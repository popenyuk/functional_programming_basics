object BiYCombinator {

	def fix[arg1Type, arg2Type, resultType]
	(bifnFactory: ((arg1Type, arg2Type) => resultType) => (arg1Type, arg2Type) => resultType):
	(arg1Type, arg2Type) => resultType =
		(arg1, arg2) => bifnFactory(fix(bifnFactory))(arg1, arg2)
}
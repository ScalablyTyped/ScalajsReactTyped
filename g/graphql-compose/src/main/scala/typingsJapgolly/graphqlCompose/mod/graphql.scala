package typingsJapgolly.graphqlCompose.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.AnonDescription
import typingsJapgolly.graphql.AnonDirectives
import typingsJapgolly.graphql.AnonMaxErrors
import typingsJapgolly.graphql.VisitorKeyMapASTKindToNod
import typingsJapgolly.graphql.astMod.ASTKindToNode
import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.graphql.astMod.ArgumentNode
import typingsJapgolly.graphql.astMod.BooleanValueNode
import typingsJapgolly.graphql.astMod.DirectiveDefinitionNode
import typingsJapgolly.graphql.astMod.DirectiveNode
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.astMod.EnumTypeDefinitionNode
import typingsJapgolly.graphql.astMod.EnumTypeExtensionNode
import typingsJapgolly.graphql.astMod.EnumValueDefinitionNode
import typingsJapgolly.graphql.astMod.EnumValueNode
import typingsJapgolly.graphql.astMod.FieldDefinitionNode
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.astMod.FloatValueNode
import typingsJapgolly.graphql.astMod.FragmentDefinitionNode
import typingsJapgolly.graphql.astMod.FragmentSpreadNode
import typingsJapgolly.graphql.astMod.InlineFragmentNode
import typingsJapgolly.graphql.astMod.InputObjectTypeDefinitionNode
import typingsJapgolly.graphql.astMod.InputObjectTypeExtensionNode
import typingsJapgolly.graphql.astMod.InputValueDefinitionNode
import typingsJapgolly.graphql.astMod.IntValueNode
import typingsJapgolly.graphql.astMod.InterfaceTypeDefinitionNode
import typingsJapgolly.graphql.astMod.InterfaceTypeExtensionNode
import typingsJapgolly.graphql.astMod.ListTypeNode
import typingsJapgolly.graphql.astMod.ListValueNode
import typingsJapgolly.graphql.astMod.NameNode
import typingsJapgolly.graphql.astMod.NamedTypeNode
import typingsJapgolly.graphql.astMod.NonNullTypeNode
import typingsJapgolly.graphql.astMod.NullValueNode
import typingsJapgolly.graphql.astMod.ObjectFieldNode
import typingsJapgolly.graphql.astMod.ObjectTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ObjectTypeExtensionNode
import typingsJapgolly.graphql.astMod.ObjectValueNode
import typingsJapgolly.graphql.astMod.OperationDefinitionNode
import typingsJapgolly.graphql.astMod.OperationTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ScalarTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ScalarTypeExtensionNode
import typingsJapgolly.graphql.astMod.SchemaDefinitionNode
import typingsJapgolly.graphql.astMod.SchemaExtensionNode
import typingsJapgolly.graphql.astMod.SelectionSetNode
import typingsJapgolly.graphql.astMod.StringValueNode
import typingsJapgolly.graphql.astMod.TypeNode
import typingsJapgolly.graphql.astMod.UnionTypeDefinitionNode
import typingsJapgolly.graphql.astMod.UnionTypeExtensionNode
import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.astMod.VariableDefinitionNode
import typingsJapgolly.graphql.astMod.VariableNode
import typingsJapgolly.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsJapgolly.graphql.buildClientSchemaMod.Options
import typingsJapgolly.graphql.coerceInputValueMod.OnErrorCB
import typingsJapgolly.graphql.coerceValueMod.CoercedValue
import typingsJapgolly.graphql.definitionMod.GraphQLAbstractType
import typingsJapgolly.graphql.definitionMod.GraphQLArgument
import typingsJapgolly.graphql.definitionMod.GraphQLCompositeType
import typingsJapgolly.graphql.definitionMod.GraphQLEnumTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLInputField
import typingsJapgolly.graphql.definitionMod.GraphQLInputObjectTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.definitionMod.GraphQLInterfaceTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLLeafType
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.definitionMod.GraphQLNullableType
import typingsJapgolly.graphql.definitionMod.GraphQLObjectTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLOutputType
import typingsJapgolly.graphql.definitionMod.GraphQLScalarTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLType
import typingsJapgolly.graphql.definitionMod.GraphQLTypeResolver
import typingsJapgolly.graphql.definitionMod.GraphQLUnionTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLWrappingType
import typingsJapgolly.graphql.definitionMod._GraphQLList
import typingsJapgolly.graphql.definitionMod._GraphQLNonNull
import typingsJapgolly.graphql.directivesMod.GraphQLDirectiveConfig
import typingsJapgolly.graphql.executeMod.ExecutionArgs
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.findBreakingChangesMod.BreakingChange
import typingsJapgolly.graphql.findBreakingChangesMod.DangerousChange
import typingsJapgolly.graphql.findBreakingChangesMod._BreakingChangeType
import typingsJapgolly.graphql.findBreakingChangesMod._DangerousChangeType
import typingsJapgolly.graphql.formatErrorMod.GraphQLFormattedError
import typingsJapgolly.graphql.graphqlMod.GraphQLArgs
import typingsJapgolly.graphql.introspectionQueryMod.IntrospectionOptions
import typingsJapgolly.graphql.introspectionQueryMod.IntrospectionQuery_
import typingsJapgolly.graphql.kindsMod._Kind
import typingsJapgolly.graphql.lexerMod.Lexer
import typingsJapgolly.graphql.locationMod.SourceLocation
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.parserMod.ParseOptions
import typingsJapgolly.graphql.pathMod.Path
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.graphql.schemaMod.GraphQLSchemaConfig
import typingsJapgolly.graphql.sourceMod.Location
import typingsJapgolly.graphql.subscribeMod.SubscriptionArgs
import typingsJapgolly.graphql.tokenKindMod._TokenKind
import typingsJapgolly.graphql.typeInfoMod.getFieldDef
import typingsJapgolly.graphql.validationContextMod.ValidationRule
import typingsJapgolly.graphql.visitorMod.VisitFn
import typingsJapgolly.graphql.visitorMod.Visitor
import typingsJapgolly.graphqlCompose.graphqlComposeStrings.`No longer supported`
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.AsyncIterableIterator
import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql")
@js.native
object graphql extends js.Object {
  @js.native
  class GraphQLDirective protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLDirective {
    def this(config: GraphQLDirectiveConfig) = this()
  }
  
  @js.native
  class GraphQLEnumType protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLEnumType {
    def this(config: GraphQLEnumTypeConfig) = this()
  }
  
  @js.native
  class GraphQLError protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
      source: js.UndefOr[Maybe[typingsJapgolly.graphql.sourceMod.Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[Double | String]]],
      originalError: js.UndefOr[Maybe[js.Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
  
  @js.native
  class GraphQLInputObjectType protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLInputObjectType {
    def this(config: GraphQLInputObjectTypeConfig) = this()
  }
  
  @js.native
  class GraphQLInterfaceType protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLInterfaceType {
    def this(config: GraphQLInterfaceTypeConfig[_, _, StringDictionary[_]]) = this()
  }
  
  @js.native
  class GraphQLListCls protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLListCls {
    def this(`type`: GraphQLType) = this()
  }
  
  @js.native
  class GraphQLNonNullCls protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLNonNullCls {
    def this(`type`: GraphQLNullableType) = this()
  }
  
  @js.native
  class GraphQLObjectType[TSource, TContext, TArgs] protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLObjectType[TSource, TContext, TArgs] {
    def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
  }
  
  @js.native
  class GraphQLScalarType protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLScalarType {
    def this(config: GraphQLScalarTypeConfig[_, _]) = this()
  }
  
  @js.native
  class GraphQLSchema protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLSchema {
    def this(config: GraphQLSchemaConfig) = this()
  }
  
  @js.native
  class GraphQLUnionType protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.GraphQLUnionType {
    def this(config: GraphQLUnionTypeConfig[_, _]) = this()
  }
  
  @js.native
  class Source protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  @js.native
  class TypeInfo protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.TypeInfo {
    def this(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema) = this()
    def this(
      schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef,
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
  }
  
  @js.native
  class ValidationContext protected ()
    extends typingsJapgolly.graphqlCompose.graphqlMod.ValidationContext {
    def this(
      schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo
    ) = this()
    def this(
      schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo,
      onError: js.Function1[/* err */ typingsJapgolly.graphql.graphQLErrorMod.GraphQLError, Unit]
    ) = this()
  }
  
  val BREAK: js.Any = js.native
  val BreakingChangeType: _BreakingChangeType = js.native
  val DEFAULT_DEPRECATION_REASON: `No longer supported` = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  @JSName("__Directive")
  val Directive: typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val DirectiveLocation: typingsJapgolly.graphql.directiveLocationMod._DirectiveLocation = js.native
  @JSName("__EnumValue")
  val EnumValue: typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Field")
  val Field: typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val GraphQLBoolean: typingsJapgolly.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLDeprecatedDirective: typingsJapgolly.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLFloat: typingsJapgolly.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLID: typingsJapgolly.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLIncludeDirective: typingsJapgolly.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLInt: typingsJapgolly.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLList: _GraphQLList[GraphQLType] = js.native
  val GraphQLNonNull: _GraphQLNonNull[GraphQLNullableType] = js.native
  val GraphQLSkipDirective: typingsJapgolly.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLString: typingsJapgolly.graphql.definitionMod.GraphQLScalarType = js.native
  @JSName("__InputValue")
  val InputValue: typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val Kind: _Kind = js.native
  @JSName("__Schema")
  val Schema: typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TokenKind: _TokenKind = js.native
  @JSName("__Type")
  val Type: typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__DirectiveLocation")
  val _DirectiveLocation: typingsJapgolly.graphql.definitionMod.GraphQLEnumType = js.native
  @JSName("__TypeKind")
  val _TypeKind: typingsJapgolly.graphql.definitionMod.GraphQLEnumType = js.native
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val defaultTypeResolver: GraphQLTypeResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val introspectionQuery: String = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
  val specifiedDirectives: js.Array[typingsJapgolly.graphql.directivesMod.GraphQLDirective] = js.native
  val specifiedRules: js.Array[ValidationRule] = js.native
  val specifiedScalarTypes: js.Array[typingsJapgolly.graphql.definitionMod.GraphQLScalarType] = js.native
  val version: String = js.native
  def assertAbstractType(`type`: js.Any): GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): GraphQLCompositeType = js.native
  def assertDirective(directive: js.Any): typingsJapgolly.graphql.directivesMod.GraphQLDirective = js.native
  def assertEnumType(`type`: js.Any): typingsJapgolly.graphql.definitionMod.GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): typingsJapgolly.graphql.definitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): typingsJapgolly.graphql.definitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): typingsJapgolly.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def assertOutputType(`type`: js.Any): GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): typingsJapgolly.graphql.definitionMod.GraphQLScalarType = js.native
  def assertSchema(schema: js.Any): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def assertType(`type`: js.Any): GraphQLType = js.native
  def assertUnionType(`type`: js.Any): typingsJapgolly.graphql.definitionMod.GraphQLUnionType = js.native
  def assertValidName(name: String): String = js.native
  def assertValidSchema(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema): Unit = js.native
  def assertWrappingType(`type`: js.Any): GraphQLWrappingType = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_, options: Options): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: String): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: typingsJapgolly.graphql.sourceMod.Source): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: typingsJapgolly.graphql.sourceMod.Source, options: BuildSchemaOptions with ParseOptions): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def createLexer[TOptions](source: typingsJapgolly.graphql.sourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def createSourceEventStream[TData](schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, document: DocumentNode): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, document: DocumentNode, rootValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def doTypesOverlap(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    typeA: GraphQLCompositeType,
    typeB: GraphQLCompositeType
  ): Boolean = js.native
  def execute[TData](args: ExecutionArgs): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def extendSchema(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def extendSchema(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    options: typingsJapgolly.graphql.extendSchemaMod.Options
  ): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def findBreakingChanges(
    oldSchema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    newSchema: typingsJapgolly.graphql.schemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
  def findDangerousChanges(
    oldSchema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    newSchema: typingsJapgolly.graphql.schemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, ast: DocumentNode): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def formatError(error: typingsJapgolly.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def getDescription(node: AnonDescription, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
  def getDirectiveValues(directiveDef: typingsJapgolly.graphql.directivesMod.GraphQLDirective, node: AnonDirectives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(
    directiveDef: typingsJapgolly.graphql.directivesMod.GraphQLDirective,
    node: AnonDirectives,
    variableValues: Maybe[StringDictionary[_]]
  ): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getLocation(source: typingsJapgolly.graphql.sourceMod.Source, position: Double): SourceLocation = js.native
  def getNamedType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNamedType(`type`: GraphQLType): GraphQLNamedType = js.native
  def getNullableType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: typingsJapgolly.graphql.definitionMod.GraphQLEnumType): typingsJapgolly.graphql.definitionMod.GraphQLEnumType = js.native
  def getNullableType(`type`: typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType): typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType = js.native
  def getNullableType(`type`: typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType): typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType = js.native
  def getNullableType(`type`: typingsJapgolly.graphql.definitionMod.GraphQLScalarType): typingsJapgolly.graphql.definitionMod.GraphQLScalarType = js.native
  def getNullableType(`type`: typingsJapgolly.graphql.definitionMod.GraphQLUnionType): typingsJapgolly.graphql.definitionMod.GraphQLUnionType = js.native
  def getNullableType[T /* <: (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | typingsJapgolly.graphql.definitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def getNullableType[T /* <: GraphQLNullableType */](`type`: typingsJapgolly.graphql.definitionMod.GraphQLNonNull[T]): T = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, operation: OperationDefinitionNode): typingsJapgolly.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getOperationRootType(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typingsJapgolly.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getVisitFn(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
  def graphql[TData](args: GraphQLArgs): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    source: typingsJapgolly.graphql.sourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: GraphQLArgs): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    source: typingsJapgolly.graphql.sourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def introspectionFromSchema(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema): IntrospectionQuery_ = js.native
  def introspectionFromSchema(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery_ = js.native
  def isAbstractType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLAbstractType */ Boolean = js.native
  def isCompositeType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLCompositeType */ Boolean = js.native
  def isDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.DefinitionNode */ Boolean = js.native
  def isDirective(directive: js.Any): /* is graphql.graphql/type/directives.GraphQLDirective */ Boolean = js.native
  def isEnumType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLEnumType */ Boolean = js.native
  def isEqualType(typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def isExecutableDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.ExecutableDefinitionNode */ Boolean = js.native
  def isInputObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputObjectType */ Boolean = js.native
  def isInputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputType */ Boolean = js.native
  def isInterfaceType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInterfaceType */ Boolean = js.native
  def isIntrospectionType(`type`: js.Any): Boolean = js.native
  def isLeafType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLLeafType */ Boolean = js.native
  def isListType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLList<any> */ Boolean = js.native
  def isNamedType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNamedType */ Boolean = js.native
  def isNonNullType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNonNull<any> */ Boolean = js.native
  def isNullableType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNullableType */ Boolean = js.native
  def isObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLObjectType<any, any, {[key: string] : any}> */ Boolean = js.native
  def isOutputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLOutputType */ Boolean = js.native
  def isRequiredArgument(arg: GraphQLArgument): Boolean = js.native
  def isRequiredInputField(field: GraphQLInputField): Boolean = js.native
  def isScalarType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLScalarType */ Boolean = js.native
  def isSchema(schema: js.Any): /* is graphql.graphql/type/schema.GraphQLSchema */ Boolean = js.native
  def isSelectionNode(node: ASTNode): /* is graphql.graphql/language/ast.SelectionNode */ Boolean = js.native
  def isSpecifiedDirective(directive: js.Any): Boolean = js.native
  def isSpecifiedScalarType(`type`: js.Any): Boolean = js.native
  def isType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLType */ Boolean = js.native
  def isTypeDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ Boolean = js.native
  def isTypeExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ Boolean = js.native
  def isTypeNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeNode */ Boolean = js.native
  def isTypeSubTypeOf(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    maybeSubType: GraphQLType,
    superType: GraphQLType
  ): Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isUnionType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLUnionType */ Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: GraphQLInputType): js.Array[String] = js.native
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String): js.UndefOr[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String, node: ASTNode): js.UndefOr[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLWrappingType */ Boolean = js.native
  def lexicographicSortSchema(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def locatedError(
    originalError: typingsJapgolly.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typingsJapgolly.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typingsJapgolly.graphql.graphQLErrorMod.GraphQLError = js.native
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: typingsJapgolly.graphql.sourceMod.Source): DocumentNode = js.native
  def parse(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typingsJapgolly.graphql.sourceMod.Source): TypeNode = js.native
  def parseType(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typingsJapgolly.graphql.sourceMod.Source): ValueNode = js.native
  def parseValue(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printError(error: typingsJapgolly.graphql.graphQLErrorMod.GraphQLError): String = js.native
  def printIntrospectionSchema(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema): String = js.native
  def printIntrospectionSchema(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    options: typingsJapgolly.graphql.schemaPrinterMod.Options
  ): String = js.native
  def printLocation(location: typingsJapgolly.graphql.astMod.Location): String = js.native
  def printSchema(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema): String = js.native
  def printSchema(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    options: typingsJapgolly.graphql.schemaPrinterMod.Options
  ): String = js.native
  def printSourceLocation(source: typingsJapgolly.graphql.sourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typingsJapgolly.graphql.schemaPrinterMod.Options): String = js.native
  def separateOperations(documentAST: DocumentNode): StringDictionary[DocumentNode] = js.native
  def stripIgnoredCharacters(source: String): String = js.native
  def stripIgnoredCharacters(source: typingsJapgolly.graphql.sourceMod.Source): String = js.native
  def subscribe[TData](args: SubscriptionArgs): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def subscribe[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def syntaxError(source: typingsJapgolly.graphql.sourceMod.Source, position: Double, description: String): typingsJapgolly.graphql.graphQLErrorMod.GraphQLError = js.native
  def typeFromAST(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typingsJapgolly.graphql.definitionMod.GraphQLList[_]] = js.native
  def typeFromAST(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typingsJapgolly.graphql.definitionMod.GraphQLNonNull[_]] = js.native
  def validate(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo
  ): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo,
    options: AnonMaxErrors
  ): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validateSchema(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMapASTKindToNod
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  @js.native
  object TypeKind extends js.Object {
    var ENUM: typingsJapgolly.graphqlCompose.graphqlComposeStrings.ENUM = js.native
    var INPUT_OBJECT: typingsJapgolly.graphqlCompose.graphqlComposeStrings.INPUT_OBJECT = js.native
    var INTERFACE: typingsJapgolly.graphqlCompose.graphqlComposeStrings.INTERFACE = js.native
    var LIST: typingsJapgolly.graphqlCompose.graphqlComposeStrings.LIST = js.native
    var NON_NULL: typingsJapgolly.graphqlCompose.graphqlComposeStrings.NON_NULL = js.native
    var OBJECT: typingsJapgolly.graphqlCompose.graphqlComposeStrings.OBJECT = js.native
    var SCALAR: typingsJapgolly.graphqlCompose.graphqlComposeStrings.SCALAR = js.native
    var UNION: typingsJapgolly.graphqlCompose.graphqlComposeStrings.UNION = js.native
  }
  
  @js.native
  object versionInfo extends js.Object {
    var major: Double = js.native
    var minor: Double = js.native
    var patch: Double = js.native
    var preReleaseTag: Double | Null = js.native
  }
  
}


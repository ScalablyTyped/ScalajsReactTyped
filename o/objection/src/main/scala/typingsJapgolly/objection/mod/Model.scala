package typingsJapgolly.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.knex.mod.FunctionHelper
import typingsJapgolly.knex.mod.Knex
import typingsJapgolly.knex.mod.Raw
import typingsJapgolly.knex.mod.RawBinding
import typingsJapgolly.knex.mod.RawBuilder
import typingsJapgolly.knex.mod.SafePartial
import typingsJapgolly.knex.mod.ValueDict
import typingsJapgolly.objection.TypeofModel
import typingsJapgolly.objection.TypeofQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "Model")
@js.native
class Model () extends js.Object {
  @JSName("$afterDelete")
  def $afterDelete(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$afterGet")
  def $afterGet(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$afterInsert")
  def $afterInsert(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$afterUpdate")
  def $afterUpdate(opt: ModelOptions, queryContext: QueryContext): js.Promise[_] | Unit = js.native
   // may throw ValidationError if validation fails
  @JSName("$afterValidate")
  def $afterValidate(json: Pojo, opt: ModelOptions): Unit = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](relation: String): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](relation: String, related: RelatedM): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](relation: String, related: js.Array[RelatedM]): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](relation: Relation): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](relation: Relation, related: RelatedM): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](relation: Relation, related: js.Array[RelatedM]): T = js.native
  @JSName("$beforeDelete")
  def $beforeDelete(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$beforeInsert")
  def $beforeInsert(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$beforeUpdate")
  def $beforeUpdate(opt: ModelOptions, queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$beforeValidate")
  def $beforeValidate(jsonSchema: JsonSchema, json: Pojo, opt: ModelOptions): JsonSchema = js.native
  @JSName("$clone")
  def $clone[T](): T = js.native
  @JSName("$clone")
  def $clone[T](opt: CloneOptions): T = js.native
  @JSName("$formatDatabaseJson")
  def $formatDatabaseJson(json: Pojo): Pojo = js.native
  @JSName("$formatJson")
  def $formatJson(json: Pojo): Pojo = js.native
  // Implementation note: At least as of TypeScript 2.7, subclasses of
  // methods that return `this` are not compatible with their superclass.
  // For example, `class Movie extends Model` could not be passed as a
  // "Model" to a function, because the methods that return `this` return
  // `Movie`, and not `Model`. The `foo<M>(this: M, ...` is a workaround.
  @JSName("$id")
  def $id(): js.Any = js.native
  @JSName("$id")
  def $id(id: js.Any): Unit = js.native
  @JSName("$knex")
  def $knex(): Knex[_, js.Array[_]] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](expression: String): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](expression: String, filters: Filters[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](expression: String, filters: Filters[QM], trxOrKnex: Knex[_, js.Array[_]]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](expression: String, filters: Filters[QM], trxOrKnex: Transaction_): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](expression: RelationExpression): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](expression: RelationExpression, filters: Filters[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](expression: RelationExpression, filters: Filters[QM], trxOrKnex: Knex[_, js.Array[_]]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](expression: RelationExpression, filters: Filters[QM], trxOrKnex: Transaction_): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$omit")
  def $omit[T](keys: String): T = js.native
  @JSName("$omit")
  def $omit[T](keys: js.Array[String]): T = js.native
  @JSName("$omit")
  def $omit[T](keys: Properties): T = js.native
  @JSName("$parseDatabaseJson")
  def $parseDatabaseJson(json: Pojo): Pojo = js.native
  @JSName("$parseJson")
  def $parseJson(json: Pojo): Pojo = js.native
  @JSName("$parseJson")
  def $parseJson(json: Pojo, opt: ModelOptions): Pojo = js.native
  @JSName("$pick")
  def $pick[T](keys: String): T = js.native
  @JSName("$pick")
  def $pick[T](keys: js.Array[String]): T = js.native
  @JSName("$pick")
  def $pick[T](keys: Properties): T = js.native
  @JSName("$query")
  def $query[QM /* <: Model */](): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$query")
  def $query[QM /* <: Model */](trxOrKnex: Knex[_, js.Array[_]]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$query")
  def $query[QM /* <: Model */](trxOrKnex: Transaction_): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  /**
    * If you add fields to your model, you get $relatedQuery typings for
    * free.
    *
    * Note that if you make any chained calls to the QueryBuilder,
    * though, you should apply a cast, which will make your code use not this
    * signatue, but the following signature.
    */
  @JSName("$relatedQuery")
  def $relatedQuery[K /* <: String */, V /* <: (/* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any) with Model */](relationName: K): QueryBuilder[V, V, V] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[K /* <: String */, V /* <: (/* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any) with Model */](relationName: K, trxOrKnex: Knex[_, js.Array[_]]): QueryBuilder[V, V, V] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[K /* <: String */, V /* <: (/* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any) with Model */](relationName: K, trxOrKnex: Transaction_): QueryBuilder[V, V, V] = js.native
  /**
    * Builds a query that only affects the models related to this instance
    * through a relation. Note that this signature requires a
    * type cast (like `bob.$relatedQuery<Animal>('pets')`).
    */
  @JSName("$relatedQuery")
  def $relatedQuery[QM /* <: Model */, RM](relationName: String): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[QM /* <: Model */, RM](relationName: String, trxOrKnex: Knex[_, js.Array[_]]): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[QM /* <: Model */, RM](relationName: String, trxOrKnex: Transaction_): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  @JSName("$set")
  def $set[T](obj: Pojo): T = js.native
  @JSName("$setDatabaseJson")
  def $setDatabaseJson[M](json: Pojo): M = js.native
  @JSName("$setJson")
  def $setJson[T](json: Pojo): T = js.native
  @JSName("$setJson")
  def $setJson[T](json: Pojo, opt: ModelOptions): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](relation: String): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](relation: String, related: RelatedM): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](relation: String, related: js.Array[RelatedM]): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](relation: Relation): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](relation: Relation, related: RelatedM): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](relation: Relation, related: js.Array[RelatedM]): T = js.native
   // may throw ValidationError if validation fails
  @JSName("$toDatabaseJson")
  def $toDatabaseJson(): js.Object = js.native
  @JSName("$toJson")
  def $toJson(): js.Object = js.native
  @JSName("$toJson")
  def $toJson(opt: ToJsonOptions): js.Object = js.native
  @JSName("$transaction")
  def $transaction(): Knex[_, js.Array[_]] = js.native
  @JSName("$traverse")
  def $traverse(filterConstructor: this.type, traverser: TraverserFunction): Unit = js.native
  @JSName("$traverse")
  def $traverse(traverser: TraverserFunction): Unit = js.native
  @JSName("$validate")
  def $validate(json: Pojo, opt: ModelOptions): Pojo = js.native
  def toJSON(): js.Object = js.native
  def toJSON(opt: ToJsonOptions): js.Object = js.native
}

/* static members */
@JSImport("objection", "Model")
@js.native
object Model extends js.Object {
  var BelongsToOneRelation: Relation = js.native
  var HasManyRelation: Relation = js.native
  var HasOneRelation: Relation = js.native
  var HasOneThroughRelation: Relation = js.native
  var JoinEagerAlgorithm: EagerAlgorithm = js.native
  var ManyToManyRelation: Relation = js.native
  var NaiveEagerAlgorithm: EagerAlgorithm = js.native
  var QueryBuilder: TypeofQueryBuilder = js.native
  var WhereInEagerAlgorithm: EagerAlgorithm = js.native
  var columnNameMappers: ColumnNameMappers = js.native
  var dbRefProp: String = js.native
  var defaultEagerAlgorithm: js.UndefOr[EagerAlgorithm] = js.native
  var defaultEagerOptions: js.UndefOr[EagerOptions] = js.native
  var fn: FunctionHelper = js.native
  var idColumn: String | js.Array[String] = js.native
  var jsonAttributes: js.Array[String] = js.native
  var jsonSchema: JsonSchema = js.native
  var modelPaths: js.Array[String] = js.native
  var modifiers: Modifiers = js.native
  var pickJsonSchemaProperties: Boolean = js.native
  var propRefRegex: js.RegExp = js.native
  @JSName("raw")
  var raw_Original: RawBuilder[_, _] = js.native
  var relatedFindQueryMutates: Boolean = js.native
  var relatedInsertQueryMutates: Boolean = js.native
  var relationMappings: RelationMappings | js.Function0[RelationMappings] = js.native
  var tableName: String = js.native
  var uidProp: String = js.native
  var uidRefProp: String = js.native
  var virtualAttributes: js.Array[String] = js.native
  def bindKnex[M](knex: Knex[_, js.Array[_]]): M = js.native
  def bindTransaction[M](transaction: Transaction_): M = js.native
  def createNotFoundError(): js.Error = js.native
  def createValidationError(args: CreateValidationErrorArgs): js.Error = js.native
  def createValidator(): Validator = js.native
  def fetchTableMetadata(): js.Promise[TableMetadata] = js.native
  def fetchTableMetadata(opt: FetchTableMetadataOptions): js.Promise[TableMetadata] = js.native
  def fromDatabaseJson[M](row: Pojo): M = js.native
  // fromJson and fromDatabaseJson both return an instance of Model, not a Model class:
  def fromJson[M](json: Pojo): M = js.native
  def fromJson[M](json: Pojo, opt: ModelOptions): M = js.native
  def getRelations(): StringDictionary[Relation] = js.native
  def knex(): Knex[_, js.Array[_]] = js.native
  def knex(knex: Knex[_, js.Array[_]]): Knex[_, js.Array[_]] = js.native
  def knexQuery(): typingsJapgolly.knex.mod.QueryBuilder[_, js.Array[SafePartial[_]]] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression, filters: Filters[QM]): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression, filters: Filters[QM], trxOrKnex: Knex[_, js.Array[_]]): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression, filters: Filters[QM], trxOrKnex: Transaction_): QueryBuilderYieldingOne[QM] = js.native
  // loadRelated is overloaded to support both Model and Model[] variants:
  def loadRelated[QM /* <: Model */](models: js.Array[QM], expression: RelationExpression): QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](models: js.Array[QM], expression: RelationExpression, filters: Filters[QM]): QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](
    models: js.Array[QM],
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: Knex[_, js.Array[_]]
  ): QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](
    models: js.Array[QM],
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: Transaction_
  ): QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def omitImpl(f: js.Function2[/* obj */ js.Object, /* prop */ String, Unit]): Unit = js.native
  def query[QM /* <: Model */](): QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: Model */](trxOrKnex: Knex[_, js.Array[_]]): QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: Model */](trxOrKnex: Transaction_): QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def raw[TResult2](sql: String, bindings: RawBinding*): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: ValueDict): Raw[TResult2] = js.native
  def raw[TResult2](value: typingsJapgolly.knex.mod.Value): Raw[TResult2] = js.native
  // This can only be used as a subquery so the result model type is irrelevant.
  def relatedQuery(relationName: String): QueryBuilder[
    _, 
    js.Array[_], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def tableMetadata(): TableMetadata = js.native
  def tableMetadata(opt: TableMetadataOptions): TableMetadata = js.native
  def traverse(filterConstructor: TypeofModel, models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(filterConstructor: TypeofModel, models: Model, traverser: TraverserFunction): Unit = js.native
  def traverse(models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(models: Model, traverser: TraverserFunction): Unit = js.native
}


package typingsJapgolly.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.knex.mod.JoinClause
import typingsJapgolly.objection.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInterface[QM /* <: Model */, RM, RV] extends js.Object {
  @JSName("andHaving")
  var andHaving_Original: Where[QM, RM, RV] = js.native
  @JSName("andWhereBetween")
  var andWhereBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("andWhereColumn")
  var andWhereColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("andWhereNotBetween")
  var andWhereNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("andWhereNotColumn")
  var andWhereNotColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("andWhereNot")
  var andWhereNot_Original: Where[QM, RM, RV] = js.native
  @JSName("andWhereRaw")
  var andWhereRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("andWhere")
  var andWhere_Original: Where[QM, RM, RV] = js.native
  @JSName("as")
  var as_Original: As[QM, RM, RV] = js.native
  @JSName("column")
  var column_Original: Select[QM, RM, RV] = js.native
  @JSName("columns")
  var columns_Original: Select[QM, RM, RV] = js.native
  @JSName("crossJoin")
  var crossJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("distinct")
  var distinct_Original: Distinct[QM, RM, RV] = js.native
  @JSName("from")
  var from_Original: Table[QM, RM, RV] = js.native
  @JSName("fullOuterJoin")
  var fullOuterJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("groupByRaw")
  var groupByRaw_Original: RawMethod[QM, RM, RV] = js.native
  // Group by
  @JSName("groupBy")
  var groupBy_Original: GroupBy[QM, RM, RV] = js.native
  @JSName("havingBetween")
  var havingBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("havingExists")
  var havingExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("havingIn")
  var havingIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("havingNotBetween")
  var havingNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("havingNotExists")
  var havingNotExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("havingNotIn")
  var havingNotIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("havingNotNull")
  var havingNotNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("havingNull")
  var havingNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("havingRaw")
  var havingRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("havingWrapped")
  var havingWrapped_Original: WhereWrapped[QM, RM, RV] = js.native
  // Having
  @JSName("having")
  var having_Original: Where[QM, RM, RV] = js.native
  @JSName("innerJoin")
  var innerJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("intersect")
  var intersect_Original: SetOperations[QM] = js.native
  @JSName("into")
  var into_Original: Table[QM, RM, RV] = js.native
  @JSName("joinRaw")
  var joinRaw_Original: JoinRaw[QM, RM, RV] = js.native
  // Joins
  @JSName("join")
  var join_Original: Join[QM, RM, RV] = js.native
  @JSName("leftJoin")
  var leftJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("leftOuterJoin")
  var leftOuterJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("orHavingBetween")
  var orHavingBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("orHavingExists")
  var orHavingExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("orHavingIn")
  var orHavingIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("orHavingNotBetween")
  var orHavingNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("orHavingNotExists")
  var orHavingNotExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("orHavingNotIn")
  var orHavingNotIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("orHavingNotNull")
  var orHavingNotNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("orHavingNull")
  var orHavingNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("orHavingRaw")
  var orHavingRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("orHaving")
  var orHaving_Original: Where[QM, RM, RV] = js.native
  @JSName("orWhereBetween")
  var orWhereBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("orWhereColumn")
  var orWhereColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("orWhereExists")
  var orWhereExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("orWhereIn")
  var orWhereIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("orWhereNotBetween")
  var orWhereNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("orWhereNotColumn")
  var orWhereNotColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("orWhereNotExists")
  var orWhereNotExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("orWhereNotIn")
  var orWhereNotIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("orWhereNotNull")
  var orWhereNotNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("orWhereNot")
  var orWhereNot_Original: Where[QM, RM, RV] = js.native
  @JSName("orWhereNull")
  var orWhereNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("orWhereRaw")
  var orWhereRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("orWhere")
  var orWhere_Original: Where[QM, RM, RV] = js.native
  @JSName("orderByRaw")
  var orderByRaw_Original: RawMethod[QM, RM, RV] = js.native
  // Order by
  @JSName("orderBy")
  var orderBy_Original: OrderBy[QM, RM, RV] = js.native
  @JSName("outerJoin")
  var outerJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("rightJoin")
  var rightJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("rightOuterJoin")
  var rightOuterJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("select")
  var select_Original: Select[QM, RM, RV] = js.native
  @JSName("table")
  var table_Original: Table[QM, RM, RV] = js.native
  @JSName("unionAll")
  var unionAll_Original: Union[QM] = js.native
  // Union
  @JSName("union")
  var union_Original: Union[QM] = js.native
  @JSName("whereBetween")
  var whereBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("whereColumn")
  var whereColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("whereExists")
  var whereExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("whereIn")
  var whereIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("whereNotBetween")
  var whereNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("whereNotColumn")
  var whereNotColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("whereNotExists")
  var whereNotExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("whereNotIn")
  var whereNotIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("whereNotNull")
  var whereNotNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("whereNot")
  var whereNot_Original: Where[QM, RM, RV] = js.native
  @JSName("whereNull")
  var whereNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("whereRaw")
  var whereRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("whereWrapped")
  var whereWrapped_Original: WhereWrapped[QM, RM, RV] = js.native
  // Wheres
  @JSName("where")
  var where_Original: Where[QM, RM, RV] = js.native
  @JSName("withRaw")
  var withRaw_Original: WithRaw[QM, RM, RV] = js.native
  @JSName("withWrapped")
  var withWrapped_Original: WithWrapped[QM, RM, RV] = js.native
  // Withs
  @JSName("with")
  var with_Original: With[QM, RM, RV] = js.native
  def andHaving(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhereBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhereRaw(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhereRaw(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def andWhereRaw(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhereRaw(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def as(alias: String): QueryBuilder[QM, RM, RV] = js.native
  def avg(columnName: String): this.type = js.native
  def avgDistinct(columnName: String): this.type = js.native
  def clearOrder(): this.type = js.native
  // Clear
  def clearSelect(): this.type = js.native
  def clearWhere(): this.type = js.native
  def column(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def column(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  def columns(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def columns(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  def connection(connection: js.Any): this.type = js.native
  // Aggregation
  def count(): this.type = js.native
  def count(columnName: String): this.type = js.native
  def countDistinct(): this.type = js.native
  def countDistinct(columnName: String): this.type = js.native
  def crossJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def debug(): this.type = js.native
  def debug(enabled: Boolean): this.type = js.native
  def decrement(columnName: String): this.type = js.native
  def decrement(columnName: String, amount: Double): this.type = js.native
  def del(): QueryBuilderYieldingCount[QM, RM] = js.native
  def delete(): QueryBuilderYieldingCount[QM, RM] = js.native
  def distinct(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def distinct(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  def from(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def from(tableName: TableName): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def groupByRaw(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def groupByRaw(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def groupByRaw(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def having(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def having(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def having(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def having(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def havingBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingExists(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingNotExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotExists(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingNotNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def havingNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def havingRaw(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def havingRaw(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def havingRaw(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def havingRaw(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def havingWrapped(
    callback: js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def increment(columnName: String): this.type = js.native
  def increment(columnName: String, amount: Double): this.type = js.native
  def innerJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def intersect(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def intersect(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def intersect(
    callbacks: (js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ])*
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def intersect(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        Unit
      ]
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def intersect(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        Unit
      ]
    ],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def into(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def into(tableName: TableName): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def joinRaw(sql: String): QueryBuilder[QM, RM, RV] = js.native
  def joinRaw(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def limit(limit: Double): this.type = js.native
  def max(columnName: String): this.type = js.native
  def min(columnName: String): this.type = js.native
  // Paging
  def offset(offset: Double): this.type = js.native
  def orHaving(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orHavingBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingExists(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotExists(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orHavingRaw(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orHavingRaw(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orHavingRaw(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orHavingRaw(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhereBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhereExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereExists(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotExists(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orWhereRaw(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhereRaw(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orWhereRaw(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhereRaw(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  // Order by
  def orderBy(columns: js.Array[AnonColumn | String]): QueryBuilder[QM, RM, RV] = js.native
  // Order by
  def orderBy(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orderBy(column: ColumnRef, order: String): QueryBuilder[QM, RM, RV] = js.native
  def orderByRaw(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def orderByRaw(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orderByRaw(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def pluck(column: String): this.type = js.native
  def rightJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def select(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def select(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  def sum(columnName: String): this.type = js.native
  def sumDistinct(columnName: String): this.type = js.native
  def table(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def table(tableName: TableName): QueryBuilder[QM, RM, RV] = js.native
  def transacting(trx: Transaction_): this.type = js.native
  def truncate(): this.type = js.native
  // Union
  def union(arg1: QBOrCallback[QM]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM], arg3: QBOrCallback[QM]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM], arg3: QBOrCallback[QM], arg4: QBOrCallback[QM]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    arg6: QBOrCallback[QM]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    arg6: QBOrCallback[QM],
    arg7: QBOrCallback[QM]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    arg6: QBOrCallback[QM],
    arg7: QBOrCallback[QM],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    arg6: QBOrCallback[QM],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM], arg3: QBOrCallback[QM], wrap: Boolean): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM], wrap: Boolean): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(arg1: QBOrCallback[QM], wrap: Boolean): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(args: QBOrCallback[QM]*): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        Unit
      ]
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def union(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        Unit
      ]
    ],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(arg1: QBOrCallback[QM]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM], arg3: QBOrCallback[QM]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM], arg3: QBOrCallback[QM], arg4: QBOrCallback[QM]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    arg6: QBOrCallback[QM]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    arg6: QBOrCallback[QM],
    arg7: QBOrCallback[QM]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    arg6: QBOrCallback[QM],
    arg7: QBOrCallback[QM],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    arg6: QBOrCallback[QM],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    arg5: QBOrCallback[QM],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    arg1: QBOrCallback[QM],
    arg2: QBOrCallback[QM],
    arg3: QBOrCallback[QM],
    arg4: QBOrCallback[QM],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM], arg3: QBOrCallback[QM], wrap: Boolean): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(arg1: QBOrCallback[QM], arg2: QBOrCallback[QM], wrap: Boolean): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(arg1: QBOrCallback[QM], wrap: Boolean): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(args: QBOrCallback[QM]*): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        Unit
      ]
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ], 
        Unit
      ]
    ],
    wrap: Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  // Wheres
  def where(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def where(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def where(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def where(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def where(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereExists(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: String,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: String, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: String, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: ColumnRef, operator: String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: ColumnRef, operator: String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereNotExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotExists(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereNotNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def whereNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def whereRaw(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
  def whereRaw(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def whereRaw(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def whereRaw(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereWrapped(
    callback: js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  // Withs
  def `with`(alias: String, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  // Withs
  def `with`(alias: String, sql: String): QueryBuilder[QM, RM, RV] = js.native
  def `with`(alias: String, sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def withRaw(alias: String, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def withRaw(alias: String, sql: String): QueryBuilder[QM, RM, RV] = js.native
  def withRaw(alias: String, sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def withWrapped(
    alias: String,
    callback: js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
}


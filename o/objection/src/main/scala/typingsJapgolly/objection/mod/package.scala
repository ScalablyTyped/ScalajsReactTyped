package typingsJapgolly.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type As[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function1[
    /* alias */ java.lang.String, 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type BluebirdMapper[T, Result] = js.Function2[/* item */ T, /* index */ scala.Double, Result]
  type ColumnRef = java.lang.String | typingsJapgolly.objection.mod.Raw_ | typingsJapgolly.objection.mod.Reference | (typingsJapgolly.objection.mod.QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ])
  type DeepPartialGraph[T] = T | typingsJapgolly.objection.mod.DeepPartialGraphModel[T] | (typingsJapgolly.objection.mod.DeepPartialGraphArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  type DeepPartialGraphModel[T] = (typingsJapgolly.objection.mod.GraphModel[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.DeepPartialGraph<T[P]>}
    */ typingsJapgolly.objection.objectionStrings.DeepPartialGraphModel with T
  ]) | typingsJapgolly.std.Partial[T]
  type Distinct[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = typingsJapgolly.objection.mod.ColumnNamesMethod[QM, RM, RV]
  type ErrorHash = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.objection.mod.ValidationErrorItem]]
  /**
    * @see http://vincit.github.io/objection.js/#fieldexpression
    */
  type FieldExpression = java.lang.String
  type FilterExpression[QM /* <: typingsJapgolly.objection.mod.Model */] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.objection.mod.FilterFunction[QM]]
  type FilterFunction[QM /* <: typingsJapgolly.objection.mod.Model */] = js.ThisFunction1[
    /* this */ typingsJapgolly.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    /* queryBuilder */ typingsJapgolly.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    scala.Unit
  ]
  type Filters[QM /* <: typingsJapgolly.objection.mod.Model */] = org.scalablytyped.runtime.StringDictionary[
    js.ThisFunction1[
      /* this */ typingsJapgolly.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      /* queryBuilder */ typingsJapgolly.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ]
  ]
  type GraphModel[T] = (typingsJapgolly.objection.AnonId with T) | (typingsJapgolly.objection.AnonRef with typingsJapgolly.objection.objectionStrings.GraphModel with js.Any) | (typingsJapgolly.objection.AnonDbRef with typingsJapgolly.objection.objectionStrings.GraphModel with js.Any)
  type Id = java.lang.String | scala.Double
  type IdOrIds = typingsJapgolly.objection.mod.Id | typingsJapgolly.objection.mod.Ids
  type Ids = js.Array[typingsJapgolly.objection.mod.Id]
  type JoinRaw[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function2[
    /* sql */ java.lang.String, 
    /* bindings */ js.UndefOr[js.Any], 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type JoinRelation = js.Function2[
    /* expr */ typingsJapgolly.objection.mod.RelationExpression, 
    /* opt */ js.UndefOr[typingsJapgolly.objection.mod.RelationOptions], 
    typingsJapgolly.objection.mod.QueryBuilder[
      typingsJapgolly.objection.mod.Model, 
      js.Array[typingsJapgolly.objection.mod.Model], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ]
  ]
  type JsonObjectOrFieldExpression = js.Object | js.Array[js.Object] | typingsJapgolly.objection.mod.FieldExpression
  type Literal = typingsJapgolly.objection.mod.Castable
  type LiteralBuilder = js.Function1[
    /* value */ typingsJapgolly.objection.mod.Value | typingsJapgolly.objection.mod.LiteralObject, 
    typingsJapgolly.objection.mod.Literal
  ]
  type LiteralObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.objection.mod.Value]
  type Modifiers = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* builder */ typingsJapgolly.objection.mod.QueryBuilder[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ]
  ]
  type NodeStyleCallback = js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], scala.Unit]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type PartialUpdate[QM /* <: typingsJapgolly.objection.mod.Model */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof QM ]:? QM[P] | objection.objection.Raw | objection.objection.Reference | objection.objection.QueryBuilder<any, std.Array<any>, / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV * / any>}
    */ typingsJapgolly.objection.objectionStrings.PartialUpdate with QM
  type Plugin = js.Function1[
    /* modelClass */ typingsJapgolly.objection.TypeofModel, 
    typingsJapgolly.objection.TypeofModel
  ]
  type Pojo = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Properties = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type QBOrCallback[QM /* <: typingsJapgolly.objection.mod.Model */] = (typingsJapgolly.objection.mod.QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ]) | (js.ThisFunction1[
    /* this */ typingsJapgolly.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    /* queryBuilder */ typingsJapgolly.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    scala.Unit
  ])
  type QueryBuilderYieldingOne[QM /* <: typingsJapgolly.objection.mod.Model */] = typingsJapgolly.objection.mod.QueryBuilder[QM, QM, QM]
  type QueryBuilderYieldingOneOrNone[QM /* <: typingsJapgolly.objection.mod.Model */] = typingsJapgolly.objection.mod.QueryBuilder[QM, QM, js.UndefOr[QM]]
  type Raw_ = typingsJapgolly.knex.mod.Raw[js.Any]
  type Reference = typingsJapgolly.objection.mod.Castable
  type ReferenceBuilder = js.Function1[/* expression */ java.lang.String, typingsJapgolly.objection.mod.Reference]
  /**
    * @see http://vincit.github.io/objection.js/#relationexpression
    */
  type RelationExpression = java.lang.String | js.Object
  type RelationExpressionMethod[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function1[
    /* relationExpression */ typingsJapgolly.objection.mod.RelationExpression, 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type RelationMappings = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.objection.mod.RelationMapping]
  type Select[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = typingsJapgolly.objection.mod.ColumnNamesMethod[QM, RM, RV]
  type TableName = java.lang.String | typingsJapgolly.objection.mod.Raw_ | typingsJapgolly.objection.mod.Reference | (typingsJapgolly.objection.mod.QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ])
  type TraverserFunction = js.Function3[
    /* model */ typingsJapgolly.objection.mod.Model, 
    /* parentModel */ typingsJapgolly.objection.mod.Model, 
    /* relationName */ java.lang.String, 
    scala.Unit
  ]
  type ValidatorContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  //
  // Partial revision of
  // https://raw.githubusercontent.com/DefinitelyTyped/DefinitelyTyped/master/types/knex/index.d.ts,
  // to change the signatures to return Objection's typed QueryBuilder wrapper:
  //
  type Value = java.lang.String | scala.Double | scala.Boolean | js.Date | (js.Array[scala.Boolean | js.Date | scala.Double | java.lang.String]) | scala.Null | typingsJapgolly.node.Buffer | typingsJapgolly.objection.mod.Raw_ | typingsJapgolly.objection.mod.Literal
  type WhereBetween[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function2[
    /* column */ typingsJapgolly.objection.mod.ColumnRef, 
    /* range */ js.Tuple2[typingsJapgolly.objection.mod.Value, typingsJapgolly.objection.mod.Value], 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereFieldExpression[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function1[
    /* fieldExpression */ typingsJapgolly.objection.mod.FieldExpression, 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJson[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function2[
    /* fieldExpression */ typingsJapgolly.objection.mod.FieldExpression, 
    /* jsonObjectOrFieldExpression */ typingsJapgolly.objection.mod.JsonObjectOrFieldExpression, 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonExpression[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function2[
    /* fieldExpression */ typingsJapgolly.objection.mod.FieldExpression, 
    /* keys */ java.lang.String | js.Array[java.lang.String], 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonField[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function3[
    /* fieldExpression */ typingsJapgolly.objection.mod.FieldExpression, 
    /* operator */ java.lang.String, 
    /* value */ scala.Boolean | scala.Double | java.lang.String | scala.Null, 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereNull[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function1[
    /* column */ typingsJapgolly.objection.mod.ColumnRef, 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereWrapped[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function1[
    /* callback */ js.Function1[
      /* queryBuilder */ typingsJapgolly.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ], 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WithWrapped[QM /* <: typingsJapgolly.objection.mod.Model */, RM, RV] = js.Function2[
    /* alias */ java.lang.String, 
    /* callback */ js.Function1[
      /* queryBuilder */ typingsJapgolly.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      js.Any
    ], 
    typingsJapgolly.objection.mod.QueryBuilder[QM, RM, RV]
  ]
}

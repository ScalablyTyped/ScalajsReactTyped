package typingsJapgolly.jsonQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Context = js.Any
  type Filter = js.Function2[
    /* input */ typingsJapgolly.jsonQuery.mod.Context, 
    /* repeated */ js.Any, 
    typingsJapgolly.jsonQuery.mod.Context
  ]
  type Locals = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jsonQuery.mod.Filter]
  type QueryParam = js.Any
  type Selector = java.lang.String
  // No way to support [Selector, ...QueryParam[]]?
  // 10 params should be more than enough, hopefully.
  type SelectorWithQueryParams = (js.Tuple2[typingsJapgolly.jsonQuery.mod.Selector, typingsJapgolly.jsonQuery.mod.QueryParam]) | (js.Tuple3[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ]) | (js.Tuple4[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ]) | (js.Tuple5[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ]) | (js.Tuple6[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ]) | (js.Tuple7[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ]) | (js.Tuple8[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ]) | (js.Tuple9[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ]) | (js.Tuple10[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ]) | (js.Tuple11[
    typingsJapgolly.jsonQuery.mod.Selector, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam, 
    typingsJapgolly.jsonQuery.mod.QueryParam
  ])
}

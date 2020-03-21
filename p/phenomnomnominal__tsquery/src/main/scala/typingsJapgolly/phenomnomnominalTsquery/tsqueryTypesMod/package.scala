package typingsJapgolly.phenomnomnominalTsquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tsqueryTypesMod {
  type TSQueryAttributeOperator = js.Function3[
    /* obj */ js.Any, 
    /* value */ js.Any, 
    /* type */ typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryAttributeOperatorType, 
    scala.Boolean
  ]
  type TSQueryAttributeOperators = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryAttributeOperator]
  type TSQueryMatcher = js.Function4[
    /* node */ typingsJapgolly.typescript.mod.Node, 
    /* selector */ typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode, 
    /* ancestry */ js.Array[typingsJapgolly.typescript.mod.Node], 
    /* options */ typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions, 
    scala.Boolean
  ]
  type TSQueryMatchers = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryMatcher]
  type TSQueryNodeTransformer = js.Function1[
    /* node */ typingsJapgolly.typescript.mod.Node, 
    js.UndefOr[typingsJapgolly.typescript.mod.Node | scala.Null]
  ]
  type TSQueryStringTransformer = js.Function1[
    /* node */ typingsJapgolly.typescript.mod.Node, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
}

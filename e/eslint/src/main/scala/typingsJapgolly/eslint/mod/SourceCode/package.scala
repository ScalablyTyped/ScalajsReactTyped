package typingsJapgolly.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SourceCode {
  type CursorWithCountOptions = scala.Double | typingsJapgolly.eslint.mod.SourceCode.FilterPredicate | typingsJapgolly.eslint.AnonCount
  type CursorWithSkipOptions = scala.Double | typingsJapgolly.eslint.mod.SourceCode.FilterPredicate | typingsJapgolly.eslint.AnonFilter
  type FilterPredicate = js.Function1[
    /* tokenOrComment */ typingsJapgolly.eslint.mod.AST.Token | typingsJapgolly.estree.mod.Comment, 
    scala.Boolean
  ]
  type ParserServices = js.Any
  type VisitorKeys = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}

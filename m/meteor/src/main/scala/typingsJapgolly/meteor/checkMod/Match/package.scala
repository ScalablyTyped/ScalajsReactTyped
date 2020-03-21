package typingsJapgolly.meteor.checkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Match {
  type Pattern = js.UndefOr[
    typingsJapgolly.std.StringConstructor | typingsJapgolly.std.NumberConstructor | typingsJapgolly.std.BooleanConstructor | typingsJapgolly.std.ObjectConstructor | typingsJapgolly.std.FunctionConstructor | (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]) | scala.Null | java.lang.String | scala.Double | scala.Boolean | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.Pattern */ js.Object
    ]) | (org.scalablytyped.runtime.StringDictionary[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.Pattern */ js.Object
    ]) | typingsJapgolly.meteor.checkMod.Match.Matcher[js.Any]
  ]
  type PatternMatch[T /* <: typingsJapgolly.meteor.checkMod.Match.Pattern */] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[K]> * / object}
    */ typingsJapgolly.meteor.meteorStrings.PatternMatch with js.Any) | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[0]> */ js.Object
  ]) | T | js.Function | scala.Boolean | scala.Double | java.lang.String
}

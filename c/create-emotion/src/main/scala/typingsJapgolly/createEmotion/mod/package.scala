package typingsJapgolly.createEmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSBaseObject = typingsJapgolly.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  type ClassNameArg = js.UndefOr[
    scala.Null | scala.Boolean | java.lang.String | (org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Null | scala.Boolean | java.lang.String]]) | typingsJapgolly.createEmotion.mod.ArrayClassNameArg
  ]
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typingsJapgolly.std.TemplateStringsArray
    - typingsJapgolly.createEmotion.mod.CSSObject
    - typingsJapgolly.createEmotion.mod.ArrayInterpolation
    - typingsJapgolly.createEmotion.mod.ClassInterpolation
  */
  type Interpolation = js.UndefOr[
    typingsJapgolly.createEmotion.mod._Interpolation | scala.Null | scala.Boolean | java.lang.String | scala.Double | typingsJapgolly.std.TemplateStringsArray
  ]
  type StylisPlugins = scala.Null | (js.Function1[/* repeated */ js.Any, js.Any]) | (js.Array[js.Function1[/* repeated */ js.Any, js.Any]])
}

package typingsJapgolly.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EvaluateFn[T] = java.lang.String | (js.Function2[/* arg1 */ T, /* repeated */ js.Any, js.Any])
  type EvaluateFnReturnType[T /* <: typingsJapgolly.puppeteer.mod.EvaluateFn[_] */] = js.Any
  type Headers = typingsJapgolly.std.Record[java.lang.String, java.lang.String]
  type LayoutDimension = java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - typingsJapgolly.puppeteer.mod.JSONArray
    - typingsJapgolly.puppeteer.mod.JSONObject
  */
  type Serializable = typingsJapgolly.puppeteer.mod._Serializable | scala.Double | java.lang.String | scala.Boolean | scala.Null
  type SerializableOrJSHandle = typingsJapgolly.puppeteer.mod.Serializable | typingsJapgolly.puppeteer.mod.JSHandle[js.Any]
  type UnwrapElementHandle[X] = X
  type WrapElementHandle[X] = X | typingsJapgolly.puppeteer.mod.ElementHandle[X]
}

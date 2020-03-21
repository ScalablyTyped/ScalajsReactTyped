package typingsJapgolly.phosphorCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonMod {
  type JSONPrimitive = scala.Boolean | scala.Double | java.lang.String | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.phosphorCoreutils.jsonMod.JSONPrimitive
    - typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
    - typingsJapgolly.phosphorCoreutils.jsonMod.JSONArray
  */
  type JSONValue = typingsJapgolly.phosphorCoreutils.jsonMod._JSONValue | typingsJapgolly.phosphorCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.phosphorCoreutils.jsonMod.JSONPrimitive
    - typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
    - typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONArray
  */
  type ReadonlyJSONValue = typingsJapgolly.phosphorCoreutils.jsonMod._ReadonlyJSONValue | typingsJapgolly.phosphorCoreutils.jsonMod.JSONPrimitive
}

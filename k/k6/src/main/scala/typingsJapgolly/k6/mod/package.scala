package typingsJapgolly.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Checker[VT] = js.Function1[/* val */ VT, scala.Boolean]
  type Checkers[VT] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.k6.mod.Checker[VT]]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typingsJapgolly.k6.mod.JSONArray
    - typingsJapgolly.k6.mod.JSONObject
  */
  type JSONValue = typingsJapgolly.k6.mod._JSONValue | scala.Null | scala.Boolean | scala.Double | java.lang.String
  type byte = scala.Double
  type bytes = js.Array[typingsJapgolly.k6.mod.byte]
}

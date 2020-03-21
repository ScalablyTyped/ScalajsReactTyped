package typingsJapgolly.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharedbMod {
  type Callback = js.Function1[/* err */ typingsJapgolly.sharedb.sharedbMod.Error, js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typingsJapgolly.sharedb.sharedbMod.JSONObject
    - typingsJapgolly.sharedb.sharedbMod.JSONArray
  */
  type JSONValue = typingsJapgolly.sharedb.sharedbMod._JSONValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type Path = js.Array[java.lang.String | scala.Double]
}

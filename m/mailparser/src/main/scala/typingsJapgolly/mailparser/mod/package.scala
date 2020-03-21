package typingsJapgolly.mailparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HeaderLines = js.Array[typingsJapgolly.mailparser.AnonKey]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typingsJapgolly.mailparser.mod.AddressObject
    - typingsJapgolly.std.Date
    - typingsJapgolly.mailparser.mod.StructuredHeader
  */
  type HeaderValue = typingsJapgolly.mailparser.mod._HeaderValue | js.Array[java.lang.String] | java.lang.String | js.Date
  type Headers = typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.mailparser.mod.HeaderValue]
  type Source = typingsJapgolly.node.Buffer | typingsJapgolly.node.streamMod.Stream | java.lang.String
}

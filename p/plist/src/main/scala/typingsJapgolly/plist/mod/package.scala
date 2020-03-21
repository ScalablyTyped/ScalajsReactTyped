package typingsJapgolly.plist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PlistBuildOptions = typingsJapgolly.xmlbuilder.mod.XMLToStringOptions
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typingsJapgolly.std.Date
    - typingsJapgolly.node.Buffer
    - typingsJapgolly.plist.mod.PlistObject
    - typingsJapgolly.plist.mod.PlistArray
  */
  type PlistValue = typingsJapgolly.plist.mod._PlistValue | java.lang.String | scala.Double | scala.Boolean | js.Date | typingsJapgolly.node.Buffer
}

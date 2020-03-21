package typingsJapgolly.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type XmlAtom = java.lang.String | scala.Double | scala.Boolean | scala.Null
  type XmlAttrs = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.xml.mod.XmlAtom]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xml.AnonAttr
    - typingsJapgolly.xml.AnonCdata
    - typingsJapgolly.xml.AnonAttrCdata
    - typingsJapgolly.xml.mod.XmlAtom
    - js.Array[typingsJapgolly.xml.mod.XmlAtom]
    - typingsJapgolly.xml.mod.XmlDescArray
  */
  type XmlDesc = typingsJapgolly.xml.mod._XmlDesc | js.Array[typingsJapgolly.xml.mod.XmlAtom] | typingsJapgolly.xml.mod.XmlAtom
  type XmlObject = (org.scalablytyped.runtime.StringDictionary[typingsJapgolly.xml.mod.ElementObject | typingsJapgolly.xml.mod.XmlDesc]) | typingsJapgolly.xml.mod.XmlDesc
}

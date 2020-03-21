package typingsJapgolly.xmlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Base type for associated arrays
    *
    * @interface AssocArray
    * @template T
    */
  type AssocArray[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ISelectResult = js.Array[org.scalajs.dom.raw.Node] | org.scalajs.dom.raw.Node | scala.Boolean | scala.Double | java.lang.String
  type IXmlSerializableConstructor = org.scalablytyped.runtime.Instantiable0[typingsJapgolly.xmlCore.mod.IXmlSerializable]
  type SelectNodes = js.Function2[
    /* node */ org.scalajs.dom.raw.Node, 
    /* xPath */ java.lang.String, 
    js.Array[org.scalajs.dom.raw.Node]
  ]
  type XmlAttributeType[T] = typingsJapgolly.xmlCore.mod.XmlSchemaItem[T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.xmlCore.xmlCoreStrings.utf8
    - typingsJapgolly.xmlCore.xmlCoreStrings.binary
    - typingsJapgolly.xmlCore.xmlCoreStrings.hex
    - typingsJapgolly.xmlCore.xmlCoreStrings.base64
    - typingsJapgolly.xmlCore.xmlCoreStrings.base64url
  */
  type XmlBufferEncoding = typingsJapgolly.xmlCore.mod._XmlBufferEncoding | java.lang.String
}

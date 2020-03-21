package typingsJapgolly.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlCdata", JSImport.Namespace)
@js.native
object xmlCdataMod extends js.Object {
  @js.native
  trait XmlCdata
    extends typingsJapgolly.xmlcreate.xmlNodeMod.default {
    var _data: js.Any = js.native
    /**
      * Gets the character data of the CDATA section.
      *
      * @returns The character data of the CDATA section.
      */
    /**
      * Sets the character data of the CDATA section.
      *
      * @param data The character data of the CDATA section.
      */
    var data: String = js.native
    /**
      * Throws an exception since {@link XmlCdata} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      * @param index This parameter is unused.
      *
      * @returns This method does not return.
      */
    def insertChild(node: typingsJapgolly.xmlcreate.xmlNodeMod.default): js.UndefOr[typingsJapgolly.xmlcreate.xmlNodeMod.default] = js.native
    def insertChild(node: typingsJapgolly.xmlcreate.xmlNodeMod.default, index: Double): js.UndefOr[typingsJapgolly.xmlcreate.xmlNodeMod.default] = js.native
    /**
      * Throws an exception since {@link XmlCdata} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typingsJapgolly.xmlcreate.xmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlCdata {
    /**
      * Initializes a new instance of the {@link XmlCdata} class.
      *
      * @param data The character data of the CDATA section.
      */
    def this(data: String) = this()
  }
  
}


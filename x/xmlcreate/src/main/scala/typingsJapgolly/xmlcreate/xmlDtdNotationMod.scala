package typingsJapgolly.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDtdNotation", JSImport.Namespace)
@js.native
object xmlDtdNotationMod extends js.Object {
  @js.native
  trait XmlDtdNotation
    extends typingsJapgolly.xmlcreate.xmlNodeMod.default {
    var _text: js.Any = js.native
    /**
      * Gets the text associated with the XML notation declaration.
      *
      * @return The text associated with the XML notation declaration.
      */
    /**
      * Sets the text associated with the XML notation declaration.
      *
      * @param text The text associated with the XML notation declaration.
      */
    var text: String = js.native
    /**
      * Throws an exception since {@link XmlDtdNotation} nodes cannot have any
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
      * Throws an exception since {@link XmlDtdNotation} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typingsJapgolly.xmlcreate.xmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlDtdNotation {
    /**
      * Initializes a new instance of the {@link XmlDtdNotation} class.
      *
      * @param text The text associated with the XML notation declaration.
      */
    def this(text: String) = this()
  }
  
}


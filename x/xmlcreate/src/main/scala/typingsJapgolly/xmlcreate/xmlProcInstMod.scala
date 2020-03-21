package typingsJapgolly.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlProcInst", JSImport.Namespace)
@js.native
object xmlProcInstMod extends js.Object {
  @js.native
  trait XmlProcInst
    extends typingsJapgolly.xmlcreate.xmlNodeMod.default {
    var _content: js.UndefOr[js.Any] = js.native
    var _target: js.Any = js.native
    /**
      * Gets the data of the processing instruction.
      *
      * @returns The data of the processing instruction. This value may be
      *          undefined.
      */
    /**
      * Sets the data of the processing instruction.
      *
      * @param content The data of the processing instruction. This value may be
      *                undefined.
      */
    var content: js.UndefOr[String] = js.native
    /**
      * Gets the target of the processing instruction.
      *
      * @returns The target of the processing instruction.
      */
    /**
      * Sets the target of the processing instruction.
      *
      * @param target The target of the processing instruction.
      */
    var target: String = js.native
    /**
      * Throws an exception since {@link XmlProcInst} nodes cannot have any
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
      * Throws an exception since {@link XmlProcInst} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typingsJapgolly.xmlcreate.xmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlProcInst {
    /**
      * Initializes a new instance of the {@link XmlProcInst} class.
      *
      * @param target The target of the processing instruction.
      * @param content The data of the processing instruction, or undefined if
      *                there is no target.
      */
    def this(target: String) = this()
    def this(target: String, content: String) = this()
  }
  
}


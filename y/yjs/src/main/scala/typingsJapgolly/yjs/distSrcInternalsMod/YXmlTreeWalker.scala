package typingsJapgolly.yjs.distSrcInternalsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yjs/dist/src/internals", "YXmlTreeWalker")
@js.native
open class YXmlTreeWalker protected ()
  extends typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlTreeWalker {
  def this(root: typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement) = this()
  /**
    * @param {YXmlFragment | YXmlElement} root
    * @param {function(AbstractType<any>):boolean} [f]
    */
  def this(root: typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment) = this()
  def this(
    root: typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement,
    f: js.Function1[
        /* arg0 */ typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], 
        Boolean
      ]
  ) = this()
  def this(
    root: typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment,
    f: js.Function1[
        /* arg0 */ typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], 
        Boolean
      ]
  ) = this()
}

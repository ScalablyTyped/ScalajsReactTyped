package typingsJapgolly.inferno

import org.scalajs.dom.Element
import typingsJapgolly.inferno.distCoreTypesMod.VNode
import typingsJapgolly.infernoVnodeFlags.mod.VNodeFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomWrappersProcessElementMod {
  
  @JSImport("inferno/dist/DOM/wrappers/processElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFormElementEventHandlers(flags: VNodeFlags, dom: Element, nextPropsOrEmpty: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFormElementEventHandlers")(flags.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], nextPropsOrEmpty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isControlledFormElement(nextPropsOrEmpty: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isControlledFormElement")(nextPropsOrEmpty.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def processElement(
    flags: VNodeFlags,
    vNode: VNode,
    dom: Element,
    nextPropsOrEmpty: Any,
    mounting: Boolean,
    isControlled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processElement")(flags.asInstanceOf[js.Any], vNode.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], nextPropsOrEmpty.asInstanceOf[js.Any], mounting.asInstanceOf[js.Any], isControlled.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

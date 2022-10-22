package typingsJapgolly.domutils

import typingsJapgolly.domhandler.libNodeMod.ChildNode
import typingsJapgolly.domhandler.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libManipulationMod {
  
  @JSImport("domutils/lib/manipulation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def append(elem: ChildNode, next: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(elem.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendChild(elem: Element, child: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(elem.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def prepend(elem: ChildNode, prev: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(elem.asInstanceOf[js.Any], prev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def prependChild(elem: Element, child: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prependChild")(elem.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeElement(elem: ChildNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def replaceElement(elem: ChildNode, replacement: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(elem.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

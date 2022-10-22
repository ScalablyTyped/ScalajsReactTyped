package typingsJapgolly.reactRemoveScroll

import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactRemoveScroll.distEs5TypesMod.Axis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5HandleScrollMod {
  
  @JSImport("react-remove-scroll/dist/es5/handleScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleScroll(axis: Axis, endTarget: HTMLElement, event: Any, sourceDelta: Double, noOverscroll: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("handleScroll")(axis.asInstanceOf[js.Any], endTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], sourceDelta.asInstanceOf[js.Any], noOverscroll.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def locationCouldBeScrolled(axis: Axis, node: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("locationCouldBeScrolled")(axis.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

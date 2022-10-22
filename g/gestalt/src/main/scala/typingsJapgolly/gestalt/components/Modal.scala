package typingsJapgolly.gestalt.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.ModalProps
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("gestalt", "Modal")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Modal.type): Default[HTMLDivElement] = new Default[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[ModalProps] & RefAttributes[HTMLDivElement]): Default[HTMLDivElement] = new Default[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

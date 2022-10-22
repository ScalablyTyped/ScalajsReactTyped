package typingsJapgolly.gestalt.components

import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.IconButtonProps
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconButton {
  
  @JSImport("gestalt", "IconButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IconButton.type): Default[(HTMLButtonElement | HTMLAnchorElement) & js.Object] = new Default[(HTMLButtonElement | HTMLAnchorElement) & js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[IconButtonProps] & (RefAttributes[HTMLButtonElement | HTMLAnchorElement])): Default[(HTMLButtonElement | HTMLAnchorElement) & js.Object] = new Default[(HTMLButtonElement | HTMLAnchorElement) & js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.gestalt.components

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.SearchFieldProps
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchField {
  
  @JSImport("gestalt", "SearchField")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SearchField.type): Default[HTMLInputElement] = new Default[HTMLInputElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[SearchFieldProps] & RefAttributes[HTMLInputElement]): Default[HTMLInputElement] = new Default[HTMLInputElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

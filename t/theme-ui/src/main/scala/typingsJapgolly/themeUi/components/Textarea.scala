package typingsJapgolly.themeUi.components

import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcTextareaMod.TextareaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Textarea {
  
  @JSImport("theme-ui", "Textarea")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Textarea.type): Default[HTMLTextAreaElement] = new Default[HTMLTextAreaElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[TextareaProps] & RefAttributes[HTMLTextAreaElement]): Default[HTMLTextAreaElement] = new Default[HTMLTextAreaElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

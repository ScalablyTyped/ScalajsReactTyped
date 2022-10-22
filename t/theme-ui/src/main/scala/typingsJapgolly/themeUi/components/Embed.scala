package typingsJapgolly.themeUi.components

import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcEmbedMod.EmbedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Embed {
  
  @JSImport("theme-ui", "Embed")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Embed.type): Default[HTMLIFrameElement] = new Default[HTMLIFrameElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[EmbedProps] & RefAttributes[HTMLIFrameElement]): Default[HTMLIFrameElement] = new Default[HTMLIFrameElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.themeUi.components

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcImageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  @JSImport("theme-ui", "Image")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Image.type): Default[HTMLImageElement] = new Default[HTMLImageElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[ImageProps] & RefAttributes[HTMLImageElement]): Default[HTMLImageElement] = new Default[HTMLImageElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcSvgMod.SVGProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SVG {
  
  @JSImport("@theme-ui/components/dist/declarations/src/SVG", "SVG")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SVG.type): Default[SVGSVGElement] = new Default[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[SVGProps] & RefAttributes[SVGSVGElement]): Default[SVGSVGElement] = new Default[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

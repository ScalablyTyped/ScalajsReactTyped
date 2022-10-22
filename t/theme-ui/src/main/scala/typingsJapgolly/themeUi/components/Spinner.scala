package typingsJapgolly.themeUi.components

import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcSpinnerMod.SpinnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spinner {
  
  @JSImport("theme-ui", "Spinner")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Spinner.type): Default[SVGSVGElement] = new Default[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[SpinnerProps] & RefAttributes[SVGSVGElement]): Default[SVGSVGElement] = new Default[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

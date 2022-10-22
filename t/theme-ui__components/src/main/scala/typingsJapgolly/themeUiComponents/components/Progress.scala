package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLProgressElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcProgressMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Progress {
  
  @JSImport("@theme-ui/components", "Progress")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Progress.type): Default[HTMLProgressElement] = new Default[HTMLProgressElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[ProgressProps] & RefAttributes[HTMLProgressElement]): Default[HTMLProgressElement] = new Default[HTMLProgressElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

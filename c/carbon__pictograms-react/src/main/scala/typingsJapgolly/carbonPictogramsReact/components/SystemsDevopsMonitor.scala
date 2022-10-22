package typingsJapgolly.carbonPictogramsReact.components

import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.carbonPictogramsReact.mod.CarbonPictogramProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SystemsDevopsMonitor {
  
  @JSImport("@carbon/pictograms-react", "SystemsDevopsMonitor")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SystemsDevopsMonitor.type): SharedBuilder_CarbonPictogramPropsRefAttributes1100045141[SVGSVGElement] = new SharedBuilder_CarbonPictogramPropsRefAttributes1100045141[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarbonPictogramProps & RefAttributes[SVGSVGElement]): SharedBuilder_CarbonPictogramPropsRefAttributes1100045141[SVGSVGElement] = new SharedBuilder_CarbonPictogramPropsRefAttributes1100045141[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

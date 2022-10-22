package typingsJapgolly.carbonIconsReact.components

import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.carbonIconsReact.mod.CarbonIconProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SendBackward {
  
  @JSImport("@carbon/icons-react", "SendBackward")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SendBackward.type): SharedBuilder_CarbonIconPropsRefAttributes_759481778[SVGSVGElement] = new SharedBuilder_CarbonIconPropsRefAttributes_759481778[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarbonIconProps & RefAttributes[SVGSVGElement]): SharedBuilder_CarbonIconPropsRefAttributes_759481778[SVGSVGElement] = new SharedBuilder_CarbonIconPropsRefAttributes_759481778[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

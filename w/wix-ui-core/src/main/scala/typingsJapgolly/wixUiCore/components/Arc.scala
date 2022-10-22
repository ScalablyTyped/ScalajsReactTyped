package typingsJapgolly.wixUiCore.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixUiCore.distEsSrcComponentsCircularProgressBarArcMod.ArcProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arc {
  
  inline def apply(className: String, size: Double, strokeWidth: Double, value: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ArcProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/circular-progress-bar/Arc", "Arc")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ArcProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

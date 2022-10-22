package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.Angle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arc {
  
  inline def apply(angle: Any, className: Any, strokeWidth: Any, viewBoxSize: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], viewBoxSize = viewBoxSize.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Angle]))
  }
  
  @JSImport("wix-style-react/dist/types/Loader/Arc", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Angle): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

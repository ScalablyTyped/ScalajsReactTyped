package typingsJapgolly.bizcharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.bizcharts.anon.Callback
import typingsJapgolly.bizcharts.anon.Radius
import typingsJapgolly.bizcharts.libGComponentsRectMod.IRectProps
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rect {
  
  inline def apply(attrs: Radius): Builder = {
    val __props = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[(Pick[IRectProps, String | Double]) & RefAttributes[Any]]))
  }
  
  @JSImport("bizcharts", "GComponents.Rect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Callback): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def isClipShape(value: Boolean): this.type = set("isClipShape", value.asInstanceOf[js.Any])
    
    inline def matrix(value: js.Array[Double]): this.type = set("matrix", value.asInstanceOf[js.Any])
    
    inline def matrixVarargs(value: Double*): this.type = set("matrix", js.Array(value*))
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: (Pick[IRectProps, String | Double]) & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

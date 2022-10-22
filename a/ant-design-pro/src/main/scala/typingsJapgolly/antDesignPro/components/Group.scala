package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.bizcharts.libGComponentsGroupMod.IGroupProps
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "GComponents.Group")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def translate(value: js.Tuple2[Double, Double]): this.type = set("translate", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Group.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: (Pick[IGroupProps, String | Double]) & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.bizcharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libInterfaceMod.CoordinateActions
import typingsJapgolly.antvG2.libInterfaceMod.CoordinateCfg
import typingsJapgolly.bizcharts.bizchartsStrings.cartesian
import typingsJapgolly.bizcharts.bizchartsStrings.helix
import typingsJapgolly.bizcharts.bizchartsStrings.polar
import typingsJapgolly.bizcharts.bizchartsStrings.rect
import typingsJapgolly.bizcharts.bizchartsStrings.theta
import typingsJapgolly.bizcharts.bizchartsStrings.x
import typingsJapgolly.bizcharts.bizchartsStrings.y
import typingsJapgolly.bizcharts.libComponentsCoordinateMod.ICoordinateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Coordinate {
  
  @JSImport("bizcharts", "Coordinate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actions(value: js.Array[CoordinateActions]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: CoordinateActions*): this.type = set("actions", js.Array(value*))
    
    inline def cfg(value: CoordinateCfg): this.type = set("cfg", value.asInstanceOf[js.Any])
    
    inline def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    inline def innerRadius(value: Double): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    inline def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def reflect(value: x | y): this.type = set("reflect", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def scale(value: js.Tuple2[Double, Double]): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    inline def transpose(value: Boolean): this.type = set("transpose", value.asInstanceOf[js.Any])
    
    inline def `type`(value: polar | theta | rect | cartesian | helix): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Coordinate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ICoordinateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

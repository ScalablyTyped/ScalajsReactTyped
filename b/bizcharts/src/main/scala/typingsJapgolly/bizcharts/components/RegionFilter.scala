package typingsJapgolly.bizcharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.antvG2.libInterfaceMod.ComponentAnimateOption
import typingsJapgolly.antvGBase.libTypesMod.ShapeAttrs
import typingsJapgolly.bizcharts.libComponentsAnnotationRegionFilterMod.AnnotationRegionFilterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegionFilter {
  
  inline def apply(color: String, end: AnnotationPosition, start: AnnotationPosition): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnnotationRegionFilterProps]))
  }
  
  @JSImport("bizcharts", "Annotation.RegionFilter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.bizcharts.mod.Annotation.RegionFilter] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animateOption(value: ComponentAnimateOption): this.type = set("animateOption", value.asInstanceOf[js.Any])
    
    inline def apply(value: js.Array[String]): this.type = set("apply", value.asInstanceOf[js.Any])
    
    inline def applyVarargs(value: String*): this.type = set("apply", js.Array(value*))
    
    inline def chartIns(value: Any): this.type = set("chartIns", value.asInstanceOf[js.Any])
    
    inline def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    inline def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    inline def style(value: ShapeAttrs): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnnotationRegionFilterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

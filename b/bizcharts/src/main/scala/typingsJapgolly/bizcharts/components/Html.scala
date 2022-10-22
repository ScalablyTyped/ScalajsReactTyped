package typingsJapgolly.bizcharts.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.antvG2Strings.bottom
import typingsJapgolly.antvG2.antvG2Strings.left
import typingsJapgolly.antvG2.antvG2Strings.middle
import typingsJapgolly.antvG2.antvG2Strings.right
import typingsJapgolly.antvG2.antvG2Strings.top
import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.antvG2.libInterfaceMod.ComponentAnimateOption
import typingsJapgolly.bizcharts.libComponentsAnnotationHtmlMod.HtmlAnnotationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Html {
  
  inline def apply(
    html: String | HTMLElement | (js.Function2[
      /* container */ HTMLElement, 
      /* view */ typingsJapgolly.antvG2.libChartViewMod.View, 
      Unit | String | HTMLElement
    ]),
    position: AnnotationPosition
  ): Builder = {
    val __props = js.Dynamic.literal(html = html.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HtmlAnnotationProps]))
  }
  
  @JSImport("bizcharts", "Annotation.Html")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.bizcharts.mod.Annotation.Html] {
    
    inline def alignX(value: left | middle | right): this.type = set("alignX", value.asInstanceOf[js.Any])
    
    inline def alignY(value: top | middle | bottom): this.type = set("alignY", value.asInstanceOf[js.Any])
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animateOption(value: ComponentAnimateOption): this.type = set("animateOption", value.asInstanceOf[js.Any])
    
    inline def chartIns(value: Any): this.type = set("chartIns", value.asInstanceOf[js.Any])
    
    inline def container(value: String | HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    inline def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    inline def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HtmlAnnotationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

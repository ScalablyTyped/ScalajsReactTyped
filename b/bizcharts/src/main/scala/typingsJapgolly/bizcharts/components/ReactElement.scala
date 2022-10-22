package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvComponent.libTypesMod.AnimateOption
import typingsJapgolly.antvComponent.libTypesMod.LooseObject
import typingsJapgolly.bizcharts.bizchartsStrings.bottom
import typingsJapgolly.bizcharts.bizchartsStrings.left
import typingsJapgolly.bizcharts.bizchartsStrings.middle
import typingsJapgolly.bizcharts.bizchartsStrings.right
import typingsJapgolly.bizcharts.bizchartsStrings.top
import typingsJapgolly.bizcharts.libComponentsAnnotationReactElementMod.HtmlAnnotationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactElement {
  
  inline def apply(content: Element | (js.Function1[/* container */ js.UndefOr[HTMLElement], Element])): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HtmlAnnotationProps]))
  }
  
  @JSImport("bizcharts", "Annotation.ReactElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.bizcharts.mod.Annotation.ReactElement] {
    
    inline def LocationType(value: String): this.type = set("LocationType", value.asInstanceOf[js.Any])
    
    inline def alignX(value: left | middle | right): this.type = set("alignX", value.asInstanceOf[js.Any])
    
    inline def alignY(value: top | middle | bottom): this.type = set("alignY", value.asInstanceOf[js.Any])
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animateOption(value: AnimateOption): this.type = set("animateOption", value.asInstanceOf[js.Any])
    
    inline def capture(value: Boolean): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def chartIns(value: Any): this.type = set("chartIns", value.asInstanceOf[js.Any])
    
    inline def container(value: HTMLElement | String): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def defaultCfg(value: js.Object): this.type = set("defaultCfg", value.asInstanceOf[js.Any])
    
    inline def domStyles(value: LooseObject): this.type = set("domStyles", value.asInstanceOf[js.Any])
    
    inline def events(value: js.Object): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    inline def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    inline def parent(value: HTMLElement | String): this.type = set("parent", value.asInstanceOf[js.Any])
    
    inline def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def updateAutoRender(value: Boolean): this.type = set("updateAutoRender", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HtmlAnnotationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

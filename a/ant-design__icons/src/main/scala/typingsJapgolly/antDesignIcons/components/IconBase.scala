package typingsJapgolly.antDesignIcons.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignIcons.esComponentsIconBaseMod.IconProps
import typingsJapgolly.antDesignIconsSvg.esTypesMod.IconDefinition
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconBase {
  
  inline def apply(icon: IconDefinition): Builder = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("@ant-design/icons/es/components/IconBase", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def focusable(value: String): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[SVGSVGElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[SVGSVGElement & Element]) => value(t0).runNow()))
    
    inline def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
    
    inline def secondaryColor(value: String): this.type = set("secondaryColor", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

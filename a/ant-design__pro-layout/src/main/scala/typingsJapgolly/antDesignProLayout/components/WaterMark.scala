package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.italic
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.light
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.none
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.normal
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.oblique
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.weight
import typingsJapgolly.antDesignProLayout.esComponentsWaterMarkMod.WaterMarkProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WaterMark {
  
  @JSImport("@ant-design/pro-layout", "WaterMark")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: String | js.Array[String]): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentVarargs(value: String*): this.type = set("content", js.Array(value*))
    
    inline def fontColor(value: String): this.type = set("fontColor", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: Double | String): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def fontStyle(value: none | normal | italic | oblique): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    inline def fontWeight(value: normal | light | weight | Double): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def gapX(value: Double): this.type = set("gapX", value.asInstanceOf[js.Any])
    
    inline def gapY(value: Double): this.type = set("gapY", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def markClassName(value: String): this.type = set("markClassName", value.asInstanceOf[js.Any])
    
    inline def markStyle(value: CSSProperties): this.type = set("markStyle", value.asInstanceOf[js.Any])
    
    inline def offsetLeft(value: Double): this.type = set("offsetLeft", value.asInstanceOf[js.Any])
    
    inline def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: WaterMark.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WaterMarkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

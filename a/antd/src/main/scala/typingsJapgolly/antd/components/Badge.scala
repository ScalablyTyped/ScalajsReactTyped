package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.libBadgeMod.BadgeProps
import typingsJapgolly.antd.libBadgeRibbonMod.RibbonProps
import typingsJapgolly.antd.libUtilColorsMod.PresetColorType
import typingsJapgolly.antd.libUtilColorsMod.PresetStatusColorType
import typingsJapgolly.antd.libUtilTypeMod.LiteralUnion
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  object Ribbon {
    
    @JSImport("antd", "Badge.Ribbon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Ribbon.type): SharedBuilder_RibbonProps1895949547 = new SharedBuilder_RibbonProps1895949547(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RibbonProps): SharedBuilder_RibbonProps1895949547 = new SharedBuilder_RibbonProps1895949547(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Badge")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: LiteralUnion[PresetColorType, String]): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def count(value: VdomNode): this.type = set("count", value.rawNode.asInstanceOf[js.Any])
    
    inline def countNull: this.type = set("count", null)
    
    inline def countVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("count", js.Array(value*))
    
    inline def countVdomElement(value: VdomElement): this.type = set("count", value.rawElement.asInstanceOf[js.Any])
    
    inline def dot(value: Boolean): this.type = set("dot", value.asInstanceOf[js.Any])
    
    inline def offset(value: js.Tuple2[Double | String, Double | String]): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def overflowCount(value: Double): this.type = set("overflowCount", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def scrollNumberPrefixCls(value: String): this.type = set("scrollNumberPrefixCls", value.asInstanceOf[js.Any])
    
    inline def showZero(value: Boolean): this.type = set("showZero", value.asInstanceOf[js.Any])
    
    inline def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: PresetStatusColorType): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def text(value: VdomNode): this.type = set("text", value.rawNode.asInstanceOf[js.Any])
    
    inline def textNull: this.type = set("text", null)
    
    inline def textVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("text", js.Array(value*))
    
    inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.antDesignProStrings.down
import typingsJapgolly.antDesignPro.antDesignProStrings.up
import typingsJapgolly.antDesignPro.libNumberInfoMod.NumberInfoProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NumberInfo {
  
  @JSImport("ant-design-pro", "NumberInfo")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.NumberInfo] {
    
    inline def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def status(value: up | down): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subTitle(value: Node | String): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    inline def subTitleNull: this.type = set("subTitle", null)
    
    inline def subTitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subTitle", js.Array(value*))
    
    inline def subTitleVdomElement(value: VdomElement): this.type = set("subTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def subTotal(value: Double): this.type = set("subTotal", value.asInstanceOf[js.Any])
    
    inline def suffix(value: String): this.type = set("suffix", value.asInstanceOf[js.Any])
    
    inline def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: Node | String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def total(value: Node | String): this.type = set("total", value.asInstanceOf[js.Any])
    
    inline def totalNull: this.type = set("total", null)
    
    inline def totalVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("total", js.Array(value*))
    
    inline def totalVdomElement(value: VdomElement): this.type = set("total", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NumberInfo.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NumberInfoProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

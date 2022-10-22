package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libSpinMod.SpinProps
import typingsJapgolly.antd.libSpinMod.SpinSize
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spin {
  
  @JSImport("antd", "Spin")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def indicator(value: VdomElement): this.type = set("indicator", value.rawElement.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def size(value: SpinSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def spinning(value: Boolean): this.type = set("spinning", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tip(value: VdomNode): this.type = set("tip", value.rawNode.asInstanceOf[js.Any])
    
    inline def tipNull: this.type = set("tip", null)
    
    inline def tipVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("tip", js.Array(value*))
    
    inline def tipVdomElement(value: VdomElement): this.type = set("tip", value.rawElement.asInstanceOf[js.Any])
    
    inline def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Spin.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpinProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

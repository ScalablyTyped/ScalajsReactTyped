package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libStatisticCountdownMod.CountdownProps
import typingsJapgolly.antd.libStatisticUtilsMod.FormatConfig
import typingsJapgolly.antd.libStatisticUtilsMod.Formatter
import typingsJapgolly.antd.libStatisticUtilsMod.countdownValueType
import typingsJapgolly.antd.libStatisticUtilsMod.valueType
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Countdown {
  
  @JSImport("antd/lib/statistic/Countdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def decimalSeparator(value: String): this.type = set("decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def formatter(value: Formatter): this.type = set("formatter", value.asInstanceOf[js.Any])
    
    inline def formatterFunction2(
      value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("formatter", js.Any.fromFunction2(value))
    
    inline def groupSeparator(value: String): this.type = set("groupSeparator", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ js.UndefOr[countdownValueType] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.UndefOr[countdownValueType]) => value(t0).runNow()))
    
    inline def onFinish(value: Callback): this.type = set("onFinish", value.toJsFn)
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    inline def prefix(value: VdomNode): this.type = set("prefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def prefixNull: this.type = set("prefix", null)
    
    inline def prefixVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("prefix", js.Array(value*))
    
    inline def prefixVdomElement(value: VdomElement): this.type = set("prefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def suffixNull: this.type = set("suffix", null)
    
    inline def suffixVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("suffix", js.Array(value*))
    
    inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def value(value: countdownValueType): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueRender(
      value: /* node */ japgolly.scalajs.react.facade.React.Node => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("valueRender", js.Any.fromFunction1(value))
    
    inline def valueStyle(value: CSSProperties): this.type = set("valueStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Countdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CountdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

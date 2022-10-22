package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.buildLineNumberMod.LineNumberProps
import typingsJapgolly.reactLazylog.buildLineNumberMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineNumber {
  
  inline def apply(number: Double): Builder = {
    val __props = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineNumberProps]))
  }
  
  @JSImport("react-lazylog/build/LineNumber", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def highlight(value: Boolean): this.type = set("highlight", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLAnchorElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & Element]) => value(t0).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineNumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

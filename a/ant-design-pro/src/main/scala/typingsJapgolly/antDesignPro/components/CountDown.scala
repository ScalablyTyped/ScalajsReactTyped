package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libCountDownMod.ICountDownProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountDown {
  
  inline def apply(target: js.Date | Double): Builder = {
    val __props = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ICountDownProps]))
  }
  
  @JSImport("ant-design-pro", "CountDown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.CountDown] {
    
    inline def format(value: /* time */ Double => Callback): this.type = set("format", js.Any.fromFunction1((t0: /* time */ Double) => value(t0).runNow()))
    
    inline def onEnd(value: Callback): this.type = set("onEnd", value.toJsFn)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICountDownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

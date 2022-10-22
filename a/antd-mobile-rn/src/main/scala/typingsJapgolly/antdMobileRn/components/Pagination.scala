package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.button
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.number
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.pointer
import typingsJapgolly.antdMobileRn.libPaginationIndexDotnativeMod.PaginationNativeProps
import typingsJapgolly.antdMobileRn.libPaginationStyleIndexDotnativeMod.IPaginationStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  inline def apply(current: Double, total: Double): Builder = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationNativeProps]))
  }
  
  @JSImport("antd-mobile-rn", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.Pagination] {
    
    inline def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def indicatorStyleNull: this.type = set("indicatorStyle", null)
    
    inline def mode(value: button | number | pointer): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def nextText(value: String): this.type = set("nextText", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* current */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* current */ Double) => value(t0).runNow()))
    
    inline def onNext(value: Callback): this.type = set("onNext", value.toJsFn)
    
    inline def onPrev(value: Callback): this.type = set("onPrev", value.toJsFn)
    
    inline def prevText(value: String): this.type = set("prevText", value.asInstanceOf[js.Any])
    
    inline def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: IPaginationStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

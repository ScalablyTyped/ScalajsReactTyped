package typingsJapgolly.reactTimeago.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactTimeago.mod.Formatter
import typingsJapgolly.reactTimeago.mod.ReactTimeagoProps
import typingsJapgolly.reactTimeago.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTimeago {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactTimeago.reactTimeagoStrings.a, typingsJapgolly.reactTimeago.reactTimeagoStrings.abbr */ Any */](date: String | Double | js.Date): Builder[T] = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ReactTimeagoProps[T] & ComponentProps[T]]))
  }
  
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactTimeago.reactTimeagoStrings.a, typingsJapgolly.reactTimeago.reactTimeagoStrings.abbr */ Any */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^[T]] {
    
    inline def component(value: T): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def formatter(value: Formatter): this.type = set("formatter", value.asInstanceOf[js.Any])
    
    inline def live(value: Boolean): this.type = set("live", value.asInstanceOf[js.Any])
    
    inline def maxPeriod(value: Double): this.type = set("maxPeriod", value.asInstanceOf[js.Any])
    
    inline def minPeriod(value: Double): this.type = set("minPeriod", value.asInstanceOf[js.Any])
    
    inline def now(value: CallbackTo[Double]): this.type = set("now", value.toJsFn)
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactTimeago.reactTimeagoStrings.a, typingsJapgolly.reactTimeago.reactTimeagoStrings.abbr */ Any */](p: ReactTimeagoProps[T] & ComponentProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactTimeago

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  open class ^[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactTimeago.reactTimeagoStrings.a, typingsJapgolly.reactTimeago.reactTimeagoStrings.abbr */ Any */] ()
    extends Component[ReactTimeagoProps[T] & ComponentProps[T], js.Object, Any]
  
  @js.native
  trait Formatter extends StObject {
    
    def apply(value: Double, unit: Unit, suffix: Suffix, epochMiliseconds: Double): Node = js.native
    def apply(value: Double, unit: Unit, suffix: Suffix, epochMiliseconds: Double, nextFormatter: Formatter): Node = js.native
  }
  
  type ReactTimeago[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactTimeago.reactTimeagoStrings.a, typingsJapgolly.reactTimeago.reactTimeagoStrings.abbr */ Any */] = japgolly.scalajs.react.facade.React.Component[ReactTimeagoProps[T] & ComponentProps[T] & js.Object, js.Object]
  
  trait ReactTimeagoProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactTimeago.reactTimeagoStrings.a, typingsJapgolly.reactTimeago.reactTimeagoStrings.abbr */ Any */] extends StObject {
    
    val component: js.UndefOr[T] = js.undefined
    
    val date: String | Double | js.Date
    
    val formatter: js.UndefOr[Formatter] = js.undefined
    
    val live: js.UndefOr[Boolean] = js.undefined
    
    val maxPeriod: js.UndefOr[Double] = js.undefined
    
    val minPeriod: js.UndefOr[Double] = js.undefined
    
    val now: js.UndefOr[js.Function0[Double]] = js.undefined
    
    val title: js.UndefOr[String] = js.undefined
  }
  object ReactTimeagoProps {
    
    inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactTimeago.reactTimeagoStrings.a, typingsJapgolly.reactTimeago.reactTimeagoStrings.abbr */ Any */](date: String | Double | js.Date): ReactTimeagoProps[T] = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTimeagoProps[T]]
    }
    
    extension [Self <: ReactTimeagoProps[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactTimeago.reactTimeagoStrings.a, typingsJapgolly.reactTimeago.reactTimeagoStrings.abbr */ Any */](x: Self & ReactTimeagoProps[T]) {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDate(value: String | Double | js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
      
      inline def setMaxPeriod(value: Double): Self = StObject.set(x, "maxPeriod", value.asInstanceOf[js.Any])
      
      inline def setMaxPeriodUndefined: Self = StObject.set(x, "maxPeriod", js.undefined)
      
      inline def setMinPeriod(value: Double): Self = StObject.set(x, "minPeriod", value.asInstanceOf[js.Any])
      
      inline def setMinPeriodUndefined: Self = StObject.set(x, "minPeriod", js.undefined)
      
      inline def setNow(value: CallbackTo[Double]): Self = StObject.set(x, "now", value.toJsFn)
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.ago
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.`from now`
  */
  trait Suffix extends StObject
  object Suffix {
    
    inline def ago: typingsJapgolly.reactTimeago.reactTimeagoStrings.ago = "ago".asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.ago]
    
    inline def `from now`: typingsJapgolly.reactTimeago.reactTimeagoStrings.`from now` = ("from now").asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.`from now`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.second
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.minute
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.hour
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.day
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.week
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.month
    - typingsJapgolly.reactTimeago.reactTimeagoStrings.year
  */
  trait Unit extends StObject
  object Unit {
    
    inline def day: typingsJapgolly.reactTimeago.reactTimeagoStrings.day = "day".asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.day]
    
    inline def hour: typingsJapgolly.reactTimeago.reactTimeagoStrings.hour = "hour".asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.hour]
    
    inline def minute: typingsJapgolly.reactTimeago.reactTimeagoStrings.minute = "minute".asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.minute]
    
    inline def month: typingsJapgolly.reactTimeago.reactTimeagoStrings.month = "month".asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.month]
    
    inline def second: typingsJapgolly.reactTimeago.reactTimeagoStrings.second = "second".asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.second]
    
    inline def week: typingsJapgolly.reactTimeago.reactTimeagoStrings.week = "week".asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.week]
    
    inline def year: typingsJapgolly.reactTimeago.reactTimeagoStrings.year = "year".asInstanceOf[typingsJapgolly.reactTimeago.reactTimeagoStrings.year]
  }
}

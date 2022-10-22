package typingsJapgolly.reactCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactCalendar.mod.CalendarTileProperties
import typingsJapgolly.reactCalendar.mod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DetailViewProps_738864266 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def calendarType(value: CalendarType): this.type = set("calendarType", value.asInstanceOf[js.Any])
  
  inline def hover(value: js.Date): this.type = set("hover", value.asInstanceOf[js.Any])
  
  inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
  
  inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
  
  inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
  
  inline def onClick(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
  
  inline def onMouseOver(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onMouseOver", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
  
  inline def renderChildren(value: /* props */ CalendarTileProperties => Element | Null): this.type = set("renderChildren", js.Any.fromFunction1(value))
  
  inline def tileClassName(
    value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
  ): this.type = set("tileClassName", value.asInstanceOf[js.Any])
  
  inline def tileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): this.type = set("tileClassName", js.Any.fromFunction1(value))
  
  inline def tileClassNameVarargs(value: String*): this.type = set("tileClassName", js.Array(value*))
  
  inline def tileContent(value: Element | (js.Function1[/* props */ CalendarTileProperties, Element | Null])): this.type = set("tileContent", value.asInstanceOf[js.Any])
  
  inline def tileContentFunction1(value: /* props */ CalendarTileProperties => Element | Null): this.type = set("tileContent", js.Any.fromFunction1(value))
  
  inline def tileContentVdomElement(value: VdomElement): this.type = set("tileContent", value.rawElement.asInstanceOf[js.Any])
  
  inline def tileDisabled(value: /* props */ CalendarTileProperties => Boolean): this.type = set("tileDisabled", js.Any.fromFunction1(value))
  
  inline def value(value: js.Date | js.Array[js.Date]): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueVarargs(value: js.Date*): this.type = set("value", js.Array(value*))
}

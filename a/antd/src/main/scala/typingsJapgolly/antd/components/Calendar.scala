package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.OnChange
import typingsJapgolly.antd.libCalendarGenerateCalendarMod.CalendarMode
import typingsJapgolly.antd.libCalendarGenerateCalendarMod.CalendarProps
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.PickerLocale
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("antd", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dateCellRender(value: Moment => japgolly.scalajs.react.facade.React.Node): this.type = set("dateCellRender", js.Any.fromFunction1(value))
    
    inline def dateFullCellRender(value: Moment => japgolly.scalajs.react.facade.React.Node): this.type = set("dateFullCellRender", js.Any.fromFunction1(value))
    
    inline def defaultValue(value: Moment): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
    
    inline def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    inline def headerRender(value: /* config */ OnChange[Moment] => japgolly.scalajs.react.facade.React.Node): this.type = set("headerRender", js.Any.fromFunction1(value))
    
    inline def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def mode(value: CalendarMode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def monthCellRender(value: Moment => japgolly.scalajs.react.facade.React.Node): this.type = set("monthCellRender", js.Any.fromFunction1(value))
    
    inline def monthFullCellRender(value: Moment => japgolly.scalajs.react.facade.React.Node): this.type = set("monthFullCellRender", js.Any.fromFunction1(value))
    
    inline def onChange(value: Moment => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: Moment) => value(t0).runNow()))
    
    inline def onPanelChange(value: (Moment, /* mode */ CalendarMode) => Callback): this.type = set("onPanelChange", js.Any.fromFunction2((t0: Moment, t1: /* mode */ CalendarMode) => (value(t0, t1)).runNow()))
    
    inline def onSelect(value: Moment => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: Moment) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def validRange(value: js.Tuple2[Moment, Moment]): this.type = set("validRange", value.asInstanceOf[js.Any])
    
    inline def value(value: Moment): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarProps[Moment]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

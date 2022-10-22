package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libCalendarGenerateCalendarMod.CalendarMode
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCalendarHeaderMod {
  
  @JSImport("antd/lib/calendar/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: CalendarHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CalendarHeaderProps[DateType] extends StObject {
    
    var fullscreen: Boolean
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    var mode: CalendarMode
    
    def onChange(date: DateType): Unit
    
    def onModeChange(mode: CalendarMode): Unit
    
    var prefixCls: String
    
    var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
    
    var value: DateType
  }
  object CalendarHeaderProps {
    
    inline def apply[DateType](
      fullscreen: Boolean,
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      mode: CalendarMode,
      onChange: DateType => Callback,
      onModeChange: CalendarMode => Callback,
      prefixCls: String,
      value: DateType
    ): CalendarHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: DateType) => onChange(t0).runNow()), onModeChange = js.Any.fromFunction1((t0: CalendarMode) => onModeChange(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarHeaderProps[DateType]]
    }
    
    extension [Self <: CalendarHeaderProps[?], DateType](x: Self & CalendarHeaderProps[DateType]) {
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMode(value: CalendarMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: DateType => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def setOnModeChange(value: CalendarMode => Callback): Self = StObject.set(x, "onModeChange", js.Any.fromFunction1((t0: CalendarMode) => value(t0).runNow()))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValidRange(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "validRange", value.asInstanceOf[js.Any])
      
      inline def setValidRangeUndefined: Self = StObject.set(x, "validRange", js.undefined)
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

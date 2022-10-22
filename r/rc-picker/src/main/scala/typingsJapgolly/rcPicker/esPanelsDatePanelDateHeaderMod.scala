package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDatePanelDateHeaderMod {
  
  @JSImport("rc-picker/es/panels/DatePanel/DateHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: DateHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait DateHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    def onMonthClick(): Unit
    
    def onNextMonth(): Unit
    
    def onNextYear(): Unit
    
    def onPrevMonth(): Unit
    
    def onPrevYear(): Unit
    
    def onYearClick(): Unit
    
    var prefixCls: String
    
    var value: js.UndefOr[DateType | Null] = js.undefined
    
    var viewDate: DateType
  }
  object DateHeaderProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onMonthClick: Callback,
      onNextMonth: Callback,
      onNextYear: Callback,
      onPrevMonth: Callback,
      onPrevYear: Callback,
      onYearClick: Callback,
      prefixCls: String,
      viewDate: DateType
    ): DateHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onMonthClick = onMonthClick.toJsFn, onNextMonth = onNextMonth.toJsFn, onNextYear = onNextYear.toJsFn, onPrevMonth = onPrevMonth.toJsFn, onPrevYear = onPrevYear.toJsFn, onYearClick = onYearClick.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateHeaderProps[DateType]]
    }
    
    extension [Self <: DateHeaderProps[?], DateType](x: Self & DateHeaderProps[DateType]) {
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnMonthClick(value: Callback): Self = StObject.set(x, "onMonthClick", value.toJsFn)
      
      inline def setOnNextMonth(value: Callback): Self = StObject.set(x, "onNextMonth", value.toJsFn)
      
      inline def setOnNextYear(value: Callback): Self = StObject.set(x, "onNextYear", value.toJsFn)
      
      inline def setOnPrevMonth(value: Callback): Self = StObject.set(x, "onPrevMonth", value.toJsFn)
      
      inline def setOnPrevYear(value: Callback): Self = StObject.set(x, "onPrevYear", value.toJsFn)
      
      inline def setOnYearClick(value: Callback): Self = StObject.set(x, "onYearClick", value.toJsFn)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

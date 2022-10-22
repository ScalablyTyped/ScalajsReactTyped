package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsQuarterPanelQuarterHeaderMod {
  
  @JSImport("rc-picker/es/panels/QuarterPanel/QuarterHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: QuarterHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait QuarterHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    def onNextYear(): Unit
    
    def onPrevYear(): Unit
    
    def onYearClick(): Unit
    
    var prefixCls: String
    
    var viewDate: DateType
  }
  object QuarterHeaderProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onNextYear: Callback,
      onPrevYear: Callback,
      onYearClick: Callback,
      prefixCls: String,
      viewDate: DateType
    ): QuarterHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onNextYear = onNextYear.toJsFn, onPrevYear = onPrevYear.toJsFn, onYearClick = onYearClick.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuarterHeaderProps[DateType]]
    }
    
    extension [Self <: QuarterHeaderProps[?], DateType](x: Self & QuarterHeaderProps[DateType]) {
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnNextYear(value: Callback): Self = StObject.set(x, "onNextYear", value.toJsFn)
      
      inline def setOnPrevYear(value: Callback): Self = StObject.set(x, "onPrevYear", value.toJsFn)
      
      inline def setOnYearClick(value: Callback): Self = StObject.set(x, "onYearClick", value.toJsFn)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

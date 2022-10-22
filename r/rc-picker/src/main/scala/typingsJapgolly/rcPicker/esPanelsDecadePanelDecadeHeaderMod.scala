package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDecadePanelDecadeHeaderMod {
  
  @JSImport("rc-picker/es/panels/DecadePanel/DecadeHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: YearHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait YearHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType]
    
    def onNextDecades(): Unit
    
    def onPrevDecades(): Unit
    
    var prefixCls: String
    
    var viewDate: DateType
  }
  object YearHeaderProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      onNextDecades: Callback,
      onPrevDecades: Callback,
      prefixCls: String,
      viewDate: DateType
    ): YearHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onNextDecades = onNextDecades.toJsFn, onPrevDecades = onPrevDecades.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearHeaderProps[DateType]]
    }
    
    extension [Self <: YearHeaderProps[?], DateType](x: Self & YearHeaderProps[DateType]) {
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setOnNextDecades(value: Callback): Self = StObject.set(x, "onNextDecades", value.toJsFn)
      
      inline def setOnPrevDecades(value: Callback): Self = StObject.set(x, "onPrevDecades", value.toJsFn)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

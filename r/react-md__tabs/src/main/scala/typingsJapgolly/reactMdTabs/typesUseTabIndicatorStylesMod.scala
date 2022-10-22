package typingsJapgolly.reactMdTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseTabIndicatorStylesMod {
  
  @JSImport("@react-md/tabs/types/useTabIndicatorStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTabIndicatorStyles(options: TabIndicatorStylesHookOptions): TabIndicatorStylesHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabIndicatorStyles")(options.asInstanceOf[js.Any]).asInstanceOf[TabIndicatorStylesHookReturnValue]
  
  type IndicatorStyles = Record[TabWidthVar | TabOffsetVar, String]
  
  trait TabIndicatorStylesHookOptions extends StObject {
    
    var activeIndex: Double
    
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  }
  object TabIndicatorStylesHookOptions {
    
    inline def apply(activeIndex: Double): TabIndicatorStylesHookOptions = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabIndicatorStylesHookOptions]
    }
    
    extension [Self <: TabIndicatorStylesHookOptions](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait TabIndicatorStylesHookReturnValue extends StObject {
    
    var indicatorStyles: IndicatorStyles
    
    var refCallback: RefFn[HTMLDivElement]
  }
  object TabIndicatorStylesHookReturnValue {
    
    inline def apply(indicatorStyles: IndicatorStyles, refCallback: HTMLDivElement | Null => Callback): TabIndicatorStylesHookReturnValue = {
      val __obj = js.Dynamic.literal(indicatorStyles = indicatorStyles.asInstanceOf[js.Any], refCallback = js.Any.fromFunction1((t0: HTMLDivElement | Null) => refCallback(t0).runNow()))
      __obj.asInstanceOf[TabIndicatorStylesHookReturnValue]
    }
    
    extension [Self <: TabIndicatorStylesHookReturnValue](x: Self) {
      
      inline def setIndicatorStyles(value: IndicatorStyles): Self = StObject.set(x, "indicatorStyles", value.asInstanceOf[js.Any])
      
      inline def setRefCallback(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "refCallback", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    }
  }
  
  type TabOffsetVar = /* "--rmd-tab-offset" */ String
  
  type TabWidthVar = /* "--rmd-tab-width" */ String
}

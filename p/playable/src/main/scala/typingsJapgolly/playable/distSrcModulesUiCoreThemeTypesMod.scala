package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.playable.distSrcModulesUiCoreTypesMod.IStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreThemeTypesMod {
  
  trait ICSSRule
    extends StObject
       with /* cssPropName */ StringDictionary[String | ICSSRuleFunction | ICSSRule]
  object ICSSRule {
    
    inline def apply(): ICSSRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICSSRule]
    }
  }
  
  type ICSSRuleFunction = js.Function1[/* data */ Any, String]
  
  type ICSSRules = StringDictionary[ICSSRule]
  
  trait IThemeAPI extends StObject {
    
    var updateTheme: js.UndefOr[js.Function1[/* themeConfig */ IThemeConfig, Unit]] = js.undefined
  }
  object IThemeAPI {
    
    inline def apply(): IThemeAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemeAPI]
    }
    
    extension [Self <: IThemeAPI](x: Self) {
      
      inline def setUpdateTheme(value: /* themeConfig */ IThemeConfig => Callback): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1((t0: /* themeConfig */ IThemeConfig) => value(t0).runNow()))
      
      inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
    }
  }
  
  trait IThemeConfig extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var progressColor: js.UndefOr[String] = js.undefined
  }
  object IThemeConfig {
    
    inline def apply(): IThemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemeConfig]
    }
    
    extension [Self <: IThemeConfig](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
      
      inline def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
    }
  }
  
  trait IThemeService extends StObject {
    
    def destroy(): Unit
    
    def get(module: js.Object): IStyles
    
    def registerModuleTheme(module: js.Object, rules: ICSSRules): Unit
    
    def updateTheme(config: IThemeConfig): Unit
  }
  object IThemeService {
    
    inline def apply(
      destroy: Callback,
      get: js.Object => IStyles,
      registerModuleTheme: (js.Object, ICSSRules) => Callback,
      updateTheme: IThemeConfig => Callback
    ): IThemeService = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, get = js.Any.fromFunction1(get), registerModuleTheme = js.Any.fromFunction2((t0: js.Object, t1: ICSSRules) => (registerModuleTheme(t0, t1)).runNow()), updateTheme = js.Any.fromFunction1((t0: IThemeConfig) => updateTheme(t0).runNow()))
      __obj.asInstanceOf[IThemeService]
    }
    
    extension [Self <: IThemeService](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGet(value: js.Object => IStyles): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setRegisterModuleTheme(value: (js.Object, ICSSRules) => Callback): Self = StObject.set(x, "registerModuleTheme", js.Any.fromFunction2((t0: js.Object, t1: ICSSRules) => (value(t0, t1)).runNow()))
      
      inline def setUpdateTheme(value: IThemeConfig => Callback): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1((t0: IThemeConfig) => value(t0).runNow()))
    }
  }
}

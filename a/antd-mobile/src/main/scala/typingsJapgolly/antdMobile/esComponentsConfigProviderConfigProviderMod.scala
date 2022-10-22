package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.esLocalesBaseMod.Locale
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsConfigProviderConfigProviderMod {
  
  @JSImport("antd-mobile/es/components/config-provider/config-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile/es/components/config-provider/config-provider", "ConfigProvider")
  @js.native
  val ConfigProvider: FC[ConfigProviderProps] = js.native
  
  object defaultConfigRef {
    
    @JSImport("antd-mobile/es/components/config-provider/config-provider", "defaultConfigRef")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/config-provider/config-provider", "defaultConfigRef.current")
    @js.native
    def current: Config = js.native
    inline def current_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  }
  
  inline def getDefaultConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")().asInstanceOf[Config]
  
  inline def setDefaultConfig(config: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("useConfig")().asInstanceOf[Config]
  
  trait Config extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var locale: Locale
  }
  object Config {
    
    inline def apply(locale: Locale): Config = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigProviderProps = Config
}

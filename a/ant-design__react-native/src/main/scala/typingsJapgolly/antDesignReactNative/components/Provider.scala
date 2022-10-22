package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.anon.PartialLocale
import typingsJapgolly.antDesignReactNative.anon.PartialTheme
import typingsJapgolly.antDesignReactNative.libProviderMod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@ant-design/react-native", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.Provider] {
    
    inline def locale(value: PartialLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def theme(value: PartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

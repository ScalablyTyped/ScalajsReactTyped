package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.anon.PartialLocale
import typingsJapgolly.antDesignReactNative.libLocaleProviderMod.LocaleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  @JSImport("@ant-design/react-native/lib/locale-provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def locale(value: PartialLocale): this.type = set("locale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LocaleProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ LocaleProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

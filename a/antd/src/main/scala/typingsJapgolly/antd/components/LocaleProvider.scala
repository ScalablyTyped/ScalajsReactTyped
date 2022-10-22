package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antd.libLocaleProviderMod.Locale
import typingsJapgolly.antd.libLocaleProviderMod.LocaleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  inline def apply(locale: Locale): Default[js.Object] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
  
  @JSImport("antd/lib/locale-provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocaleProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

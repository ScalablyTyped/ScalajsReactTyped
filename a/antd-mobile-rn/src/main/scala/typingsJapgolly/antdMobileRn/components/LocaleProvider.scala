package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobileRn.libLocaleProviderLocaleProviderMod.LocaleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  inline def apply(locale: typingsJapgolly.antdMobileRn.anon.DatePicker): Default[typingsJapgolly.antdMobileRn.mod.LocaleProvider] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[typingsJapgolly.antdMobileRn.mod.LocaleProvider](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
  
  @JSImport("antd-mobile-rn", "LocaleProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocaleProviderProps): Default[typingsJapgolly.antdMobileRn.mod.LocaleProvider] = new Default[typingsJapgolly.antdMobileRn.mod.LocaleProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.antdMobile.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.esComponentsConfigProviderConfigProviderMod.Config
import typingsJapgolly.antdMobile.esLocalesBaseMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigProvider {
  
  inline def apply(locale: Locale): Default[js.Object] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Config]))
  }
  
  @JSImport("antd-mobile", "ConfigProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Config): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

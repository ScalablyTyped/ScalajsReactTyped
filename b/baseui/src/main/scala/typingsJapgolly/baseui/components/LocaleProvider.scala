package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.anon.PartialLocale
import typingsJapgolly.baseui.localeMod.LocaleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  inline def apply(locale: PartialLocale): Default[js.Object] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
  
  @JSImport("baseui", "LocaleProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocaleProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

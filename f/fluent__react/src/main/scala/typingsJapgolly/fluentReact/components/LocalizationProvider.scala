package typingsJapgolly.fluentReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.fluentReact.esmLocalizationMod.ReactLocalization
import typingsJapgolly.fluentReact.esmProviderMod.LocalizationProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocalizationProvider {
  
  inline def apply(l10n: ReactLocalization): Default[js.Object] = {
    val __props = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LocalizationProviderProps]))
  }
  
  @JSImport("@fluent/react", "LocalizationProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocalizationProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

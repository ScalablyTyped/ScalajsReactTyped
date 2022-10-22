package typingsJapgolly.atlaskitAnalyticsNext.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.atlaskitAnalyticsNext.distTypesComponentsAnalyticsContextLegacyAnalyticsContextMod.Props
import typingsJapgolly.atlaskitAnalyticsNext.distTypesComponentsAnalyticsContextLegacyAnalyticsContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LegacyAnalyticsContext {
  
  inline def apply(data: js.Object): Default[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsContext/LegacyAnalyticsContext", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

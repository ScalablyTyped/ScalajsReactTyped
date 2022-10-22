package typingsJapgolly.useAnalytics.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.useAnalytics.mod.AnalyticsProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnalyticsProvider {
  
  inline def apply(
    instance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[AnalyticsProviderProps]))
  }
  
  @JSImport("use-analytics", "AnalyticsProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AnalyticsProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

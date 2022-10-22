package typingsJapgolly.atlaskitAnalyticsNext.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitAnalyticsNext.distTypesComponentsAnalyticsListenerLegacyAnalyticsListenerMod.Props
import typingsJapgolly.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LegacyAnalyticsListener {
  
  inline def apply(onEvent: (default, js.UndefOr[String]) => Callback): Builder = {
    val __props = js.Dynamic.literal(onEvent = js.Any.fromFunction2((t0: default, t1: js.UndefOr[String]) => (onEvent(t0, t1)).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/LegacyAnalyticsListener", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.atlaskitAnalyticsNext.distTypesComponentsAnalyticsListenerLegacyAnalyticsListenerMod.default
        ] {
    
    inline def channel(value: String): this.type = set("channel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

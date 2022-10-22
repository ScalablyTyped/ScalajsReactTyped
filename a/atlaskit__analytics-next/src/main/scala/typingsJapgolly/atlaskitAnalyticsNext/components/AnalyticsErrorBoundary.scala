package typingsJapgolly.atlaskitAnalyticsNext.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitAnalyticsNext.anon.OmitAnalyticsErrorBoundar
import typingsJapgolly.atlaskitAnalyticsNext.distTypesComponentsAnalyticsErrorBoundaryMod.AnalyticsErrorBoundaryErrorInfo
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnalyticsErrorBoundary {
  
  inline def apply(channel: String): Builder = {
    val __props = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OmitAnalyticsErrorBoundar]))
  }
  
  @JSImport("@atlaskit/analytics-next", "AnalyticsErrorBoundary")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ErrorComponent(value: ComponentType[js.Object]): this.type = set("ErrorComponent", value.asInstanceOf[js.Any])
    
    inline def onError(value: (/* error */ js.Error, /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo]) => Callback): this.type = set("onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo]) => (value(t0, t1)).runNow()))
  }
  
  def withProps(p: OmitAnalyticsErrorBoundar): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

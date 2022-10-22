package typingsJapgolly.atlaskitAnalyticsNext.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.atlaskitAnalyticsNext.anon.Channel
import typingsJapgolly.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnalyticsListener {
  
  inline def apply(onEvent: (default, js.UndefOr[String]) => Callback): SharedBuilder_Channel_1493479499 = {
    val __props = js.Dynamic.literal(onEvent = js.Any.fromFunction2((t0: default, t1: js.UndefOr[String]) => (onEvent(t0, t1)).runNow()))
    new SharedBuilder_Channel_1493479499(js.Array(this.component, __props.asInstanceOf[/* props */ Channel]))
  }
  
  @JSImport("@atlaskit/analytics-next", "AnalyticsListener")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* props */ Channel): SharedBuilder_Channel_1493479499 = new SharedBuilder_Channel_1493479499(js.Array(this.component, p.asInstanceOf[js.Any]))
}

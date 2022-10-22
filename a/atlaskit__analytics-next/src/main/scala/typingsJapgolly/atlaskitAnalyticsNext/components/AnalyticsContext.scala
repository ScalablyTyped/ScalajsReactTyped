package typingsJapgolly.atlaskitAnalyticsNext.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.atlaskitAnalyticsNext.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnalyticsContext {
  
  inline def apply(data: js.Object): Default[js.Object] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* props */ Children]))
  }
  
  @JSImport("@atlaskit/analytics-next", "AnalyticsContext")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* props */ Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

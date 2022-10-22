package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antDesignProLayout.anon.ChangeSetting
import typingsJapgolly.antDesignProLayout.anon.PartialProSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegionalSetting {
  
  inline def apply(
    changeSetting: (String, Any, js.UndefOr[Boolean]) => Callback,
    hashId: String,
    settings: PartialProSettings
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(changeSetting = js.Any.fromFunction3((t0: String, t1: Any, t2: js.UndefOr[Boolean]) => (changeSetting(t0, t1, t2)).runNow()), hashId = hashId.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ChangeSetting]))
  }
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/RegionalChange", "RegionalSetting")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ChangeSetting): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

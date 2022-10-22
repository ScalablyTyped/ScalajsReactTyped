package typingsJapgolly.reactDetectOffline.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactDetectOffline.mod.DetectorProps
import typingsJapgolly.reactDetectOffline.mod.PollingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Detector {
  
  inline def apply(render: typingsJapgolly.reactDetectOffline.anon.Online => Element | Null): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[DetectorProps]))
  }
  
  @JSImport("react-detect-offline", "Detector")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDetectOffline.mod.Detector] {
    
    inline def onChange(value: /* online */ Boolean => js.UndefOr[Unit]): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def polling(value: Boolean | PollingConfig): this.type = set("polling", value.asInstanceOf[js.Any])
    
    inline def wrapperType(value: String): this.type = set("wrapperType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DetectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

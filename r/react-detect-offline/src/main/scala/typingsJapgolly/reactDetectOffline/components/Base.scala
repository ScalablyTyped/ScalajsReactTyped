package typingsJapgolly.reactDetectOffline.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDetectOffline.mod.BaseProps
import typingsJapgolly.reactDetectOffline.mod.PollingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Base {
  
  @JSImport("react-detect-offline", "Base")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDetectOffline.mod.Base] {
    
    inline def onChange(value: /* online */ Boolean => js.UndefOr[Unit]): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def polling(value: Boolean | PollingConfig): this.type = set("polling", value.asInstanceOf[js.Any])
    
    inline def wrapperType(value: String): this.type = set("wrapperType", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Base.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

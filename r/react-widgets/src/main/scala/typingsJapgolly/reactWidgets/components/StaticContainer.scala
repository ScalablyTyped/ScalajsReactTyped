package typingsJapgolly.reactWidgets.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactWidgets.esmPopupMod.StaticContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StaticContainer {
  
  @JSImport("react-widgets/esm/Popup", "StaticContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def shouldUpdate(value: Boolean): this.type = set("shouldUpdate", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StaticContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* hasChildren */ StaticContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.ServerContainerRef
import typingsJapgolly.tuyaPanelKit.anon.Pathname
import typingsJapgolly.tuyaPanelKit.anon.ServerContextTypechildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServerContainer {
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "ServerContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[ServerContainerRef] {
    
    inline def location(value: Pathname): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ServerContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ServerContextTypechildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

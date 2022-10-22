package typingsJapgolly.ionicReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ionicReact.distTypesComponentsIonRouteMod.IonRouteProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonRoute {
  
  inline def apply(render: js.UndefOr[Any] => Element): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[IonRouteProps]))
  }
  
  @JSImport("@ionic/react", "IonRoute")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.ionicReact.mod.IonRoute] {
    
    inline def disableIonPageManagement(value: Boolean): this.type = set("disableIonPageManagement", value.asInstanceOf[js.Any])
    
    inline def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    
    inline def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IonRouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

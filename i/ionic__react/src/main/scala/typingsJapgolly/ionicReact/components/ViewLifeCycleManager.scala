package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ionicReact.distTypesRoutingViewLifeCycleManagerMod.ViewTransitionManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ViewLifeCycleManager {
  
  inline def apply(mount: Boolean, removeView: Callback): Default[typingsJapgolly.ionicReact.mod.ViewLifeCycleManager] = {
    val __props = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], removeView = removeView.toJsFn)
    new Default[typingsJapgolly.ionicReact.mod.ViewLifeCycleManager](js.Array(this.component, __props.asInstanceOf[ViewTransitionManagerProps]))
  }
  
  @JSImport("@ionic/react", "ViewLifeCycleManager")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ViewTransitionManagerProps): Default[typingsJapgolly.ionicReact.mod.ViewLifeCycleManager] = new Default[typingsJapgolly.ionicReact.mod.ViewLifeCycleManager](js.Array(this.component, p.asInstanceOf[js.Any]))
}

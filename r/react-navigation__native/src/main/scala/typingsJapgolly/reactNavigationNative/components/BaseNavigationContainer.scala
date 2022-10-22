package typingsJapgolly.reactNavigationNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerProps
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.InitialState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseNavigationContainer {
  
  @JSImport("@react-navigation/native", "BaseNavigationContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[NavigationContainerRef[ParamListBase]] {
    
    inline def independent(value: Boolean): this.type = set("independent", value.asInstanceOf[js.Any])
    
    inline def initialState(value: InitialState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def onStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Callback): this.type = set("onStateChange", js.Any.fromFunction1((t0: /* state */ js.UndefOr[NavigationState[ParamListBase]]) => value(t0).runNow()))
    
    inline def onUnhandledAction(value: /* action */ NavigationAction => Callback): this.type = set("onUnhandledAction", js.Any.fromFunction1((t0: /* action */ NavigationAction) => value(t0).runNow()))
  }
  
  implicit def make(companion: BaseNavigationContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavigationContainerProps & RefAttributes[NavigationContainerRef[ParamListBase]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

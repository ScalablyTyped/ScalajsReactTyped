package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationContainerRef
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.DocumentTitleOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.LinkingOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.InitialState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationAction
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typingsJapgolly.tuyaPanelKit.anon.NavigationContainerPropst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationContainer {
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[NavigationContainerRef] {
    
    inline def documentTitle(value: DocumentTitleOptions): this.type = set("documentTitle", value.asInstanceOf[js.Any])
    
    inline def fallback(value: VdomNode): this.type = set("fallback", value.rawNode.asInstanceOf[js.Any])
    
    inline def fallbackNull: this.type = set("fallback", null)
    
    inline def fallbackVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fallback", js.Array(value*))
    
    inline def fallbackVdomElement(value: VdomElement): this.type = set("fallback", value.rawElement.asInstanceOf[js.Any])
    
    inline def independent(value: Boolean): this.type = set("independent", value.asInstanceOf[js.Any])
    
    inline def initialState(value: InitialState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def linking(value: LinkingOptions): this.type = set("linking", value.asInstanceOf[js.Any])
    
    inline def onReady(value: Callback): this.type = set("onReady", value.toJsFn)
    
    inline def onStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Callback): this.type = set("onStateChange", js.Any.fromFunction1((t0: /* state */ js.UndefOr[NavigationState[ParamListBase]]) => value(t0).runNow()))
    
    inline def onUnhandledAction(value: /* action */ NavigationAction => Callback): this.type = set("onUnhandledAction", js.Any.fromFunction1((t0: /* action */ NavigationAction) => value(t0).runNow()))
    
    inline def theme(value: typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NavigationContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavigationContainerPropst): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

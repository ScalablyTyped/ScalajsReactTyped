package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ComponentProvider
import typingsJapgolly.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typingsJapgolly.reactNativeNavigation.storeMod.Store
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/components/ComponentWrapper", JSImport.Namespace)
@js.native
object componentWrapperMod extends js.Object {
  @js.native
  class ComponentWrapper () extends js.Object {
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClassP[js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClassP[js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentClassP[js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClassP[js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClassP[js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClassP[js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentClassP[js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClassP[js.Object] = js.native
    def wrapWithRedux(WrappedComponent: ComponentClassP[js.Object], ReduxProvider: js.Any, reduxStore: js.Any): ComponentClassP[js.Object] = js.native
  }
  
  @js.native
  trait IWrappedComponent
    extends Component[js.Object, js.Object, js.Any] {
    def setProps(newProps: Record[String, _]): Unit = js.native
  }
  
}


package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ComponentProvider
import typingsJapgolly.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typingsJapgolly.reactNativeNavigation.libDistSrcEventsComponentEventsObserverMod.ComponentEventsObserver
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcComponentsComponentWrapperMod {
  
  @JSImport("react-native-navigation/lib/dist/src/components/ComponentWrapper", "ComponentWrapper")
  @js.native
  open class ComponentWrapper () extends StObject {
    
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentClassP[Any & js.Object] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentClassP[Any & js.Object] = js.native
    
    def wrapWithRedux(WrappedComponent: ComponentClassP[Any & js.Object], ReduxProvider: Any, reduxStore: Any): ComponentClassP[Any & js.Object] = js.native
  }
  
  @js.native
  trait IWrappedComponent
    extends Component[js.Object, js.Object, Any] {
    
    var isMounted: Boolean = js.native
    
    def setProps(newProps: Record[String, Any]): Unit = js.native
    def setProps(newProps: Record[String, Any], callback: js.Function0[Unit]): Unit = js.native
  }
}

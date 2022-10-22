package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.reactNativeNavigation.anon.ComponentId
import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typingsJapgolly.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidAppearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidDisappearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentWillAppearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.NavigationButtonPressedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.PreviewCompletedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ScreenPoppedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarCancelPressedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarUpdatedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesEventSubscriptionMod.EventSubscription
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesNavigationComponentListenerMod.NavigationComponentListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcEventsComponentEventsObserverMod {
  
  @JSImport("react-native-navigation/lib/dist/src/events/ComponentEventsObserver", "ComponentEventsObserver")
  @js.native
  open class ComponentEventsObserver protected () extends StObject {
    def this(nativeEventsReceiver: NativeEventsReceiver, store: Store) = this()
    
    /* private */ var alreadyRegistered: Any = js.native
    
    def bindComponent(component: Component[ComponentId & js.Object, js.Object]): EventSubscription = js.native
    def bindComponent(component: Component[ComponentId & js.Object, js.Object], componentId: String): EventSubscription = js.native
    
    /* private */ var listeners: Any = js.native
    
    /* private */ val nativeEventsReceiver: Any = js.native
    
    def notifyComponentDidAppear(event: ComponentDidAppearEvent): Unit = js.native
    
    def notifyComponentDidDisappear(event: ComponentDidDisappearEvent): Unit = js.native
    
    def notifyComponentWillAppear(event: ComponentWillAppearEvent): Unit = js.native
    
    def notifyNavigationButtonPressed(event: NavigationButtonPressedEvent): Unit = js.native
    
    def notifyPreviewCompleted(event: PreviewCompletedEvent): Unit = js.native
    
    def notifyScreenPopped(event: ScreenPoppedEvent): Unit = js.native
    
    def notifySearchBarCancelPressed(event: SearchBarCancelPressedEvent): Unit = js.native
    
    def notifySearchBarUpdated(event: SearchBarUpdatedEvent): Unit = js.native
    
    def registerComponentListener(listener: NavigationComponentListener, componentId: String): EventSubscription = js.native
    
    def registerOnceForAllComponentEvents(): Unit = js.native
    
    /* private */ val store: Any = js.native
    
    /* private */ var triggerOnAllListenersByComponentId: Any = js.native
    
    def unmounted(componentId: String): Unit = js.native
  }
}

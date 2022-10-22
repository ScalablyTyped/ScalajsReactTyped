package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.reactNative.mod.EmitterSubscription
import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typingsJapgolly.reactNativeNavigation.libDistSrcEventsCommandsObserverMod.CommandsObserver
import typingsJapgolly.reactNativeNavigation.libDistSrcEventsComponentEventsObserverMod.ComponentEventsObserver
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidAppearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidDisappearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentWillAppearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ModalAttemptedToDismissEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ModalDismissedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.NavigationButtonPressedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.PreviewCompletedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ScreenPoppedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarCancelPressedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarUpdatedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesEventSubscriptionMod.EventSubscription
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabLongPressedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabPressedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabSelectedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesEventsMod.CommandCompletedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesNavigationComponentListenerMod.NavigationComponentListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcEventsEventsRegistryMod {
  
  @JSImport("react-native-navigation/lib/dist/src/events/EventsRegistry", "EventsRegistry")
  @js.native
  open class EventsRegistry protected () extends StObject {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
    
    def bindComponent(component: Component[Any & js.Object, js.Object]): EventSubscription = js.native
    def bindComponent(component: Component[Any & js.Object, js.Object], componentId: String): EventSubscription = js.native
    
    /* private */ var commandsObserver: Any = js.native
    
    /* private */ var componentEventsObserver: Any = js.native
    
    /* private */ var nativeEventsReceiver: Any = js.native
    
    def registerAppLaunchedListener(callback: js.Function0[Unit]): EmitterSubscription = js.native
    
    def registerBottomTabLongPressedListener(callback: js.Function1[/* event */ BottomTabLongPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabPressedListener(callback: js.Function1[/* event */ BottomTabPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabSelectedListener(callback: js.Function1[/* event */ BottomTabSelectedEvent, Unit]): EmitterSubscription = js.native
    
    def registerCommandCompletedListener(callback: js.Function1[/* event */ CommandCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerCommandListener(callback: js.Function2[/* name */ String, /* params */ Any, Unit]): EventSubscription = js.native
    
    def registerComponentDidAppearListener(callback: js.Function1[/* event */ ComponentDidAppearEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentDidDisappearListener(callback: js.Function1[/* event */ ComponentDidDisappearEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentListener(listener: NavigationComponentListener, componentId: String): EventSubscription = js.native
    
    def registerComponentWillAppearListener(callback: js.Function1[/* event */ ComponentWillAppearEvent, Unit]): EmitterSubscription = js.native
    
    def registerModalAttemptedToDismissListener(callback: js.Function1[/* event */ ModalAttemptedToDismissEvent, Unit]): EmitterSubscription = js.native
    
    def registerModalDismissedListener(callback: js.Function1[/* event */ ModalDismissedEvent, Unit]): EmitterSubscription = js.native
    
    def registerNavigationButtonPressedListener(callback: js.Function1[/* event */ NavigationButtonPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerPreviewCompletedListener(callback: js.Function1[/* event */ PreviewCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerScreenPoppedListener(callback: js.Function1[/* event */ ScreenPoppedEvent, Unit]): EmitterSubscription = js.native
    
    def registerSearchBarCancelPressedListener(callback: js.Function1[/* event */ SearchBarCancelPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerSearchBarUpdatedListener(callback: js.Function1[/* event */ SearchBarUpdatedEvent, Unit]): EmitterSubscription = js.native
  }
}

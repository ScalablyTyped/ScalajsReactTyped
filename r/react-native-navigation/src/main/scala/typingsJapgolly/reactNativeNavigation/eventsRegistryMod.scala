package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.reactNative.mod.EmitterSubscription
import typingsJapgolly.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typingsJapgolly.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typingsJapgolly.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typingsJapgolly.reactNativeNavigation.eventsMod.BottomTabSelectedEvent
import typingsJapgolly.reactNativeNavigation.eventsMod.CommandCompletedEvent
import typingsJapgolly.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/EventsRegistry", JSImport.Namespace)
@js.native
object eventsRegistryMod extends js.Object {
  @js.native
  class EventsRegistry protected () extends js.Object {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
    var commandsObserver: js.Any = js.native
    var componentEventsObserver: js.Any = js.native
    var nativeEventsReceiver: js.Any = js.native
    def bindComponent(component: Component[js.Object, js.Object]): EventSubscription = js.native
    def bindComponent(component: Component[js.Object, js.Object], componentId: String): EventSubscription = js.native
    def registerAppLaunchedListener(callback: js.Function0[Unit]): EmitterSubscription = js.native
    def registerBottomTabSelectedListener(callback: js.Function1[/* event */ BottomTabSelectedEvent, Unit]): EmitterSubscription = js.native
    def registerCommandCompletedListener(callback: js.Function1[/* event */ CommandCompletedEvent, Unit]): EmitterSubscription = js.native
    def registerCommandListener(callback: js.Function2[/* name */ String, /* params */ js.Any, Unit]): EventSubscription = js.native
    def registerComponentDidAppearListener(callback: js.Function1[/* event */ ComponentDidAppearEvent, Unit]): EmitterSubscription = js.native
    def registerComponentDidDisappearListener(callback: js.Function1[/* event */ ComponentDidDisappearEvent, Unit]): EmitterSubscription = js.native
    def registerModalDismissedListener(callback: js.Function1[/* event */ ModalDismissedEvent, Unit]): EmitterSubscription = js.native
    def registerNavigationButtonPressedListener(callback: js.Function1[/* event */ NavigationButtonPressedEvent, Unit]): EmitterSubscription = js.native
    def registerPreviewCompletedListener(callback: js.Function1[/* event */ PreviewCompletedEvent, Unit]): EmitterSubscription = js.native
    def registerSearchBarCancelPressedListener(callback: js.Function1[/* event */ SearchBarCancelPressedEvent, Unit]): EmitterSubscription = js.native
    def registerSearchBarUpdatedListener(callback: js.Function1[/* event */ SearchBarUpdatedEvent, Unit]): EmitterSubscription = js.native
  }
  
}


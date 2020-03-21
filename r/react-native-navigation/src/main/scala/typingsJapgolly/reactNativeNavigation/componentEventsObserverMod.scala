package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typingsJapgolly.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typingsJapgolly.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typingsJapgolly.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import typingsJapgolly.reactNativeNavigation.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/ComponentEventsObserver", JSImport.Namespace)
@js.native
object componentEventsObserverMod extends js.Object {
  @js.native
  class ComponentEventsObserver protected () extends js.Object {
    def this(nativeEventsReceiver: NativeEventsReceiver, store: Store) = this()
    var alreadyRegistered: js.Any = js.native
    var listeners: js.Any = js.native
    val nativeEventsReceiver: js.Any = js.native
    val store: js.Any = js.native
    var triggerOnAllListenersByComponentId: js.Any = js.native
    def bindComponent(component: Component[js.Object, js.Object]): EventSubscription = js.native
    def bindComponent(component: Component[js.Object, js.Object], componentId: String): EventSubscription = js.native
    def notifyComponentDidAppear(event: ComponentDidAppearEvent): Unit = js.native
    def notifyComponentDidDisappear(event: ComponentDidDisappearEvent): Unit = js.native
    def notifyModalDismissed(event: ModalDismissedEvent): Unit = js.native
    def notifyNavigationButtonPressed(event: NavigationButtonPressedEvent): Unit = js.native
    def notifyPreviewCompleted(event: PreviewCompletedEvent): Unit = js.native
    def notifySearchBarCancelPressed(event: SearchBarCancelPressedEvent): Unit = js.native
    def notifySearchBarUpdated(event: SearchBarUpdatedEvent): Unit = js.native
    def registerOnceForAllComponentEvents(): Unit = js.native
    def unmounted(componentId: String): Unit = js.native
  }
  
}


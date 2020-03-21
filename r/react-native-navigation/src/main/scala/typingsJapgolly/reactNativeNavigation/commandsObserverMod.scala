package typingsJapgolly.reactNativeNavigation

import typingsJapgolly.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typingsJapgolly.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/CommandsObserver", JSImport.Namespace)
@js.native
object commandsObserverMod extends js.Object {
  @js.native
  class CommandsObserver protected () extends js.Object {
    def this(uniqueIdProvider: UniqueIdProvider) = this()
    var listeners: js.Any = js.native
    var uniqueIdProvider: js.Any = js.native
    def notify(commandName: String, params: Record[String, _]): Unit = js.native
    def register(listener: CommandsListener): EventSubscription = js.native
  }
  
  type CommandsListener = js.Function2[/* name */ String, /* params */ Record[String, js.Any], Unit]
}


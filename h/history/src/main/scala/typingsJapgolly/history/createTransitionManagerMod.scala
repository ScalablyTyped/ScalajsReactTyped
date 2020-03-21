package typingsJapgolly.history

import typingsJapgolly.history.mod.Action
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationListener
import typingsJapgolly.history.mod.UnregisterCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/createTransitionManager", JSImport.Namespace)
@js.native
object createTransitionManagerMod extends js.Object {
  @js.native
  trait TransitionManager[S] extends js.Object {
    def appendListener(listener: LocationListener[S]): UnregisterCallback = js.native
    def confirmTransitionTo(
      location: Location[S],
      action: Action,
      getUserConfirmation: js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit],
      callback: js.Function1[/* result */ Boolean, Unit]
    ): Unit = js.native
    def notifyListeners(location: Location[S], action: Action): Unit = js.native
    def setPrompt(): UnregisterCallback = js.native
    def setPrompt(nextPrompt: Prompt[S]): UnregisterCallback = js.native
  }
  
  def default[S](): TransitionManager[S] = js.native
  type Prompt[S] = PromptFunction[S] | Boolean
  type PromptFunction[S] = js.Function2[/* location */ Location[S], /* action */ Action, js.Any]
}


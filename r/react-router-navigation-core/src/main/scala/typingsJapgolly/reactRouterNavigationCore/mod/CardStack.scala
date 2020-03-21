package typingsJapgolly.reactRouterNavigationCore.mod

import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRouterNavigationCore.AnonCards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "CardStack")
@js.native
class CardStack protected ()
  extends Component[CardStackProps, AnonCards, js.Any] {
  def this(props: CardStackProps) = this()
  def this(props: CardStackProps, context: js.Any) = this()
  def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
  // Pop to previous scene (n-1)
  def onNavigateBack(): Boolean = js.native
  def unlistenHistory(): Unit = js.native
}


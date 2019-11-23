package typingsJapgolly.atReachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReachRouterMod {
  import japgolly.scalajs.react.raw.React.Node
  import org.scalajs.dom.raw.HTMLAnchorElement
  import typingsJapgolly.atReachRouter.Anon_Default
  import typingsJapgolly.atReachRouter.Anon_State
  import typingsJapgolly.atReachRouter.atReachRouterStrings.href
  import typingsJapgolly.history.historyMod.LocationState
  import typingsJapgolly.react.reactMod.AnchorHTMLAttributes
  import typingsJapgolly.react.reactMod.DetailedHTMLProps
  import typingsJapgolly.std.Exclude
  import typingsJapgolly.std.Partial
  import typingsJapgolly.std.Pick

  type AnchorProps = Omit[
    DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
    href
  ]
  type HistoryListener = js.Function1[/* parameter */ HistoryListenerParameter, Unit]
  type HistoryLocation = WindowLocation with Anon_State
  type HistoryUnsubscribe = js.Function0[Unit]
  type LocationProviderRenderFn = js.Function1[/* context */ LocationContext, Node]
  type MatchRenderFn[TParams] = js.Function1[/* props */ MatchRenderProps[TParams], Node]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type RouteComponentProps[TParams] = Partial[TParams] with Anon_Default
  type WindowLocation = org.scalajs.dom.raw.Location with typingsJapgolly.history.historyMod.Location[LocationState]
}

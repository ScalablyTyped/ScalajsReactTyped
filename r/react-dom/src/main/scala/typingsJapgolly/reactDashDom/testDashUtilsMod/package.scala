package typingsJapgolly.reactDashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object testDashUtilsMod {
  import japgolly.scalajs.react.raw.React.Component
  import org.scalajs.dom.raw.Element

  type EventSimulator = js.Function2[
    /* element */ Element | (Component[js.Any with js.Object, js.Object]), 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    Unit
  ]
}

package typingsJapgolly.reactAddonsTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventSimulator = js.Function2[
    /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), 
    /* eventData */ js.UndefOr[typingsJapgolly.reactAddonsTestUtils.mod.SyntheticEventData], 
    scala.Unit
  ]
}

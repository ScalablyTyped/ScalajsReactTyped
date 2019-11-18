package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electron {
  import typingsJapgolly.std.Event

  type GlobalEvent = Event
  type NodeRequireFunction = js.Function1[typingsJapgolly.electron.electronStrings.electron, TypeofElectron]
}

package typingsJapgolly.tablesorter

import typingsJapgolly.tablesorter.omitMod.Omit
import typingsJapgolly.tablesorter.tablesorterStrings.max
import typingsJapgolly.tablesorter.tablesorterStrings.min
import typingsJapgolly.tablesorter.tablesorterStrings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/Formatter/Options/UIOptionsBase", JSImport.Namespace)
@js.native
object uioptionsbaseMod extends js.Object {
  type UIOptionsBase[T /* <: AnonMax */] = Omit[T, min | max | step]
}


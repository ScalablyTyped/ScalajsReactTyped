package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.diffDeltaMod.DiffDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status-entry", JSImport.Namespace)
@js.native
object statusEntryMod extends js.Object {
  @js.native
  class StatusEntry () extends js.Object {
    def headToIndex(): DiffDelta = js.native
    def indexToWorkdir(): DiffDelta = js.native
    def status(): Double = js.native
  }
  
}


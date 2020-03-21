package typingsJapgolly.xstate.patternsMod

import typingsJapgolly.std.Partial
import typingsJapgolly.xstate.AnonInitial
import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/patterns", "sequence")
@js.native
object sequence_states extends js.Object {
  def apply[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    items: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ]
  ): AnonInitial[TStateSchema, TEvent] = js.native
  def apply[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    items: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ],
    options: Partial[SequencePatternOptions[TEvent]]
  ): AnonInitial[TStateSchema, TEvent] = js.native
}


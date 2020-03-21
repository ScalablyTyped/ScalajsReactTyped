package typingsJapgolly.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listCounterexamples` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListCounterexamplesConstants")
@js.native
object ListCounterexamplesConstants extends js.Object {
  /** The attribute by which returned counterexamples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    /* "text" */ val TEXT: typingsJapgolly.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort.TEXT with String = js.native
    /* "updated" */ val UPDATED: typingsJapgolly.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort with String
      ] = js.native
  }
  
}


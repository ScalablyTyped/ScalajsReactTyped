package typingsJapgolly.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listDialogNodes` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListDialogNodesConstants")
@js.native
object ListDialogNodesConstants extends js.Object {
  /** The attribute by which returned dialog nodes will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    /* "dialog_node" */ val DIALOG_NODE: typingsJapgolly.watsonDeveloperCloud.mod.ListDialogNodesConstants.Sort.DIALOG_NODE with String = js.native
    /* "updated" */ val UPDATED: typingsJapgolly.watsonDeveloperCloud.mod.ListDialogNodesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.watsonDeveloperCloud.mod.ListDialogNodesConstants.Sort with String
      ] = js.native
  }
  
}


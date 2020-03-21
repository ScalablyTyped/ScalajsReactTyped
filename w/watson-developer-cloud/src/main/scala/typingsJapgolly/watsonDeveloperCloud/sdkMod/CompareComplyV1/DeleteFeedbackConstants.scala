package typingsJapgolly.watsonDeveloperCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `deleteFeedback` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.DeleteFeedbackConstants")
@js.native
object DeleteFeedbackConstants extends js.Object {
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    /* "contracts" */ val CONTRACTS: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model.CONTRACTS with String = js.native
    /* "tables" */ val TABLES: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model with String
      ] = js.native
  }
  
}


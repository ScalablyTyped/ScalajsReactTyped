package typingsJapgolly.watsonDeveloperCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createBatch` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.CreateBatchConstants")
@js.native
object CreateBatchConstants extends js.Object {
  /** The Compare and Comply method to run across the submitted input documents. */
  @js.native
  object Function extends js.Object {
    /* "element_classification" */ val ELEMENT_CLASSIFICATION: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.ELEMENT_CLASSIFICATION with String = js.native
    /* "html_conversion" */ val HTML_CONVERSION: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.HTML_CONVERSION with String = js.native
    /* "tables" */ val TABLES: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function with String
      ] = js.native
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    /* "contracts" */ val CONTRACTS: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model.CONTRACTS with String = js.native
    /* "tables" */ val TABLES: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model with String
      ] = js.native
  }
  
}


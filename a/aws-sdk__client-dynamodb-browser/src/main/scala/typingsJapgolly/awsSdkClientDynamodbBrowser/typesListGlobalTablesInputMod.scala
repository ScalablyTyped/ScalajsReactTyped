package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/ListGlobalTablesInput", JSImport.Namespace)
@js.native
object typesListGlobalTablesInputMod extends js.Object {
  @js.native
  trait ListGlobalTablesInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>The first global table name that this operation will evaluate.</p>
      */
    var ExclusiveStartGlobalTableName: js.UndefOr[String] = js.native
    /**
      * <p>The maximum number of table names to return.</p>
      */
    var Limit: js.UndefOr[Double] = js.native
    /**
      * <p>Lists the global tables in a specific region.</p>
      */
    var RegionName: js.UndefOr[String] = js.native
  }
  
}


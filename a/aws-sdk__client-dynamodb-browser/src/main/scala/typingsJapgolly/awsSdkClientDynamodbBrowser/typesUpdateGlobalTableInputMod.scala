package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod.ReplicaUpdate
import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/UpdateGlobalTableInput", JSImport.Namespace)
@js.native
object typesUpdateGlobalTableInputMod extends js.Object {
  @js.native
  trait UpdateGlobalTableInput extends InputTypesUnion {
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
      * <p>The global table name.</p>
      */
    var GlobalTableName: String = js.native
    /**
      * <p>A list of regions that should be added or removed from the global table.</p>
      */
    var ReplicaUpdates: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate] = js.native
  }
  
}


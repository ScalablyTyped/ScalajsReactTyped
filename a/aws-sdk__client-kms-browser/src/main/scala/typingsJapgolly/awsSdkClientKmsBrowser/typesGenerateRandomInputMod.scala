package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/types/GenerateRandomInput", JSImport.Namespace)
@js.native
object typesGenerateRandomInputMod extends js.Object {
  @js.native
  trait GenerateRandomInput extends InputTypesUnion {
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
      * <p>The length of the byte string.</p>
      */
    var NumberOfBytes: js.UndefOr[Double] = js.native
  }
  
}


package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetDifferencesInput", JSImport.Namespace)
@js.native
object typesGetDifferencesInputMod extends js.Object {
  @js.native
  trait GetDifferencesInput extends InputTypesUnion {
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
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>A non-negative integer used to limit the number of returned results.</p>
      */
    var MaxResults: js.UndefOr[Double] = js.native
    /**
      * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    /**
      * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit.</p>
      */
    var afterCommitSpecifier: String = js.native
    /**
      * <p>The file path in which to check differences. Limits the results to this path. Can also be used to specify the changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all paths.</p>
      */
    var afterPath: js.UndefOr[String] = js.native
    /**
      * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value will be shown. If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the results with <code>maxResults</code>.</p>
      */
    var beforeCommitSpecifier: js.UndefOr[String] = js.native
    /**
      * <p>The file path in which to check for differences. Limits the results to this path. Can also be used to specify the previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code> are not specified, differences will be shown for all paths.</p>
      */
    var beforePath: js.UndefOr[String] = js.native
    /**
      * <p>The name of the repository where you want to get differences.</p>
      */
    var repositoryName: String = js.native
  }
  
}


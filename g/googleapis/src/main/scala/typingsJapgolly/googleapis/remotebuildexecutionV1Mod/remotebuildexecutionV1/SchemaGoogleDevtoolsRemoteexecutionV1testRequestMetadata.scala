package typingsJapgolly.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An optional Metadata to attach to any RPC request to tell the server about
  * an external context of the request. The server may use this for logging or
  * other purposes. To use it, the client attaches the header to the call using
  * the canonical proto serialization: name:
  * google.devtools.remoteexecution.v1test.requestmetadata-bin contents: the
  * base64 encoded binary RequestMetadata message.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata extends js.Object {
  /**
    * An identifier that ties multiple requests to the same action. For
    * example, multiple requests to the CAS, Action Cache, and Execution API
    * are used in order to compile foo.cc.
    */
  var actionId: js.UndefOr[String] = js.native
  /**
    * An identifier to tie multiple tool invocations together. For example,
    * runs of foo_test, bar_test and baz_test on a post-submit of a given
    * patch.
    */
  var correlatedInvocationsId: js.UndefOr[String] = js.native
  /**
    * The details for the tool invoking the requests.
    */
  var toolDetails: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails] = js.native
  /**
    * An identifier that ties multiple actions together to a final result. For
    * example, multiple actions are required to build and run foo_test.
    */
  var toolInvocationId: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata {
  @scala.inline
  def apply(
    actionId: String = null,
    correlatedInvocationsId: String = null,
    toolDetails: SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails = null,
    toolInvocationId: String = null
  ): SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata = {
    val __obj = js.Dynamic.literal()
    if (actionId != null) __obj.updateDynamic("actionId")(actionId.asInstanceOf[js.Any])
    if (correlatedInvocationsId != null) __obj.updateDynamic("correlatedInvocationsId")(correlatedInvocationsId.asInstanceOf[js.Any])
    if (toolDetails != null) __obj.updateDynamic("toolDetails")(toolDetails.asInstanceOf[js.Any])
    if (toolInvocationId != null) __obj.updateDynamic("toolInvocationId")(toolInvocationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata]
  }
}


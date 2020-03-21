package typingsJapgolly.vscodeLanguageserverProtocol

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ResourceOperationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocumentChanges extends js.Object {
  /**
    * The client supports versioned document changes in `WorkspaceEdit`s
    */
  var documentChanges: js.UndefOr[Boolean] = js.undefined
  /**
    * The failure handling strategy of a client if applying the workspace edit
    * failes.
    */
  var failureHandling: js.UndefOr[FailureHandlingKind] = js.undefined
  /**
    * The resource operations the client supports. Clients should at least
    * support 'create', 'rename' and 'delete' files and folders.
    */
  var resourceOperations: js.UndefOr[js.Array[ResourceOperationKind]] = js.undefined
}

object AnonDocumentChanges {
  @scala.inline
  def apply(
    documentChanges: js.UndefOr[Boolean] = js.undefined,
    failureHandling: FailureHandlingKind = null,
    resourceOperations: js.Array[ResourceOperationKind] = null
  ): AnonDocumentChanges = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(documentChanges)) __obj.updateDynamic("documentChanges")(documentChanges.asInstanceOf[js.Any])
    if (failureHandling != null) __obj.updateDynamic("failureHandling")(failureHandling.asInstanceOf[js.Any])
    if (resourceOperations != null) __obj.updateDynamic("resourceOperations")(resourceOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentChanges]
  }
}


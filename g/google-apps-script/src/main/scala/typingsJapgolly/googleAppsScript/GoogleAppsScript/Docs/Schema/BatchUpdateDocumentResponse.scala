package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateDocumentResponse extends js.Object {
  var documentId: js.UndefOr[String] = js.undefined
  var replies: js.UndefOr[js.Array[Response]] = js.undefined
  var writeControl: js.UndefOr[WriteControl] = js.undefined
}

object BatchUpdateDocumentResponse {
  @scala.inline
  def apply(documentId: String = null, replies: js.Array[Response] = null, writeControl: WriteControl = null): BatchUpdateDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDocumentResponse]
  }
}


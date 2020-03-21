package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sites

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sites Attachment such as a file attached to a page.
  *
  * Note that an Attachment is a Blob and can be used anywhere Blob input is expected.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  *
  *     var filesPage = SitesApp.getSite('example.com', 'mysite').getChildByName("files");
  *     var attachments = filesPage.getAttachments();
  *
  *     // DocsList.createFile accepts a blob input. Since an Attachment is just a blob, we can
  *     // just pass it directly to that method
  *     var file = DocsList.createFile(attachments[0]);
  */
trait Attachment extends js.Object {
  def deleteAttachment(): Unit
  def getAs(contentType: String): Blob
  def getAttachmentType(): AttachmentType
  def getBlob(): Blob
  def getContentType(): String
  def getDatePublished(): Date
  def getDescription(): String
  def getLastUpdated(): Date
  def getParent(): Page
  def getTitle(): String
  def getUrl(): String
  def setContentType(contentType: String): Attachment
  def setDescription(description: String): Attachment
  def setFrom(blob: BlobSource): Attachment
  def setParent(parent: Page): Attachment
  def setTitle(title: String): Attachment
  def setUrl(url: String): Attachment
}

object Attachment {
  @scala.inline
  def apply(
    deleteAttachment: Callback,
    getAs: String => CallbackTo[Blob],
    getAttachmentType: CallbackTo[AttachmentType],
    getBlob: CallbackTo[Blob],
    getContentType: CallbackTo[String],
    getDatePublished: CallbackTo[Date],
    getDescription: CallbackTo[String],
    getLastUpdated: CallbackTo[Date],
    getParent: CallbackTo[Page],
    getTitle: CallbackTo[String],
    getUrl: CallbackTo[String],
    setContentType: String => CallbackTo[Attachment],
    setDescription: String => CallbackTo[Attachment],
    setFrom: BlobSource => CallbackTo[Attachment],
    setParent: Page => CallbackTo[Attachment],
    setTitle: String => CallbackTo[Attachment],
    setUrl: String => CallbackTo[Attachment]
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteAttachment")(deleteAttachment.toJsFn)
    __obj.updateDynamic("getAs")(js.Any.fromFunction1((t0: java.lang.String) => getAs(t0).runNow()))
    __obj.updateDynamic("getAttachmentType")(getAttachmentType.toJsFn)
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.updateDynamic("getContentType")(getContentType.toJsFn)
    __obj.updateDynamic("getDatePublished")(getDatePublished.toJsFn)
    __obj.updateDynamic("getDescription")(getDescription.toJsFn)
    __obj.updateDynamic("getLastUpdated")(getLastUpdated.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("setContentType")(js.Any.fromFunction1((t0: java.lang.String) => setContentType(t0).runNow()))
    __obj.updateDynamic("setDescription")(js.Any.fromFunction1((t0: java.lang.String) => setDescription(t0).runNow()))
    __obj.updateDynamic("setFrom")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource) => setFrom(t0).runNow()))
    __obj.updateDynamic("setParent")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Sites.Page) => setParent(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: java.lang.String) => setUrl(t0).runNow()))
    __obj.asInstanceOf[Attachment]
  }
}


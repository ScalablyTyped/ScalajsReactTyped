package typingsJapgolly.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataBlobstore2Info extends js.Object {
  /**
    * gdata
    */
  var blobGeneration: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var blobId: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var downloadReadHandle: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var readToken: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var uploadMetadataContainer: js.UndefOr[String] = js.native
}

object SchemaGdataBlobstore2Info {
  @scala.inline
  def apply(
    blobGeneration: String = null,
    blobId: String = null,
    downloadReadHandle: String = null,
    readToken: String = null,
    uploadMetadataContainer: String = null
  ): SchemaGdataBlobstore2Info = {
    val __obj = js.Dynamic.literal()
    if (blobGeneration != null) __obj.updateDynamic("blobGeneration")(blobGeneration.asInstanceOf[js.Any])
    if (blobId != null) __obj.updateDynamic("blobId")(blobId.asInstanceOf[js.Any])
    if (downloadReadHandle != null) __obj.updateDynamic("downloadReadHandle")(downloadReadHandle.asInstanceOf[js.Any])
    if (readToken != null) __obj.updateDynamic("readToken")(readToken.asInstanceOf[js.Any])
    if (uploadMetadataContainer != null) __obj.updateDynamic("uploadMetadataContainer")(uploadMetadataContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataBlobstore2Info]
  }
}


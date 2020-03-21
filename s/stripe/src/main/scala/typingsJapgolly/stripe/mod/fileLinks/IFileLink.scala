package typingsJapgolly.stripe.mod.fileLinks

import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.mod.IResourceObject
import typingsJapgolly.stripe.stripeStrings.file_link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileLink extends IResourceObject {
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Whether this link is already expired.
    */
  var expired: Boolean
  /**
    * Time at which the link expires.
    */
  var expires_at: Double | Null
  /**
    * The file object this link points to
    */
  var file: String
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * Value is 'file_link'
    */
  @JSName("object")
  var object_IFileLink: file_link
  /**
    * The publicly accessible URL to download the file.
    */
  var url: String
}

object IFileLink {
  @scala.inline
  def apply(
    created: Double,
    expired: Boolean,
    file: String,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: file_link,
    url: String,
    expires_at: Int | Double = null
  ): IFileLink = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (expires_at != null) __obj.updateDynamic("expires_at")(expires_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileLink]
  }
}


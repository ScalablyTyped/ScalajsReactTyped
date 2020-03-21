package typingsJapgolly.firebase.mod.storage

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The full set of object metadata, including read-only properties.
  */
trait FullMetadata extends UploadMetadata {
  /**
    * The bucket this object is contained in.
    */
  var bucket: String
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURLs: js.Array[String]
  /**
    * The full path of this object.
    */
  var fullPath: String
  /**
    * The object's generation.
    * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
    */
  var generation: String
  /**
    * The object's metageneration.
    * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
    */
  var metageneration: String
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  var name: String
  /**
    * The size of this object, in bytes.
    */
  var size: Double
  /**
    * A date string representing when this object was created.
    */
  var timeCreated: String
  /**
    * A date string representing when this object was last updated.
    */
  var updated: String
}

object FullMetadata {
  @scala.inline
  def apply(
    bucket: String,
    downloadURLs: js.Array[String],
    fullPath: String,
    generation: String,
    metageneration: String,
    name: String,
    size: Double,
    timeCreated: String,
    updated: String,
    cacheControl: String = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    contentType: String = null,
    customMetadata: StringDictionary[String] = null,
    md5Hash: String = null
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], downloadURLs = downloadURLs.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata.asInstanceOf[js.Any])
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
}


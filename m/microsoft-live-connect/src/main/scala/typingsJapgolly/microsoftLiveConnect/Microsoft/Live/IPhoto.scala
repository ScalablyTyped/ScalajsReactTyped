package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Photo object contains info about a user's photos on SkyDrive. The
  * Live Connect REST API supports creating, reading, updating, and deleting
  * Photo objects. Use the wl.photos scope to read Photo objects. Use the
  * wl.contacts_photos scope to read any albums, photos, videos, and audio
  * that other users have shared with the user. Use the wl.skydrive_update
  * scope to create, update, or delete Photo objects.
  */
trait IPhoto extends js.Object {
  /**
    * The manufacturer of the camera that took the photo.
    */
  var camera_make: String
  /**
    * The brand and model number of the camera that took the photo.
    */
  var camera_model: String
  /**
    * The number of comments associated with the photo.
    */
  var comments_count: Double
  /**
    * A value that indicates whether comments are enabled for the photo. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean
  /**
    * The time, in ISO 8601 format, at which the photo was created.
    */
  var created_time: String
  /**
    * A description of the photo, or null if no description is specified.
    */
  var description: String
  /**
    * The denominator of the shutter speed (for example, the "15" in "1/15
    * s") that the photo was taken at.
    */
  var exposure_denominator: Double
  /**
    * The numerator of the shutter speed (for example, the "1" in "1/15 s")
    * that the photo was taken at.
    */
  var exposure_numerator: Double
  /**
    * The focal length that the photo was taken at, typically expressed in
    * millimeters for newer lenses.
    */
  var focal_length: Double
  /**
    * The f-number that the photo was taken at.
    */
  var focal_ratio: Double
  /**
    * Info about the user who uploaded the photo.
    */
  var from: IUserInfo
  /**
    * The height, in pixels, of the photo.
    */
  var height: Double
  /**
    * The Photo object's ID.
    */
  var id: String
  /**
    * Info about various sizes of the photo.
    */
  var images: js.Array[IImageInfo]
  /**
    * A value that indicates whether this photo can be embedded. If this
    * photo can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean
  /**
    * A URL of the photo, hosted in SkyDrive.
    */
  var link: String
  /**
    * The location where the photo was taken.
    * Note: The location object is not available for shared photos.
    */
  var location: ILocation
  /**
    * The file name of the photo.
    */
  var name: String
  /**
    * The ID of the folder where the item is stored.
    */
  var parent_id: String
  /**
    * A URL of the photo's picture.
    */
  var picture: String
  /**
    * The object that contains permissions info for the photo.
    */
  var shared_with: ISharedWith
  /**
    * The size, in bytes, of the photo.
    */
  var size: Double
  /**
    * The download URL for the photo.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    */
  var source: String
  /**
    * The number of tags on the photo.
    */
  var tags_count: Double
  /**
    * A value that indicates whether tags are enabled for the photo. If
    * users can tag the photo, this value is true; otherwise, it is false.
    */
  var tags_enabled: Boolean
  /**
    * The type of object; in this case, "photo".
    */
  var `type`: String
  /**
    * The time, in ISO 8601 format, at which the photo was last updated.
    */
  var updated_time: String
  /**
    * The URL to upload photo content hosted in SkyDrive. This value is
    * returned only if the wl.skydrive scope is present.
    */
  var upload_location: String
  /**
    * The date, in ISO 8601 format, on which the photo was taken, or null
    * if no date is specified.
    */
  var when_taken: String
  /**
    * The width, in pixels, of the photo.
    */
  var width: Double
}

object IPhoto {
  @scala.inline
  def apply(
    camera_make: String,
    camera_model: String,
    comments_count: Double,
    comments_enabled: Boolean,
    created_time: String,
    description: String,
    exposure_denominator: Double,
    exposure_numerator: Double,
    focal_length: Double,
    focal_ratio: Double,
    from: IUserInfo,
    height: Double,
    id: String,
    images: js.Array[IImageInfo],
    is_embeddable: Boolean,
    link: String,
    location: ILocation,
    name: String,
    parent_id: String,
    picture: String,
    shared_with: ISharedWith,
    size: Double,
    source: String,
    tags_count: Double,
    tags_enabled: Boolean,
    `type`: String,
    updated_time: String,
    upload_location: String,
    when_taken: String,
    width: Double
  ): IPhoto = {
    val __obj = js.Dynamic.literal(camera_make = camera_make.asInstanceOf[js.Any], camera_model = camera_model.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_enabled = comments_enabled.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exposure_denominator = exposure_denominator.asInstanceOf[js.Any], exposure_numerator = exposure_numerator.asInstanceOf[js.Any], focal_length = focal_length.asInstanceOf[js.Any], focal_ratio = focal_ratio.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags_count = tags_count.asInstanceOf[js.Any], tags_enabled = tags_enabled.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any], when_taken = when_taken.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPhoto]
  }
}


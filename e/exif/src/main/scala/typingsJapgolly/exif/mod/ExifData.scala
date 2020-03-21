package typingsJapgolly.exif.mod

import typingsJapgolly.exif.AnonApertureValue
import typingsJapgolly.exif.AnonAutoBracketing
import typingsJapgolly.exif.AnonCompression
import typingsJapgolly.exif.AnonCopyright
import typingsJapgolly.exif.AnonGPSAltitude
import typingsJapgolly.exif.AnonInteropIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExifData extends js.Object {
  var exif: AnonApertureValue
  var gps: AnonGPSAltitude
  var image: AnonCopyright
  var interoperability: AnonInteropIndex
  var makernote: AnonAutoBracketing
  var thumbnail: AnonCompression
}

object ExifData {
  @scala.inline
  def apply(
    exif: AnonApertureValue,
    gps: AnonGPSAltitude,
    image: AnonCopyright,
    interoperability: AnonInteropIndex,
    makernote: AnonAutoBracketing,
    thumbnail: AnonCompression
  ): ExifData = {
    val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], gps = gps.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], interoperability = interoperability.asInstanceOf[js.Any], makernote = makernote.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExifData]
  }
}


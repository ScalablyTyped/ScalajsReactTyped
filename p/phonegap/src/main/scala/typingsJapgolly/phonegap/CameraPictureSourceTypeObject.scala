package typingsJapgolly.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraPictureSourceTypeObject extends js.Object {
  var CAMERA: Double
  var PHOTOLIBRARY: Double
  var SAVEDPHOTOALBUM: Double
}

object CameraPictureSourceTypeObject {
  @scala.inline
  def apply(CAMERA: Double, PHOTOLIBRARY: Double, SAVEDPHOTOALBUM: Double): CameraPictureSourceTypeObject = {
    val __obj = js.Dynamic.literal(CAMERA = CAMERA.asInstanceOf[js.Any], PHOTOLIBRARY = PHOTOLIBRARY.asInstanceOf[js.Any], SAVEDPHOTOALBUM = SAVEDPHOTOALBUM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CameraPictureSourceTypeObject]
  }
}


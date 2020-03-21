package typingsJapgolly.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebGL 1 Extensions
trait EXTColorBufferHalfFloat extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double
  val RGB16F_EXT: Double
  val RGBA16F_EXT: Double
  val UNSIGNED_NORMALIZED_EXT: Double
}

object EXTColorBufferHalfFloat {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double,
    RGB16F_EXT: Double,
    RGBA16F_EXT: Double,
    UNSIGNED_NORMALIZED_EXT: Double
  ): EXTColorBufferHalfFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT.asInstanceOf[js.Any], RGB16F_EXT = RGB16F_EXT.asInstanceOf[js.Any], RGBA16F_EXT = RGBA16F_EXT.asInstanceOf[js.Any], UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EXTColorBufferHalfFloat]
  }
}


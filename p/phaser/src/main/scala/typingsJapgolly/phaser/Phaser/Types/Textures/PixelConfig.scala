package typingsJapgolly.phaser.Phaser.Types.Textures

import typingsJapgolly.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the position and color data for a single pixel in a CanvasTexture.
  */
trait PixelConfig extends js.Object {
  /**
    * The alpha of the pixel, between 0 and 1.
    */
  var alpha: Double
  /**
    * The color of the pixel, not including the alpha channel.
    */
  var color: integer
  /**
    * The x-coordinate of the pixel.
    */
  var x: integer
  /**
    * The y-coordinate of the pixel.
    */
  var y: integer
}

object PixelConfig {
  @scala.inline
  def apply(alpha: Double, color: integer, x: integer, y: integer): PixelConfig = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PixelConfig]
  }
}


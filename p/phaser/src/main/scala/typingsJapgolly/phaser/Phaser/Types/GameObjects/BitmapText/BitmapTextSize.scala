package typingsJapgolly.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapTextSize extends js.Object {
  /**
    * The position and size of the BitmapText, taking into account the position and scale of the Game Object.
    */
  var global: GlobalBitmapTextSize
  /**
    * The position and size of the BitmapText, taking just the font size into account.
    */
  var local: LocalBitmapTextSize
}

object BitmapTextSize {
  @scala.inline
  def apply(global: GlobalBitmapTextSize, local: LocalBitmapTextSize): BitmapTextSize = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BitmapTextSize]
  }
}


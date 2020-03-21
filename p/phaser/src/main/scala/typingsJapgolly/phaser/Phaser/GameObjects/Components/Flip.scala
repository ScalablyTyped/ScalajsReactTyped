package typingsJapgolly.phaser.Phaser.GameObjects.Components

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for visually flipping a Game Object.
  * Should be applied as a mixin and not used directly.
  */
trait Flip extends js.Object {
  /**
    * The horizontally flipped state of the Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  var flipX: Boolean
  /**
    * The vertically flipped state of the Game Object.
    * 
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  var flipY: Boolean
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  def resetFlip(): this.type
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * 
    * A Game Object that is flipped will render inversed on the flipped axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlip(x: Boolean, y: Boolean): this.type
  /**
    * Sets the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlipX(value: Boolean): this.type
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlipY(value: Boolean): this.type
  /**
    * Toggles the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  def toggleFlipX(): this.type
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  def toggleFlipY(): this.type
}

object Flip {
  @scala.inline
  def apply(
    flipX: Boolean,
    flipY: Boolean,
    resetFlip: CallbackTo[Flip],
    setFlip: (Boolean, Boolean) => CallbackTo[Flip],
    setFlipX: Boolean => CallbackTo[Flip],
    setFlipY: Boolean => CallbackTo[Flip],
    toggleFlipX: CallbackTo[Flip],
    toggleFlipY: CallbackTo[Flip]
  ): Flip = {
    val __obj = js.Dynamic.literal(flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any])
    __obj.updateDynamic("resetFlip")(resetFlip.toJsFn)
    __obj.updateDynamic("setFlip")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => setFlip(t0, t1).runNow()))
    __obj.updateDynamic("setFlipX")(js.Any.fromFunction1((t0: scala.Boolean) => setFlipX(t0).runNow()))
    __obj.updateDynamic("setFlipY")(js.Any.fromFunction1((t0: scala.Boolean) => setFlipY(t0).runNow()))
    __obj.updateDynamic("toggleFlipX")(toggleFlipX.toJsFn)
    __obj.updateDynamic("toggleFlipY")(toggleFlipY.toJsFn)
    __obj.asInstanceOf[Flip]
  }
}


package typingsJapgolly.phaser.Phaser.Types.Create

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateTextureConfig extends js.Object {
  /**
    * [description]
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
    * [description]
    */
  var clearCanvas: js.UndefOr[Boolean] = js.undefined
  /**
    * [description]
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * [description]
    */
  var palette: js.UndefOr[Palette] = js.undefined
  /**
    * The height of each 'pixel' in the generated texture.
    */
  var pixelHeight: js.UndefOr[Double] = js.undefined
  /**
    * The width of each 'pixel' in the generated texture.
    */
  var pixelWidth: js.UndefOr[Double] = js.undefined
  /**
    * [description]
    */
  var postRender: js.UndefOr[GenerateTextureCallback] = js.undefined
  /**
    * [description]
    */
  var preRender: js.UndefOr[GenerateTextureCallback] = js.undefined
  /**
    * [description]
    */
  var resizeCanvas: js.UndefOr[Boolean] = js.undefined
}

object GenerateTextureConfig {
  @scala.inline
  def apply(
    canvas: HTMLCanvasElement = null,
    clearCanvas: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[_] = null,
    palette: Palette = null,
    pixelHeight: Int | Double = null,
    pixelWidth: Int | Double = null,
    postRender: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Callback = null,
    preRender: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Callback = null,
    resizeCanvas: js.UndefOr[Boolean] = js.undefined
  ): GenerateTextureConfig = {
    val __obj = js.Dynamic.literal()
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(clearCanvas)) __obj.updateDynamic("clearCanvas")(clearCanvas.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (pixelHeight != null) __obj.updateDynamic("pixelHeight")(pixelHeight.asInstanceOf[js.Any])
    if (pixelWidth != null) __obj.updateDynamic("pixelWidth")(pixelWidth.asInstanceOf[js.Any])
    if (postRender != null) __obj.updateDynamic("postRender")(js.Any.fromFunction2((t0: /* canvas */ org.scalajs.dom.raw.HTMLCanvasElement, t1: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D) => postRender(t0, t1).runNow()))
    if (preRender != null) __obj.updateDynamic("preRender")(js.Any.fromFunction2((t0: /* canvas */ org.scalajs.dom.raw.HTMLCanvasElement, t1: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D) => preRender(t0, t1).runNow()))
    if (!js.isUndefined(resizeCanvas)) __obj.updateDynamic("resizeCanvas")(resizeCanvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateTextureConfig]
  }
}


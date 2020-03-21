package typingsJapgolly.three.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CanvasTexture")
@js.native
class CanvasTexture protected ()
  extends typingsJapgolly.three.canvasTextureMod.CanvasTexture {
  def this(
    canvas: HTMLCanvasElement,
    mapping: js.UndefOr[typingsJapgolly.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    format: js.UndefOr[typingsJapgolly.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typingsJapgolly.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
  def this(
    canvas: HTMLImageElement,
    mapping: js.UndefOr[typingsJapgolly.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    format: js.UndefOr[typingsJapgolly.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typingsJapgolly.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
  def this(
    canvas: HTMLVideoElement,
    mapping: js.UndefOr[typingsJapgolly.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    format: js.UndefOr[typingsJapgolly.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typingsJapgolly.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}


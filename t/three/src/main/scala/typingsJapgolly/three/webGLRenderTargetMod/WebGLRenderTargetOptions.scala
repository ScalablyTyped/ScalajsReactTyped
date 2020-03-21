package typingsJapgolly.three.webGLRenderTargetMod

import typingsJapgolly.three.constantsMod.TextureDataType
import typingsJapgolly.three.constantsMod.TextureFilter
import typingsJapgolly.three.constantsMod.Wrapping
import typingsJapgolly.three.depthTextureMod.DepthTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderTargetOptions extends js.Object {
   // UnsignedByteType;
  var anisotropy: js.UndefOr[Double] = js.undefined
   // 1;
  var depthBuffer: js.UndefOr[Boolean] = js.undefined
   // true;
  var depthTexture: js.UndefOr[DepthTexture] = js.undefined
  var format: js.UndefOr[Double] = js.undefined
   // true;
  var generateMipmaps: js.UndefOr[Boolean] = js.undefined
  var magFilter: js.UndefOr[TextureFilter] = js.undefined
  var minFilter: js.UndefOr[TextureFilter] = js.undefined
   // true;
  var stencilBuffer: js.UndefOr[Boolean] = js.undefined
   // RGBAFormat;
  var `type`: js.UndefOr[TextureDataType] = js.undefined
  var wrapS: js.UndefOr[Wrapping] = js.undefined
  var wrapT: js.UndefOr[Wrapping] = js.undefined
}

object WebGLRenderTargetOptions {
  @scala.inline
  def apply(
    anisotropy: Int | Double = null,
    depthBuffer: js.UndefOr[Boolean] = js.undefined,
    depthTexture: DepthTexture = null,
    format: Int | Double = null,
    generateMipmaps: js.UndefOr[Boolean] = js.undefined,
    magFilter: TextureFilter = null,
    minFilter: TextureFilter = null,
    stencilBuffer: js.UndefOr[Boolean] = js.undefined,
    `type`: TextureDataType = null,
    wrapS: Wrapping = null,
    wrapT: Wrapping = null
  ): WebGLRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (anisotropy != null) __obj.updateDynamic("anisotropy")(anisotropy.asInstanceOf[js.Any])
    if (!js.isUndefined(depthBuffer)) __obj.updateDynamic("depthBuffer")(depthBuffer.asInstanceOf[js.Any])
    if (depthTexture != null) __obj.updateDynamic("depthTexture")(depthTexture.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipmaps)) __obj.updateDynamic("generateMipmaps")(generateMipmaps.asInstanceOf[js.Any])
    if (magFilter != null) __obj.updateDynamic("magFilter")(magFilter.asInstanceOf[js.Any])
    if (minFilter != null) __obj.updateDynamic("minFilter")(minFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(stencilBuffer)) __obj.updateDynamic("stencilBuffer")(stencilBuffer.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (wrapS != null) __obj.updateDynamic("wrapS")(wrapS.asInstanceOf[js.Any])
    if (wrapT != null) __obj.updateDynamic("wrapT")(wrapT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLRenderTargetOptions]
  }
}


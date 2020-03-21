package typingsJapgolly.tensorflowTfjsNode

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/image", JSImport.Namespace)
@js.native
object imageMod extends js.Object {
  @js.native
  sealed trait ImageType extends js.Object
  
  def decodeBmp(contents: scala.scalajs.js.typedarray.Uint8Array): Tensor3D = js.native
  def decodeBmp(contents: scala.scalajs.js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
  def decodeGif(contents: scala.scalajs.js.typedarray.Uint8Array): Tensor4D = js.native
  def decodeImage(content: scala.scalajs.js.typedarray.Uint8Array): Tensor3D | Tensor4D = js.native
  def decodeImage(content: scala.scalajs.js.typedarray.Uint8Array, channels: Double): Tensor3D | Tensor4D = js.native
  def decodeImage(content: scala.scalajs.js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D | Tensor4D = js.native
  def decodeImage(
    content: scala.scalajs.js.typedarray.Uint8Array,
    channels: Double,
    dtype: String,
    expandAnimations: Boolean
  ): Tensor3D | Tensor4D = js.native
  def decodeJpeg(
    contents: scala.scalajs.js.typedarray.Uint8Array,
    channels: js.UndefOr[Double],
    ratio: js.UndefOr[Double],
    fancyUpscaling: js.UndefOr[Boolean],
    tryRecoverTruncated: js.UndefOr[Boolean],
    acceptableFraction: js.UndefOr[Double],
    dctMethod: js.UndefOr[String]
  ): Tensor3D = js.native
  def decodePng(contents: scala.scalajs.js.typedarray.Uint8Array): Tensor3D = js.native
  def decodePng(contents: scala.scalajs.js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
  def decodePng(contents: scala.scalajs.js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D = js.native
  def encodeJpeg(
    image: Tensor3D,
    format: js.UndefOr[grayscale | rgb],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[cm | in],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  @JSName("encodeJpeg")
  def encodeJpeg_cm(
    image: Tensor3D,
    format: js.UndefOr[_empty],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[cm],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  @JSName("encodeJpeg")
  def encodeJpeg_in(
    image: Tensor3D,
    format: js.UndefOr[_empty],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[in],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def encodePng(image: Tensor3D): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def encodePng(image: Tensor3D, compression: Double): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def getImageType(content: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  @js.native
  object ImageType extends js.Object {
    @js.native
    sealed trait BMP extends ImageType
    
    @js.native
    sealed trait GIF extends ImageType
    
    @js.native
    sealed trait JPEG extends ImageType
    
    @js.native
    sealed trait PNG extends ImageType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImageType with String] = js.native
    /* "BMP" */ @js.native
    object BMP extends TopLevel[BMP with String]
    
    /* "gif" */ @js.native
    object GIF extends TopLevel[GIF with String]
    
    /* "jpeg" */ @js.native
    object JPEG extends TopLevel[JPEG with String]
    
    /* "png" */ @js.native
    object PNG extends TopLevel[PNG with String]
    
  }
  
}


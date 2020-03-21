package typingsJapgolly.tensorflowTfjsData

import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsData.lazyIteratorMod.LazyIterator
import typingsJapgolly.tensorflowTfjsData.typesMod.WebcamConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/webcam_iterator", JSImport.Namespace)
@js.native
object webcamIteratorMod extends js.Object {
  @js.native
  class WebcamIterator protected () extends LazyIterator[Tensor3D] {
    var cropBox: js.Any = js.native
    var cropBoxInd: js.Any = js.native
    var cropSize: js.Any = js.native
    var isClosed: js.Any = js.native
    var needToResize: js.Any = js.native
    var resize: js.Any = js.native
    var stream: js.Any = js.native
    val webcamConfig: WebcamConfig = js.native
    val webcamVideoElement: HTMLVideoElement = js.native
    def capture(): js.Promise[Tensor3D] = js.native
    def cropAndResizeFrame(img: Tensor3D): Tensor3D = js.native
    def start(): js.Promise[Unit] = js.native
    def stop(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object WebcamIterator extends js.Object {
    def create(): js.Promise[WebcamIterator] = js.native
    def create(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
    def create(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
  }
  
}


package typingsJapgolly.tensorflowTfjsData

import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.RequestInfo
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typingsJapgolly.tensorflowTfjsData.csvDatasetMod.CSVDataset
import typingsJapgolly.tensorflowTfjsData.datasetMod.Dataset
import typingsJapgolly.tensorflowTfjsData.microphoneIteratorMod.MicrophoneIterator
import typingsJapgolly.tensorflowTfjsData.typesMod.CSVConfig
import typingsJapgolly.tensorflowTfjsData.typesMod.MicrophoneConfig
import typingsJapgolly.tensorflowTfjsData.typesMod.WebcamConfig
import typingsJapgolly.tensorflowTfjsData.webcamIteratorMod.WebcamIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/readers", JSImport.Namespace)
@js.native
object readersMod extends js.Object {
  def csv(source: RequestInfo): CSVDataset = js.native
  def csv(source: RequestInfo, csvConfig: CSVConfig): CSVDataset = js.native
  def func[T /* <: TensorContainer */](f: js.Function0[(IteratorResult[T, _]) | (js.Promise[IteratorResult[T, _]])]): Dataset[T] = js.native
  def generator[T /* <: TensorContainer */](generator: js.Function0[js.Iterator[T] | js.Promise[js.Iterator[T]]]): Dataset[T] = js.native
  def microphone(): js.Promise[MicrophoneIterator] = js.native
  def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = js.native
  def webcam(): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
}


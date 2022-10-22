package typingsJapgolly.tensorflowTfjsData

import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.RequestInfo
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.TensorContainer
import typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset
import typingsJapgolly.tensorflowTfjsData.distDatasetsCsvDatasetMod.CSVDataset
import typingsJapgolly.tensorflowTfjsData.distIteratorsMicrophoneIteratorMod.MicrophoneIterator
import typingsJapgolly.tensorflowTfjsData.distIteratorsWebcamIteratorMod.WebcamIterator
import typingsJapgolly.tensorflowTfjsData.distTypesMod.CSVConfig
import typingsJapgolly.tensorflowTfjsData.distTypesMod.MicrophoneConfig
import typingsJapgolly.tensorflowTfjsData.distTypesMod.WebcamConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReadersMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def csv(source: RequestInfo): CSVDataset = ^.asInstanceOf[js.Dynamic].applyDynamic("csv")(source.asInstanceOf[js.Any]).asInstanceOf[CSVDataset]
  inline def csv(source: RequestInfo, csvConfig: CSVConfig): CSVDataset = (^.asInstanceOf[js.Dynamic].applyDynamic("csv")(source.asInstanceOf[js.Any], csvConfig.asInstanceOf[js.Any])).asInstanceOf[CSVDataset]
  
  inline def func[T /* <: TensorContainer */](f: js.Function0[(IteratorResult[T, Any]) | (js.Promise[IteratorResult[T, Any]])]): Dataset[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(f.asInstanceOf[js.Any]).asInstanceOf[Dataset[T]]
  
  inline def generator[T /* <: TensorContainer */](generator: js.Function0[js.Iterator[T] | js.Promise[js.Iterator[T]]]): Dataset[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generator")(generator.asInstanceOf[js.Any]).asInstanceOf[Dataset[T]]
  
  inline def microphone(): js.Promise[MicrophoneIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("microphone")().asInstanceOf[js.Promise[MicrophoneIterator]]
  inline def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("microphone")(microphoneConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MicrophoneIterator]]
  
  inline def webcam(): js.Promise[WebcamIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("webcam")().asInstanceOf[js.Promise[WebcamIterator]]
  inline def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("webcam")(webcamVideoElement.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebcamIterator]]
  inline def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("webcam")(webcamVideoElement.asInstanceOf[js.Any], webcamConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebcamIterator]]
  inline def webcam(webcamVideoElement: Unit, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("webcam")(webcamVideoElement.asInstanceOf[js.Any], webcamConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebcamIterator]]
}

package typingsJapgolly.tensorflowTfjs.mod

import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.RequestInfo
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.TensorContainer
import typingsJapgolly.tensorflowTfjsData.distDatasetMod.DatasetContainer
import typingsJapgolly.tensorflowTfjsData.distDatasourceMod.DataSource
import typingsJapgolly.tensorflowTfjsData.distIteratorsFileChunkIteratorMod.FileChunkIteratorOptions
import typingsJapgolly.tensorflowTfjsData.distIteratorsMicrophoneIteratorMod.MicrophoneIterator
import typingsJapgolly.tensorflowTfjsData.distIteratorsWebcamIteratorMod.WebcamIterator
import typingsJapgolly.tensorflowTfjsData.distTypesMod.CSVConfig
import typingsJapgolly.tensorflowTfjsData.distTypesMod.FileElement
import typingsJapgolly.tensorflowTfjsData.distTypesMod.MicrophoneConfig
import typingsJapgolly.tensorflowTfjsData.distTypesMod.WebcamConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSImport("@tensorflow/tfjs", "data")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs", "data.CSVDataset")
  @js.native
  open class CSVDataset protected ()
    extends typingsJapgolly.tensorflowTfjsData.mod.CSVDataset {
    /**
      * Create a `CSVDataset`.
      *
      * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
      * @param csvConfig (Optional) A CSVConfig object that contains configurations
      *     of reading and decoding from CSV file(s).
      *
      *     hasHeader: (Optional) A boolean value that indicates whether the first
      *     row of provided CSV file is a header line with column names, and should
      *     not be included in the data. Defaults to `true`.
      *
      *     columnNames: (Optional) A list of strings that corresponds to
      *     the CSV column names, in order. If provided, it ignores the column
      *     names inferred from the header row. If not provided, infers the column
      *     names from the first row of the records. If hasHeader is false and
      *     columnNames is not provided, this method throws an error.
      *
      *     columnConfigs: (Optional) A dictionary whose key is column names, value
      *     is an object stating if this column is required, column's data type,
      *     default value, and if this column is label. If provided, keys must
      *     correspond to names provided in columnNames or inferred from the file
      *     header lines. If isLabel is true any column, returns an array of two
      *     items: the first item is a dict of features key/value pairs, the second
      *     item is a dict of labels key/value pairs. If no feature is marked as
      *     label, returns a dict of features only.
      *
      *     configuredColumnsOnly (Optional) If true, only columns provided in
      *     columnConfigs will be parsed and provided during iteration.
      *
      *     delimiter (Optional) The string used to parse each line of the input
      *     file. Defaults to `,`.
      */
    def this(input: DataSource) = this()
    def this(input: DataSource, csvConfig: CSVConfig) = this()
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs", "data.Dataset")
  @js.native
  open class Dataset[T /* <: TensorContainer */] ()
    extends typingsJapgolly.tensorflowTfjsData.mod.Dataset[T]
  /* static members */
  object Dataset {
    
    @JSImport("@tensorflow/tfjs", "data.Dataset.MAX_BUFFER_SIZE")
    @js.native
    val MAX_BUFFER_SIZE: /* 10000 */ Double = js.native
  }
  
  @JSImport("@tensorflow/tfjs", "data.FileDataSource")
  @js.native
  open class FileDataSource protected ()
    extends typingsJapgolly.tensorflowTfjsData.mod.FileDataSource {
    def this(input: String) = this()
    /**
      * Create a `FileDataSource`.
      *
      * @param input Local file path, or `File`/`Blob`/`Uint8Array` object to
      *     read. Local file only works in node environment.
      * @param options Options passed to the underlying `FileChunkIterator`s,
      *   such as {chunksize: 1024}.
      */
    def this(input: FileElement) = this()
    def this(input: String, options: FileChunkIteratorOptions) = this()
    def this(input: FileElement, options: FileChunkIteratorOptions) = this()
  }
  
  @JSImport("@tensorflow/tfjs", "data.TextLineDataset")
  @js.native
  open class TextLineDataset protected ()
    extends typingsJapgolly.tensorflowTfjsData.mod.TextLineDataset {
    /**
      * Create a `TextLineDataset`.
      *
      * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
      */
    def this(input: DataSource) = this()
  }
  
  @JSImport("@tensorflow/tfjs", "data.URLDataSource")
  @js.native
  open class URLDataSource protected ()
    extends typingsJapgolly.tensorflowTfjsData.mod.URLDataSource {
    /**
      * Create a `URLDataSource`.
      *
      * @param url A source URL string, or a `Request` object.
      * @param options Options passed to the underlying `FileChunkIterator`s,
      *   such as {chunksize: 1024}.
      */
    def this(url: RequestInfo) = this()
    def this(url: RequestInfo, fileOptions: FileChunkIteratorOptions) = this()
  }
  
  inline def array[T /* <: TensorContainer */](items: js.Array[T]): typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(items.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset[T]]
  
  inline def csv(source: RequestInfo): typingsJapgolly.tensorflowTfjsData.distDatasetsCsvDatasetMod.CSVDataset = ^.asInstanceOf[js.Dynamic].applyDynamic("csv")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsData.distDatasetsCsvDatasetMod.CSVDataset]
  inline def csv(source: RequestInfo, csvConfig: CSVConfig): typingsJapgolly.tensorflowTfjsData.distDatasetsCsvDatasetMod.CSVDataset = (^.asInstanceOf[js.Dynamic].applyDynamic("csv")(source.asInstanceOf[js.Any], csvConfig.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tensorflowTfjsData.distDatasetsCsvDatasetMod.CSVDataset]
  
  inline def func[T /* <: TensorContainer */](f: js.Function0[(IteratorResult[T, Any]) | (js.Promise[IteratorResult[T, Any]])]): typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(f.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset[T]]
  
  inline def generator[T /* <: TensorContainer */](generator: js.Function0[js.Iterator[T] | js.Promise[js.Iterator[T]]]): typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generator")(generator.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset[T]]
  
  inline def microphone(): js.Promise[MicrophoneIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("microphone")().asInstanceOf[js.Promise[MicrophoneIterator]]
  inline def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("microphone")(microphoneConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MicrophoneIterator]]
  
  @JSImport("@tensorflow/tfjs", "data.version_data")
  @js.native
  val versionData: /* "4.0.0" */ String = js.native
  
  inline def webcam(): js.Promise[WebcamIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("webcam")().asInstanceOf[js.Promise[WebcamIterator]]
  inline def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("webcam")(webcamVideoElement.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebcamIterator]]
  inline def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("webcam")(webcamVideoElement.asInstanceOf[js.Any], webcamConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebcamIterator]]
  inline def webcam(webcamVideoElement: Unit, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("webcam")(webcamVideoElement.asInstanceOf[js.Any], webcamConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebcamIterator]]
  
  inline def zip[O /* <: TensorContainer */](datasets: DatasetContainer): typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(datasets.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset[O]]
}

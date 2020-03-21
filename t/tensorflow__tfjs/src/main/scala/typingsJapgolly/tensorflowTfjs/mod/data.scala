package typingsJapgolly.tensorflowTfjs.mod

import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.RequestInfo
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsNumbers.`10000`
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.`1Dot5Dot2`
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typingsJapgolly.tensorflowTfjsData.datasetMod.DatasetContainer
import typingsJapgolly.tensorflowTfjsData.datasourceMod.DataSource
import typingsJapgolly.tensorflowTfjsData.fileChunkIteratorMod.FileChunkIteratorOptions
import typingsJapgolly.tensorflowTfjsData.microphoneIteratorMod.MicrophoneIterator
import typingsJapgolly.tensorflowTfjsData.typesMod.CSVConfig
import typingsJapgolly.tensorflowTfjsData.typesMod.FileElement
import typingsJapgolly.tensorflowTfjsData.typesMod.MicrophoneConfig
import typingsJapgolly.tensorflowTfjsData.typesMod.WebcamConfig
import typingsJapgolly.tensorflowTfjsData.webcamIteratorMod.WebcamIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "data")
@js.native
object data extends js.Object {
  @js.native
  class CSVDataset protected ()
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
  
  @js.native
  abstract class Dataset[T /* <: TensorContainer */] ()
    extends typingsJapgolly.tensorflowTfjsData.mod.Dataset[T]
  
  @js.native
  class FileDataSource protected ()
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
  
  @js.native
  class TextLineDataset protected ()
    extends typingsJapgolly.tensorflowTfjsData.mod.TextLineDataset {
    /**
      * Create a `TextLineDataset`.
      *
      * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
      */
    def this(input: DataSource) = this()
  }
  
  @js.native
  class URLDataSource protected ()
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
  
  @JSName("version_data")
  val versionData: `1Dot5Dot2` = js.native
  def array[T /* <: TensorContainer */](items: js.Array[T]): typingsJapgolly.tensorflowTfjsData.datasetMod.Dataset[T] = js.native
  def csv(source: RequestInfo): typingsJapgolly.tensorflowTfjsData.csvDatasetMod.CSVDataset = js.native
  def csv(source: RequestInfo, csvConfig: CSVConfig): typingsJapgolly.tensorflowTfjsData.csvDatasetMod.CSVDataset = js.native
  def func[T /* <: TensorContainer */](f: js.Function0[(IteratorResult[T, _]) | (js.Promise[IteratorResult[T, _]])]): typingsJapgolly.tensorflowTfjsData.datasetMod.Dataset[T] = js.native
  def generator[T /* <: TensorContainer */](generator: js.Function0[js.Iterator[T] | js.Promise[js.Iterator[T]]]): typingsJapgolly.tensorflowTfjsData.datasetMod.Dataset[T] = js.native
  def microphone(): js.Promise[MicrophoneIterator] = js.native
  def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = js.native
  def webcam(): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
  def zip[O /* <: TensorContainer */](datasets: DatasetContainer): typingsJapgolly.tensorflowTfjsData.datasetMod.Dataset[O] = js.native
  /* static members */
  @js.native
  object Dataset extends js.Object {
    val MAX_BUFFER_SIZE: `10000` = js.native
  }
  
}


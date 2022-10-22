package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.anon.PartialArchiverZipOptions
import typingsJapgolly.exceljs.anon.PartialWorkbookStreamRead
import typingsJapgolly.exceljs.anon.PartialWorkbookStreamWrit
import typingsJapgolly.exceljs.anon.PartialZlibOptions
import typingsJapgolly.exceljs.exceljsStrings.cache
import typingsJapgolly.exceljs.exceljsStrings.emit
import typingsJapgolly.exceljs.exceljsStrings.ignore
import typingsJapgolly.node.NodeJS.TypedArray
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stream {
  
  object xlsx {
    
    @JSImport("exceljs", "stream.xlsx.WorkbookReader")
    @js.native
    open class WorkbookReader protected () extends Workbook {
      def this(input: String, options: PartialWorkbookStreamRead) = this()
      def this(input: Stream, options: PartialWorkbookStreamRead) = this()
      
      def parse(): AsyncIterator[Any, Any, Unit] = js.native
      
      def read(): js.Promise[Unit] = js.native
    }
    
    @JSImport("exceljs", "stream.xlsx.WorkbookWriter")
    @js.native
    open class WorkbookWriter protected () extends Workbook {
      def this(options: PartialWorkbookStreamWrit) = this()
      
      def addApp(): js.Promise[Unit] = js.native
      
      def addContentTypes(): js.Promise[Unit] = js.native
      
      def addCore(): js.Promise[Unit] = js.native
      
      def addOfficeRels(): js.Promise[Unit] = js.native
      
      def addSharedStrings(): js.Promise[Unit] = js.native
      
      def addStyles(): js.Promise[Unit] = js.native
      
      def addThemes(): js.Promise[Unit] = js.native
      
      def addWorkbook(): js.Promise[Unit] = js.native
      
      def addWorkbookRels(): js.Promise[Unit] = js.native
      
      // commit all worksheets, then add suplimentary files
      def commit(): js.Promise[Unit] = js.native
    }
    
    @JSImport("exceljs", "stream.xlsx.WorksheetReader")
    @js.native
    open class WorksheetReader protected () extends StObject {
      def this(options: WorksheetReaderOptions) = this()
      
      def columns(): Double = js.native
      
      def dimensions(): Double = js.native
      
      def getColumn(c: Double): Column = js.native
      
      def parse(): AsyncIterator[js.Array[Any], Any, Unit] = js.native
      
      def read(): js.Promise[Unit] = js.native
    }
    
    trait ArchiverZipOptions extends StObject {
      
      var comment: String
      
      var forceLocalTime: Boolean
      
      var forceZip64: Boolean
      
      var store: Boolean
      
      var zlib: PartialZlibOptions
    }
    object ArchiverZipOptions {
      
      inline def apply(
        comment: String,
        forceLocalTime: Boolean,
        forceZip64: Boolean,
        store: Boolean,
        zlib: PartialZlibOptions
      ): ArchiverZipOptions = {
        val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], forceLocalTime = forceLocalTime.asInstanceOf[js.Any], forceZip64 = forceZip64.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
        __obj.asInstanceOf[ArchiverZipOptions]
      }
      
      extension [Self <: ArchiverZipOptions](x: Self) {
        
        inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
        
        inline def setForceLocalTime(value: Boolean): Self = StObject.set(x, "forceLocalTime", value.asInstanceOf[js.Any])
        
        inline def setForceZip64(value: Boolean): Self = StObject.set(x, "forceZip64", value.asInstanceOf[js.Any])
        
        inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
        
        inline def setZlib(value: PartialZlibOptions): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
      }
    }
    
    trait WorkbookStreamReaderOptions extends StObject {
      
      /**
      			 * @default 'ignore'
      			 */
      var entries: js.UndefOr[emit | ignore] = js.undefined
      
      /**
      			 * @default 'ignore'
      			 */
      var hyperlinks: js.UndefOr[cache | emit | ignore] = js.undefined
      
      /**
      			 * @default 'cache'
      			 */
      var sharedStrings: js.UndefOr[cache | emit | ignore] = js.undefined
      
      /**
      			 * @default 'ignore'
      			 */
      var styles: js.UndefOr[cache | ignore] = js.undefined
      
      /**
      			 * @default 'emit'
      			 */
      var worksheets: js.UndefOr[emit | ignore] = js.undefined
    }
    object WorkbookStreamReaderOptions {
      
      inline def apply(): WorkbookStreamReaderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WorkbookStreamReaderOptions]
      }
      
      extension [Self <: WorkbookStreamReaderOptions](x: Self) {
        
        inline def setEntries(value: emit | ignore): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
        
        inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
        
        inline def setHyperlinks(value: cache | emit | ignore): Self = StObject.set(x, "hyperlinks", value.asInstanceOf[js.Any])
        
        inline def setHyperlinksUndefined: Self = StObject.set(x, "hyperlinks", js.undefined)
        
        inline def setSharedStrings(value: cache | emit | ignore): Self = StObject.set(x, "sharedStrings", value.asInstanceOf[js.Any])
        
        inline def setSharedStringsUndefined: Self = StObject.set(x, "sharedStrings", js.undefined)
        
        inline def setStyles(value: cache | ignore): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        inline def setWorksheets(value: emit | ignore): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
        
        inline def setWorksheetsUndefined: Self = StObject.set(x, "worksheets", js.undefined)
      }
    }
    
    trait WorkbookStreamWriterOptions
      extends StObject
         with WorkbookWriterOptions {
      
      /**
      			 * Specifies whether to add style information to the workbook.
      			 * Styles can add some performance overhead. Default is false
      			 */
      var zip: PartialArchiverZipOptions
    }
    object WorkbookStreamWriterOptions {
      
      inline def apply(
        filename: String,
        stream: Stream,
        useSharedStrings: Boolean,
        useStyles: Boolean,
        zip: PartialArchiverZipOptions
      ): WorkbookStreamWriterOptions = {
        val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkbookStreamWriterOptions]
      }
      
      extension [Self <: WorkbookStreamWriterOptions](x: Self) {
        
        inline def setZip(value: PartialArchiverZipOptions): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      }
    }
    
    trait WorkbookWriterOptions extends StObject {
      
      /**
      			 * 	If stream not specified, this field specifies the path to a file to write the XLSX workbook to.
      			 */
      var filename: String
      
      /**
      			 * Specifies a writable stream to write the XLSX workbook to.
      			 */
      var stream: Stream
      
      /**
      			 * 	Specifies whether to use shared strings in the workbook. Default is false
      			 */
      var useSharedStrings: Boolean
      
      /**
      			 * Specifies whether to add style information to the workbook.
      			 * Styles can add some performance overhead. Default is false
      			 */
      var useStyles: Boolean
    }
    object WorkbookWriterOptions {
      
      inline def apply(filename: String, stream: Stream, useSharedStrings: Boolean, useStyles: Boolean): WorkbookWriterOptions = {
        val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkbookWriterOptions]
      }
      
      extension [Self <: WorkbookWriterOptions](x: Self) {
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
        
        inline def setUseSharedStrings(value: Boolean): Self = StObject.set(x, "useSharedStrings", value.asInstanceOf[js.Any])
        
        inline def setUseStyles(value: Boolean): Self = StObject.set(x, "useStyles", value.asInstanceOf[js.Any])
      }
    }
    
    trait WorksheetReaderOptions extends StObject {
      
      var entry: Stream
      
      var id: Double
      
      var options: WorkbookStreamReaderOptions
      
      var workbook: Workbook
    }
    object WorksheetReaderOptions {
      
      inline def apply(entry: Stream, id: Double, options: WorkbookStreamReaderOptions, workbook: Workbook): WorksheetReaderOptions = {
        val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], workbook = workbook.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorksheetReaderOptions]
      }
      
      extension [Self <: WorksheetReaderOptions](x: Self) {
        
        inline def setEntry(value: Stream): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: WorkbookStreamReaderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setWorkbook(value: Workbook): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
      }
    }
    
    trait ZlibOptions extends StObject {
      
      /**
      			 * @default 16*1024
      			 */
      var chunkSize: Double
      
      // compression only
      var dictionary: js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView
      
      /**
      			 * @default constants.Z_FINISH
      			 */
      var finishFlush: Double
      
      /**
      			 * @default constants.Z_NO_FLUSH
      			 */
      var flush: Double
      
      var level: Double
      
      // compression only
      var memLevel: Double
      
      // compression only
      var strategy: Double
      
      var windowBits: Double
    }
    object ZlibOptions {
      
      inline def apply(
        chunkSize: Double,
        dictionary: js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView,
        finishFlush: Double,
        flush: Double,
        level: Double,
        memLevel: Double,
        strategy: Double,
        windowBits: Double
      ): ZlibOptions = {
        val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], finishFlush = finishFlush.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], memLevel = memLevel.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], windowBits = windowBits.asInstanceOf[js.Any])
        __obj.asInstanceOf[ZlibOptions]
      }
      
      extension [Self <: ZlibOptions](x: Self) {
        
        inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
        
        inline def setDictionary(value: js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
        
        inline def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
        
        inline def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
        
        inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
        
        inline def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
        
        inline def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      }
    }
  }
}

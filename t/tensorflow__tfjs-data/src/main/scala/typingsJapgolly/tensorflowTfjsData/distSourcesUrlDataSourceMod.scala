package typingsJapgolly.tensorflowTfjsData

import typingsJapgolly.std.RequestInfo
import typingsJapgolly.tensorflowTfjsData.distDatasourceMod.DataSource
import typingsJapgolly.tensorflowTfjsData.distIteratorsFileChunkIteratorMod.FileChunkIteratorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSourcesUrlDataSourceMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/sources/url_data_source", "URLDataSource")
  @js.native
  open class URLDataSource protected () extends DataSource {
    /**
      * Create a `URLDataSource`.
      *
      * @param url A source URL string, or a `Request` object.
      * @param options Options passed to the underlying `FileChunkIterator`s,
      *   such as {chunksize: 1024}.
      */
    def this(url: RequestInfo) = this()
    def this(url: RequestInfo, fileOptions: FileChunkIteratorOptions) = this()
    
    /* protected */ val fileOptions: FileChunkIteratorOptions = js.native
    
    /* protected */ val url: RequestInfo = js.native
  }
}

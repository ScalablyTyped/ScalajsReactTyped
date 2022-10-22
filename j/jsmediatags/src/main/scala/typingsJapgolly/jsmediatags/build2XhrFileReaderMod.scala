package typingsJapgolly.jsmediatags

import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.jsmediatags.anon.AvoidHeadRequests
import typingsJapgolly.jsmediatags.typesMod.CallbackType
import typingsJapgolly.jsmediatags.typesMod.LoadCallbackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2XhrFileReaderMod {
  
  @JSImport("jsmediatags/build2/XhrFileReader", JSImport.Default)
  @js.native
  open class default protected () extends XhrFileReader {
    def this(url: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/XhrFileReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsmediatags/build2/XhrFileReader", "default._config")
    @js.native
    def _config: AvoidHeadRequests = js.native
    inline def _config_=(x: AvoidHeadRequests): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_config")(x.asInstanceOf[js.Any])
    
    inline def canReadFile(file: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def setConfig(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait ContentRangeType extends StObject {
    
    var firstBytePosition: js.UndefOr[Double] = js.undefined
    
    var instanceLength: js.UndefOr[Double] = js.undefined
    
    var lastBytePosition: js.UndefOr[Double] = js.undefined
  }
  object ContentRangeType {
    
    inline def apply(): ContentRangeType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentRangeType]
    }
    
    extension [Self <: ContentRangeType](x: Self) {
      
      inline def setFirstBytePosition(value: Double): Self = StObject.set(x, "firstBytePosition", value.asInstanceOf[js.Any])
      
      inline def setFirstBytePositionUndefined: Self = StObject.set(x, "firstBytePosition", js.undefined)
      
      inline def setInstanceLength(value: Double): Self = StObject.set(x, "instanceLength", value.asInstanceOf[js.Any])
      
      inline def setInstanceLengthUndefined: Self = StObject.set(x, "instanceLength", js.undefined)
      
      inline def setLastBytePosition(value: Double): Self = StObject.set(x, "lastBytePosition", value.asInstanceOf[js.Any])
      
      inline def setLastBytePositionUndefined: Self = StObject.set(x, "lastBytePosition", js.undefined)
    }
  }
  
  @js.native
  trait XhrFileReader
    extends typingsJapgolly.jsmediatags.build2MediaFileReaderMod.default {
    
    def _createXHRObject(): XMLHttpRequest = js.native
    
    def _fetchEntireFile(callbacks: LoadCallbackType): Unit = js.native
    
    def _fetchSizeWithGetRequest(callbacks: LoadCallbackType): Unit = js.native
    
    def _fetchSizeWithHeadRequest(callbacks: LoadCallbackType): Unit = js.native
    
    var _fileData: typingsJapgolly.jsmediatags.build2ChunkedFileDataMod.default = js.native
    
    def _getResponseHeader(xhr: XMLHttpRequest, headerName: String): String | Null = js.native
    
    def _getXhrResponseContent(xhr: XMLHttpRequest): String = js.native
    
    def _hasResponseHeader(xhr: XMLHttpRequest, headerName: String): Boolean = js.native
    
    def _isWebWorker(): Boolean = js.native
    
    def _makeXHRRequest(method: String, range: js.Tuple2[Double, Double], callbacks: CallbackType): Unit = js.native
    def _makeXHRRequest(method: String, range: Null, callbacks: CallbackType): Unit = js.native
    
    def _parseContentLength(xhr: XMLHttpRequest): Double | Null = js.native
    
    def _parseContentRange(xhr: XMLHttpRequest): ContentRangeType | Null = js.native
    
    def _roundRangeToChunkMultiple(range: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
    
    def _setRequestHeader(xhr: XMLHttpRequest, headerName: String, headerValue: String): Unit = js.native
    
    var _url: String = js.native
  }
}

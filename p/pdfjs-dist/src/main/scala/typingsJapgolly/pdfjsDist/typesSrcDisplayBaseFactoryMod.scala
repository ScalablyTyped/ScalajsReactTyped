package typingsJapgolly.pdfjsDist

import typingsJapgolly.pdfjsDist.anon.BaseUrl
import typingsJapgolly.pdfjsDist.anon.Canvas
import typingsJapgolly.pdfjsDist.anon.Filename
import typingsJapgolly.pdfjsDist.anon.NameAny
import typingsJapgolly.pdfjsDist.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayBaseFactoryMod {
  
  @JSImport("pdfjs-dist/types/src/display/base_factory", "BaseCMapReaderFactory")
  @js.native
  open class BaseCMapReaderFactory protected () extends StObject {
    def this(hasBaseUrlIsCompressed: BaseUrl) = this()
    
    /**
      * @ignore
      */
    def _fetchData(url: Any, compressionType: Any): Unit = js.native
    
    var baseUrl: Any = js.native
    
    def fetch(hasName: NameAny): js.Promise[Any] = js.native
    
    var isCompressed: Boolean = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/base_factory", "BaseCanvasFactory")
  @js.native
  open class BaseCanvasFactory () extends StObject {
    
    /**
      * @ignore
      */
    def _createCanvas(width: Any, height: Any): Unit = js.native
    
    def create(width: Any, height: Any): Canvas = js.native
    
    def destroy(canvasAndContext: Any): Unit = js.native
    
    def reset(canvasAndContext: Any, width: Any, height: Any): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/base_factory", "BaseSVGFactory")
  @js.native
  open class BaseSVGFactory () extends StObject {
    
    /**
      * @ignore
      */
    def _createSVG(`type`: Any): Unit = js.native
    
    def create(width: Any, height: Any): Unit = js.native
    def create(width: Any, height: Any, skipDimensions: Boolean): Unit = js.native
    
    def createElement(`type`: Any): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/base_factory", "BaseStandardFontDataFactory")
  @js.native
  open class BaseStandardFontDataFactory protected () extends StObject {
    def this(hasBaseUrl: `0`) = this()
    
    /**
      * @ignore
      */
    def _fetchData(url: Any): Unit = js.native
    
    var baseUrl: Any = js.native
    
    def fetch(hasFilename: Filename): js.Promise[Any] = js.native
  }
}

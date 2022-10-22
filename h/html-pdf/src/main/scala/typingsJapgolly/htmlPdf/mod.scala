package typingsJapgolly.htmlPdf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.htmlPdf.anon.Bottom
import typingsJapgolly.htmlPdf.anon.Contents
import typingsJapgolly.htmlPdf.anon.Detached
import typingsJapgolly.htmlPdf.anon.Domain
import typingsJapgolly.htmlPdf.anon.Height
import typingsJapgolly.htmlPdf.htmlPdfStrings.A3
import typingsJapgolly.htmlPdf.htmlPdfStrings.A4
import typingsJapgolly.htmlPdf.htmlPdfStrings.A5
import typingsJapgolly.htmlPdf.htmlPdfStrings.Legal
import typingsJapgolly.htmlPdf.htmlPdfStrings.Letter
import typingsJapgolly.htmlPdf.htmlPdfStrings.Tabloid
import typingsJapgolly.htmlPdf.htmlPdfStrings.jpeg
import typingsJapgolly.htmlPdf.htmlPdfStrings.landscape
import typingsJapgolly.htmlPdf.htmlPdfStrings.manual
import typingsJapgolly.htmlPdf.htmlPdfStrings.pdf
import typingsJapgolly.htmlPdf.htmlPdfStrings.png
import typingsJapgolly.htmlPdf.htmlPdfStrings.portrait
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-pdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(html: String): CreateResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(html.asInstanceOf[js.Any]).asInstanceOf[CreateResult]
  inline def create(html: String, options: CreateOptions): CreateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CreateResult]
  
  trait CreateOptions extends StObject {
    
    // Rendering options
    var base: js.UndefOr[String] = js.undefined
    
    // Page options
    var border: js.UndefOr[String | Bottom] = js.undefined
    
    // To run Node application as Windows service
    var childProcessOptions: js.UndefOr[Detached] = js.undefined
    
    // Export options
    var directory: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[Height] = js.undefined
    
    var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
    
    var header: js.UndefOr[Contents] = js.undefined
    
    // Papersize Options: http://phantomjs.org/api/webpage/property/paper-size.html
    var height: js.UndefOr[String] = js.undefined
    
    // HTTP Cookies that are used for requests
    var httpCookies: js.UndefOr[js.Array[Domain]] = js.undefined
    
    // HTTP Headers that are used for requests
    var httpHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    // Prevent local file:// access by passing '--local-url-access=false' to phantomjs
    // For security reasons you should keep the default value if you render
    // arbitrary html/js.
    // The default is `false`
    var localUrlAccess: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[portrait | landscape] = js.undefined
    
    var paginationOffset: js.UndefOr[Double] = js.undefined
    
    var phantomArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    // Script options
    var phantomPath: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[String] = js.undefined
    
    // Time we should wait after window load
    var renderDelay: js.UndefOr[manual | Double] = js.undefined
    
    var script: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    // File options
    var `type`: js.UndefOr[png | jpeg | pdf] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    // Zooming option, can be used to scale images if `options.type` is not pdf
    var zoomFactor: js.UndefOr[String] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    extension [Self <: CreateOptions](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBorder(value: String | Bottom): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setChildProcessOptions(value: Detached): Self = StObject.set(x, "childProcessOptions", value.asInstanceOf[js.Any])
      
      inline def setChildProcessOptionsUndefined: Self = StObject.set(x, "childProcessOptions", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setFooter(value: Height): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeader(value: Contents): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHttpCookies(value: js.Array[Domain]): Self = StObject.set(x, "httpCookies", value.asInstanceOf[js.Any])
      
      inline def setHttpCookiesUndefined: Self = StObject.set(x, "httpCookies", js.undefined)
      
      inline def setHttpCookiesVarargs(value: Domain*): Self = StObject.set(x, "httpCookies", js.Array(value*))
      
      inline def setHttpHeaders(value: StringDictionary[String]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
      
      inline def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
      
      inline def setLocalUrlAccess(value: Boolean): Self = StObject.set(x, "localUrlAccess", value.asInstanceOf[js.Any])
      
      inline def setLocalUrlAccessUndefined: Self = StObject.set(x, "localUrlAccess", js.undefined)
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPaginationOffset(value: Double): Self = StObject.set(x, "paginationOffset", value.asInstanceOf[js.Any])
      
      inline def setPaginationOffsetUndefined: Self = StObject.set(x, "paginationOffset", js.undefined)
      
      inline def setPhantomArgs(value: js.Array[String]): Self = StObject.set(x, "phantomArgs", value.asInstanceOf[js.Any])
      
      inline def setPhantomArgsUndefined: Self = StObject.set(x, "phantomArgs", js.undefined)
      
      inline def setPhantomArgsVarargs(value: String*): Self = StObject.set(x, "phantomArgs", js.Array(value*))
      
      inline def setPhantomPath(value: String): Self = StObject.set(x, "phantomPath", value.asInstanceOf[js.Any])
      
      inline def setPhantomPathUndefined: Self = StObject.set(x, "phantomPath", js.undefined)
      
      inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRenderDelay(value: manual | Double): Self = StObject.set(x, "renderDelay", value.asInstanceOf[js.Any])
      
      inline def setRenderDelayUndefined: Self = StObject.set(x, "renderDelay", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: png | jpeg | pdf): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZoomFactor(value: String): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    }
  }
  
  @js.native
  trait CreateResult extends StObject {
    
    def toBuffer(callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]): Unit = js.native
    
    def toFile(): Unit = js.native
    def toFile(callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
    def toFile(filename: String): Unit = js.native
    def toFile(filename: String, callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
    def toFile(filename: Unit, callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
    
    def toStream(callback: js.Function2[/* err */ js.Error, /* stream */ ReadStream, Unit]): Unit = js.native
  }
  
  trait FileInfo extends StObject {
    
    var filename: String
  }
  object FileInfo {
    
    inline def apply(filename: String): FileInfo = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}

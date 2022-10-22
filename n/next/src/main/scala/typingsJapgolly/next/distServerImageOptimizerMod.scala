package typingsJapgolly.next

import typingsJapgolly.next.anon.ErrorMessage
import typingsJapgolly.next.anon.Height
import typingsJapgolly.next.anon.Href
import typingsJapgolly.next.anon.NextConfig
import typingsJapgolly.next.distServerConfigSharedMod.NextConfigComplete
import typingsJapgolly.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import typingsJapgolly.next.distServerResponseCacheTypesMod.IncrementalCacheEntry
import typingsJapgolly.next.distServerResponseCacheTypesMod.IncrementalCacheValue
import typingsJapgolly.next.nextBooleans.`false`
import typingsJapgolly.next.nextStrings.avif_
import typingsJapgolly.next.nextStrings.imageSlashavif
import typingsJapgolly.next.nextStrings.imageSlashgif
import typingsJapgolly.next.nextStrings.imageSlashjpeg
import typingsJapgolly.next.nextStrings.imageSlashpng
import typingsJapgolly.next.nextStrings.imageSlashsvgPlussignxml
import typingsJapgolly.next.nextStrings.imageSlashwebp
import typingsJapgolly.next.nextStrings.jpeg
import typingsJapgolly.next.nextStrings.png
import typingsJapgolly.next.nextStrings.webp_
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.querystringMod.ParsedUrlQuery
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerImageOptimizerMod {
  
  @JSImport("next/dist/server/image-optimizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/image-optimizer", "Deferred")
  @js.native
  open class Deferred[T] () extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(): Unit = js.native
    def reject(error: js.Error): Unit = js.native
    
    def resolve(value: T): Unit = js.native
  }
  
  @JSImport("next/dist/server/image-optimizer", "ImageError")
  @js.native
  open class ImageError protected ()
    extends StObject
       with Error {
    def this(statusCode: Double, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var statusCode: Double = js.native
  }
  
  @JSImport("next/dist/server/image-optimizer", "ImageOptimizerCache")
  @js.native
  open class ImageOptimizerCache protected () extends StObject {
    def this(hasDistDirNextConfig: NextConfig) = this()
    
    /* private */ var cacheDir: Any = js.native
    
    def get(cacheKey: String): js.Promise[IncrementalCacheEntry | Null] = js.native
    
    /* private */ var nextConfig: Any = js.native
    
    def set(cacheKey: String): js.Promise[Unit] = js.native
    def set(cacheKey: String, value: Null, revalidate: Double): js.Promise[Unit] = js.native
    def set(cacheKey: String, value: IncrementalCacheValue): js.Promise[Unit] = js.native
    def set(cacheKey: String, value: IncrementalCacheValue, revalidate: Double): js.Promise[Unit] = js.native
    @JSName("set")
    def set_false(cacheKey: String, value: Null, revalidate: `false`): js.Promise[Unit] = js.native
    @JSName("set")
    def set_false(cacheKey: String, value: IncrementalCacheValue, revalidate: `false`): js.Promise[Unit] = js.native
  }
  /* static members */
  object ImageOptimizerCache {
    
    @JSImport("next/dist/server/image-optimizer", "ImageOptimizerCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCacheKey(hasHrefWidthQualityMimeType: Href): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")(hasHrefWidthQualityMimeType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def validateParams(req: IncomingMessage, query: ParsedUrlQuery, nextConfig: NextConfigComplete, isDev: Boolean): ImageParamsResult | ErrorMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("validateParams")(req.asInstanceOf[js.Any], query.asInstanceOf[js.Any], nextConfig.asInstanceOf[js.Any], isDev.asInstanceOf[js.Any])).asInstanceOf[ImageParamsResult | ErrorMessage]
  }
  
  inline def detectContentType(buffer: Buffer): imageSlashsvgPlussignxml | imageSlashavif | imageSlashwebp | imageSlashpng | imageSlashjpeg | imageSlashgif | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detectContentType")(buffer.asInstanceOf[js.Any]).asInstanceOf[imageSlashsvgPlussignxml | imageSlashavif | imageSlashwebp | imageSlashpng | imageSlashjpeg | imageSlashgif | Null]
  
  inline def getHash(items: js.Array[String | Double | Buffer]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHash")(items.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getImageSize(buffer: Buffer, `extension`: avif_ | webp_ | png | jpeg): js.Promise[Height] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSize")(buffer.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Height]]
  
  inline def getMaxAge(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxAge")().asInstanceOf[Double]
  inline def getMaxAge(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxAge")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def imageOptimizer(
    _req: IncomingMessage,
    _res: ServerResponse[IncomingMessage],
    paramsResult: ImageParamsResult,
    nextConfig: NextConfigComplete,
    isDev: Boolean,
    handleRequest: js.Function3[
      /* newReq */ IncomingMessage, 
      /* newRes */ ServerResponse[IncomingMessage], 
      /* newParsedUrl */ js.UndefOr[NextUrlWithParsedQuery], 
      js.Promise[Unit]
    ]
  ): js.Promise[typingsJapgolly.next.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOptimizer")(_req.asInstanceOf[js.Any], _res.asInstanceOf[js.Any], paramsResult.asInstanceOf[js.Any], nextConfig.asInstanceOf[js.Any], isDev.asInstanceOf[js.Any], handleRequest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.next.anon.Buffer]]
  inline def imageOptimizer(
    _req: IncomingMessage,
    _res: ServerResponse[IncomingMessage],
    paramsResult: ImageParamsResult,
    nextConfig: NextConfigComplete,
    isDev: Unit,
    handleRequest: js.Function3[
      /* newReq */ IncomingMessage, 
      /* newRes */ ServerResponse[IncomingMessage], 
      /* newParsedUrl */ js.UndefOr[NextUrlWithParsedQuery], 
      js.Promise[Unit]
    ]
  ): js.Promise[typingsJapgolly.next.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOptimizer")(_req.asInstanceOf[js.Any], _res.asInstanceOf[js.Any], paramsResult.asInstanceOf[js.Any], nextConfig.asInstanceOf[js.Any], isDev.asInstanceOf[js.Any], handleRequest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.next.anon.Buffer]]
  
  inline def resizeImage(
    content: Buffer,
    width: Double,
    height: Double,
    `extension`: avif_ | webp_ | png | jpeg,
    quality: Double
  ): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeImage")(content.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def sendResponse(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    url: String,
    `extension`: String,
    buffer: Buffer,
    isStatic: Boolean,
    xCache: XCacheHeader,
    contentSecurityPolicy: String,
    maxAge: Double,
    isDev: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResponse")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], xCache.asInstanceOf[js.Any], contentSecurityPolicy.asInstanceOf[js.Any], maxAge.asInstanceOf[js.Any], isDev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ImageParamsResult extends StObject {
    
    var href: String
    
    var isAbsolute: Boolean
    
    var isStatic: Boolean
    
    var mimeType: String
    
    var minimumCacheTTL: Double
    
    var quality: Double
    
    var sizes: js.Array[Double]
    
    var width: Double
  }
  object ImageParamsResult {
    
    inline def apply(
      href: String,
      isAbsolute: Boolean,
      isStatic: Boolean,
      mimeType: String,
      minimumCacheTTL: Double,
      quality: Double,
      sizes: js.Array[Double],
      width: Double
    ): ImageParamsResult = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], isAbsolute = isAbsolute.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], minimumCacheTTL = minimumCacheTTL.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageParamsResult]
    }
    
    extension [Self <: ImageParamsResult](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setIsAbsolute(value: Boolean): Self = StObject.set(x, "isAbsolute", value.asInstanceOf[js.Any])
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMinimumCacheTTL(value: Double): Self = StObject.set(x, "minimumCacheTTL", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.MISS
    - typingsJapgolly.next.nextStrings.HIT
    - typingsJapgolly.next.nextStrings.STALE
  */
  trait XCacheHeader extends StObject
  object XCacheHeader {
    
    inline def HIT: typingsJapgolly.next.nextStrings.HIT = "HIT".asInstanceOf[typingsJapgolly.next.nextStrings.HIT]
    
    inline def MISS: typingsJapgolly.next.nextStrings.MISS = "MISS".asInstanceOf[typingsJapgolly.next.nextStrings.MISS]
    
    inline def STALE: typingsJapgolly.next.nextStrings.STALE = "STALE".asInstanceOf[typingsJapgolly.next.nextStrings.STALE]
  }
}

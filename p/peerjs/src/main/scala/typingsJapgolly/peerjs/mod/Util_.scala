package typingsJapgolly.peerjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import org.scalajs.dom.FileReader
import typingsJapgolly.peerjs.anon.Chrome
import typingsJapgolly.peerjs.anon.Data
import typingsJapgolly.peerjs.anon.IceServers
import typingsJapgolly.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Util_ extends StObject {
  
  val CLOUD_HOST: /* "0.peerjs.com" */ String
  
  val CLOUD_PORT: /* 443 */ Double
  
  def binaryStringToArrayBuffer(binary: String): js.typedarray.ArrayBuffer | SharedArrayBuffer
  
  def blobToArrayBuffer(blob: Blob, cb: js.Function1[/* arg */ js.typedarray.ArrayBuffer | Null, Unit]): FileReader
  
  val browser: String
  
  val browserVersion: Double
  
  def chunk(blob: Blob): js.Array[Data]
  
  val chunkedBrowsers: Chrome
  
  val chunkedMTU: /* 16300 */ Double
  
  val defaultConfig: IceServers
  
  def isSecure(): Boolean
  
  def noop(): Unit
  
  var pack: Any
  
  def randomToken(): String
  
  val supports: UtilSupportsObj
  
  var unpack: Any
  
  def validateId(id: String): Boolean
}
object Util_ {
  
  inline def apply(
    CLOUD_HOST: /* "0.peerjs.com" */ String,
    CLOUD_PORT: /* 443 */ Double,
    binaryStringToArrayBuffer: String => js.typedarray.ArrayBuffer | SharedArrayBuffer,
    blobToArrayBuffer: (Blob, js.Function1[/* arg */ js.typedarray.ArrayBuffer | Null, Unit]) => FileReader,
    browser: String,
    browserVersion: Double,
    chunk: Blob => js.Array[Data],
    chunkedBrowsers: Chrome,
    chunkedMTU: /* 16300 */ Double,
    defaultConfig: IceServers,
    isSecure: CallbackTo[Boolean],
    noop: Callback,
    pack: Any,
    randomToken: CallbackTo[String],
    supports: UtilSupportsObj,
    unpack: Any,
    validateId: String => Boolean
  ): Util_ = {
    val __obj = js.Dynamic.literal(CLOUD_HOST = CLOUD_HOST.asInstanceOf[js.Any], CLOUD_PORT = CLOUD_PORT.asInstanceOf[js.Any], binaryStringToArrayBuffer = js.Any.fromFunction1(binaryStringToArrayBuffer), blobToArrayBuffer = js.Any.fromFunction2(blobToArrayBuffer), browser = browser.asInstanceOf[js.Any], browserVersion = browserVersion.asInstanceOf[js.Any], chunk = js.Any.fromFunction1(chunk), chunkedBrowsers = chunkedBrowsers.asInstanceOf[js.Any], chunkedMTU = chunkedMTU.asInstanceOf[js.Any], defaultConfig = defaultConfig.asInstanceOf[js.Any], isSecure = isSecure.toJsFn, noop = noop.toJsFn, pack = pack.asInstanceOf[js.Any], randomToken = randomToken.toJsFn, supports = supports.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any], validateId = js.Any.fromFunction1(validateId))
    __obj.asInstanceOf[Util_]
  }
  
  extension [Self <: Util_](x: Self) {
    
    inline def setBinaryStringToArrayBuffer(value: String => js.typedarray.ArrayBuffer | SharedArrayBuffer): Self = StObject.set(x, "binaryStringToArrayBuffer", js.Any.fromFunction1(value))
    
    inline def setBlobToArrayBuffer(value: (Blob, js.Function1[/* arg */ js.typedarray.ArrayBuffer | Null, Unit]) => FileReader): Self = StObject.set(x, "blobToArrayBuffer", js.Any.fromFunction2(value))
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersion(value: Double): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
    
    inline def setCLOUD_HOST(value: /* "0.peerjs.com" */ String): Self = StObject.set(x, "CLOUD_HOST", value.asInstanceOf[js.Any])
    
    inline def setCLOUD_PORT(value: /* 443 */ Double): Self = StObject.set(x, "CLOUD_PORT", value.asInstanceOf[js.Any])
    
    inline def setChunk(value: Blob => js.Array[Data]): Self = StObject.set(x, "chunk", js.Any.fromFunction1(value))
    
    inline def setChunkedBrowsers(value: Chrome): Self = StObject.set(x, "chunkedBrowsers", value.asInstanceOf[js.Any])
    
    inline def setChunkedMTU(value: /* 16300 */ Double): Self = StObject.set(x, "chunkedMTU", value.asInstanceOf[js.Any])
    
    inline def setDefaultConfig(value: IceServers): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
    
    inline def setIsSecure(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSecure", value.toJsFn)
    
    inline def setNoop(value: Callback): Self = StObject.set(x, "noop", value.toJsFn)
    
    inline def setPack(value: Any): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
    
    inline def setRandomToken(value: CallbackTo[String]): Self = StObject.set(x, "randomToken", value.toJsFn)
    
    inline def setSupports(value: UtilSupportsObj): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    inline def setUnpack(value: Any): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
    
    inline def setValidateId(value: String => Boolean): Self = StObject.set(x, "validateId", js.Any.fromFunction1(value))
  }
}

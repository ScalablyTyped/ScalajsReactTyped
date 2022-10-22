package typingsJapgolly.clamavJs

import typingsJapgolly.clamavJs.clamavJsInts.`3310`
import typingsJapgolly.clamavJs.clamavJsStrings.localhost
import typingsJapgolly.node.fsMod.ReadStream
import typingsJapgolly.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clamav.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("clamav.js", "ClamAVChannel")
  @js.native
  open class ClamAVChannel () extends StObject {
    
    def _flush(callback: js.Function0[Any]): Unit = js.native
    
    def _transform(chunk: Double, encoding: Any, callback: js.Function0[Any]): Unit = js.native
  }
  
  inline def clamavfilescan(
    port: Double,
    host: String,
    filename: String,
    callback: js.Function3[/* error */ js.Error, /* object */ Any, /* result */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clamavfilescan")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clamavpathscan(
    port: Double,
    host: String,
    pathname: String,
    callback: js.Function3[/* error */ js.Error, /* object */ Any, /* result */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clamavpathscan")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clamavstreamscan(
    port: Double,
    host: String,
    stream: ReadStream,
    complete: js.Function1[/* stream */ Stream | ReadStream, Any],
    `object`: Any,
    callback: js.Function3[/* error */ js.Error, /* object */ Any, /* result */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clamavstreamscan")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clamavstreamscan(
    port: Double,
    host: String,
    stream: Stream,
    complete: js.Function1[/* stream */ Stream | ReadStream, Any],
    `object`: Any,
    callback: js.Function3[/* error */ js.Error, /* object */ Any, /* result */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clamavstreamscan")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createScanner(port: Double, host: String): ClamScanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ClamScanner]
  
  inline def ping(
    port: Double,
    host: String,
    timeout: Double,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ping")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def version(
    port: Double,
    host: String,
    timeout: Double,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* status */ js.UndefOr[String], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("version")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait ClamScanner extends StObject {
    
    var host: String | localhost = js.native
    
    var port: `3310` | Double = js.native
    
    def scan(
      `object`: String,
      callback: js.Function3[/* error */ js.Error, /* object */ Any, /* result */ String, Any]
    ): Unit = js.native
    def scan(
      `object`: ReadStream,
      callback: js.Function3[/* error */ js.Error, /* object */ Any, /* result */ String, Any]
    ): Unit = js.native
    def scan(
      `object`: Stream,
      callback: js.Function3[/* error */ js.Error, /* object */ Any, /* result */ String, Any]
    ): Unit = js.native
  }
}

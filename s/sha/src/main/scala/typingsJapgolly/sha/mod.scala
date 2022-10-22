package typingsJapgolly.sha

import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check[R](fileName: String, expected: String, cb: CheckCallback[R]): Unit | R = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fileName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit | R]
  inline def check[R](fileName: String, expected: String, options: ShaOptions, cb: CheckCallback[R]): Unit | R = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fileName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit | R]
  
  inline def checkSync(fileName: String, expected: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(fileName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkSync(fileName: String, expected: String, options: ShaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(fileName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(fileName: String, cb: GetCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(fileName.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(fileName: String, options: ShaOptions, cb: GetCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSync(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSync(fileName: String, options: ShaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSync")(fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stream(expected: String): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(expected.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def stream(expected: String, options: ShaOptions): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  type CheckCallback[R] = js.Function1[/* err */ js.Error | Null, R]
  
  type GetCallback = js.Function2[/* err */ js.Error | Null, /* actual */ String, Unit]
  
  trait ShaOptions extends StObject {
    
    /** defaults to `sha1` and can be any of the algorithms supported by `crypto.createHash` */
    var algorithm: js.UndefOr[String] = js.undefined
  }
  object ShaOptions {
    
    inline def apply(): ShaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShaOptions]
    }
    
    extension [Self <: ShaOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    }
  }
}

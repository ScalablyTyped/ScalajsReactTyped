package typingsJapgolly.antvG2

import org.scalajs.dom.MessageEvent
import org.scalajs.dom.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelUtilCreateWorkerMod {
  
  @JSImport("@antv/g2/lib/geometry/label/util/createWorker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWorker(f: Any): MyWorker = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorker")(f.asInstanceOf[js.Any]).asInstanceOf[MyWorker]
  
  @js.native
  trait MyWorker extends StObject {
    
    def destroy(): Unit = js.native
    
    def post(params: Any): js.Promise[MessageEvent] = js.native
    def post(params: Any, onError: js.Function0[Any]): js.Promise[MessageEvent] = js.native
    
    var queue: js.Array[Any] = js.native
    
    var worker: Worker = js.native
  }
}

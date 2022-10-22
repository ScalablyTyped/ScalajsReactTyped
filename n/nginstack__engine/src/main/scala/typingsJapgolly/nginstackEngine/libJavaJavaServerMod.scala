package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJavaJavaServerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/java/JavaServer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JavaServer {
    
    /* CompleteClass */
    var configFileName: String = js.native
    
    /* CompleteClass */
    override def listServices(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def publishService(serviceUrl: String, serviceJavaClass: Any): Unit = js.native
    
    /* CompleteClass */
    override def unpublishService(serviceUrl: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/java/JavaServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Classes]
  
  type Classes = typingsJapgolly.nginstackEngine.libDatabaseClassesMod.^
  
  trait JavaServer extends StObject {
    
    var configFileName: String
    
    def listServices(): js.Array[Any]
    
    def publishService(serviceUrl: String, serviceJavaClass: Any): Unit
    
    def unpublishService(serviceUrl: String): Unit
  }
  object JavaServer {
    
    inline def apply(
      configFileName: String,
      listServices: CallbackTo[js.Array[Any]],
      publishService: (String, Any) => Callback,
      unpublishService: String => Callback
    ): JavaServer = {
      val __obj = js.Dynamic.literal(configFileName = configFileName.asInstanceOf[js.Any], listServices = listServices.toJsFn, publishService = js.Any.fromFunction2((t0: String, t1: Any) => (publishService(t0, t1)).runNow()), unpublishService = js.Any.fromFunction1((t0: String) => unpublishService(t0).runNow()))
      __obj.asInstanceOf[JavaServer]
    }
    
    extension [Self <: JavaServer](x: Self) {
      
      inline def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
      
      inline def setListServices(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "listServices", value.toJsFn)
      
      inline def setPublishService(value: (String, Any) => Callback): Self = StObject.set(x, "publishService", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setUnpublishService(value: String => Callback): Self = StObject.set(x, "unpublishService", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}

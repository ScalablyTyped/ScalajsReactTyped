package typingsJapgolly.openjscad

import org.scalajs.dom.URL
import org.scalajs.dom.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var Worker: org.scalajs.dom.Worker
  
  var requestFileSystem: Any
  
  var webkitRequestFileSystem: Any
  
  //    URL: URL;
  var webkitURL: URL
}
object Window {
  
  inline def apply(Worker: Worker, requestFileSystem: Any, webkitRequestFileSystem: Any, webkitURL: URL): Window = {
    val __obj = js.Dynamic.literal(Worker = Worker.asInstanceOf[js.Any], requestFileSystem = requestFileSystem.asInstanceOf[js.Any], webkitRequestFileSystem = webkitRequestFileSystem.asInstanceOf[js.Any], webkitURL = webkitURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setRequestFileSystem(value: Any): Self = StObject.set(x, "requestFileSystem", value.asInstanceOf[js.Any])
    
    inline def setWebkitRequestFileSystem(value: Any): Self = StObject.set(x, "webkitRequestFileSystem", value.asInstanceOf[js.Any])
    
    inline def setWebkitURL(value: URL): Self = StObject.set(x, "webkitURL", value.asInstanceOf[js.Any])
    
    inline def setWorker(value: Worker): Self = StObject.set(x, "Worker", value.asInstanceOf[js.Any])
  }
}

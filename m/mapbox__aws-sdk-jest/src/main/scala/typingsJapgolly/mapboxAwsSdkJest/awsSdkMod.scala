package typingsJapgolly.mapboxAwsSdkJest

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsSdkMod {
  
  @JSImport("aws-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearAllMocks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllMocks")().asInstanceOf[Unit]
  
  inline def spyOn(service: String, method: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(service.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def spyOnEachPage(service: String, method: String, pages: js.Array[Record[String, Any]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("spyOnEachPage")(service.asInstanceOf[js.Any], method.asInstanceOf[js.Any], pages.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def spyOnPromise(service: String, method: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("spyOnPromise")(service.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def spyOnPromise(service: String, method: String, response: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("spyOnPromise")(service.asInstanceOf[js.Any], method.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Any]
}

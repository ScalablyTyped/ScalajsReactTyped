package typingsJapgolly.firebaseFunctions

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseFunctions.distSrcPublicTypesMod.Functions
import typingsJapgolly.firebaseFunctions.distSrcPublicTypesMod.HttpsCallable
import typingsJapgolly.firebaseFunctions.distSrcPublicTypesMod.HttpsCallableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("@firebase/functions/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectFunctionsEmulator(functionsInstance: Functions, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFunctionsEmulator")(functionsInstance.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFunctions(): Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")().asInstanceOf[Functions]
  inline def getFunctions(app: Unit, regionOrCustomDomain: String): Functions = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any])).asInstanceOf[Functions]
  inline def getFunctions(app: FirebaseApp): Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any]).asInstanceOf[Functions]
  inline def getFunctions(app: FirebaseApp, regionOrCustomDomain: String): Functions = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any])).asInstanceOf[Functions]
  
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: Functions, name: String): HttpsCallable[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable[RequestData, ResponseData]]
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: Functions, name: String, options: HttpsCallableOptions): HttpsCallable[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable[RequestData, ResponseData]]
  
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: Functions, url: String): HttpsCallable[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable[RequestData, ResponseData]]
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: Functions, url: String, options: HttpsCallableOptions): HttpsCallable[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable[RequestData, ResponseData]]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var functions: Functions
    }
    object NameServiceMapping {
      
      inline def apply(functions: Functions): NameServiceMapping = {
        val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setFunctions(value: Functions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      }
    }
  }
}

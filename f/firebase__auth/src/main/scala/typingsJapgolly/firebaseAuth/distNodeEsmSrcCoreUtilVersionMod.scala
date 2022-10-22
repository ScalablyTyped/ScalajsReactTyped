package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Browser
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Cordova
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.JsCore
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Node
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.ReactNative
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilVersionMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/util/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClientVersion(clientPlatform: ClientPlatform): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_getClientVersion")(clientPlatform.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getClientVersion(clientPlatform: ClientPlatform, frameworks: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getClientVersion")(clientPlatform.asInstanceOf[js.Any], frameworks.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object ClientImplementation {
    
    inline def CORE: JsCore = "JsCore".asInstanceOf[JsCore]
  }
  type ClientImplementation = JsCore
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Browser
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Node
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.ReactNative
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Cordova
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Worker
  */
  trait ClientPlatform extends StObject
  object ClientPlatform {
    
    inline def BROWSER: Browser = "Browser".asInstanceOf[Browser]
    
    inline def CORDOVA: Cordova = "Cordova".asInstanceOf[Cordova]
    
    inline def NODE: Node = "Node".asInstanceOf[Node]
    
    inline def REACT_NATIVE: ReactNative = "ReactNative".asInstanceOf[ReactNative]
    
    inline def WORKER: Worker = "Worker".asInstanceOf[Worker]
  }
}

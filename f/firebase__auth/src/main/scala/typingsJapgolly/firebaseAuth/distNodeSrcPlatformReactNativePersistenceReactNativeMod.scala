package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.Persistence
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.ReactNativeAsyncStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcPlatformReactNativePersistenceReactNativeMod {
  
  @JSImport("@firebase/auth/dist/node/src/platform_react_native/persistence/react_native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReactNativePersistence(storage: ReactNativeAsyncStorage): Persistence = ^.asInstanceOf[js.Dynamic].applyDynamic("getReactNativePersistence")(storage.asInstanceOf[js.Any]).asInstanceOf[Persistence]
}

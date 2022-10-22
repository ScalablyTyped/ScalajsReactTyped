package typingsJapgolly.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcCoreVersionMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/version", "SDK_VERSION")
  @js.native
  def SDK_VERSION: String = js.native
  inline def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])
  
  inline def setSDKVersion(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSDKVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

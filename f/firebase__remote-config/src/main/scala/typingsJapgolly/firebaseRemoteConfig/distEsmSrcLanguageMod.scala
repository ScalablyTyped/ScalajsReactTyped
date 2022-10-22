package typingsJapgolly.firebaseRemoteConfig

import org.scalajs.dom.NavigatorLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcLanguageMod {
  
  @JSImport("@firebase/remote-config/dist/esm/src/language", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUserLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserLanguage")().asInstanceOf[String]
  inline def getUserLanguage(navigatorLanguage: NavigatorLanguage): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserLanguage")(navigatorLanguage.asInstanceOf[js.Any]).asInstanceOf[String]
}

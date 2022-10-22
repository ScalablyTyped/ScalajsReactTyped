package typingsJapgolly.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReactComponentLibUtilsDevMod {
  
  @JSImport("@ionic/react/dist/types/components/react-component-lib/utils/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deprecationWarning(key: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecationWarning")(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isDevMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevMode")().asInstanceOf[Boolean]
}

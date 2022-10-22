package typingsJapgolly.devtools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFinderFinderMod {
  
  @JSImport("devtools/build/finder/finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def darwinGetAppPaths(app: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("darwinGetAppPaths")(app.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def darwinGetInstallations(appPaths: js.Array[String], suffixes: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("darwinGetInstallations")(appPaths.asInstanceOf[js.Any], suffixes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}

package typingsJapgolly.nunjucksDate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nunjucks-date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(env: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(env.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def install(env: Any, filterName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(env.asInstanceOf[js.Any], filterName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultFormat(formatString: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultFormat")(formatString.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

package typingsJapgolly.nbind

import typingsJapgolly.nbind.anon.Reflect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTodtsMod {
  
  @JSImport("nbind/dist/todts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dump(options: Reflect): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(options.asInstanceOf[js.Any]).asInstanceOf[String]
}

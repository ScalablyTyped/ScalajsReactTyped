package typingsJapgolly.typedoc

import typingsJapgolly.minimatch.mod.Minimatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsPathsMod {
  
  @JSImport("typedoc/dist/lib/utils/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMinimatch(patterns: js.Array[String]): js.Array[Minimatch] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMinimatch")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Minimatch]]
  
  inline def matchesAny(patterns: js.Array[Minimatch], path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesAny")(patterns.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nicePath(absPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nicePath")(absPath.asInstanceOf[js.Any]).asInstanceOf[String]
}

package typingsJapgolly.findParentDir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    currentFullPath: String,
    clue: String,
    cb: js.Function2[/* err */ Any, /* dir */ String | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(currentFullPath.asInstanceOf[js.Any], clue.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("find-parent-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(currentFullPath: String, clue: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(currentFullPath.asInstanceOf[js.Any], clue.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}

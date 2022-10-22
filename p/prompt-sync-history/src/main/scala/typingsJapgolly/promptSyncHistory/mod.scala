package typingsJapgolly.promptSyncHistory

import typingsJapgolly.promptSync.mod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): History = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[History]
  inline def apply(file: String): History = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[History]
  inline def apply(file: String, max: Double): History = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[History]
  inline def apply(file: Unit, max: Double): History = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[History]
  
  @JSImport("prompt-sync-history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

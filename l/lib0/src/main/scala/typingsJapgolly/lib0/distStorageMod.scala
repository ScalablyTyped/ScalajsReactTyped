package typingsJapgolly.lib0

import typingsJapgolly.lib0.anon.Key
import typingsJapgolly.lib0.lib0Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStorageMod {
  
  @JSImport("lib0/dist/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onChange(eventHandler: js.Function1[/* arg0 */ Key, Unit]): `true` | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")(eventHandler.asInstanceOf[js.Any]).asInstanceOf[`true` | Unit]
  
  @JSImport("lib0/dist/storage", "varStorage")
  @js.native
  val varStorage: Any = js.native
}

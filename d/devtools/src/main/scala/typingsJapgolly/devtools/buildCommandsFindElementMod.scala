package typingsJapgolly.devtools

import typingsJapgolly.devtools.anon.Using
import typingsJapgolly.wdioProtocols.buildTypesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsFindElementMod {
  
  @JSImport("devtools/build/commands/findElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasUsingValue: Using): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
}

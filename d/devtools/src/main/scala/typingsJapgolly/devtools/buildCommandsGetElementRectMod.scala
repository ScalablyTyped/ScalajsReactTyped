package typingsJapgolly.devtools

import typingsJapgolly.devtools.anon.ElementId
import typingsJapgolly.devtools.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsGetElementRectMod {
  
  @JSImport("devtools/build/commands/getElementRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasElementId: ElementId): js.Promise[Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Height]]
}

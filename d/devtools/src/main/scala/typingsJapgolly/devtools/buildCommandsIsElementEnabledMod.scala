package typingsJapgolly.devtools

import typingsJapgolly.devtools.anon.ElementId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsIsElementEnabledMod {
  
  @JSImport("devtools/build/commands/isElementEnabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasElementId: ElementId): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}

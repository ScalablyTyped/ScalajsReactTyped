package typingsJapgolly.arangodb

import typingsJapgolly.arangodb.Foxx.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foxxMod {
  
  @JSImport("@arangodb/foxx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRouter(): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")().asInstanceOf[Router]
}

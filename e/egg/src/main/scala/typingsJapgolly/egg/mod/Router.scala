package typingsJapgolly.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router
  extends typingsJapgolly.koaRouter.mod.^[Any, Context[Any]] {
  
  /**
    * restful router api
    */
  def resources(name: String, prefix: String, middleware: Any*): Router = js.native
}

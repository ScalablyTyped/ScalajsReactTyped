package typingsJapgolly.eggView

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewManager
  extends StObject
     with Map[String, Any] {
  
  def resolve(name: String): js.Promise[String] = js.native
  
  def use(name: String, viewEngine: ViewBase): Unit = js.native
}

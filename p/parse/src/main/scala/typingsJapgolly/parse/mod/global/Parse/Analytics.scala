package typingsJapgolly.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Analytics {
  
  @JSGlobal("Parse.Analytics")
  @js.native
  val ^ : js.Any = js.native
  
  inline def track(name: String, dimensions: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(name.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}

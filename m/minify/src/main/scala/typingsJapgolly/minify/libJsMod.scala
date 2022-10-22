package typingsJapgolly.minify

import typingsJapgolly.minify.anon.PickOptionsjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsMod {
  
  @JSImport("minify/lib/js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(data: String, userOptions: PickOptionsjs): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}

package typingsJapgolly.requirejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod {
  
  @JSImport("module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[Any]
  
  @JSImport("module", "id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  
  @JSImport("module", "uri")
  @js.native
  def uri: String = js.native
  inline def uri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uri")(x.asInstanceOf[js.Any])
}

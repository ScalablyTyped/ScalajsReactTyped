package typingsJapgolly.undici.mod

import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.undici.typesFetchMod.BodyInit
import typingsJapgolly.undici.typesFetchMod.ResponseInit
import typingsJapgolly.undici.typesFetchMod.ResponseRedirectStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("undici", "Response")
@js.native
open class Response ()
  extends typingsJapgolly.undici.typesFetchMod.Response {
  def this(body: BodyInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}
/* static members */
object Response {
  
  @JSImport("undici", "Response")
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(): typingsJapgolly.undici.typesFetchMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typingsJapgolly.undici.typesFetchMod.Response]
  
  inline def json(data: Any): typingsJapgolly.undici.typesFetchMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.undici.typesFetchMod.Response]
  inline def json(data: Any, init: ResponseInit): typingsJapgolly.undici.typesFetchMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.undici.typesFetchMod.Response]
  
  inline def redirect(url: String, status: ResponseRedirectStatus): typingsJapgolly.undici.typesFetchMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.undici.typesFetchMod.Response]
  inline def redirect(url: URL_, status: ResponseRedirectStatus): typingsJapgolly.undici.typesFetchMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.undici.typesFetchMod.Response]
}

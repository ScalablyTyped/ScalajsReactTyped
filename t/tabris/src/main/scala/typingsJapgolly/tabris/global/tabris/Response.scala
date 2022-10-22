package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.tabris.Blob
import typingsJapgolly.tabris.FormData
import typingsJapgolly.tabris.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Response
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
/* was `typeof Response` */
@JSGlobal("tabris.Response")
@js.native
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
open class Response ()
  extends typingsJapgolly.tabris.mod.Response {
  def this(body: String) = this()
  def this(body: Blob) = this()
  def this(body: FormData) = this()
  def this(body: String, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: Blob, init: ResponseInit) = this()
  def this(body: FormData, init: ResponseInit) = this()
}
/* was `typeof Response` */
object Response {
  
  @JSGlobal("tabris.Response")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def error(): typingsJapgolly.tabris.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typingsJapgolly.tabris.Response]
  
  /* static member */
  inline def redirect(url: String, status: Double): typingsJapgolly.tabris.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tabris.Response]
}

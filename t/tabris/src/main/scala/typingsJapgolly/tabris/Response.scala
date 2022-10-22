package typingsJapgolly.tabris

import typingsJapgolly.tabris.tabrisStrings.basic
import typingsJapgolly.tabris.tabrisStrings.cors
import typingsJapgolly.tabris.tabrisStrings.default
import typingsJapgolly.tabris.tabrisStrings.error
import typingsJapgolly.tabris.tabrisStrings.opaque
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Response
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
@js.native
trait Response extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def blob(): js.Promise[Blob] = js.native
  
  val bodyUsed: Boolean = js.native
  
  val headers: Headers = js.native
  
  def json(): js.Promise[Any] = js.native
  @JSName("json")
  def json_T[T](): js.Promise[T] = js.native
  
  val ok: Boolean = js.native
  
  val status: Double = js.native
  
  val statusText: String = js.native
  
  def text(): js.Promise[String] = js.native
  
  val `type`: basic | cors | default | error | opaque = js.native
  
  val url: String = js.native
}

package typingsJapgolly.next.anon

import org.scalajs.dom.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofResponse extends StObject {
  
  /* standard dom */
  def error(): org.scalajs.dom.Response = js.native
  
  /* standard dom */
  def redirect(url: String): org.scalajs.dom.Response = js.native
  def redirect(url: String, status: Double): org.scalajs.dom.Response = js.native
  def redirect(url: URL): org.scalajs.dom.Response = js.native
  def redirect(url: URL, status: Double): org.scalajs.dom.Response = js.native
}

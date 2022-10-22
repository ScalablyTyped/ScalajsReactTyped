package typingsJapgolly.oauth2orize.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2orize", "OAuth2Error")
@js.native
/**
  * @param code Defaults to *server_error*.
  * @param status Defaults to 500.
  */
open class OAuth2Error ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: Unit, code: String) = this()
  def this(message: String, code: String, uri: String) = this()
  def this(message: String, code: Unit, uri: String) = this()
  def this(message: Unit, code: String, uri: String) = this()
  def this(message: Unit, code: Unit, uri: String) = this()
  def this(message: String, code: String, uri: String, status: Double) = this()
  def this(message: String, code: String, uri: Unit, status: Double) = this()
  def this(message: String, code: Unit, uri: String, status: Double) = this()
  def this(message: String, code: Unit, uri: Unit, status: Double) = this()
  def this(message: Unit, code: String, uri: String, status: Double) = this()
  def this(message: Unit, code: String, uri: Unit, status: Double) = this()
  def this(message: Unit, code: Unit, uri: String, status: Double) = this()
  def this(message: Unit, code: Unit, uri: Unit, status: Double) = this()
  
  var code: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var status: Double = js.native
  
  var uri: js.UndefOr[String] = js.native
}

package typingsJapgolly.oauth2orize.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareRequest extends IncomingMessage {
  
  var oauth2: js.UndefOr[OAuth2] = js.native
  
  var user: js.UndefOr[Any] = js.native
}

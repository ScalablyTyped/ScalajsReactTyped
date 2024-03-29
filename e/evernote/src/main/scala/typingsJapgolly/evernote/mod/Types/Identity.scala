package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.anon.Blocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.Identity")
@js.native
open class Identity () extends StObject {
  def this(args: Blocked) = this()
  
  var blocked: js.UndefOr[Boolean] = js.native
  
  var contact: js.UndefOr[Contact] = js.native
  
  var deactivated: js.UndefOr[Boolean] = js.native
  
  var eventId: js.UndefOr[MessageEventID] = js.native
  
  var id: js.UndefOr[IdentityID] = js.native
  
  var sameBusiness: js.UndefOr[Boolean] = js.native
  
  var userConnected: js.UndefOr[Boolean] = js.native
  
  var userId: js.UndefOr[UserID] = js.native
}

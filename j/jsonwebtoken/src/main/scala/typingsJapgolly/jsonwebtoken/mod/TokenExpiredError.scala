package typingsJapgolly.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.jsonwebtoken.mod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "TokenExpiredError")
@js.native
class TokenExpiredError protected () extends JsonWebTokenError {
  def this(message: String, expiredAt: js.Date) = this()
  var expiredAt: js.Date = js.native
}


package typingsJapgolly.wordpressDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAM extends js.Object {
  var AM: String
  var PM: String
  var am: String
  var pm: String
}

object AnonAM {
  @scala.inline
  def apply(AM: String, PM: String, am: String, pm: String): AnonAM = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAM]
  }
}


package typingsJapgolly.twilioChat.messageMod

import typingsJapgolly.twilioChat.sessionMod.Session
import typingsJapgolly.twilioMcsClient.mod.McsClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageServices extends js.Object {
  var mcsClient: McsClient
  var session: Session
}

object MessageServices {
  @scala.inline
  def apply(mcsClient: McsClient, session: Session): MessageServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageServices]
  }
}


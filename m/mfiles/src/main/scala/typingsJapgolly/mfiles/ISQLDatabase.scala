package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFDBEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISQLDatabase extends js.Object {
  var AdminUser: IImpersonation
  var BasicUser: IImpersonation
  var Engine: MFDBEngine
  var Name: String
  var Server: String
  def Clone(): ISQLDatabase
}

object ISQLDatabase {
  @scala.inline
  def apply(
    AdminUser: IImpersonation,
    BasicUser: IImpersonation,
    Clone: CallbackTo[ISQLDatabase],
    Engine: MFDBEngine,
    Name: String,
    Server: String
  ): ISQLDatabase = {
    val __obj = js.Dynamic.literal(AdminUser = AdminUser.asInstanceOf[js.Any], BasicUser = BasicUser.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[ISQLDatabase]
  }
}


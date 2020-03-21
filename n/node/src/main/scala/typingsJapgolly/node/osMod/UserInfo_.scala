package typingsJapgolly.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo_[T] extends js.Object {
  var gid: Double
  var homedir: T
  var shell: T
  var uid: Double
  var username: T
}

object UserInfo_ {
  @scala.inline
  def apply[T](gid: Double, homedir: T, shell: T, uid: Double, username: T): UserInfo_[T] = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], homedir = homedir.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserInfo_[T]]
  }
}


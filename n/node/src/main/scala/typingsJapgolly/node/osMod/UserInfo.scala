package typingsJapgolly.node.osMod

import typingsJapgolly.node.Anon_BufferEncoding
import typingsJapgolly.node.Anon_EncodingString
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo[T] extends js.Object {
  var gid: Double
  var homedir: T
  var shell: T
  var uid: Double
  var username: T
}

object UserInfo {
  @scala.inline
  def apply[T](gid: Double, homedir: T, shell: T, uid: Double, username: T): UserInfo[T] = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], homedir = homedir.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserInfo[T]]
  }
}

@JSImport("os", "userInfo")
@js.native
object userInfo extends js.Object {
  def apply(): UserInfo[java.lang.String] = js.native
  def apply(options: Anon_BufferEncoding): UserInfo[Buffer] = js.native
  def apply(options: Anon_EncodingString): UserInfo[java.lang.String] = js.native
}


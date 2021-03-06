package typingsJapgolly.nodeZookeeperClient.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def check(path: String): this.type = js.native
  def check(path: String, version: Double): this.type = js.native
  def commit(callback: js.Function2[/* error */ js.Error | Exception, /* results */ js.Any, Unit]): Unit = js.native
  def create(path: String): this.type = js.native
  def create(path: String, dataOrAclsOrmode1: Buffer | js.Array[ACL] | Double): this.type = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer | js.Array[ACL] | Double,
    dataOrAclsOrmode2: Buffer | js.Array[ACL] | Double
  ): this.type = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer | js.Array[ACL] | Double,
    dataOrAclsOrmode2: Buffer | js.Array[ACL] | Double,
    dataOrAclsOrmode3: Buffer | js.Array[ACL] | Double
  ): this.type = js.native
  def remove(path: String): this.type = js.native
  def remove(path: String, version: Double): this.type = js.native
  def setData(path: String): this.type = js.native
  def setData(path: String, data: Null, version: Double): this.type = js.native
  def setData(path: String, data: Buffer): this.type = js.native
  def setData(path: String, data: Buffer, version: Double): this.type = js.native
}


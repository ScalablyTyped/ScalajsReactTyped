package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.clientContextMod.ClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ClientContext")
@js.native
class ClientContext protected ()
  extends typingsJapgolly.sipJs.clientContextMod.ClientContext {
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, method: String, target: String) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, method: String, target: typingsJapgolly.sipJs.coreMod.URI) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, method: String, target: String, options: Options) = this()
  def this(
    ua: typingsJapgolly.sipJs.uAMod.UA,
    method: String,
    target: typingsJapgolly.sipJs.coreMod.URI,
    options: Options
  ) = this()
}

/* static members */
@JSImport("sip.js", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(
    objToConstruct: typingsJapgolly.sipJs.clientContextMod.ClientContext,
    ua: typingsJapgolly.sipJs.uAMod.UA,
    method: String,
    originalTarget: String
  ): Unit = js.native
  def initializer(
    objToConstruct: typingsJapgolly.sipJs.clientContextMod.ClientContext,
    ua: typingsJapgolly.sipJs.uAMod.UA,
    method: String,
    originalTarget: String,
    options: Options
  ): Unit = js.native
  def initializer(
    objToConstruct: typingsJapgolly.sipJs.clientContextMod.ClientContext,
    ua: typingsJapgolly.sipJs.uAMod.UA,
    method: String,
    originalTarget: typingsJapgolly.sipJs.coreMod.URI
  ): Unit = js.native
  def initializer(
    objToConstruct: typingsJapgolly.sipJs.clientContextMod.ClientContext,
    ua: typingsJapgolly.sipJs.uAMod.UA,
    method: String,
    originalTarget: typingsJapgolly.sipJs.coreMod.URI,
    options: Options
  ): Unit = js.native
}


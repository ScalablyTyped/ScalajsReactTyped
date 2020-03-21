package typingsJapgolly.stompit.connectMod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/connect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(optionsOrPath: String): typingsJapgolly.stompit.clientMod.^ = js.native
  def apply(
    optionsOrPath: String,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typingsJapgolly.stompit.clientMod.^, Unit]
  ): typingsJapgolly.stompit.clientMod.^ = js.native
  def apply(optionsOrPath: ConnectOptions): typingsJapgolly.stompit.clientMod.^ = js.native
  def apply(
    optionsOrPath: ConnectOptions,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typingsJapgolly.stompit.clientMod.^, Unit]
  ): typingsJapgolly.stompit.clientMod.^ = js.native
  def apply(port: Double): typingsJapgolly.stompit.clientMod.^ = js.native
  def apply(port: Double, host: String): typingsJapgolly.stompit.clientMod.^ = js.native
  def apply(
    port: Double,
    host: String,
    connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsJapgolly.stompit.clientMod.^, Unit]
  ): typingsJapgolly.stompit.clientMod.^ = js.native
}


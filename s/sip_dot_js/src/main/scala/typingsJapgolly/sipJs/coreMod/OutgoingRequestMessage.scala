package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.bodyMod.Body
import typingsJapgolly.sipJs.outgoingRequestMessageMod.OutgoingRequestMessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "OutgoingRequestMessage")
@js.native
class OutgoingRequestMessage protected ()
  extends typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.uriMod.URI,
    fromURI: typingsJapgolly.sipJs.uriMod.URI,
    toURI: typingsJapgolly.sipJs.uriMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.uriMod.URI,
    fromURI: typingsJapgolly.sipJs.uriMod.URI,
    toURI: typingsJapgolly.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.uriMod.URI,
    fromURI: typingsJapgolly.sipJs.uriMod.URI,
    toURI: typingsJapgolly.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.uriMod.URI,
    fromURI: typingsJapgolly.sipJs.uriMod.URI,
    toURI: typingsJapgolly.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "OutgoingRequestMessage")
@js.native
object OutgoingRequestMessage extends js.Object {
  /** Get a copy of the default options. */
  var getDefaultOptions: js.Any = js.native
  var makeNameAddrHeader: js.Any = js.native
}


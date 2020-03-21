package typingsJapgolly.nodemailer.jsonTransportMod

import typingsJapgolly.nodemailer.sharedMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/json-transport", JSImport.Namespace)
@js.native
class ^ protected () extends JSONTransport {
  def this(options: Options) = this()
  /* CompleteClass */
  override var logger: Logger = js.native
  /* CompleteClass */
  @JSName("mailer")
  override var mailer_JSONTransport: typingsJapgolly.nodemailer.mailerMod.^ = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def send(
    mail: typingsJapgolly.nodemailer.mailMessageMod.^,
    callback: js.Function2[
      /* err */ js.Error | Null, 
      /* info */ typingsJapgolly.nodemailer.mod.SentMessageInfo, 
      Unit
    ]
  ): Unit = js.native
}


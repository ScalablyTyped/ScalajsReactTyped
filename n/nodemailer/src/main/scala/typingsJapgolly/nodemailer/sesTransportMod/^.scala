package typingsJapgolly.nodemailer.sesTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/ses-transport", JSImport.Namespace)
@js.native
class ^ protected () extends SESTransport {
  def this(options: Options) = this()
  /* CompleteClass */
  override var name: String = js.native
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


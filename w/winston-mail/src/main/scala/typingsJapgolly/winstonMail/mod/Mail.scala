package typingsJapgolly.winstonMail.mod

import typingsJapgolly.std.Transport
import typingsJapgolly.winstonMail.AnonLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify winston.TransportInstance * / any */ @JSImport("winston-mail", "Mail")
@js.native
class Mail protected () extends Transport {
  def this(options: MailTransportOptions) = this()
  var from: String = js.native
  var html: Boolean = js.native
  var level: String = js.native
  var name: String = js.native
  var silent: Boolean = js.native
  var subject: String = js.native
  var to: String = js.native
  var unique: Boolean = js.native
  def filter(obj: AnonLevel): Boolean = js.native
  def log(level: js.Any, msg: js.Any, meta: js.Any, callback: js.Any): js.Any = js.native
}


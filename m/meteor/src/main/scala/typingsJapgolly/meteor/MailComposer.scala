package typingsJapgolly.meteor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailComposer extends js.Object {
  def addHeader(name: String, value: String): Unit
  def pipe(stream: js.Any): Unit
  def setMessageOption(from: String, to: String, body: String, html: String): Unit
  def streamMessage(): Unit
}

@JSGlobal("MailComposer")
@js.native
object MailComposer extends TopLevel[MailComposerStatic]


package typingsJapgolly.sendmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFn = js.Function2[/* err */ js.Error, /* domain */ java.lang.String, scala.Unit]
  type SendMailFn = js.Function2[
    /* mail */ typingsJapgolly.sendmail.mod.MailInput, 
    /* callback */ typingsJapgolly.sendmail.mod.CallbackFn, 
    scala.Unit
  ]
}

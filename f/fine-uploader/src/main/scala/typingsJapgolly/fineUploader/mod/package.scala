package typingsJapgolly.fineUploader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ShowConfirmFunction = js.Function1[
    /* message */ java.lang.String, 
    typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  type ShowMessageFunction = js.Function1[
    /* message */ java.lang.String, 
    typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  type ShowPromptFunction = js.Function2[
    /* message */ java.lang.String, 
    /* defaultValue */ java.lang.String, 
    typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
}

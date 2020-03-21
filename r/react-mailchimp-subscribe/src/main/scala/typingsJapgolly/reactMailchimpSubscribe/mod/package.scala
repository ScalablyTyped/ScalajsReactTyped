package typingsJapgolly.reactMailchimpSubscribe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultFormFields = typingsJapgolly.reactMailchimpSubscribe.mod.EmailFormFields
  type FormHooks[FormFields] = typingsJapgolly.reactMailchimpSubscribe.mod.SubscribeArg[FormFields] with (typingsJapgolly.reactMailchimpSubscribe.mod.ResponseArgs | typingsJapgolly.reactMailchimpSubscribe.mod.PendingArgs)
  type MailchimpSubscribe[FormFields] = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactMailchimpSubscribe.mod.Props[FormFields] with js.Object, 
    js.Object
  ]
}

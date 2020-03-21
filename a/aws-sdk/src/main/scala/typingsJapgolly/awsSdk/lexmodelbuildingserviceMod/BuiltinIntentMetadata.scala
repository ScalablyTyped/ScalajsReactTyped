package typingsJapgolly.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinIntentMetadata extends js.Object {
  /**
    * A unique identifier for the built-in intent. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signature: js.UndefOr[BuiltinIntentSignature] = js.native
  /**
    * A list of identifiers for the locales that the intent supports.
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.native
}

object BuiltinIntentMetadata {
  @scala.inline
  def apply(signature: BuiltinIntentSignature = null, supportedLocales: LocaleList = null): BuiltinIntentMetadata = {
    val __obj = js.Dynamic.literal()
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (supportedLocales != null) __obj.updateDynamic("supportedLocales")(supportedLocales.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinIntentMetadata]
  }
}


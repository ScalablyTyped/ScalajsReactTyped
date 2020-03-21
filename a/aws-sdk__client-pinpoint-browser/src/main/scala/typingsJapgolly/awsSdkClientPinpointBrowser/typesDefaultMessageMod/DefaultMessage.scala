package typingsJapgolly.awsSdkClientPinpointBrowser.typesDefaultMessageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMessage extends js.Object {
  /**
    * The message body of the notification, the email body or the text message.
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
  ] = js.undefined
}

object DefaultMessage {
  @scala.inline
  def apply(
    Body: String = null,
    Substitutions: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]) = null
  ): DefaultMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMessage]
  }
}


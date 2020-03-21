package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.links

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialParameters extends js.Object {
  def setDescriptionText(descriptionText: String): DynamicLink
  def setImageUrl(imageUrl: String): DynamicLink
  def setTitle(title: String): DynamicLink
}

object SocialParameters {
  @scala.inline
  def apply(
    setDescriptionText: String => CallbackTo[DynamicLink],
    setImageUrl: String => CallbackTo[DynamicLink],
    setTitle: String => CallbackTo[DynamicLink]
  ): SocialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDescriptionText")(js.Any.fromFunction1((t0: java.lang.String) => setDescriptionText(t0).runNow()))
    __obj.updateDynamic("setImageUrl")(js.Any.fromFunction1((t0: java.lang.String) => setImageUrl(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[SocialParameters]
  }
}


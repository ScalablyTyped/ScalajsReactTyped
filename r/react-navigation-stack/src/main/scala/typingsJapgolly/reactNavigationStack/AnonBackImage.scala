package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNavigationStack.backButtonWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackImage extends js.Object {
  var backImage: js.Function1[/* hasTintColor */ Props, Element]
  var pressColorAndroid: String
  var tintColor: String
  var truncatedTitle: String
}

object AnonBackImage {
  @scala.inline
  def apply(
    backImage: /* hasTintColor */ Props => CallbackTo[Element],
    pressColorAndroid: String,
    tintColor: String,
    truncatedTitle: String
  ): AnonBackImage = {
    val __obj = js.Dynamic.literal(pressColorAndroid = pressColorAndroid.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], truncatedTitle = truncatedTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("backImage")(js.Any.fromFunction1((t0: /* hasTintColor */ typingsJapgolly.reactNavigationStack.backButtonWebMod.Props) => backImage(t0).runNow()))
    __obj.asInstanceOf[AnonBackImage]
  }
}


package typingsJapgolly.reactDashNavigationDashStack

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderBackButtonWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackImage extends js.Object {
  var backImage: js.Function1[/* hasTintColor */ Props, Element]
  var pressColorAndroid: String
  var tintColor: String
  var truncatedTitle: String
}

object Anon_BackImage {
  @scala.inline
  def apply(
    backImage: /* hasTintColor */ Props => CallbackTo[Element],
    pressColorAndroid: String,
    tintColor: String,
    truncatedTitle: String
  ): Anon_BackImage = {
    val __obj = js.Dynamic.literal(pressColorAndroid = pressColorAndroid.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], truncatedTitle = truncatedTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("backImage")(js.Any.fromFunction1((t0: /* hasTintColor */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderBackButtonWebMod.Props) => backImage(t0).runNow()))
    __obj.asInstanceOf[Anon_BackImage]
  }
}


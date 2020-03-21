package typingsJapgolly.materialUiStyles.getStylesCreatorGetStylesCreatorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyleRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesCreator[Theme, Props /* <: js.Object */, ClassKey /* <: String */] extends js.Object {
  var themingEnabled: Boolean
  def create(theme: Theme, name: String): StyleRules[Props, ClassKey]
}

object StylesCreator {
  @scala.inline
  def apply[Theme, Props /* <: js.Object */, ClassKey /* <: String */](create: (Theme, String) => CallbackTo[StyleRules[Props, ClassKey]], themingEnabled: Boolean): StylesCreator[Theme, Props, ClassKey] = {
    val __obj = js.Dynamic.literal(themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: Theme, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.asInstanceOf[StylesCreator[Theme, Props, ClassKey]]
  }
}


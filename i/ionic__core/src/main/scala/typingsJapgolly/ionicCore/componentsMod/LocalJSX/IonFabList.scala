package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import typingsJapgolly.ionicCore.ionicCoreStrings.bottom
import typingsJapgolly.ionicCore.ionicCoreStrings.end
import typingsJapgolly.ionicCore.ionicCoreStrings.start
import typingsJapgolly.ionicCore.ionicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFabList extends js.Object {
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  var activated: js.UndefOr[Boolean] = js.undefined
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: js.UndefOr[start | end | top | bottom] = js.undefined
}

object IonFabList {
  @scala.inline
  def apply(activated: js.UndefOr[Boolean] = js.undefined, side: start | end | top | bottom = null): IonFabList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activated)) __obj.updateDynamic("activated")(activated.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonFabList]
  }
}


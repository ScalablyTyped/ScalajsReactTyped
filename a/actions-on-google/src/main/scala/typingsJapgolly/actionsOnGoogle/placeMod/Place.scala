package typingsJapgolly.actionsOnGoogle.placeMod

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPLACE
import typingsJapgolly.actionsOnGoogle.helperHelperMod.Helper
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2PlaceValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/place", "Place")
@js.native
class Place protected () extends Helper[actionsDotintentDotPLACE, GoogleActionsV2PlaceValueSpec] {
  /**
    * @param options Place options
    * @public
    */
  def this(options: PlaceOptions) = this()
}


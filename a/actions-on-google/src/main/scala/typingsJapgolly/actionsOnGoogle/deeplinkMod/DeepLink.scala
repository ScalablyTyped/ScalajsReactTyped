package typingsJapgolly.actionsOnGoogle.deeplinkMod

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK
import typingsJapgolly.actionsOnGoogle.helperHelperMod.Helper
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2LinkValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/deeplink", "DeepLink")
@js.native
class DeepLink protected () extends Helper[actionsDotintentDotLINK, GoogleActionsV2LinkValueSpec] {
  /**
    * @param options DeepLink options
    * @deprecated
    * @public
    */
  def this(options: DeepLinkOptions) = this()
}


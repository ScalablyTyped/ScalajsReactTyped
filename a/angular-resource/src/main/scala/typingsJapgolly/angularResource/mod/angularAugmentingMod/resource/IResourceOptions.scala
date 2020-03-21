package typingsJapgolly.angularResource.mod.angularAugmentingMod.resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently supported options for the $resource factory options argument.
  */
trait IResourceOptions extends js.Object {
  /**
    * If true, the request made by a "non-instance" call will be cancelled (if not already completed) by calling
    * $cancelRequest() on the call's return value. This can be overwritten per action. (Defaults to false.)
    */
  var cancellable: js.UndefOr[Boolean] = js.undefined
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[Boolean] = js.undefined
}

object IResourceOptions {
  @scala.inline
  def apply(
    cancellable: js.UndefOr[Boolean] = js.undefined,
    stripTrailingSlashes: js.UndefOr[Boolean] = js.undefined
  ): IResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancellable)) __obj.updateDynamic("cancellable")(cancellable.asInstanceOf[js.Any])
    if (!js.isUndefined(stripTrailingSlashes)) __obj.updateDynamic("stripTrailingSlashes")(stripTrailingSlashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceOptions]
  }
}


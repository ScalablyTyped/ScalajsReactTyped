package typingsJapgolly.officeUiFabricReact.imageBaseMod

import typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageState extends js.Object {
  var loadState: js.UndefOr[ImageLoadState] = js.undefined
}

object IImageState {
  @scala.inline
  def apply(loadState: ImageLoadState = null): IImageState = {
    val __obj = js.Dynamic.literal()
    if (loadState != null) __obj.updateDynamic("loadState")(loadState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageState]
  }
}


package typingsJapgolly.photoswipe.photoswipeUiDefaultMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.photoswipe.mod.UI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
  */
trait PhotoSwipeUIDefault extends UI[Options] {
  /**
    * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
    */
  def update(): Unit
}

object PhotoSwipeUIDefault {
  @scala.inline
  def apply(init: Callback, update: Callback): PhotoSwipeUIDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[PhotoSwipeUIDefault]
  }
}


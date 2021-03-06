package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MutationObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/watch-options", JSImport.Namespace)
@js.native
object watchOptionsMod extends js.Object {
  def findCheckedOption(el: js.Any, tagName: String): js.UndefOr[HTMLElement] = js.native
  def watchForOptions[T /* <: HTMLElement */](containerEl: HTMLElement, tagName: String, onChange: js.Function1[/* el */ js.UndefOr[T], Unit]): MutationObserver = js.native
}


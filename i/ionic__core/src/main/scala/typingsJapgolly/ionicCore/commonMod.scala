package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.HTMLInputElement
import typingsJapgolly.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  def isFocused(input: HTMLInputElement): Boolean = js.native
  def isFocused(input: HTMLTextAreaElement): Boolean = js.native
  def relocateInput(componentEl: HTMLElement, inputEl: HTMLInputElement, shouldRelocate: Boolean): Unit = js.native
  def relocateInput(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    shouldRelocate: Boolean,
    inputRelativeY: Double
  ): Unit = js.native
  def relocateInput(componentEl: HTMLElement, inputEl: HTMLTextAreaElement, shouldRelocate: Boolean): Unit = js.native
  def relocateInput(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    shouldRelocate: Boolean,
    inputRelativeY: Double
  ): Unit = js.native
}


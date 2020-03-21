package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonContentElement
import typingsJapgolly.std.HTMLInputElement
import typingsJapgolly.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/input-shims/hacks/hide-caret", JSImport.Namespace)
@js.native
object hideCaretMod extends js.Object {
  def enableHideCaretOnScroll(componentEl: HTMLElement): js.Function0[Unit] = js.native
  def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: js.UndefOr[scala.Nothing], scrollEl: HTMLIonContentElement): js.Function0[Unit] = js.native
  def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: HTMLInputElement): js.Function0[Unit] = js.native
  def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: HTMLInputElement, scrollEl: HTMLIonContentElement): js.Function0[Unit] = js.native
  def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: HTMLTextAreaElement): js.Function0[Unit] = js.native
  def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: HTMLTextAreaElement, scrollEl: HTMLIonContentElement): js.Function0[Unit] = js.native
}


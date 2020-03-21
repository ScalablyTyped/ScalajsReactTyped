package typingsJapgolly.domHelpers.animateMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.domHelpers.addEventListenerMod.EventHandler
import typingsJapgolly.domHelpers.domHelpersStrings.transitionend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/animate", JSImport.Default)
@js.native
object default_transitionend extends js.Object {
  def apply(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
  def apply(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    easing: String,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
}


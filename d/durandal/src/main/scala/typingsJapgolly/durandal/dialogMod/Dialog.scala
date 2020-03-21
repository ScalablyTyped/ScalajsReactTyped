package typingsJapgolly.durandal.dialogMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.durandal.DurandalActivator
import typingsJapgolly.durandal.DurandalPromise
import typingsJapgolly.durandal.compositionMod.CompositionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  @JSName("activator")
  var activator_Original: DurandalActivator[_] = js.native
  var context: DialogContext = js.native
  var host: HTMLElement = js.native
  var owner: js.Any = js.native
  var settings: CompositionContext = js.native
  def activator(): js.Any = js.native
  def activator(value: js.Any): Unit = js.native
  def close(): DurandalPromise[_] = js.native
}


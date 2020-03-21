package typingsJapgolly.durandal.compositionMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.durandal.DurandalPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/composition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var current: CompositionTransation = js.native
  var defaultStrategy: js.Function1[/* context */ CompositionContext, DurandalPromise[HTMLElement]] = js.native
  var defaultTransitionName: String = js.native
}


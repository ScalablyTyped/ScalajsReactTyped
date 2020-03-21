package typingsJapgolly.tanemSvgInjector

import typingsJapgolly.std.Element
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.tanemSvgInjector.typesMod.BeforeEach
import typingsJapgolly.tanemSvgInjector.typesMod.Errback
import typingsJapgolly.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/inject-element", JSImport.Namespace)
@js.native
object injectElementMod extends js.Object {
  def default(
    el: Element,
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = js.native
  def default(
    el: HTMLElement,
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = js.native
}


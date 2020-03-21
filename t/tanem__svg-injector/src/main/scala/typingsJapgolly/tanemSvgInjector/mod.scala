package typingsJapgolly.tanemSvgInjector

import typingsJapgolly.tanemSvgInjector.svgInjectorMod.Elements
import typingsJapgolly.tanemSvgInjector.svgInjectorMod.OptionalArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def SVGInjector(elements: Elements): Unit = js.native
  def SVGInjector(elements: Elements, hasAfterAllAfterEachBeforeEachEvalScriptsRenumerateIRIElements: OptionalArgs): Unit = js.native
  @js.native
  object EvalScripts extends js.Object {
    /* "always" */ val Always: typingsJapgolly.tanemSvgInjector.typesMod.EvalScripts.Always with String = js.native
    /* "never" */ val Never: typingsJapgolly.tanemSvgInjector.typesMod.EvalScripts.Never with String = js.native
    /* "once" */ val Once: typingsJapgolly.tanemSvgInjector.typesMod.EvalScripts.Once with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tanemSvgInjector.typesMod.EvalScripts with String] = js.native
  }
  
}


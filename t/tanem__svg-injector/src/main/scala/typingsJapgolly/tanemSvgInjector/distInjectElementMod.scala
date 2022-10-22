package typingsJapgolly.tanemSvgInjector

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.NonNullable
import typingsJapgolly.tanemSvgInjector.distTypesMod.BeforeEach
import typingsJapgolly.tanemSvgInjector.distTypesMod.Errback
import typingsJapgolly.tanemSvgInjector.distTypesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInjectElementMod {
  
  @JSImport("@tanem/svg-injector/dist/inject-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    el: NonNullable[ElementType],
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    cacheRequests: Boolean,
    httpRequestWithCredentials: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], evalScripts.asInstanceOf[js.Any], renumerateIRIElements.asInstanceOf[js.Any], cacheRequests.asInstanceOf[js.Any], httpRequestWithCredentials.asInstanceOf[js.Any], beforeEach.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ElementType = Element | HTMLElement | Null
}

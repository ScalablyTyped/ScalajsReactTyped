package typingsJapgolly.detox

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.detox.mod.global.Detox.CircusTestEventListenerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnersJestSpecReporterMod extends Shortcut {
  
  @JSImport("detox/runners/jest/specReporter", JSImport.Namespace)
  @js.native
  val ^ : SpecReporter = js.native
  
  trait SpecReporter
    extends StObject
       with CircusTestEventListenerBase {
    
    def specDone(): Unit
    
    def specStarted(): Unit
    
    def suiteDone(): Unit
    
    // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
    def suiteStarted(): Unit
  }
  object SpecReporter {
    
    inline def apply(
      handleTestEvent: (Any, Any) => js.Promise[Unit],
      specDone: Callback,
      specStarted: Callback,
      suiteDone: Callback,
      suiteStarted: Callback
    ): SpecReporter = {
      val __obj = js.Dynamic.literal(handleTestEvent = js.Any.fromFunction2(handleTestEvent), specDone = specDone.toJsFn, specStarted = specStarted.toJsFn, suiteDone = suiteDone.toJsFn, suiteStarted = suiteStarted.toJsFn)
      __obj.asInstanceOf[SpecReporter]
    }
    
    extension [Self <: SpecReporter](x: Self) {
      
      inline def setSpecDone(value: Callback): Self = StObject.set(x, "specDone", value.toJsFn)
      
      inline def setSpecStarted(value: Callback): Self = StObject.set(x, "specStarted", value.toJsFn)
      
      inline def setSuiteDone(value: Callback): Self = StObject.set(x, "suiteDone", value.toJsFn)
      
      inline def setSuiteStarted(value: Callback): Self = StObject.set(x, "suiteStarted", value.toJsFn)
    }
  }
  
  type _To = SpecReporter
  
  /* This means you don't have to write `^`, but can instead just say `runnersJestSpecReporterMod.foo` */
  override def _to: SpecReporter = ^
}

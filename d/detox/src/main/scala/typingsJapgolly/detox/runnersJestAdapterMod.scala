package typingsJapgolly.detox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.detox.mod.global.Detox.CircusTestEventListenerBase
import typingsJapgolly.detox.mod.global.Detox.DetoxExportWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnersJestAdapterMod extends Shortcut {
  
  @JSImport("detox/runners/jest/adapter", JSImport.Namespace)
  @js.native
  val ^ : DetoxJestAdapter = js.native
  
  trait DetoxJestAdapter
    extends StObject
       with CircusTestEventListenerBase {
    
    def afterAll(): js.Promise[Unit]
    
    def beforeEach(): js.Promise[Unit]
    
    var detox: DetoxExportWrapper
    
    // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
    def specDone(): Unit
    
    def specStarted(): Unit
  }
  object DetoxJestAdapter {
    
    inline def apply(
      afterAll: CallbackTo[js.Promise[Unit]],
      beforeEach: CallbackTo[js.Promise[Unit]],
      detox: DetoxExportWrapper,
      handleTestEvent: (Any, Any) => js.Promise[Unit],
      specDone: Callback,
      specStarted: Callback
    ): DetoxJestAdapter = {
      val __obj = js.Dynamic.literal(afterAll = afterAll.toJsFn, beforeEach = beforeEach.toJsFn, detox = detox.asInstanceOf[js.Any], handleTestEvent = js.Any.fromFunction2(handleTestEvent), specDone = specDone.toJsFn, specStarted = specStarted.toJsFn)
      __obj.asInstanceOf[DetoxJestAdapter]
    }
    
    extension [Self <: DetoxJestAdapter](x: Self) {
      
      inline def setAfterAll(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "afterAll", value.toJsFn)
      
      inline def setBeforeEach(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "beforeEach", value.toJsFn)
      
      inline def setDetox(value: DetoxExportWrapper): Self = StObject.set(x, "detox", value.asInstanceOf[js.Any])
      
      inline def setSpecDone(value: Callback): Self = StObject.set(x, "specDone", value.toJsFn)
      
      inline def setSpecStarted(value: Callback): Self = StObject.set(x, "specStarted", value.toJsFn)
    }
  }
  
  type _To = DetoxJestAdapter
  
  /* This means you don't have to write `^`, but can instead just say `runnersJestAdapterMod.foo` */
  override def _to: DetoxJestAdapter = ^
}

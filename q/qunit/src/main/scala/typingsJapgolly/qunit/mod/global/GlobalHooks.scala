package typingsJapgolly.qunit.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalHooks extends StObject {
  
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
  
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
}
object GlobalHooks {
  
  inline def apply(
    afterEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback,
    beforeEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback
  ): GlobalHooks = {
    val __obj = js.Dynamic.literal(afterEach = js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => afterEach(t0).runNow()), beforeEach = js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => beforeEach(t0).runNow()))
    __obj.asInstanceOf[GlobalHooks]
  }
  
  extension [Self <: GlobalHooks](x: Self) {
    
    inline def setAfterEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback): Self = StObject.set(x, "afterEach", js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => value(t0).runNow()))
    
    inline def setBeforeEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => value(t0).runNow()))
  }
}

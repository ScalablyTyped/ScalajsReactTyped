package typingsJapgolly.qunit.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedHooks extends StObject {
  
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  def after(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
  
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
  
  /**
    * Runs before the first test.
    */
  def before(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
  
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
}
object NestedHooks {
  
  inline def apply(
    after: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback,
    afterEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback,
    before: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback,
    beforeEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback
  ): NestedHooks = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => after(t0).runNow()), afterEach = js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => afterEach(t0).runNow()), before = js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => before(t0).runNow()), beforeEach = js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => beforeEach(t0).runNow()))
    __obj.asInstanceOf[NestedHooks]
  }
  
  extension [Self <: NestedHooks](x: Self) {
    
    inline def setAfter(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback): Self = StObject.set(x, "after", js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => value(t0).runNow()))
    
    inline def setAfterEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback): Self = StObject.set(x, "afterEach", js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => value(t0).runNow()))
    
    inline def setBefore(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback): Self = StObject.set(x, "before", js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => value(t0).runNow()))
    
    inline def setBeforeEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Callback): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1((t0: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]) => value(t0).runNow()))
  }
}

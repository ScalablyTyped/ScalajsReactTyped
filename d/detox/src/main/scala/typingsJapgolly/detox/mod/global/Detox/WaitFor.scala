package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitFor extends StObject {
  
  /**
    * Performs the action repeatedly on the element until an expectation is met
    * @example await waitFor(element(by.text('Text5'))).toBeVisible().whileElement(by.id('ScrollView630')).scroll(50, 'down');
    */
  def whileElement(by: NativeMatcher): NativeElement & WaitFor
  
  /**
    * Waits for the condition to be met until the specified time (millis) have elapsed.
    * @example await waitFor(element(by.id('UniqueId336'))).toExist().withTimeout(2000);
    */
  def withTimeout(millis: Double): js.Promise[Unit]
}
object WaitFor {
  
  inline def apply(whileElement: NativeMatcher => NativeElement & WaitFor, withTimeout: Double => js.Promise[Unit]): WaitFor = {
    val __obj = js.Dynamic.literal(whileElement = js.Any.fromFunction1(whileElement), withTimeout = js.Any.fromFunction1(withTimeout))
    __obj.asInstanceOf[WaitFor]
  }
  
  extension [Self <: WaitFor](x: Self) {
    
    inline def setWhileElement(value: NativeMatcher => NativeElement & WaitFor): Self = StObject.set(x, "whileElement", js.Any.fromFunction1(value))
    
    inline def setWithTimeout(value: Double => js.Promise[Unit]): Self = StObject.set(x, "withTimeout", js.Any.fromFunction1(value))
  }
}

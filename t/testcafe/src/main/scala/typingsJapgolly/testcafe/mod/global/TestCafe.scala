package typingsJapgolly.testcafe.mod.global

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCafe extends StObject {
  
  /**
    * Stops the TestCafe server. Forcibly closes all connections and pending test runs immediately.
    */
  def close(): js.Promise[Unit]
  
  /**
    * Creates a remote browser connection.
    */
  def createBrowserConnection(): js.Promise[BrowserConnection]
  
  /**
    * Creates the live mode test runner that is used to configure and launch test tasks.
    */
  def createLiveModeRunner(): Runner
  
  /**
    * Creates the test runner that is used to configure and launch test tasks.
    */
  def createRunner(): Runner
}
object TestCafe {
  
  inline def apply(
    close: CallbackTo[js.Promise[Unit]],
    createBrowserConnection: CallbackTo[js.Promise[BrowserConnection]],
    createLiveModeRunner: CallbackTo[Runner],
    createRunner: CallbackTo[Runner]
  ): TestCafe = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, createBrowserConnection = createBrowserConnection.toJsFn, createLiveModeRunner = createLiveModeRunner.toJsFn, createRunner = createRunner.toJsFn)
    __obj.asInstanceOf[TestCafe]
  }
  
  extension [Self <: TestCafe](x: Self) {
    
    inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCreateBrowserConnection(value: CallbackTo[js.Promise[BrowserConnection]]): Self = StObject.set(x, "createBrowserConnection", value.toJsFn)
    
    inline def setCreateLiveModeRunner(value: CallbackTo[Runner]): Self = StObject.set(x, "createLiveModeRunner", value.toJsFn)
    
    inline def setCreateRunner(value: CallbackTo[Runner]): Self = StObject.set(x, "createRunner", value.toJsFn)
  }
}

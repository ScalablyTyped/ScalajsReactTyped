package typingsJapgolly.cypress.typesSinonMod

import typingsJapgolly.cypress.anon.PartialSinonSandboxConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.cypress.typesSinonMod.SinonApi because var conflicts: clock. Inlined expectation, FakeXMLHttpRequest, fakeServer, fakeServerWithClock, createSandbox, createSandbox, defaultConfig, addBehavior, setFormatter */ @js.native
trait SinonStatic
  extends StObject
     with SinonSandbox {
  
  var FakeXMLHttpRequest: SinonFakeXMLHttpRequestStatic = js.native
  
  /**
    * Add a custom behavior.
    * The name will be available as a function on stubs, and the chaining mechanism
    * will be set up for you (e.g. no need to return anything from your function,
    * its return value will be ignored). The fn will be passed the fake instance
    * as its first argument, and then the user's arguments.
    */
  def addBehavior(name: String, fn: js.Function2[/* fake */ SinonStub[js.Array[Any], Any], /* repeated */ Any, Unit]): Unit = js.native
  
  /**
    * Creates a new sandbox object with spies, stubs, and mocks.
    * @param config
    */
  def createSandbox(): SinonSandbox = js.native
  def createSandbox(config: PartialSinonSandboxConfig): SinonSandbox = js.native
  
  var defaultConfig: PartialSinonSandboxConfig = js.native
  
  var expectation: SinonExpectationStatic = js.native
  
  var fakeServer: SinonFakeServerStatic = js.native
  
  var fakeServerWithClock: SinonFakeServerStatic = js.native
  
  /**
    * Replace the default formatter used when formatting ECMAScript object
    * An example converts a basic object, such as  {id: 42 }, to a string
    * on a format of your choosing, such as "{ id: 42 }"
    */
  def setFormatter(customFormatter: js.Function1[/* repeated */ Any, String]): Unit = js.native
}

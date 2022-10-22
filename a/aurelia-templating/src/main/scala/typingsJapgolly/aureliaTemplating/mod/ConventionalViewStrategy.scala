package typingsJapgolly.aureliaTemplating.mod

import typingsJapgolly.aureliaMetadata.mod.Origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ConventionalViewStrategy")
@js.native
open class ConventionalViewStrategy protected () extends StObject {
  /**
  	* Creates an instance of ConventionalViewStrategy.
  	* @param viewLocator The view locator service for conventionally locating the view.
  	* @param origin The origin of the view model to conventionally load the view for.
  	*/
  def this(viewLocator: ViewLocator, origin: Origin) = this()
  
  /**
  	* Loads a view factory.
  	* @param viewEngine The view engine to use during the load process.
  	* @param compileInstruction Additional instructions to use during compilation of the view.
  	* @param loadContext The loading context used for loading all resources and dependencies.
  	* @param target A class from which to extract metadata of additional resources to load.
  	* @return A promise for the view factory that is produced by this strategy.
  	*/
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction): js.Promise[ViewFactory] = js.native
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction, loadContext: Unit, target: Any): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: Any
  ): js.Promise[ViewFactory] = js.native
  
  var moduleId: String = js.native
  
  var viewUrl: Any = js.native
}

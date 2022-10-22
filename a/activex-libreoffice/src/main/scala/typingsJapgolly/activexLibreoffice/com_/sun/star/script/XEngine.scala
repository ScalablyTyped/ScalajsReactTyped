package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to control a scripting engine.
  * @deprecated Deprecated
  */
trait XEngine
  extends StObject
     with XInterface {
  
  /** gets an interface to the object which is the scripting root. */
  var Root: XInterface
  
  /**
    * adds an engine listener.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addEngineListener(Listener: XEngineListener): Unit
  
  /**
    * terminates the execution of the running script.
    *
    * The waiting queue is cleared too.
    */
  def cancel(): Unit
  
  /** compiles a script module in the scope of the root object. */
  def compile(ModuleName: String, Script: String, CreateDebugInfo: Boolean): Boolean
  
  /** gets an interface to the object which is the scripting root. */
  def getRoot(): XInterface
  
  /**
    * removes an engine listener.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeEngineListener(Listener: XEngineListener): Unit
  
  /**
    * runs a script specified by a string.
    *
    * The arguments given in **aArgs** can be ignored by the engine. The Script is executed synchronously.
    */
  def run(aScript: String, xThis: XInterface, aArgs: SeqEquiv[Any]): Any
  
  /**
    * runs the script specified by a string and makes callbacks.
    *
    * The arguments given in **aArgs** can be ignored by the engine. The script is executed asynchronously.
    */
  def runAsync(acript: String, xThis: XInterface, args: SeqEquiv[Any], xCallback: XEngineListener): Unit
  
  /** sets an access object to get external functions. */
  def setLibraryAccess(Library: XLibraryAccess): Unit
  
  /**
    * sets an interface to an object as a scripting root.
    *
    * If the root object implements the {@link XInvocation} interface, then the engine uses this interface to set/get properties and call methods.
    */
  def setRoot(xRoot: XInterface): Unit
}
object XEngine {
  
  inline def apply(
    Root: XInterface,
    acquire: Callback,
    addEngineListener: XEngineListener => Callback,
    cancel: Callback,
    compile: (String, String, Boolean) => Boolean,
    getRoot: CallbackTo[XInterface],
    queryInterface: `type` => Any,
    release: Callback,
    removeEngineListener: XEngineListener => Callback,
    run: (String, XInterface, SeqEquiv[Any]) => Any,
    runAsync: (String, XInterface, SeqEquiv[Any], XEngineListener) => Callback,
    setLibraryAccess: XLibraryAccess => Callback,
    setRoot: XInterface => Callback
  ): XEngine = {
    val __obj = js.Dynamic.literal(Root = Root.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEngineListener = js.Any.fromFunction1((t0: XEngineListener) => addEngineListener(t0).runNow()), cancel = cancel.toJsFn, compile = js.Any.fromFunction3(compile), getRoot = getRoot.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEngineListener = js.Any.fromFunction1((t0: XEngineListener) => removeEngineListener(t0).runNow()), run = js.Any.fromFunction3(run), runAsync = js.Any.fromFunction4((t0: String, t1: XInterface, t2: SeqEquiv[Any], t3: XEngineListener) => (runAsync(t0, t1, t2, t3)).runNow()), setLibraryAccess = js.Any.fromFunction1((t0: XLibraryAccess) => setLibraryAccess(t0).runNow()), setRoot = js.Any.fromFunction1((t0: XInterface) => setRoot(t0).runNow()))
    __obj.asInstanceOf[XEngine]
  }
  
  extension [Self <: XEngine](x: Self) {
    
    inline def setAddEngineListener(value: XEngineListener => Callback): Self = StObject.set(x, "addEngineListener", js.Any.fromFunction1((t0: XEngineListener) => value(t0).runNow()))
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setCompile(value: (String, String, Boolean) => Boolean): Self = StObject.set(x, "compile", js.Any.fromFunction3(value))
    
    inline def setGetRoot(value: CallbackTo[XInterface]): Self = StObject.set(x, "getRoot", value.toJsFn)
    
    inline def setRemoveEngineListener(value: XEngineListener => Callback): Self = StObject.set(x, "removeEngineListener", js.Any.fromFunction1((t0: XEngineListener) => value(t0).runNow()))
    
    inline def setRoot(value: XInterface): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRun(value: (String, XInterface, SeqEquiv[Any]) => Any): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    
    inline def setRunAsync(value: (String, XInterface, SeqEquiv[Any], XEngineListener) => Callback): Self = StObject.set(x, "runAsync", js.Any.fromFunction4((t0: String, t1: XInterface, t2: SeqEquiv[Any], t3: XEngineListener) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetLibraryAccess(value: XLibraryAccess => Callback): Self = StObject.set(x, "setLibraryAccess", js.Any.fromFunction1((t0: XLibraryAccess) => value(t0).runNow()))
    
    inline def setSetRoot(value: XInterface => Callback): Self = StObject.set(x, "setRoot", js.Any.fromFunction1((t0: XInterface) => value(t0).runNow()))
  }
}

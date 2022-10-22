package typingsJapgolly.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputJax extends StObject {
  
  /*This is the method that the MathJax.Hub calls when it needs the input jax to process the given math <script>.
    * Its default action is to do the following:
    *
    * Start loading any element jax specified in the elementJax array;
    * Start loading the jax’s jax.js file;
    * Start loading the required output jax (so it is ready when needed); and
    * Redefine itself to simply return the callback for the load operation (so that further calls to it will cause
    * the processing to wait for the callback).
    * Once the jax.js file has loaded, this method is replaced by the jax’s Translate() method (see below), so that
    * subsequent calls to Process() will perform the appropriate translation.
    */
  def Process(script: Any, state: Any): Any
  
  /*This registers the MIME-type associated with this input jax so that MathJax knows to call this input jax when
    * it sees a <script> of that type. An input jax can register more than one type, but it will be responsible for
    * distinguishing elements of the various types from one another.
    */
  def Register(mimetype: String): Unit
  
  /*This is the main routine called by MathJax when a <script> of the appropriate type is found. The default
    * Translate() method throws an error indicating that Translate() hasn’t been defined, so when the jax.js file
    * loads, it should override the default Translate() with its own version that does the actual translation.
    *
    * The translation process should include the creation of an Element Jax that stores the data needed for this
    * element.
    */
  def Translate(script: Any, state: Any): ElementJax
  
  /*The directory where the jax files are stored (e.g., "[MathJax]/jax/input/TeX").*/
  var directory: String
  
  /*The name of the ElementJax class that this input jax will produce (typically mml, as that is the only
    * ElementJax at the moment).
    */
  var elementJax: String
  
  /*The name of the jax.*/
  var id: String
  
  /*This implements the element jax’s needsUpdate() method, and returns true if the jax needs to be rerendered
    * (i.e., the text has changed), and false otherwise.
    */
  def needsUpdate(element: Any): Boolean
  
  /*The version number of the jax.*/
  var version: String
}
object InputJax {
  
  inline def apply(
    Process: (Any, Any) => Any,
    Register: String => japgolly.scalajs.react.Callback,
    Translate: (Any, Any) => ElementJax,
    directory: String,
    elementJax: String,
    id: String,
    needsUpdate: Any => Boolean,
    version: String
  ): InputJax = {
    val __obj = js.Dynamic.literal(Process = js.Any.fromFunction2(Process), Register = js.Any.fromFunction1((t0: String) => Register(t0).runNow()), Translate = js.Any.fromFunction2(Translate), directory = directory.asInstanceOf[js.Any], elementJax = elementJax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], needsUpdate = js.Any.fromFunction1(needsUpdate), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputJax]
  }
  
  extension [Self <: InputJax](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setElementJax(value: String): Self = StObject.set(x, "elementJax", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNeedsUpdate(value: Any => Boolean): Self = StObject.set(x, "needsUpdate", js.Any.fromFunction1(value))
    
    inline def setProcess(value: (Any, Any) => Any): Self = StObject.set(x, "Process", js.Any.fromFunction2(value))
    
    inline def setRegister(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "Register", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTranslate(value: (Any, Any) => ElementJax): Self = StObject.set(x, "Translate", js.Any.fromFunction2(value))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

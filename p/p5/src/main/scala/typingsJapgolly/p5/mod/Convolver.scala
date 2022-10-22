package typingsJapgolly.p5.mod

import org.scalajs.dom.ConvolverNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Convolver
  extends StObject
     with Effect {
  
  /**
    *   Load and assign a new Impulse Response to the
    *   p5.Convolver. The impulse is added to the
    *   .impulses array. Previous impulses can be accessed
    *   with the .toggleImpulse(id) method.
    *   @param path path to a sound file
    *   @param callback function (optional)
    *   @param errorCallback function (optional)
    */
  def addImpulse(
    path: String,
    callback: js.Function1[/* repeated */ Any, Any],
    errorCallback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  /**
    *   Internally, the p5.Convolver uses the a  Web Audio
    *   Convolver Node.
    */
  var convolverNode: ConvolverNode = js.native
  
  /**
    *   If you load multiple impulse files using the
    *   .addImpulse method, they will be stored as Objects
    *   in this Array. Toggle between them with the
    *   toggleImpulse(id) method.
    */
  var impulses: js.Array[Any] = js.native
  
  /**
    *   Connect a source to the convolver.
    *   @param src p5.sound / Web Audio object with a
    *   sound output.
    */
  def process(src: js.Object): Unit = js.native
  
  /**
    *   Similar to .addImpulse, except that the .impulses
    *   Array is reset to save memory. A new .impulses
    *   array is created with this impulse as the only
    *   item.
    *   @param path path to a sound file
    *   @param callback function (optional)
    *   @param errorCallback function (optional)
    */
  def resetImpulse(
    path: String,
    callback: js.Function1[/* repeated */ Any, Any],
    errorCallback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  /**
    *   If you have used .addImpulse() to add multiple
    *   impulses to a p5.Convolver, then you can use this
    *   method to toggle between the items in the
    *   .impulses Array. Accepts a parameter to identify
    *   which impulse you wish to use, identified either
    *   by its original filename (String) or by its
    *   position in the .impulses  Array (Number). You can
    *   access the objects in the .impulses Array
    *   directly. Each Object has two attributes: an
    *   .audioBuffer (type: Web Audio  AudioBuffer) and a
    *   .name, a String that corresponds with the original
    *   filename.
    *   @param id Identify the impulse by its original
    *   filename (String), or by its position in the
    *   .impulses Array (Number).
    */
  def toggleImpulse(id: String): Unit = js.native
  def toggleImpulse(id: Double): Unit = js.native
}

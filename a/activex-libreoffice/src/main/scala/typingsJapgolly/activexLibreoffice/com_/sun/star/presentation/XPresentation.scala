package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** With this interface you can control any object that implements a {@link Presentation} . */
trait XPresentation
  extends StObject
     with XInterface {
  
  /** The presentation is stopped and the full-screen mode will end. */
  def end(): Unit
  
  /** Starts the presentation from the beginning and shows the actual running time to the user. */
  def rehearseTimings(): Unit
  
  /** The presentation is shown in full-screen and started from the beginning. */
  def start(): Unit
}
object XPresentation {
  
  inline def apply(
    acquire: Callback,
    end: Callback,
    queryInterface: `type` => Any,
    rehearseTimings: Callback,
    release: Callback,
    start: Callback
  ): XPresentation = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, end = end.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = rehearseTimings.toJsFn, release = release.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[XPresentation]
  }
  
  extension [Self <: XPresentation](x: Self) {
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setRehearseTimings(value: Callback): Self = StObject.set(x, "rehearseTimings", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
  }
}

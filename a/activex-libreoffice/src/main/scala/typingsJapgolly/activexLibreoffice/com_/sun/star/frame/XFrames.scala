package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages and creates frames.
  *
  * Frames may contain other frames (by implementing an {@link XFrames} interface) and may be contained in other frames.
  * @see XFrame
  * @see Frame
  */
trait XFrames
  extends StObject
     with XIndexAccess {
  
  /**
    * appends the specified {@link Frame} to the list of sub-frames.
    * @param xFrame new frame for inserting into this container
    */
  def append(xFrame: XFrame): Unit
  
  /**
    * provides access to the list of all currently existing frames inside this container and their sub frames
    * @param nSearchFlags use combinations of {@link FrameSearchFlag} to specify which frames should be found
    * @returns all frames of this container and all available frames of the whole frame tree which match search parameter **SearchFlags**
    */
  def queryFrames(nSearchFlags: Double): SafeArray[XFrame]
  
  /**
    * removes the frame from its container.
    *
    * Note: The method XComponent::dispose() is not called implicitly by this method.The creator attribute of the frame must be reset by the caller of this
    * method.
    * @param xFrame frame which should be removed from this container
    */
  def remove(xFrame: XFrame): Unit
}
object XFrames {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    append: XFrame => Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryFrames: Double => SafeArray[XFrame],
    queryInterface: `type` => Any,
    release: Callback,
    remove: XFrame => Callback
  ): XFrames = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, append = js.Any.fromFunction1((t0: XFrame) => append(t0).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryFrames = js.Any.fromFunction1(queryFrames), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: XFrame) => remove(t0).runNow()))
    __obj.asInstanceOf[XFrames]
  }
  
  extension [Self <: XFrames](x: Self) {
    
    inline def setAppend(value: XFrame => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: XFrame) => value(t0).runNow()))
    
    inline def setQueryFrames(value: Double => SafeArray[XFrame]): Self = StObject.set(x, "queryFrames", js.Any.fromFunction1(value))
    
    inline def setRemove(value: XFrame => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: XFrame) => value(t0).runNow()))
  }
}

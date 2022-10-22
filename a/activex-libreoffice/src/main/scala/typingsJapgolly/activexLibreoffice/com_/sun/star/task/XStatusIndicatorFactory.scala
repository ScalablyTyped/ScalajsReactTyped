package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides multiple, probably parallel running, status indicator objects
  *
  * A possible factory is the {@link com.sun.star.frame.Frame} service.
  * @see com.sun.star.frame.Frame
  */
trait XStatusIndicatorFactory
  extends StObject
     with XInterface {
  
  /**
    * create a new status indicator instance
    * @returns the new indicator
    */
  def createStatusIndicator(): XStatusIndicator
}
object XStatusIndicatorFactory {
  
  inline def apply(
    acquire: Callback,
    createStatusIndicator: CallbackTo[XStatusIndicator],
    queryInterface: `type` => Any,
    release: Callback
  ): XStatusIndicatorFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createStatusIndicator = createStatusIndicator.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStatusIndicatorFactory]
  }
  
  extension [Self <: XStatusIndicatorFactory](x: Self) {
    
    inline def setCreateStatusIndicator(value: CallbackTo[XStatusIndicator]): Self = StObject.set(x, "createStatusIndicator", value.toJsFn)
  }
}

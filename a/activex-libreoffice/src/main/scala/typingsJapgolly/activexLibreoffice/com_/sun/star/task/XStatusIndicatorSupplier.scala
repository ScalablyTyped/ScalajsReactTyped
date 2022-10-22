package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XStatusIndicatorFactory} instead of this
  * @deprecated Deprecated
  */
trait XStatusIndicatorSupplier
  extends StObject
     with XInterface {
  
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  val StatusIndicator: XStatusIndicator
  
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  def getStatusIndicator(): XStatusIndicator
}
object XStatusIndicatorSupplier {
  
  inline def apply(
    StatusIndicator: XStatusIndicator,
    acquire: Callback,
    getStatusIndicator: CallbackTo[XStatusIndicator],
    queryInterface: `type` => Any,
    release: Callback
  ): XStatusIndicatorSupplier = {
    val __obj = js.Dynamic.literal(StatusIndicator = StatusIndicator.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStatusIndicator = getStatusIndicator.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStatusIndicatorSupplier]
  }
  
  extension [Self <: XStatusIndicatorSupplier](x: Self) {
    
    inline def setGetStatusIndicator(value: CallbackTo[XStatusIndicator]): Self = StObject.set(x, "getStatusIndicator", value.toJsFn)
    
    inline def setStatusIndicator(value: XStatusIndicator): Self = StObject.set(x, "StatusIndicator", value.asInstanceOf[js.Any])
  }
}

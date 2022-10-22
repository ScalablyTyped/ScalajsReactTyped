package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the collection of dimensions of a data pilot source.
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XDimensionsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of dimensions.
    * @see com.sun.star.sheet.DataPilotSourceDimensions
    */
  val Dimensions: XNameAccess
  
  /**
    * returns the collection of dimensions.
    * @see com.sun.star.sheet.DataPilotSourceDimensions
    */
  def getDimensions(): XNameAccess
}
object XDimensionsSupplier {
  
  inline def apply(
    Dimensions: XNameAccess,
    acquire: Callback,
    getDimensions: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XDimensionsSupplier = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDimensions = getDimensions.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDimensionsSupplier]
  }
  
  extension [Self <: XDimensionsSupplier](x: Self) {
    
    inline def setDimensions(value: XNameAccess): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setGetDimensions(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getDimensions", value.toJsFn)
  }
}

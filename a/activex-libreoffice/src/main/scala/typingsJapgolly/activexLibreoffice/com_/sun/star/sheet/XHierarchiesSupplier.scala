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
  * provides access to the collection of hierarchies of a data pilot source dimension.
  * @see com.sun.star.sheet.DataPilotSourceDimension
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XHierarchiesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of hierarchies.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  val Hierarchies: XNameAccess
  
  /**
    * returns the collection of hierarchies.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  def getHierarchies(): XNameAccess
}
object XHierarchiesSupplier {
  
  inline def apply(
    Hierarchies: XNameAccess,
    acquire: Callback,
    getHierarchies: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XHierarchiesSupplier = {
    val __obj = js.Dynamic.literal(Hierarchies = Hierarchies.asInstanceOf[js.Any], acquire = acquire.toJsFn, getHierarchies = getHierarchies.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHierarchiesSupplier]
  }
  
  extension [Self <: XHierarchiesSupplier](x: Self) {
    
    inline def setGetHierarchies(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getHierarchies", value.toJsFn)
    
    inline def setHierarchies(value: XNameAccess): Self = StObject.set(x, "Hierarchies", value.asInstanceOf[js.Any])
  }
}

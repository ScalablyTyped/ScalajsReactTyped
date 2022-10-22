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
  * provides access to the collection of levels of a data pilot source hierarchy.
  * @see com.sun.star.sheet.DataPilotSourceHierarchy
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XLevelsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of levels.
    * @see com.sun.star.sheet.DataPilotSourceLevels
    */
  val Levels: XNameAccess
  
  /**
    * returns the collection of levels.
    * @see com.sun.star.sheet.DataPilotSourceLevels
    */
  def getLevels(): XNameAccess
}
object XLevelsSupplier {
  
  inline def apply(
    Levels: XNameAccess,
    acquire: Callback,
    getLevels: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XLevelsSupplier = {
    val __obj = js.Dynamic.literal(Levels = Levels.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLevels = getLevels.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLevelsSupplier]
  }
  
  extension [Self <: XLevelsSupplier](x: Self) {
    
    inline def setGetLevels(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getLevels", value.toJsFn)
    
    inline def setLevels(value: XNameAccess): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
  }
}

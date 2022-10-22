package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of views, typically used for a database definition object. */
trait XViewsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of views.
    * @returns the views
    */
  val Views: XNameAccess
  
  /**
    * returns the container of views.
    * @returns the views
    */
  def getViews(): XNameAccess
}
object XViewsSupplier {
  
  inline def apply(
    Views: XNameAccess,
    acquire: Callback,
    getViews: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XViewsSupplier = {
    val __obj = js.Dynamic.literal(Views = Views.asInstanceOf[js.Any], acquire = acquire.toJsFn, getViews = getViews.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XViewsSupplier]
  }
  
  extension [Self <: XViewsSupplier](x: Self) {
    
    inline def setGetViews(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getViews", value.toJsFn)
    
    inline def setViews(value: XNameAccess): Self = StObject.set(x, "Views", value.asInstanceOf[js.Any])
  }
}

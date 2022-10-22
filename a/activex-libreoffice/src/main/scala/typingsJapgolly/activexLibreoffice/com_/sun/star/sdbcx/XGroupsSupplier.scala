package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of groups, typically used for a database definition object. */
trait XGroupsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of groups.
    * @returns the groups
    */
  val Groups: XNameAccess
  
  /**
    * returns the container of groups.
    * @returns the groups
    */
  def getGroups(): XNameAccess
}
object XGroupsSupplier {
  
  inline def apply(
    Groups: XNameAccess,
    acquire: Callback,
    getGroups: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XGroupsSupplier = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], acquire = acquire.toJsFn, getGroups = getGroups.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XGroupsSupplier]
  }
  
  extension [Self <: XGroupsSupplier](x: Self) {
    
    inline def setGetGroups(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getGroups", value.toJsFn)
    
    inline def setGroups(value: XNameAccess): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supports the renaming of definition objects. ;
  *
  * This is a very desirable feature which is not supported by all databases. There is no standard SQL statement provided for this feature.
  */
trait XRename
  extends StObject
     with XInterface {
  
  /**
    * is intended to alter the name of a object.
    * @param newName the new name
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def rename(newName: String): Unit
}
object XRename {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, rename: String => Callback): XRename = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, rename = js.Any.fromFunction1((t0: String) => rename(t0).runNow()))
    __obj.asInstanceOf[XRename]
  }
  
  extension [Self <: XRename](x: Self) {
    
    inline def setRename(value: String => Callback): Self = StObject.set(x, "rename", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}

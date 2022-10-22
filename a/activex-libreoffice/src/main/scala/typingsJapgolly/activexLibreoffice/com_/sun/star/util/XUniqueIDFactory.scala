package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** creates IDs which are unique within the container. */
trait XUniqueIDFactory
  extends StObject
     with XInterface {
  
  def createUniqueID(): String
}
object XUniqueIDFactory {
  
  inline def apply(
    acquire: Callback,
    createUniqueID: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XUniqueIDFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createUniqueID = createUniqueID.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUniqueIDFactory]
  }
  
  extension [Self <: XUniqueIDFactory](x: Self) {
    
    inline def setCreateUniqueID(value: CallbackTo[String]): Self = StObject.set(x, "createUniqueID", value.toJsFn)
  }
}

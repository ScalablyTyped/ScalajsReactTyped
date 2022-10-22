package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XUrlList
  extends StObject
     with XInterface {
  
  var List: SafeArray[String]
}
object XUrlList {
  
  inline def apply(List: SafeArray[String], acquire: Callback, queryInterface: `type` => Any, release: Callback): XUrlList = {
    val __obj = js.Dynamic.literal(List = List.asInstanceOf[js.Any], acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUrlList]
  }
  
  extension [Self <: XUrlList](x: Self) {
    
    inline def setList(value: SafeArray[String]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
  }
}

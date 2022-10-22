package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XLibraryQueryExecutable
  extends StObject
     with XInterface {
  
  def HasExecutableCode(name: String): Boolean
}
object XLibraryQueryExecutable {
  
  inline def apply(
    HasExecutableCode: String => Boolean,
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XLibraryQueryExecutable = {
    val __obj = js.Dynamic.literal(HasExecutableCode = js.Any.fromFunction1(HasExecutableCode), acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLibraryQueryExecutable]
  }
  
  extension [Self <: XLibraryQueryExecutable](x: Self) {
    
    inline def setHasExecutableCode(value: String => Boolean): Self = StObject.set(x, "HasExecutableCode", js.Any.fromFunction1(value))
  }
}

package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a factory for instances of service {@link com.sun.star.sdb.SQLQueryComposer} . */
trait XSQLQueryComposerFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a new query composer.
    * @returns the {@link SQLQueryComposer} object
    */
  def createQueryComposer(): XSQLQueryComposer
}
object XSQLQueryComposerFactory {
  
  inline def apply(
    acquire: Callback,
    createQueryComposer: CallbackTo[XSQLQueryComposer],
    queryInterface: `type` => Any,
    release: Callback
  ): XSQLQueryComposerFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createQueryComposer = createQueryComposer.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSQLQueryComposerFactory]
  }
  
  extension [Self <: XSQLQueryComposerFactory](x: Self) {
    
    inline def setCreateQueryComposer(value: CallbackTo[XSQLQueryComposer]): Self = StObject.set(x, "createQueryComposer", value.toJsFn)
  }
}

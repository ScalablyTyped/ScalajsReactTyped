package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to set the size of the underlying data of a stream to zero. */
trait XTruncate
  extends StObject
     with XInterface {
  
  /** sets the size of the underlying data of the stream to zero. */
  def truncate(): Unit
}
object XTruncate {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, truncate: Callback): XTruncate = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, truncate = truncate.toJsFn)
    __obj.asInstanceOf[XTruncate]
  }
  
  extension [Self <: XTruncate](x: Self) {
    
    inline def setTruncate(value: Callback): Self = StObject.set(x, "truncate", value.toJsFn)
  }
}

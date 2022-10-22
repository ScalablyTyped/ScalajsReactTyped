package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables a text object to copy attributed text from another text object. */
trait XTextCopy
  extends StObject
     with XInterface {
  
  /**
    * copies the content from another text object.
    * @param xSource specifies the source text object.
    */
  def copyText(xSource: XTextCopy): Unit
}
object XTextCopy {
  
  inline def apply(
    acquire: Callback,
    copyText: XTextCopy => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XTextCopy = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, copyText = js.Any.fromFunction1((t0: XTextCopy) => copyText(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextCopy]
  }
  
  extension [Self <: XTextCopy](x: Self) {
    
    inline def setCopyText(value: XTextCopy => Callback): Self = StObject.set(x, "copyText", js.Any.fromFunction1((t0: XTextCopy) => value(t0).runNow()))
  }
}

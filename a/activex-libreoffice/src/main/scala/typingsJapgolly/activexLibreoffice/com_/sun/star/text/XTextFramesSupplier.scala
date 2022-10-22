package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the {@link TextFrame} instances in this context (e.g. document). */
trait XTextFramesSupplier
  extends StObject
     with XInterface {
  
  /** returns a collection of text frames. */
  val TextFrames: XNameAccess
  
  /** returns a collection of text frames. */
  def getTextFrames(): XNameAccess
}
object XTextFramesSupplier {
  
  inline def apply(
    TextFrames: XNameAccess,
    acquire: Callback,
    getTextFrames: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextFramesSupplier = {
    val __obj = js.Dynamic.literal(TextFrames = TextFrames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTextFrames = getTextFrames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextFramesSupplier]
  }
  
  extension [Self <: XTextFramesSupplier](x: Self) {
    
    inline def setGetTextFrames(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getTextFrames", value.toJsFn)
    
    inline def setTextFrames(value: XNameAccess): Self = StObject.set(x, "TextFrames", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** manages the text sections within the context (i.e. the document). */
trait XTextSectionsSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of text sections. */
  val TextSections: XNameAccess
  
  /** @returns the collection of text sections. */
  def getTextSections(): XNameAccess
}
object XTextSectionsSupplier {
  
  inline def apply(
    TextSections: XNameAccess,
    acquire: Callback,
    getTextSections: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextSectionsSupplier = {
    val __obj = js.Dynamic.literal(TextSections = TextSections.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTextSections = getTextSections.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextSectionsSupplier]
  }
  
  extension [Self <: XTextSectionsSupplier](x: Self) {
    
    inline def setGetTextSections(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getTextSections", value.toJsFn)
    
    inline def setTextSections(value: XNameAccess): Self = StObject.set(x, "TextSections", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains the settings of the line numbering in a text document. */
trait XLineNumberingProperties
  extends StObject
     with XInterface {
  
  /** @returns the {@link LineNumberingProperties} of the object. */
  val LineNumberingProperties: XPropertySet
  
  /** @returns the {@link LineNumberingProperties} of the object. */
  def getLineNumberingProperties(): XPropertySet
}
object XLineNumberingProperties {
  
  inline def apply(
    LineNumberingProperties: XPropertySet,
    acquire: Callback,
    getLineNumberingProperties: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XLineNumberingProperties = {
    val __obj = js.Dynamic.literal(LineNumberingProperties = LineNumberingProperties.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLineNumberingProperties = getLineNumberingProperties.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLineNumberingProperties]
  }
  
  extension [Self <: XLineNumberingProperties](x: Self) {
    
    inline def setGetLineNumberingProperties(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getLineNumberingProperties", value.toJsFn)
    
    inline def setLineNumberingProperties(value: XPropertySet): Self = StObject.set(x, "LineNumberingProperties", value.asInstanceOf[js.Any])
  }
}

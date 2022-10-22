package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link com.sun.star.document.XExtendedFilterDetection} instead of this
  * @deprecated Deprecated
  */
trait XExtendedFilterDetection
  extends StObject
     with XInterface {
  
  /**
    * use {@link com.sun.star.document.XExtendedFilterDetection.detect()} instead of this
    * @deprecated Deprecated
    */
  def detect(URL: String, Argumentlist: SeqEquiv[PropertyValue]): String
}
object XExtendedFilterDetection {
  
  inline def apply(
    acquire: Callback,
    detect: (String, SeqEquiv[PropertyValue]) => String,
    queryInterface: `type` => Any,
    release: Callback
  ): XExtendedFilterDetection = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, detect = js.Any.fromFunction2(detect), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XExtendedFilterDetection]
  }
  
  extension [Self <: XExtendedFilterDetection](x: Self) {
    
    inline def setDetect(value: (String, SeqEquiv[PropertyValue]) => String): Self = StObject.set(x, "detect", js.Any.fromFunction2(value))
  }
}

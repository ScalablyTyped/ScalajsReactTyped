package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Certificate Serial Number Converter
  *
  * This interface converts a certificate serial number to and from a string
  */
trait XSerialNumberAdapter
  extends StObject
     with XInterface {
  
  /** Convert the SerialNumber to a sequence */
  def toSequence(SerialNumber: String): SafeArray[Double]
  
  /** Convert the SerialNumber to a string */
  def toString(SerialNumber: SeqEquiv[Double]): String
}
object XSerialNumberAdapter {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    toSequence: String => SafeArray[Double],
    toString_ : SeqEquiv[Double] => String
  ): XSerialNumberAdapter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, toSequence = js.Any.fromFunction1(toSequence))
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[XSerialNumberAdapter]
  }
  
  extension [Self <: XSerialNumberAdapter](x: Self) {
    
    inline def setToSequence(value: String => SafeArray[Double]): Self = StObject.set(x, "toSequence", js.Any.fromFunction1(value))
    
    inline def setToString_(value: SeqEquiv[Double] => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}

package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to associate a SAX event with a document location.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.Locator** .
  */
trait XLocator
  extends StObject
     with XInterface {
  
  /** @returns the column number where the current document event ends. */
  val ColumnNumber: Double
  
  /** @returns the line number where the current document event ends. */
  val LineNumber: Double
  
  /** @returns the public identifier for the current document event. */
  val PublicId: String
  
  /** @returns the system identifier for the current document event. */
  val SystemId: String
  
  /** @returns the column number where the current document event ends. */
  def getColumnNumber(): Double
  
  /** @returns the line number where the current document event ends. */
  def getLineNumber(): Double
  
  /** @returns the public identifier for the current document event. */
  def getPublicId(): String
  
  /** @returns the system identifier for the current document event. */
  def getSystemId(): String
}
object XLocator {
  
  inline def apply(
    ColumnNumber: Double,
    LineNumber: Double,
    PublicId: String,
    SystemId: String,
    acquire: Callback,
    getColumnNumber: CallbackTo[Double],
    getLineNumber: CallbackTo[Double],
    getPublicId: CallbackTo[String],
    getSystemId: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XLocator = {
    val __obj = js.Dynamic.literal(ColumnNumber = ColumnNumber.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], PublicId = PublicId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumnNumber = getColumnNumber.toJsFn, getLineNumber = getLineNumber.toJsFn, getPublicId = getPublicId.toJsFn, getSystemId = getSystemId.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLocator]
  }
  
  extension [Self <: XLocator](x: Self) {
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "ColumnNumber", value.asInstanceOf[js.Any])
    
    inline def setGetColumnNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getColumnNumber", value.toJsFn)
    
    inline def setGetLineNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getLineNumber", value.toJsFn)
    
    inline def setGetPublicId(value: CallbackTo[String]): Self = StObject.set(x, "getPublicId", value.toJsFn)
    
    inline def setGetSystemId(value: CallbackTo[String]): Self = StObject.set(x, "getSystemId", value.toJsFn)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "LineNumber", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: String): Self = StObject.set(x, "PublicId", value.asInstanceOf[js.Any])
    
    inline def setSystemId(value: String): Self = StObject.set(x, "SystemId", value.asInstanceOf[js.Any])
  }
}

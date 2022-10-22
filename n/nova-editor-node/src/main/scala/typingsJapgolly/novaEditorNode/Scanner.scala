package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/scanner/
trait Scanner extends StObject {
  
  val atEnd: Boolean
  
  var caseSensitive: Boolean
  
  var location: Double
  
  def scanChars(charset: Charset): String | Null
  
  def scanFloat(): Double | Null
  
  def scanHexFloat(): Double | Null
  
  def scanHexInt(): Double | Null
  
  def scanInt(): Double | Null
  
  def scanString(string: String): String | Null
  
  def scanUpToChars(charset: Charset): String | Null
  
  def scanUpToString(string: String): String | Null
  
  var skipChars: Charset
  
  val string: String
}
object Scanner {
  
  inline def apply(
    atEnd: Boolean,
    caseSensitive: Boolean,
    location: Double,
    scanChars: Charset => String | Null,
    scanFloat: CallbackTo[Double | Null],
    scanHexFloat: CallbackTo[Double | Null],
    scanHexInt: CallbackTo[Double | Null],
    scanInt: CallbackTo[Double | Null],
    scanString: String => String | Null,
    scanUpToChars: Charset => String | Null,
    scanUpToString: String => String | Null,
    skipChars: Charset,
    string: String
  ): Scanner = {
    val __obj = js.Dynamic.literal(atEnd = atEnd.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], scanChars = js.Any.fromFunction1(scanChars), scanFloat = scanFloat.toJsFn, scanHexFloat = scanHexFloat.toJsFn, scanHexInt = scanHexInt.toJsFn, scanInt = scanInt.toJsFn, scanString = js.Any.fromFunction1(scanString), scanUpToChars = js.Any.fromFunction1(scanUpToChars), scanUpToString = js.Any.fromFunction1(scanUpToString), skipChars = skipChars.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanner]
  }
  
  extension [Self <: Scanner](x: Self) {
    
    inline def setAtEnd(value: Boolean): Self = StObject.set(x, "atEnd", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setScanChars(value: Charset => String | Null): Self = StObject.set(x, "scanChars", js.Any.fromFunction1(value))
    
    inline def setScanFloat(value: CallbackTo[Double | Null]): Self = StObject.set(x, "scanFloat", value.toJsFn)
    
    inline def setScanHexFloat(value: CallbackTo[Double | Null]): Self = StObject.set(x, "scanHexFloat", value.toJsFn)
    
    inline def setScanHexInt(value: CallbackTo[Double | Null]): Self = StObject.set(x, "scanHexInt", value.toJsFn)
    
    inline def setScanInt(value: CallbackTo[Double | Null]): Self = StObject.set(x, "scanInt", value.toJsFn)
    
    inline def setScanString(value: String => String | Null): Self = StObject.set(x, "scanString", js.Any.fromFunction1(value))
    
    inline def setScanUpToChars(value: Charset => String | Null): Self = StObject.set(x, "scanUpToChars", js.Any.fromFunction1(value))
    
    inline def setScanUpToString(value: String => String | Null): Self = StObject.set(x, "scanUpToString", js.Any.fromFunction1(value))
    
    inline def setSkipChars(value: Charset): Self = StObject.set(x, "skipChars", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Raw data representation._
  * @see https://docs.scriptable.app/data
  */
trait Data extends StObject {
  
  /**
    * _Gets bytes from data._
    * @see https://docs.scriptable.app/data/#-getbytes
    */
  def getBytes(): js.Array[Double]
  
  /**
    * _Creates a base64 encoded string._
    *
    * Creates a base64 encoded string from the data.
    * @see https://docs.scriptable.app/data/#-tobase64string
    */
  def toBase64String(): String
  
  /**
    * _Creates a string from the data._
    *
    * The data is assumed to represent a UTF8 encoded string. If the string is not UTF8 encoded string, the function will return null.
    * @see https://docs.scriptable.app/data/#-torawstring
    */
  def toRawString(): String
}
object Data {
  
  inline def apply(
    getBytes: CallbackTo[js.Array[Double]],
    toBase64String: CallbackTo[String],
    toRawString: CallbackTo[String]
  ): Data = {
    val __obj = js.Dynamic.literal(getBytes = getBytes.toJsFn, toBase64String = toBase64String.toJsFn, toRawString = toRawString.toJsFn)
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setGetBytes(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getBytes", value.toJsFn)
    
    inline def setToBase64String(value: CallbackTo[String]): Self = StObject.set(x, "toBase64String", value.toJsFn)
    
    inline def setToRawString(value: CallbackTo[String]): Self = StObject.set(x, "toRawString", value.toJsFn)
  }
}

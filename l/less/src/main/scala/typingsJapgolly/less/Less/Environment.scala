package typingsJapgolly.less.Less

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * Look up the charset of a mime type
    */
  def charsetLookup(mime: String): String
  
  /**
    * Converts a string to a base 64 string
    */
  def encodeBase64(str: String): String
  
  /**
    * Gets a source map generator
    */
  def getSourceMapGenerator(): Any
  
  /**
    * Lookup the mime-type of a filename
    */
  def mimeLookup(filename: String): String
}
object Environment {
  
  inline def apply(
    charsetLookup: String => String,
    encodeBase64: String => String,
    getSourceMapGenerator: CallbackTo[Any],
    mimeLookup: String => String
  ): Environment = {
    val __obj = js.Dynamic.literal(charsetLookup = js.Any.fromFunction1(charsetLookup), encodeBase64 = js.Any.fromFunction1(encodeBase64), getSourceMapGenerator = getSourceMapGenerator.toJsFn, mimeLookup = js.Any.fromFunction1(mimeLookup))
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setCharsetLookup(value: String => String): Self = StObject.set(x, "charsetLookup", js.Any.fromFunction1(value))
    
    inline def setEncodeBase64(value: String => String): Self = StObject.set(x, "encodeBase64", js.Any.fromFunction1(value))
    
    inline def setGetSourceMapGenerator(value: CallbackTo[Any]): Self = StObject.set(x, "getSourceMapGenerator", value.toJsFn)
    
    inline def setMimeLookup(value: String => String): Self = StObject.set(x, "mimeLookup", js.Any.fromFunction1(value))
  }
}

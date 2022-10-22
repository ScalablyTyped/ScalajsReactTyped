package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.Attribute
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.FastAttribute
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a container for the attributes of an XML element.
  *
  * ;  Attributes are separated into known attributes and unknown attributes.
  *
  * Known attributes have a local name that is known to the {@link XFastTokenHandler} registered at the {@link XFastParser} which created the sax event
  * containing this attributes. If an attribute also has a namespace, that must be registered at the {@link XFastParser} , else this attribute is also
  * unknown even if the local name is known.
  */
trait XFastAttributeList
  extends StObject
     with XInterface {
  
  /** returns a sequence of attributes which names and or namespaces URLS are translated to tokens. */
  val FastAttributes: SafeArray[FastAttribute]
  
  /** returns a sequence of attributes which names and or namespaces URLS can not be translated to tokens. */
  val UnknownAttributes: SafeArray[Attribute]
  
  /** returns a sequence of attributes which names and or namespaces URLS are translated to tokens. */
  def getFastAttributes(): SafeArray[FastAttribute]
  
  /**
    * retrieves the value of an attribute. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The string value from the attribute or an empty string if the attribute is not available.
    */
  def getOptionalValue(Token: Double): String
  
  /**
    * retrieves the token of an attribute value. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @param Default This value will be returned if the attribute is not available
    * @returns If the attribute is available it returns the integer token of the value from the attribute or FastToken::Invalid. If not the value of `Default` i
    */
  def getOptionalValueToken(Token: Double, Default: Double): Double
  
  /** returns a sequence of attributes which names and or namespaces URLS can not be translated to tokens. */
  def getUnknownAttributes(): SafeArray[Attribute]
  
  /**
    * retrieves the value of an attribute. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The string value from the attribute.
    * @throws SAXEXception if the attribute is not available
    */
  def getValue(Token: Double): String
  
  /**
    * retrieves the token of an attribute value. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The integer token of the value from the attribute or FastToken::Invalid
    * @throws SAXEXception if the attribute is not available
    */
  def getValueToken(Token: Double): Double
  
  /**
    * checks if an attribute is available. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns `TRUE` , if the attribute is available
    */
  def hasAttribute(Token: Double): Boolean
}
object XFastAttributeList {
  
  inline def apply(
    FastAttributes: SafeArray[FastAttribute],
    UnknownAttributes: SafeArray[Attribute],
    acquire: Callback,
    getFastAttributes: CallbackTo[SafeArray[FastAttribute]],
    getOptionalValue: Double => String,
    getOptionalValueToken: (Double, Double) => Double,
    getUnknownAttributes: CallbackTo[SafeArray[Attribute]],
    getValue: Double => String,
    getValueToken: Double => Double,
    hasAttribute: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XFastAttributeList = {
    val __obj = js.Dynamic.literal(FastAttributes = FastAttributes.asInstanceOf[js.Any], UnknownAttributes = UnknownAttributes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFastAttributes = getFastAttributes.toJsFn, getOptionalValue = js.Any.fromFunction1(getOptionalValue), getOptionalValueToken = js.Any.fromFunction2(getOptionalValueToken), getUnknownAttributes = getUnknownAttributes.toJsFn, getValue = js.Any.fromFunction1(getValue), getValueToken = js.Any.fromFunction1(getValueToken), hasAttribute = js.Any.fromFunction1(hasAttribute), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFastAttributeList]
  }
  
  extension [Self <: XFastAttributeList](x: Self) {
    
    inline def setFastAttributes(value: SafeArray[FastAttribute]): Self = StObject.set(x, "FastAttributes", value.asInstanceOf[js.Any])
    
    inline def setGetFastAttributes(value: CallbackTo[SafeArray[FastAttribute]]): Self = StObject.set(x, "getFastAttributes", value.toJsFn)
    
    inline def setGetOptionalValue(value: Double => String): Self = StObject.set(x, "getOptionalValue", js.Any.fromFunction1(value))
    
    inline def setGetOptionalValueToken(value: (Double, Double) => Double): Self = StObject.set(x, "getOptionalValueToken", js.Any.fromFunction2(value))
    
    inline def setGetUnknownAttributes(value: CallbackTo[SafeArray[Attribute]]): Self = StObject.set(x, "getUnknownAttributes", value.toJsFn)
    
    inline def setGetValue(value: Double => String): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setGetValueToken(value: Double => Double): Self = StObject.set(x, "getValueToken", js.Any.fromFunction1(value))
    
    inline def setHasAttribute(value: Double => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
    
    inline def setUnknownAttributes(value: SafeArray[Attribute]): Self = StObject.set(x, "UnknownAttributes", value.asInstanceOf[js.Any])
  }
}

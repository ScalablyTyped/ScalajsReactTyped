package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An implementation of this interface represents a MIME content-type that conforms to [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and
  * [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} . Instances that implement this interface could be created using the interface {@link
  * XMimeContentTypeFactory} .
  */
trait XMimeContentType
  extends StObject
     with XInterface {
  
  /**
    * To get the full media/submedia type of the MIME content-type.
    * @returns The full media/submedia type of the MIME content-type.
    */
  val FullMediaType: String
  
  /**
    * To get the media subtype of the MIME content-type.
    * @returns The media subtype of the MIME content-type.
    */
  val MediaSubtype: String
  
  /**
    * To get the media type of the MIME content-type.
    * @returns The media type of the MIME content-type.
    */
  val MediaType: String
  
  /**
    * To get a list of parameters that the MIME content-type contains.
    * @returns A list of the names of all parameters of the MIME content-type.
    */
  val Parameters: SafeArray[String]
  
  /**
    * To get the full media/submedia type of the MIME content-type.
    * @returns The full media/submedia type of the MIME content-type.
    */
  def getFullMediaType(): String
  
  /**
    * To get the media subtype of the MIME content-type.
    * @returns The media subtype of the MIME content-type.
    */
  def getMediaSubtype(): String
  
  /**
    * To get the media type of the MIME content-type.
    * @returns The media type of the MIME content-type.
    */
  def getMediaType(): String
  
  /**
    * To get the value of a specified parameter.
    * @param aName The name of the parameter for which the value is requested.
    * @returns The value of the specified parameter.
    * @throws com::sun::star::container::NoSuchElementException if the specified parameter doesn't exist.
    */
  def getParameterValue(aName: String): String
  
  /**
    * To get a list of parameters that the MIME content-type contains.
    * @returns A list of the names of all parameters of the MIME content-type.
    */
  def getParameters(): SafeArray[String]
  
  /**
    * To query if a specific parameter is supported.
    * @param aName The name of the parameter to query for.
    * @returns A value of `TRUE` if the MIME content-type has the specified parameter. A value of `FALSE` if the MIME content-type has not the specified parameter.
    */
  def hasParameter(aName: String): Boolean
}
object XMimeContentType {
  
  inline def apply(
    FullMediaType: String,
    MediaSubtype: String,
    MediaType: String,
    Parameters: SafeArray[String],
    acquire: Callback,
    getFullMediaType: CallbackTo[String],
    getMediaSubtype: CallbackTo[String],
    getMediaType: CallbackTo[String],
    getParameterValue: String => String,
    getParameters: CallbackTo[SafeArray[String]],
    hasParameter: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XMimeContentType = {
    val __obj = js.Dynamic.literal(FullMediaType = FullMediaType.asInstanceOf[js.Any], MediaSubtype = MediaSubtype.asInstanceOf[js.Any], MediaType = MediaType.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFullMediaType = getFullMediaType.toJsFn, getMediaSubtype = getMediaSubtype.toJsFn, getMediaType = getMediaType.toJsFn, getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = getParameters.toJsFn, hasParameter = js.Any.fromFunction1(hasParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMimeContentType]
  }
  
  extension [Self <: XMimeContentType](x: Self) {
    
    inline def setFullMediaType(value: String): Self = StObject.set(x, "FullMediaType", value.asInstanceOf[js.Any])
    
    inline def setGetFullMediaType(value: CallbackTo[String]): Self = StObject.set(x, "getFullMediaType", value.toJsFn)
    
    inline def setGetMediaSubtype(value: CallbackTo[String]): Self = StObject.set(x, "getMediaSubtype", value.toJsFn)
    
    inline def setGetMediaType(value: CallbackTo[String]): Self = StObject.set(x, "getMediaType", value.toJsFn)
    
    inline def setGetParameterValue(value: String => String): Self = StObject.set(x, "getParameterValue", js.Any.fromFunction1(value))
    
    inline def setGetParameters(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setHasParameter(value: String => Boolean): Self = StObject.set(x, "hasParameter", js.Any.fromFunction1(value))
    
    inline def setMediaSubtype(value: String): Self = StObject.set(x, "MediaSubtype", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: String): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: SafeArray[String]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}

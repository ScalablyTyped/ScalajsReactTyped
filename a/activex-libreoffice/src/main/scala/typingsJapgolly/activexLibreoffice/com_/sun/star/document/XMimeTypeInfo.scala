package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides information regarding which MIME types are supported by a filter. */
trait XMimeTypeInfo
  extends StObject
     with XInterface {
  
  /** @returns a sequence of the names of all supported MIME types. */
  val SupportedMimeTypeNames: SafeArray[String]
  
  /** @returns a sequence of the names of all supported MIME types. */
  def getSupportedMimeTypeNames(): SafeArray[String]
  
  /** asks whether a MIME type is supported or not. */
  def supportsMimeType(MimeTypeName: String): Boolean
}
object XMimeTypeInfo {
  
  inline def apply(
    SupportedMimeTypeNames: SafeArray[String],
    acquire: Callback,
    getSupportedMimeTypeNames: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    supportsMimeType: String => Boolean
  ): XMimeTypeInfo = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSupportedMimeTypeNames = getSupportedMimeTypeNames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, supportsMimeType = js.Any.fromFunction1(supportsMimeType))
    __obj.asInstanceOf[XMimeTypeInfo]
  }
  
  extension [Self <: XMimeTypeInfo](x: Self) {
    
    inline def setGetSupportedMimeTypeNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSupportedMimeTypeNames", value.toJsFn)
    
    inline def setSupportedMimeTypeNames(value: SafeArray[String]): Self = StObject.set(x, "SupportedMimeTypeNames", value.asInstanceOf[js.Any])
    
    inline def setSupportsMimeType(value: String => Boolean): Self = StObject.set(x, "supportsMimeType", js.Any.fromFunction1(value))
  }
}

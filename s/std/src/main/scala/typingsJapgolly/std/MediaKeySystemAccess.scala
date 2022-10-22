package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method.
  * Available only in secure contexts.
  */
trait MediaKeySystemAccess extends StObject {
  
  /* standard dom */
  def createMediaKeys(): js.Promise[MediaKeys]
  
  /* standard dom */
  def getConfiguration(): MediaKeySystemConfiguration
  
  /* standard dom */
  val keySystem: java.lang.String
}
object MediaKeySystemAccess {
  
  inline def apply(
    createMediaKeys: CallbackTo[js.Promise[MediaKeys]],
    getConfiguration: CallbackTo[MediaKeySystemConfiguration],
    keySystem: java.lang.String
  ): MediaKeySystemAccess = {
    val __obj = js.Dynamic.literal(createMediaKeys = createMediaKeys.toJsFn, getConfiguration = getConfiguration.toJsFn, keySystem = keySystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySystemAccess]
  }
  
  extension [Self <: MediaKeySystemAccess](x: Self) {
    
    inline def setCreateMediaKeys(value: CallbackTo[js.Promise[MediaKeys]]): Self = StObject.set(x, "createMediaKeys", value.toJsFn)
    
    inline def setGetConfiguration(value: CallbackTo[MediaKeySystemConfiguration]): Self = StObject.set(x, "getConfiguration", value.toJsFn)
    
    inline def setKeySystem(value: java.lang.String): Self = StObject.set(x, "keySystem", value.asInstanceOf[js.Any])
  }
}

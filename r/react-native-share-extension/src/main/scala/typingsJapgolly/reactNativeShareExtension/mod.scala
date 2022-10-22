package typingsJapgolly.reactNativeShareExtension

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactNativeShareExtension.reactNativeShareExtensionStrings.imagesSlashAsterisk
import typingsJapgolly.reactNativeShareExtension.reactNativeShareExtensionStrings.textSlashplain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-share-extension", JSImport.Default)
  @js.native
  val default: ShareExtension = js.native
  
  trait ShareData extends StObject {
    
    var `type`: textSlashplain | imagesSlashAsterisk
    
    var value: String
  }
  object ShareData {
    
    inline def apply(`type`: textSlashplain | imagesSlashAsterisk, value: String): ShareData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareData]
    }
    
    extension [Self <: ShareData](x: Self) {
      
      inline def setType(value: textSlashplain | imagesSlashAsterisk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShareExtension extends StObject {
    
    def close(): Unit
    
    def data(): js.Promise[ShareData]
    
    def openURL(uri: String): Unit
  }
  object ShareExtension {
    
    inline def apply(close: Callback, data: CallbackTo[js.Promise[ShareData]], openURL: String => Callback): ShareExtension = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, data = data.toJsFn, openURL = js.Any.fromFunction1((t0: String) => openURL(t0).runNow()))
      __obj.asInstanceOf[ShareExtension]
    }
    
    extension [Self <: ShareExtension](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setData(value: CallbackTo[js.Promise[ShareData]]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setOpenURL(value: String => Callback): Self = StObject.set(x, "openURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type _To = ShareExtension
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ShareExtension = default
}

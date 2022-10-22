package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antdMobile.esComponentsErrorBlockCreateErrorBlockMod.ErrorBlockProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsErrorBlockMod {
  
  @JSImport("antd-mobile/es/components/error-block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile/es/components/error-block", JSImport.Default)
  @js.native
  val default: FC[ErrorBlockProps] = js.native
  
  inline def createErrorBlock(imageRecord: ImageRecord): FC[ErrorBlockProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createErrorBlock")(imageRecord.asInstanceOf[js.Any]).asInstanceOf[FC[ErrorBlockProps]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antdMobile.antdMobileStrings.default
    - typingsJapgolly.antdMobile.antdMobileStrings.disconnected
    - typingsJapgolly.antdMobile.antdMobileStrings.empty
    - typingsJapgolly.antdMobile.antdMobileStrings.busy
  */
  trait ErrorBlockStatus extends StObject
  object ErrorBlockStatus {
    
    inline def default: typingsJapgolly.antdMobile.antdMobileStrings.default = "default".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.default]
    
    inline def busy: typingsJapgolly.antdMobile.antdMobileStrings.busy = "busy".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.busy]
    
    inline def disconnected: typingsJapgolly.antdMobile.antdMobileStrings.disconnected = "disconnected".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.disconnected]
    
    inline def empty: typingsJapgolly.antdMobile.antdMobileStrings.empty = "empty".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.empty]
  }
  
  /* Inlined std.Partial<std.Record<antd-mobile.antd-mobile/es/components/error-block.ErrorBlockStatus, string | react.react.ReactNode>> */
  trait ImageRecord extends StObject {
    
    var default: js.UndefOr[String | Node] = js.undefined
    
    var busy: js.UndefOr[String | Node] = js.undefined
    
    var disconnected: js.UndefOr[String | Node] = js.undefined
    
    var empty: js.UndefOr[String | Node] = js.undefined
  }
  object ImageRecord {
    
    inline def apply(): ImageRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageRecord]
    }
    
    extension [Self <: ImageRecord](x: Self) {
      
      inline def setBusy(value: String | Node): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setBusyNull: Self = StObject.set(x, "busy", null)
      
      inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      inline def setBusyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "busy", js.Array(value*))
      
      inline def setBusyVdomElement(value: VdomElement): Self = StObject.set(x, "busy", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefault(value: String | Node): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDefaultVdomElement(value: VdomElement): Self = StObject.set(x, "default", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisconnected(value: String | Node): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
      
      inline def setDisconnectedNull: Self = StObject.set(x, "disconnected", null)
      
      inline def setDisconnectedUndefined: Self = StObject.set(x, "disconnected", js.undefined)
      
      inline def setDisconnectedVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "disconnected", js.Array(value*))
      
      inline def setDisconnectedVdomElement(value: VdomElement): Self = StObject.set(x, "disconnected", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEmpty(value: String | Node): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyNull: Self = StObject.set(x, "empty", null)
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setEmptyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "empty", js.Array(value*))
      
      inline def setEmptyVdomElement(value: VdomElement): Self = StObject.set(x, "empty", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

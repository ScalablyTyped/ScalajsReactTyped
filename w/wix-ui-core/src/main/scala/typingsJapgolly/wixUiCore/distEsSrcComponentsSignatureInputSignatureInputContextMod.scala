package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.wixUiCore.wixUiCoreStrings.inputId
import typingsJapgolly.wixUiCore.wixUiCoreStrings.padApi
import typingsJapgolly.wixUiCore.wixUiCoreStrings.setInputId
import typingsJapgolly.wixUiCore.wixUiCoreStrings.setSignaturePadContext
import typingsJapgolly.wixUiCore.wixUiCoreStrings.setSignatureTitleId
import typingsJapgolly.wixUiCore.wixUiCoreStrings.titleId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSignatureInputSignatureInputContextMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInputContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInputContext", "SignatureInputContextProvider")
  @js.native
  val SignatureInputContextProvider: Provider[SignatureInputContextValue] = js.native
  
  inline def withSignatureInputContext[P /* <: WithSignaturePadProps */](WrappedComponent: ComponentType[P]): FunctionComponent[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        inputId | titleId | padApi | setSignaturePadContext | setSignatureTitleId | setInputId
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSignatureInputContext")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        inputId | titleId | padApi | setSignaturePadContext | setSignatureTitleId | setInputId
      ]
    ]
  ]]
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait SignatureInputContextValue extends StObject {
    
    var inputId: js.UndefOr[String] = js.native
    
    var padApi: js.UndefOr[SignaturePadApiContext] = js.native
    
    def setInputId(): Unit = js.native
    def setInputId(id: String): Unit = js.native
    
    def setSignaturePadContext(api: SignaturePadApiContext): Unit = js.native
    
    def setSignatureTitleId(): Unit = js.native
    def setSignatureTitleId(id: String): Unit = js.native
    
    var titleId: js.UndefOr[String] = js.native
  }
  
  trait SignaturePadApiContext extends StObject {
    
    def clear(): Unit
  }
  object SignaturePadApiContext {
    
    inline def apply(clear: Callback): SignaturePadApiContext = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn)
      __obj.asInstanceOf[SignaturePadApiContext]
    }
    
    extension [Self <: SignaturePadApiContext](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    }
  }
  
  type WithSignaturePadProps = SignatureInputContextValue
}

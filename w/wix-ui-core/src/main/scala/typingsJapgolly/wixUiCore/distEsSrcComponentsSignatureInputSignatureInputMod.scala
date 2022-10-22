package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixUiCore.anon.InputId
import typingsJapgolly.wixUiCore.anon.PickClearButtonPropschild
import typingsJapgolly.wixUiCore.anon.PickSigningPadPropschildr
import typingsJapgolly.wixUiCore.anon.PickTitlePropschildren
import typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputSignatureInputContextMod.SignaturePadApiContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSignatureInputSignatureInputMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInput", "SignatureInput")
  @js.native
  open class SignatureInput protected ()
    extends Component[js.Object, SignatureInputState, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
    
    def setInputId(inputId: String): Unit = js.native
    
    def setSignaturePadContext(padApi: SignaturePadApiContext): Unit = js.native
    
    def setSignatureTitleId(titleId: String): Unit = js.native
    
    @JSName("state")
    val state_SignatureInput: InputId = js.native
  }
  /* static members */
  object SignatureInput {
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInput", "SignatureInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInput", "SignatureInput.ClearButton")
    @js.native
    def ClearButton: FunctionComponent[PickClearButtonPropschild] = js.native
    inline def ClearButton_=(x: FunctionComponent[PickClearButtonPropschild]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearButton")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInput", "SignatureInput.SigningPad")
    @js.native
    def SigningPad: FunctionComponent[PickSigningPadPropschildr] = js.native
    inline def SigningPad_=(x: FunctionComponent[PickSigningPadPropschildr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SigningPad")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInput", "SignatureInput.Title")
    @js.native
    def Title: FunctionComponent[PickTitlePropschildren] = js.native
    inline def Title_=(x: FunctionComponent[PickTitlePropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInput", "SignatureInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<wix-ui-core.wix-ui-core/dist/es/src/components/signature-input/SignatureInputContext.SignatureInputContextValue> */
  trait SignatureInputState extends StObject {
    
    val inputId: js.UndefOr[String] = js.undefined
    
    val padApi: js.UndefOr[SignaturePadApiContext] = js.undefined
    
    val setInputId: js.Function1[/* id */ js.UndefOr[String], Unit]
    
    val setSignaturePadContext: js.Function1[/* api */ SignaturePadApiContext, Unit]
    
    val setSignatureTitleId: js.Function1[/* id */ js.UndefOr[String], Unit]
    
    val titleId: js.UndefOr[String] = js.undefined
  }
  object SignatureInputState {
    
    inline def apply(
      setInputId: /* id */ js.UndefOr[String] => Callback,
      setSignaturePadContext: /* api */ SignaturePadApiContext => Callback,
      setSignatureTitleId: /* id */ js.UndefOr[String] => Callback
    ): SignatureInputState = {
      val __obj = js.Dynamic.literal(setInputId = js.Any.fromFunction1((t0: /* id */ js.UndefOr[String]) => setInputId(t0).runNow()), setSignaturePadContext = js.Any.fromFunction1((t0: /* api */ SignaturePadApiContext) => setSignaturePadContext(t0).runNow()), setSignatureTitleId = js.Any.fromFunction1((t0: /* id */ js.UndefOr[String]) => setSignatureTitleId(t0).runNow()))
      __obj.asInstanceOf[SignatureInputState]
    }
    
    extension [Self <: SignatureInputState](x: Self) {
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setPadApi(value: SignaturePadApiContext): Self = StObject.set(x, "padApi", value.asInstanceOf[js.Any])
      
      inline def setPadApiUndefined: Self = StObject.set(x, "padApi", js.undefined)
      
      inline def setSetInputId(value: /* id */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setInputId", js.Any.fromFunction1((t0: /* id */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetSignaturePadContext(value: /* api */ SignaturePadApiContext => Callback): Self = StObject.set(x, "setSignaturePadContext", js.Any.fromFunction1((t0: /* api */ SignaturePadApiContext) => value(t0).runNow()))
      
      inline def setSetSignatureTitleId(value: /* id */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setSignatureTitleId", js.Any.fromFunction1((t0: /* id */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setTitleId(value: String): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
      
      inline def setTitleIdUndefined: Self = StObject.set(x, "titleId", js.undefined)
    }
  }
}

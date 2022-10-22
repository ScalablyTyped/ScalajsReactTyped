package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixUiCore.anon.GetClearButtonProps
import typingsJapgolly.wixUiCore.anon.PickClearButtonPropschild
import typingsJapgolly.wixUiCore.distEsSrcComponentsButtonNextButtonNextMod.ButtonProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputSignatureInputContextMod.SignatureInputContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSignatureInputClearButtonClearButtonMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/clear-button/ClearButton", "ClearButton")
  @js.native
  val ClearButton: FunctionComponent[PickClearButtonPropschild] = js.native
  
  type ClearButtonChildrenFn = js.Function1[/* childrenFn */ GetClearButtonProps, Element]
  
  trait ClearButtonChildrenProps
    extends StObject
       with ButtonProps {
    
    var `data-hook`: js.UndefOr[String] = js.undefined
  }
  object ClearButtonChildrenProps {
    
    inline def apply(): ClearButtonChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearButtonChildrenProps]
    }
    
    extension [Self <: ClearButtonChildrenProps](x: Self) {
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    }
  }
  
  @js.native
  trait ClearButtonProps
    extends StObject
       with SignatureInputContextValue {
    
    var children: js.UndefOr[ClearButtonChildrenFn] = js.native
  }
}

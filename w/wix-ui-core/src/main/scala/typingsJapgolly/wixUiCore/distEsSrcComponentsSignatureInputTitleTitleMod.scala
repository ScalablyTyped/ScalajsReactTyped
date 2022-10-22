package typingsJapgolly.wixUiCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixUiCore.anon.GetTitleProps
import typingsJapgolly.wixUiCore.anon.PickTitlePropschildren
import typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputSignatureInputContextMod.SignatureInputContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSignatureInputTitleTitleMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/title/Title", "Title")
  @js.native
  val Title: FunctionComponent[PickTitlePropschildren] = js.native
  
  type TitleChildrenFn = js.Function1[/* childrenFn */ GetTitleProps, Element]
  
  trait TitleChildrenProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var `data-hook`: js.UndefOr[String] = js.undefined
  }
  object TitleChildrenProps {
    
    inline def apply(): TitleChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleChildrenProps]
    }
    
    extension [Self <: TitleChildrenProps](x: Self) {
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    }
  }
  
  @js.native
  trait TitleProps
    extends StObject
       with SignatureInputContextValue {
    
    var children: js.UndefOr[TitleChildrenFn] = js.native
  }
}

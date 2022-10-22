package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutMod.BaseModalLayoutProps
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typingsJapgolly.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageModalLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/MessageModalLayout", JSImport.Default)
  @js.native
  val default: FC[MessageModalLayoutProps] = js.native
  
  trait MessageModalLayoutProps
    extends StObject
       with BaseModalLayoutProps {
    
    var actionsSize: js.UndefOr[ButtonSize] = js.undefined
    
    var content: js.UndefOr[String | Node] = js.undefined
    
    var footnote: js.UndefOr[Node] = js.undefined
    
    var illustration: js.UndefOr[String | Node] = js.undefined
    
    var primaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var primaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var primaryButtonText: js.UndefOr[String] = js.undefined
    
    var secondaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var secondaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var secondaryButtonText: js.UndefOr[String] = js.undefined
    
    var sideActions: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[String | Node] = js.undefined
  }
  object MessageModalLayoutProps {
    
    inline def apply(): MessageModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageModalLayoutProps]
    }
    
    extension [Self <: MessageModalLayoutProps](x: Self) {
      
      inline def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
      
      inline def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
      
      inline def setContent(value: String | Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFootnote(value: VdomNode): Self = StObject.set(x, "footnote", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFootnoteNull: Self = StObject.set(x, "footnote", null)
      
      inline def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
      
      inline def setFootnoteVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footnote", js.Array(value*))
      
      inline def setFootnoteVdomElement(value: VdomElement): Self = StObject.set(x, "footnote", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIllustration(value: String | Node): Self = StObject.set(x, "illustration", value.asInstanceOf[js.Any])
      
      inline def setIllustrationNull: Self = StObject.set(x, "illustration", null)
      
      inline def setIllustrationUndefined: Self = StObject.set(x, "illustration", js.undefined)
      
      inline def setIllustrationVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "illustration", js.Array(value*))
      
      inline def setIllustrationVdomElement(value: VdomElement): Self = StObject.set(x, "illustration", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonOnClick(value: Callback): Self = StObject.set(x, "primaryButtonOnClick", value.toJsFn)
      
      inline def setPrimaryButtonOnClickUndefined: Self = StObject.set(x, "primaryButtonOnClick", js.undefined)
      
      inline def setPrimaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
      
      inline def setPrimaryButtonText(value: String): Self = StObject.set(x, "primaryButtonText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
      
      inline def setSecondaryButtonOnClick(value: Callback): Self = StObject.set(x, "secondaryButtonOnClick", value.toJsFn)
      
      inline def setSecondaryButtonOnClickUndefined: Self = StObject.set(x, "secondaryButtonOnClick", js.undefined)
      
      inline def setSecondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
      
      inline def setSecondaryButtonText(value: String): Self = StObject.set(x, "secondaryButtonText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonTextUndefined: Self = StObject.set(x, "secondaryButtonText", js.undefined)
      
      inline def setSideActions(value: VdomNode): Self = StObject.set(x, "sideActions", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSideActionsNull: Self = StObject.set(x, "sideActions", null)
      
      inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      inline def setSideActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sideActions", js.Array(value*))
      
      inline def setSideActionsVdomElement(value: VdomElement): Self = StObject.set(x, "sideActions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: String | Node): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[MessageModalLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesMessageModalLayoutMod.foo` */
  override def _to: FC[MessageModalLayoutProps] = default
}

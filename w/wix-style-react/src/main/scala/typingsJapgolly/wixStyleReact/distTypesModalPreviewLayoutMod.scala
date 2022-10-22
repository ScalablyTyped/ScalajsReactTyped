package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalPreviewLayoutMod {
  
  @JSImport("wix-style-react/dist/types/ModalPreviewLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ModalPreviewLayoutProps, js.Object, Any]
  
  type ModalPreviewLayout = PureComponent[ModalPreviewLayoutProps, js.Object, Any]
  
  trait ModalPreviewLayoutProps extends StObject {
    
    var actions: js.UndefOr[Node] = js.undefined
    
    var children: Node
    
    var closeButtonTooltipText: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var nextButtonProps: js.UndefOr[NextButtonProps] = js.undefined
    
    def onClose(): Unit
    
    var prevButtonProps: js.UndefOr[PrevButtonProps] = js.undefined
    
    var shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ModalPreviewLayoutProps {
    
    inline def apply(onClose: Callback): ModalPreviewLayoutProps = {
      val __obj = js.Dynamic.literal(onClose = onClose.toJsFn, children = null)
      __obj.asInstanceOf[ModalPreviewLayoutProps]
    }
    
    extension [Self <: ModalPreviewLayoutProps](x: Self) {
      
      inline def setActions(value: VdomNode): Self = StObject.set(x, "actions", value.rawNode.asInstanceOf[js.Any])
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setActionsVdomElement(value: VdomElement): Self = StObject.set(x, "actions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseButtonTooltipText(value: String): Self = StObject.set(x, "closeButtonTooltipText", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonTooltipTextUndefined: Self = StObject.set(x, "closeButtonTooltipText", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setNextButtonProps(value: NextButtonProps): Self = StObject.set(x, "nextButtonProps", value.asInstanceOf[js.Any])
      
      inline def setNextButtonPropsUndefined: Self = StObject.set(x, "nextButtonProps", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setPrevButtonProps(value: PrevButtonProps): Self = StObject.set(x, "prevButtonProps", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonPropsUndefined: Self = StObject.set(x, "prevButtonProps", js.undefined)
      
      inline def setShouldCloseOnOverlayClick(value: Boolean): Self = StObject.set(x, "shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setShouldCloseOnOverlayClickUndefined: Self = StObject.set(x, "shouldCloseOnOverlayClick", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait NextButtonProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* childIndexDisplayed */ Double, js.Object]] = js.undefined
    
    var tooltipText: js.UndefOr[Node] = js.undefined
  }
  object NextButtonProps {
    
    inline def apply(): NextButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextButtonProps]
    }
    
    extension [Self <: NextButtonProps](x: Self) {
      
      inline def setOnClick(value: /* childIndexDisplayed */ Double => js.Object): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTooltipText(value: VdomNode): Self = StObject.set(x, "tooltipText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTooltipTextNull: Self = StObject.set(x, "tooltipText", null)
      
      inline def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
      
      inline def setTooltipTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltipText", js.Array(value*))
      
      inline def setTooltipTextVdomElement(value: VdomElement): Self = StObject.set(x, "tooltipText", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait PrevButtonProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* childIndexDisplayed */ Double, js.Object]] = js.undefined
    
    var tooltipText: js.UndefOr[Node] = js.undefined
  }
  object PrevButtonProps {
    
    inline def apply(): PrevButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrevButtonProps]
    }
    
    extension [Self <: PrevButtonProps](x: Self) {
      
      inline def setOnClick(value: /* childIndexDisplayed */ Double => js.Object): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTooltipText(value: VdomNode): Self = StObject.set(x, "tooltipText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTooltipTextNull: Self = StObject.set(x, "tooltipText", null)
      
      inline def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
      
      inline def setTooltipTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltipText", js.Array(value*))
      
      inline def setTooltipTextVdomElement(value: VdomElement): Self = StObject.set(x, "tooltipText", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

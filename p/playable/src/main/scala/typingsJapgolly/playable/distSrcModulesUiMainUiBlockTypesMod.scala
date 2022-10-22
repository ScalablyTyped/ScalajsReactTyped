package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiMainUiBlockTypesMod {
  
  trait IMainUIBlock extends StObject {
    
    def destroy(): Unit
    
    def disableShowingContent(): Unit
    
    def enableShowingContent(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def setShouldAlwaysShow(flag: Boolean): Unit
    
    def show(): Unit
  }
  object IMainUIBlock {
    
    inline def apply(
      destroy: Callback,
      disableShowingContent: Callback,
      enableShowingContent: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      setShouldAlwaysShow: Boolean => Callback,
      show: Callback
    ): IMainUIBlock = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, disableShowingContent = disableShowingContent.toJsFn, enableShowingContent = enableShowingContent.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, setShouldAlwaysShow = js.Any.fromFunction1((t0: Boolean) => setShouldAlwaysShow(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[IMainUIBlock]
    }
    
    extension [Self <: IMainUIBlock](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisableShowingContent(value: Callback): Self = StObject.set(x, "disableShowingContent", value.toJsFn)
      
      inline def setEnableShowingContent(value: Callback): Self = StObject.set(x, "enableShowingContent", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setSetShouldAlwaysShow(value: Boolean => Callback): Self = StObject.set(x, "setShouldAlwaysShow", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IMainUIBlockAPI extends StObject {
    
    var hideMainUI: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setMainUIShouldAlwaysShow: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.undefined
    
    var showMainUI: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IMainUIBlockAPI {
    
    inline def apply(): IMainUIBlockAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMainUIBlockAPI]
    }
    
    extension [Self <: IMainUIBlockAPI](x: Self) {
      
      inline def setHideMainUI(value: Callback): Self = StObject.set(x, "hideMainUI", value.toJsFn)
      
      inline def setHideMainUIUndefined: Self = StObject.set(x, "hideMainUI", js.undefined)
      
      inline def setSetMainUIShouldAlwaysShow(value: /* flag */ Boolean => Callback): Self = StObject.set(x, "setMainUIShouldAlwaysShow", js.Any.fromFunction1((t0: /* flag */ Boolean) => value(t0).runNow()))
      
      inline def setSetMainUIShouldAlwaysShowUndefined: Self = StObject.set(x, "setMainUIShouldAlwaysShow", js.undefined)
      
      inline def setShowMainUI(value: Callback): Self = StObject.set(x, "showMainUI", value.toJsFn)
      
      inline def setShowMainUIUndefined: Self = StObject.set(x, "showMainUI", js.undefined)
    }
  }
  
  trait IMainUIBlockViewConfig extends StObject {
    
    var elements: IMainUIBlockViewElements
  }
  object IMainUIBlockViewConfig {
    
    inline def apply(elements: IMainUIBlockViewElements): IMainUIBlockViewConfig = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMainUIBlockViewConfig]
    }
    
    extension [Self <: IMainUIBlockViewConfig](x: Self) {
      
      inline def setElements(value: IMainUIBlockViewElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMainUIBlockViewElements extends StObject {
    
    var bottomBlock: HTMLElement
    
    var tooltipContainer: HTMLElement
    
    var topBlock: HTMLElement
  }
  object IMainUIBlockViewElements {
    
    inline def apply(bottomBlock: HTMLElement, tooltipContainer: HTMLElement, topBlock: HTMLElement): IMainUIBlockViewElements = {
      val __obj = js.Dynamic.literal(bottomBlock = bottomBlock.asInstanceOf[js.Any], tooltipContainer = tooltipContainer.asInstanceOf[js.Any], topBlock = topBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMainUIBlockViewElements]
    }
    
    extension [Self <: IMainUIBlockViewElements](x: Self) {
      
      inline def setBottomBlock(value: HTMLElement): Self = StObject.set(x, "bottomBlock", value.asInstanceOf[js.Any])
      
      inline def setTooltipContainer(value: HTMLElement): Self = StObject.set(x, "tooltipContainer", value.asInstanceOf[js.Any])
      
      inline def setTopBlock(value: HTMLElement): Self = StObject.set(x, "topBlock", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMainUIBlockViewStyles extends StObject {
    
    var hidden: String
    
    var mainUiBlock: String
    
    var tooltipContainerWrapper: String
  }
  object IMainUIBlockViewStyles {
    
    inline def apply(hidden: String, mainUiBlock: String, tooltipContainerWrapper: String): IMainUIBlockViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], mainUiBlock = mainUiBlock.asInstanceOf[js.Any], tooltipContainerWrapper = tooltipContainerWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMainUIBlockViewStyles]
    }
    
    extension [Self <: IMainUIBlockViewStyles](x: Self) {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setMainUiBlock(value: String): Self = StObject.set(x, "mainUiBlock", value.asInstanceOf[js.Any])
      
      inline def setTooltipContainerWrapper(value: String): Self = StObject.set(x, "tooltipContainerWrapper", value.asInstanceOf[js.Any])
    }
  }
}

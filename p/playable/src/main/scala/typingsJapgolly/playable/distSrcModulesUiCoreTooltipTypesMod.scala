package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreTooltipTypesMod {
  
  @js.native
  sealed trait TooltipPositionPlacement extends StObject
  @JSImport("playable/dist/src/modules/ui/core/tooltip/types", "TooltipPositionPlacement")
  @js.native
  object TooltipPositionPlacement extends StObject {
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with TooltipPositionPlacement
    
    @js.native
    sealed trait TOP
      extends StObject
         with TooltipPositionPlacement
  }
  
  trait ITooltip extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    var isHidden: Boolean
    
    def setStyle(style: StringDictionary[String | Double]): Unit
    
    def setText(text: String): Unit
    
    def show(): Unit
  }
  object ITooltip {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      isHidden: Boolean,
      setStyle: StringDictionary[String | Double] => Callback,
      setText: String => Callback,
      show: Callback
    ): ITooltip = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, isHidden = isHidden.asInstanceOf[js.Any], setStyle = js.Any.fromFunction1((t0: StringDictionary[String | Double]) => setStyle(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[ITooltip]
    }
    
    extension [Self <: ITooltip](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setSetStyle(value: StringDictionary[String | Double] => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction1((t0: StringDictionary[String | Double]) => value(t0).runNow()))
      
      inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait ITooltipPosition extends StObject {
    
    var placement: TooltipPositionPlacement
    
    var x: Double
  }
  object ITooltipPosition {
    
    inline def apply(placement: TooltipPositionPlacement, x: Double): ITooltipPosition = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipPosition]
    }
    
    extension [Self <: ITooltipPosition](x: Self) {
      
      inline def setPlacement(value: TooltipPositionPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  type ITooltipPositionFunction = js.Function1[/* tooltipContainerElement */ HTMLElement, ITooltipPosition]
  
  trait ITooltipReference extends StObject {
    
    def destroy(): Unit
    
    def disable(): Unit
    
    def enable(): Unit
    
    def hide(): Unit
    
    var isDisabled: Boolean
    
    var isHidden: Boolean
    
    def setText(text: String): Unit
    
    def show(): Unit
  }
  object ITooltipReference {
    
    inline def apply(
      destroy: Callback,
      disable: Callback,
      enable: Callback,
      hide: Callback,
      isDisabled: Boolean,
      isHidden: Boolean,
      setText: String => Callback,
      show: Callback
    ): ITooltipReference = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, disable = disable.toJsFn, enable = enable.toJsFn, hide = hide.toJsFn, isDisabled = isDisabled.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[ITooltipReference]
    }
    
    extension [Self <: ITooltipReference](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait ITooltipReferenceOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ITooltipReferenceOptions {
    
    inline def apply(): ITooltipReferenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipReferenceOptions]
    }
    
    extension [Self <: ITooltipReferenceOptions](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ITooltipService extends StObject {
    
    def createReference(reference: HTMLElement, options: ITooltipReferenceOptions): ITooltipReference
    
    def destroy(): Unit
    
    def hide(): Unit
    
    var isHidden: Boolean
    
    def setText(text: String): Unit
    
    def show(options: ITooltipShowOptions): Unit
    
    var tooltipContainerElement: HTMLElement
  }
  object ITooltipService {
    
    inline def apply(
      createReference: (HTMLElement, ITooltipReferenceOptions) => ITooltipReference,
      destroy: Callback,
      hide: Callback,
      isHidden: Boolean,
      setText: String => Callback,
      show: ITooltipShowOptions => Callback,
      tooltipContainerElement: HTMLElement
    ): ITooltipService = {
      val __obj = js.Dynamic.literal(createReference = js.Any.fromFunction2(createReference), destroy = destroy.toJsFn, hide = hide.toJsFn, isHidden = isHidden.asInstanceOf[js.Any], setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), show = js.Any.fromFunction1((t0: ITooltipShowOptions) => show(t0).runNow()), tooltipContainerElement = tooltipContainerElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipService]
    }
    
    extension [Self <: ITooltipService](x: Self) {
      
      inline def setCreateReference(value: (HTMLElement, ITooltipReferenceOptions) => ITooltipReference): Self = StObject.set(x, "createReference", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setShow(value: ITooltipShowOptions => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: ITooltipShowOptions) => value(t0).runNow()))
      
      inline def setTooltipContainerElement(value: HTMLElement): Self = StObject.set(x, "tooltipContainerElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITooltipShowOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var position: ITooltipPosition | ITooltipPositionFunction
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ITooltipShowOptions {
    
    inline def apply(position: ITooltipPosition | ITooltipPositionFunction): ITooltipShowOptions = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipShowOptions]
    }
    
    extension [Self <: ITooltipShowOptions](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setPosition(value: ITooltipPosition | ITooltipPositionFunction): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionFunction1(value: /* tooltipContainerElement */ HTMLElement => ITooltipPosition): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ITooltipStyles extends StObject {
    
    var showAsElement: String
    
    var showAsText: String
    
    var tooltip: String
    
    var tooltipInner: String
    
    var tooltipVisible: String
  }
  object ITooltipStyles {
    
    inline def apply(
      showAsElement: String,
      showAsText: String,
      tooltip: String,
      tooltipInner: String,
      tooltipVisible: String
    ): ITooltipStyles = {
      val __obj = js.Dynamic.literal(showAsElement = showAsElement.asInstanceOf[js.Any], showAsText = showAsText.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipInner = tooltipInner.asInstanceOf[js.Any], tooltipVisible = tooltipVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipStyles]
    }
    
    extension [Self <: ITooltipStyles](x: Self) {
      
      inline def setShowAsElement(value: String): Self = StObject.set(x, "showAsElement", value.asInstanceOf[js.Any])
      
      inline def setShowAsText(value: String): Self = StObject.set(x, "showAsText", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipInner(value: String): Self = StObject.set(x, "tooltipInner", value.asInstanceOf[js.Any])
      
      inline def setTooltipVisible(value: String): Self = StObject.set(x, "tooltipVisible", value.asInstanceOf[js.Any])
    }
  }
}

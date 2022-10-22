package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.anon.Bottom
import typingsJapgolly.playable.anon.Left
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipPosition
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipPositionFunction
import typingsJapgolly.playable.distSrcModulesUiCoreTypesMod.IStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreTooltipTooltipContainerMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-container", JSImport.Default)
  @js.native
  open class default protected () extends TooltipContainer {
    def this(tooltip: typingsJapgolly.playable.distSrcModulesUiCoreTooltipTooltipMod.default) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getTooltipPositionStyles(position: ITooltipPosition): StringDictionary[String | Double] = js.native
  }
  
  trait ITooltipContainer extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def getTooltipPositionStyles(position: ITooltipPosition): StringDictionary[String | Double]
  }
  object ITooltipContainer {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      getTooltipPositionStyles: ITooltipPosition => StringDictionary[String | Double]
    ): ITooltipContainer = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, getTooltipPositionStyles = js.Any.fromFunction1(getTooltipPositionStyles))
      __obj.asInstanceOf[ITooltipContainer]
    }
    
    extension [Self <: ITooltipContainer](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setGetTooltipPositionStyles(value: ITooltipPosition => StringDictionary[String | Double]): Self = StObject.set(x, "getTooltipPositionStyles", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TooltipContainer
    extends typingsJapgolly.playable.distSrcModulesUiCoreStylableMod.default[IStyles]
       with ITooltipContainer {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _getTooltipLeftX: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _tooltip: Any = js.native
    
    def getTooltipPositionStyles(position: ITooltipPositionFunction): Bottom | Left = js.native
  }
}

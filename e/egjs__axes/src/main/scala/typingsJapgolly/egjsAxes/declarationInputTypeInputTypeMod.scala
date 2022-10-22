package typingsJapgolly.egjsAxes

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.egjsAxes.declarationAxesMod.AxesOption
import typingsJapgolly.egjsAxes.declarationAxisManagerMod.Axis
import typingsJapgolly.egjsAxes.declarationTypesMod.ActiveEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationInputTypeInputTypeMod {
  
  @JSImport("@egjs/axes/declaration/inputType/InputType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertInputType(): ActiveEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("convertInputType")().asInstanceOf[ActiveEvent]
  inline def convertInputType(inputType: js.Array[String]): ActiveEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("convertInputType")(inputType.asInstanceOf[js.Any]).asInstanceOf[ActiveEvent]
  
  inline def toAxis(source: js.Array[String], offset: js.Array[Double]): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("toAxis")(source.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Axis]
  
  trait InputType extends StObject {
    
    var axes: js.Array[String]
    
    def connect(observer: InputTypeObserver): InputType
    
    def destroy(): Any
    
    var disable: js.UndefOr[js.Function0[Any]] = js.undefined
    
    def disconnect(): Any
    
    var element: HTMLElement
    
    var enable: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var isEnable: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    def mapAxes(axes: js.Array[String]): Any
  }
  object InputType {
    
    inline def apply(
      axes: js.Array[String],
      connect: InputTypeObserver => InputType,
      destroy: CallbackTo[Any],
      disconnect: CallbackTo[Any],
      element: HTMLElement,
      mapAxes: js.Array[String] => Any
    ): InputType = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), destroy = destroy.toJsFn, disconnect = disconnect.toJsFn, element = element.asInstanceOf[js.Any], mapAxes = js.Any.fromFunction1(mapAxes))
      __obj.asInstanceOf[InputType]
    }
    
    extension [Self <: InputType](x: Self) {
      
      inline def setAxes(value: js.Array[String]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesVarargs(value: String*): Self = StObject.set(x, "axes", js.Array(value*))
      
      inline def setConnect(value: InputTypeObserver => InputType): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: CallbackTo[Any]): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisable(value: CallbackTo[Any]): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDisconnect(value: CallbackTo[Any]): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEnable(value: CallbackTo[Any]): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setIsEnable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnable", value.toJsFn)
      
      inline def setIsEnableUndefined: Self = StObject.set(x, "isEnable", js.undefined)
      
      inline def setMapAxes(value: js.Array[String] => Any): Self = StObject.set(x, "mapAxes", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait InputTypeObserver extends StObject {
    
    def change(inputType: InputType, event: Any, offset: Axis): Any = js.native
    def change(inputType: InputType, event: Any, offset: Axis, useAnimation: Boolean): Any = js.native
    
    def get(inputType: InputType): Axis = js.native
    
    def hold(inputType: InputType, event: Any): Any = js.native
    
    var options: AxesOption = js.native
    
    def release(inputType: InputType, event: Any, velocity: js.Array[Double]): Any = js.native
    def release(inputType: InputType, event: Any, velocity: js.Array[Double], inputDuration: Double): Any = js.native
  }
}

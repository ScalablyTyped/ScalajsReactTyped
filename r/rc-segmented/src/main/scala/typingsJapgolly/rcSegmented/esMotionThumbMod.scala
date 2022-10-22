package typingsJapgolly.rcSegmented

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcSegmented.mod.SegmentedValue
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMotionThumbMod {
  
  @JSImport("rc-segmented/es/MotionThumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MotionThumbInterface): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait MotionThumbInterface extends StObject {
    
    var containerRef: RefHandle[HTMLDivElement]
    
    def getValueIndex(value: SegmentedValue): Double
    
    var motionName: String
    
    var onMotionEnd: VoidFunction
    
    var onMotionStart: VoidFunction
    
    var prefixCls: String
    
    var value: SegmentedValue
  }
  object MotionThumbInterface {
    
    inline def apply(
      containerRef: RefHandle[HTMLDivElement],
      getValueIndex: SegmentedValue => Double,
      motionName: String,
      onMotionEnd: Callback,
      onMotionStart: Callback,
      prefixCls: String,
      value: SegmentedValue
    ): MotionThumbInterface = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], getValueIndex = js.Any.fromFunction1(getValueIndex), motionName = motionName.asInstanceOf[js.Any], onMotionEnd = onMotionEnd.toJsFn, onMotionStart = onMotionStart.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotionThumbInterface]
    }
    
    extension [Self <: MotionThumbInterface](x: Self) {
      
      inline def setContainerRef(value: RefHandle[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setGetValueIndex(value: SegmentedValue => Double): Self = StObject.set(x, "getValueIndex", js.Any.fromFunction1(value))
      
      inline def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      inline def setOnMotionEnd(value: Callback): Self = StObject.set(x, "onMotionEnd", value.toJsFn)
      
      inline def setOnMotionStart(value: Callback): Self = StObject.set(x, "onMotionStart", value.toJsFn)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: SegmentedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

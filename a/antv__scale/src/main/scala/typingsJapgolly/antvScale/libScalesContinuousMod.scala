package typingsJapgolly.antvScale

import typingsJapgolly.antvScale.libScalesBaseMod.Base
import typingsJapgolly.antvScale.libTypesMod.ContinuousOptions
import typingsJapgolly.antvScale.libTypesMod.NiceMethod
import typingsJapgolly.antvScale.libTypesMod.TickMethodOptions
import typingsJapgolly.antvScale.libTypesMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesContinuousMod {
  
  /* note: abstract class */ @JSImport("@antv/scale/lib/scales/continuous", "Continuous")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Continuous[O /* <: ContinuousOptions */] () extends Base[O] {
    def this(options: O) = this()
    
    /* protected */ def chooseClamp(transform: Transform): js.Function1[/* x */ Double, Double] = js.native
    
    /* protected */ def chooseNice(): NiceMethod[Double | js.Date] = js.native
    
    /**
      * 根据比例尺 和 options 选择对应的 transform 和 untransform 函数
      * y = a * f(x) + b
      * x = a * f'(y) + b
      * @returns [f(x), f'(y)]
      */
    /* protected */ def chooseTransforms(): js.Array[Transform] = js.native
    
    /* protected */ def composeInput(transform: Transform, untransform: Transform, clamp: Transform): Unit = js.native
    
    /* protected */ def composeOutput(transform: Transform, clamp: Transform): Unit = js.native
    
    /* protected */ def getTickMethodOptions(): TickMethodOptions[Double | js.Date] = js.native
    
    def getTicks(): js.Array[Double | js.Date] = js.native
    
    /** 实际上将 y 映射为 x 的函数 */
    /* protected */ def input(x: Any): Any = js.native
    /** 实际上将 y 映射为 x 的函数 */
    /* protected */ @JSName("input")
    var input_Original: Transform = js.native
    
    /* protected */ def nice(): Unit = js.native
    
    /** 实际上将 x 映射为 y 的函数 */
    /* protected */ def output(x: Any): Any = js.native
    /** 实际上将 x 映射为 y 的函数 */
    /* protected */ @JSName("output")
    var output_Original: Transform = js.native
  }
}

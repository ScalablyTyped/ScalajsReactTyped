package typingsJapgolly.antvScale

import typingsJapgolly.antvScale.libScalesContinuousMod.Continuous
import typingsJapgolly.antvScale.libTypesMod.LinearOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesLinearMod {
  
  @JSImport("@antv/scale/lib/scales/linear", "Linear")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Linear () extends Continuous[LinearOptions] {
    def this(options: LinearOptions) = this()
  }
}

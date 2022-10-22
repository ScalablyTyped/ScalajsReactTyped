package typingsJapgolly.antDesignReactNative.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.antDesignReactNative.anon.Direction
import typingsJapgolly.antDesignReactNative.libStepsMod.StepsProps
import typingsJapgolly.antDesignReactNative.libStepsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Steps")
@js.native
open class Steps protected () extends default {
  def this(props: StepsProps) = this()
}
/* static members */
object Steps {
  
  @JSImport("@ant-design/react-native", "Steps")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Steps.Step")
  @js.native
  def Step: Instantiable0[typingsJapgolly.antDesignReactNative.libStepsStepsItemMod.default] = js.native
  inline def Step_=(x: Instantiable0[typingsJapgolly.antDesignReactNative.libStepsStepsItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Steps.defaultProps")
  @js.native
  def defaultProps: Direction = js.native
  inline def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}

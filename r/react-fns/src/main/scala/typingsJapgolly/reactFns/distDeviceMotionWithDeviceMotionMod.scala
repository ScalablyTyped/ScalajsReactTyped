package typingsJapgolly.reactFns

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.distDeviceMotionDeviceMotionMod.DeviceMotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeviceMotionWithDeviceMotionMod {
  
  @JSImport("react-fns/dist/DeviceMotion/withDeviceMotion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDeviceMotion[Props](Component: ComponentType[Props & DeviceMotionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDeviceMotion")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}

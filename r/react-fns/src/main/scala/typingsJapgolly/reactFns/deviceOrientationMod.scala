package typingsJapgolly.reactFns

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/DeviceOrientation", JSImport.Namespace)
@js.native
object deviceOrientationMod extends js.Object {
  @js.native
  class DeviceOrientation ()
    extends typingsJapgolly.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientation
  
  def withDeviceOrientation[Props](Component: ComponentType[Props with DeviceOrientationProps]): ComponentType[Props] = js.native
}


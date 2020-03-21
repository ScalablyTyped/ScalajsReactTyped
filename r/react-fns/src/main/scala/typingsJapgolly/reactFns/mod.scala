package typingsJapgolly.reactFns

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import typingsJapgolly.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typingsJapgolly.reactFns.geoPositionGeoPositionMod.GeoPositionProps
import typingsJapgolly.reactFns.localesLocalesMod.LocalesProps
import typingsJapgolly.reactFns.mediaMediaMod.MediaProps
import typingsJapgolly.reactFns.networkNetworkMod.NetworkProps
import typingsJapgolly.reactFns.scrollScrollMod.ScrollProps
import typingsJapgolly.reactFns.typesMod.SharedRenderProps
import typingsJapgolly.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DeviceMotion ()
    extends typingsJapgolly.reactFns.deviceMotionDeviceMotionMod.DeviceMotion
  
  @js.native
  class DeviceOrientation ()
    extends typingsJapgolly.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientation
  
  @js.native
  class GeoPosition ()
    extends typingsJapgolly.reactFns.geoPositionGeoPositionMod.GeoPosition
  
  @js.native
  class Locales ()
    extends typingsJapgolly.reactFns.localesLocalesMod.Locales
  
  @js.native
  class Network ()
    extends typingsJapgolly.reactFns.networkNetworkMod.Network
  
  @js.native
  class Scroll ()
    extends typingsJapgolly.reactFns.scrollMod.Scroll
  
  @js.native
  class WindowSize ()
    extends typingsJapgolly.reactFns.windowSizeMod.WindowSize
  
  val Media: SFC[SharedRenderProps[MediaProps]] = js.native
  def withDeviceMotion[Props](Component: ComponentType[Props with DeviceMotionProps]): ComponentType[Props] = js.native
  def withDeviceOrientation[Props](Component: ComponentType[Props with DeviceOrientationProps]): ComponentType[Props] = js.native
  def withGeoPosition[Props](Component: ComponentType[Props with GeoPositionProps]): ComponentType[Props] = js.native
  def withLocales[Props](Component: ComponentType[Props with LocalesProps]): ComponentType[Props] = js.native
  def withNetwork[Props](Component: ComponentType[Props with NetworkProps]): ComponentType[Props] = js.native
  def withScroll[Props](Component: ComponentType[Props with ScrollProps]): ComponentType[Props] = js.native
  def withWindowSize[Props](Component: ComponentType[Props with WindowSizeProps]): ComponentType[Props] = js.native
  /* static members */
  @js.native
  object Scroll extends js.Object {
    var defaultProps: PartialScrollConfig = js.native
  }
  
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    var defaultProps: PartialWindowSizeConfig = js.native
  }
  
}


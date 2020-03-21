package typingsJapgolly.reactNativeMaps.mod

import typingsJapgolly.reactNative.mod.Animated.Animated
import typingsJapgolly.reactNative.mod.Animated.CompositeAnimation
import typingsJapgolly.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-maps", "AnimatedRegion")
@js.native
class AnimatedRegion () extends Animated {
  def this(region: Region) = this()
  var latitude: Value = js.native
  var latitudeDelta: Value = js.native
  var longitude: Value = js.native
  var longitudeDelta: Value = js.native
  def addListener(callback: js.Function1[/* region */ Region, Unit]): String = js.native
  def flattenOffset(): Unit = js.native
  def removeListener(id: String): Unit = js.native
  def setOffset(offset: Region): Unit = js.native
  def setValue(value: Region): Unit = js.native
  def spring(config: AnimatedRegionSpringConfig): CompositeAnimation = js.native
  def stopAnimation(): Unit = js.native
  def stopAnimation(callback: js.Function1[/* region */ Region, Unit]): Unit = js.native
  def timing(config: AnimatedRegionTimingConfig): CompositeAnimation = js.native
}


package typingsJapgolly.detox

import typingsJapgolly.detox.mod.global.Detox.DetoxKnownDeviceType
import typingsJapgolly.detox.mod.global.Detox.Direction
import typingsJapgolly.detox.mod.global.Detox.LocationPermission
import typingsJapgolly.detox.mod.global.Detox.Orientation
import typingsJapgolly.detox.mod.global.Detox.PermissionState
import typingsJapgolly.detox.mod.global.Detox.PinchDirection
import typingsJapgolly.detox.mod.global.Detox.Speed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detoxStrings {
  
  @js.native
  sealed trait NO
    extends StObject
       with PermissionState
  inline def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait UNSAFE_configReady extends StObject
  inline def UNSAFE_configReady: UNSAFE_configReady = "UNSAFE_configReady".asInstanceOf[UNSAFE_configReady]
  
  @js.native
  sealed trait YES
    extends StObject
       with PermissionState
  inline def YES: YES = "YES".asInstanceOf[YES]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait always
    extends StObject
       with LocationPermission
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait android extends StObject
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait androidDotapk extends StObject
  inline def androidDotapk: androidDotapk = "android.apk".asInstanceOf[androidDotapk]
  
  @js.native
  sealed trait androidDotattached
    extends StObject
       with DetoxKnownDeviceType
  inline def androidDotattached: androidDotattached = "android.attached".asInstanceOf[androidDotattached]
  
  @js.native
  sealed trait androidDotemulator
    extends StObject
       with DetoxKnownDeviceType
  inline def androidDotemulator: androidDotemulator = "android.emulator".asInstanceOf[androidDotemulator]
  
  @js.native
  sealed trait androidDotgenycloud
    extends StObject
       with DetoxKnownDeviceType
  inline def androidDotgenycloud: androidDotgenycloud = "android.genycloud".asInstanceOf[androidDotgenycloud]
  
  @js.native
  sealed trait angle_indirect extends StObject
  inline def angle_indirect: angle_indirect = "angle_indirect".asInstanceOf[angle_indirect]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bottom
    extends StObject
       with Direction
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait disabled extends StObject
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait down
    extends StObject
       with Direction
  inline def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait enabled extends StObject
  inline def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait failing extends StObject
  inline def failing: failing = "failing".asInstanceOf[failing]
  
  @js.native
  sealed trait fast
    extends StObject
       with Speed
  inline def fast: fast = "fast".asInstanceOf[fast]
  
  @js.native
  sealed trait gone extends StObject
  inline def gone: gone = "gone".asInstanceOf[gone]
  
  @js.native
  sealed trait guest extends StObject
  inline def guest: guest = "guest".asInstanceOf[guest]
  
  @js.native
  sealed trait host extends StObject
  inline def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait inuse
    extends StObject
       with LocationPermission
  inline def inuse: inuse = "inuse".asInstanceOf[inuse]
  
  @js.native
  sealed trait invisible extends StObject
  inline def invisible: invisible = "invisible".asInstanceOf[invisible]
  
  @js.native
  sealed trait inward
    extends StObject
       with PinchDirection
  inline def inward: inward = "inward".asInstanceOf[inward]
  
  @js.native
  sealed trait ios extends StObject
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait iosDotapp extends StObject
  inline def iosDotapp: iosDotapp = "ios.app".asInstanceOf[iosDotapp]
  
  @js.native
  sealed trait iosDotnone
    extends StObject
       with DetoxKnownDeviceType
  inline def iosDotnone: iosDotnone = "ios.none".asInstanceOf[iosDotnone]
  
  @js.native
  sealed trait iosDotsimulator
    extends StObject
       with DetoxKnownDeviceType
  inline def iosDotsimulator: iosDotsimulator = "ios.simulator".asInstanceOf[iosDotsimulator]
  
  @js.native
  sealed trait landscape
    extends StObject
       with Orientation
  inline def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait left
    extends StObject
       with Direction
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait manual extends StObject
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait never
    extends StObject
       with LocationPermission
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait outward
    extends StObject
       with PinchDirection
  inline def outward: outward = "outward".asInstanceOf[outward]
  
  @js.native
  sealed trait portrait
    extends StObject
       with Orientation
  inline def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait right
    extends StObject
       with Direction
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait slow
    extends StObject
       with Speed
  inline def slow: slow = "slow".asInstanceOf[slow]
  
  @js.native
  sealed trait swiftshader_indirect extends StObject
  inline def swiftshader_indirect: swiftshader_indirect = "swiftshader_indirect".asInstanceOf[swiftshader_indirect]
  
  @js.native
  sealed trait top
    extends StObject
       with Direction
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait unset
    extends StObject
       with LocationPermission
       with PermissionState
  inline def unset: unset = "unset".asInstanceOf[unset]
  
  @js.native
  sealed trait up
    extends StObject
       with Direction
  inline def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait visible extends StObject
  inline def visible: visible = "visible".asInstanceOf[visible]
}

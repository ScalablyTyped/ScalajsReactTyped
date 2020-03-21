package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.ionicCoreStrings.android
import typingsJapgolly.ionicCore.ionicCoreStrings.capacitor
import typingsJapgolly.ionicCore.ionicCoreStrings.cordova
import typingsJapgolly.ionicCore.ionicCoreStrings.desktop
import typingsJapgolly.ionicCore.ionicCoreStrings.electron
import typingsJapgolly.ionicCore.ionicCoreStrings.hybrid
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.ipad
import typingsJapgolly.ionicCore.ionicCoreStrings.iphone
import typingsJapgolly.ionicCore.ionicCoreStrings.mobile
import typingsJapgolly.ionicCore.ionicCoreStrings.mobileweb
import typingsJapgolly.ionicCore.ionicCoreStrings.phablet
import typingsJapgolly.ionicCore.ionicCoreStrings.pwa
import typingsJapgolly.ionicCore.ionicCoreStrings.tablet
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  @js.native
  trait IsPlatformSignature extends js.Object {
    def apply(plt: Platforms): Boolean = js.native
    def apply(win: Window_, plt: Platforms): Boolean = js.native
  }
  
  val isPlatform: IsPlatformSignature = js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def testUserAgent(win: Window_, expr: js.RegExp): Boolean = js.native
  type Platforms = String
}


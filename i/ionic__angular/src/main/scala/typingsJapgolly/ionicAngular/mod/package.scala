package typingsJapgolly.ionicAngular.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicAngular.ionicAngularStrings.android
import typingsJapgolly.ionicAngular.ionicAngularStrings.capacitor
import typingsJapgolly.ionicAngular.ionicAngularStrings.cordova
import typingsJapgolly.ionicAngular.ionicAngularStrings.desktop
import typingsJapgolly.ionicAngular.ionicAngularStrings.electron
import typingsJapgolly.ionicAngular.ionicAngularStrings.hybrid
import typingsJapgolly.ionicAngular.ionicAngularStrings.ios
import typingsJapgolly.ionicAngular.ionicAngularStrings.ipad
import typingsJapgolly.ionicAngular.ionicAngularStrings.iphone
import typingsJapgolly.ionicAngular.ionicAngularStrings.mobile
import typingsJapgolly.ionicAngular.ionicAngularStrings.mobileweb
import typingsJapgolly.ionicAngular.ionicAngularStrings.phablet
import typingsJapgolly.ionicAngular.ionicAngularStrings.pwa
import typingsJapgolly.ionicAngular.ionicAngularStrings.tablet
import typingsJapgolly.ionicAngular.mod.^
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsGestureMod.Gesture
import typingsJapgolly.ionicCore.distTypesUtilsGestureMod.GestureConfig
import typingsJapgolly.ionicCore.distTypesUtilsPlatformMod.IsPlatformSignature
import typingsJapgolly.ionicCore.distTypesUtilsTransitionMod.TransitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def IonicSlides(opts: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IonicSlides")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def createAnimation(): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")().asInstanceOf[Animation]
inline def createAnimation(animationId: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(animationId.asInstanceOf[js.Any]).asInstanceOf[Animation]

inline def createGesture(config: GestureConfig): Gesture = ^.asInstanceOf[js.Dynamic].applyDynamic("createGesture")(config.asInstanceOf[js.Any]).asInstanceOf[Gesture]

inline def getPlatforms(): js.Array[
ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")().asInstanceOf[js.Array[
ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid]]
inline def getPlatforms(win: Any): js.Array[
ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[
ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid]]

inline def getTimeGivenProgression(
  p0: js.Array[Double],
  p1: js.Array[Double],
  p2: js.Array[Double],
  p3: js.Array[Double],
  progression: Double
): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeGivenProgression")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], progression.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

inline def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosTransitionAnimation")(navEl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]

inline def isPlatform: IsPlatformSignature = ^.asInstanceOf[js.Dynamic].selectDynamic("isPlatform").asInstanceOf[IsPlatformSignature]

inline def mdTransitionAnimation(_underscore: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("mdTransitionAnimation")(_underscore.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]

package typingsJapgolly.ionicAngular

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
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsPlatformMod.IsPlatformSignature
import typingsJapgolly.ionicCore.distTypesUtilsTransitionMod.TransitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicCoreMod {
  
  @JSImport("@ionic/angular/ionic-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/ionic-core", "IonicSafeString")
  @js.native
  open class IonicSafeString protected ()
    extends typingsJapgolly.ionicCore.mod.IonicSafeString {
    def this(value: String) = this()
  }
  
  inline def createAnimation(): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")().asInstanceOf[Animation]
  inline def createAnimation(animationId: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(animationId.asInstanceOf[js.Any]).asInstanceOf[Animation]
  
  inline def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")().asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  inline def getPlatforms(win: Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  
  inline def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosTransitionAnimation")(navEl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
  
  @JSImport("@ionic/angular/ionic-core", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  inline def mdTransitionAnimation(_underscore: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("mdTransitionAnimation")(_underscore.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
}

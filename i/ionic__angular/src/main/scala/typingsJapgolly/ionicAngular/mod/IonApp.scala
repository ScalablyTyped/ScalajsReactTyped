package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-app`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonApp")
@js.native
open class IonApp protected ()
  extends typingsJapgolly.ionicAngular.directivesProxiesMod.IonApp {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
}
/* static members */
object IonApp {
  
  @JSImport("@ionic/angular", "IonApp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "IonApp.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    typingsJapgolly.ionicAngular.directivesProxiesMod.IonApp, 
    `ion-app`, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      typingsJapgolly.ionicAngular.directivesProxiesMod.IonApp, 
      `ion-app`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "IonApp.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesProxiesMod.IonApp, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesProxiesMod.IonApp, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

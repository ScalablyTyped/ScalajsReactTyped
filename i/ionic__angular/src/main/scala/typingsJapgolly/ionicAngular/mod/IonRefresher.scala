package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.CloseDuration
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-refresher`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonRefresher")
@js.native
open class IonRefresher protected ()
  extends typingsJapgolly.ionicAngular.directivesProxiesMod.IonRefresher {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
}
/* static members */
object IonRefresher {
  
  @JSImport("@ionic/angular", "IonRefresher")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "IonRefresher.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    typingsJapgolly.ionicAngular.directivesProxiesMod.IonRefresher, 
    `ion-refresher`, 
    scala.Nothing, 
    CloseDuration, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      typingsJapgolly.ionicAngular.directivesProxiesMod.IonRefresher, 
      `ion-refresher`, 
      scala.Nothing, 
      CloseDuration, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "IonRefresher.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesProxiesMod.IonRefresher, scala.Nothing] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesProxiesMod.IonRefresher, scala.Nothing]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

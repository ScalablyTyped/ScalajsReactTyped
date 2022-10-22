package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.ForceOverscroll
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-content`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonContent")
@js.native
open class IonContent protected ()
  extends typingsJapgolly.ionicAngular.directivesProxiesMod.IonContent {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
}
/* static members */
object IonContent {
  
  @JSImport("@ionic/angular", "IonContent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "IonContent.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    typingsJapgolly.ionicAngular.directivesProxiesMod.IonContent, 
    `ion-content`, 
    scala.Nothing, 
    ForceOverscroll, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      typingsJapgolly.ionicAngular.directivesProxiesMod.IonContent, 
      `ion-content`, 
      scala.Nothing, 
      ForceOverscroll, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "IonContent.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesProxiesMod.IonContent, scala.Nothing] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesProxiesMod.IonContent, scala.Nothing]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

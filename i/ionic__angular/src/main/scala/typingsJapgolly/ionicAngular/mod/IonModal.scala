package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.BackdropBreakpoint
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-modal`
import typingsJapgolly.ionicAngular.ionicAngularStrings.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonModal")
@js.native
open class IonModal protected ()
  extends typingsJapgolly.ionicAngular.directivesOverlaysModalMod.IonModal {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
}
/* static members */
object IonModal {
  
  @JSImport("@ionic/angular", "IonModal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "IonModal.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    typingsJapgolly.ionicAngular.directivesOverlaysModalMod.IonModal, 
    `ion-modal`, 
    scala.Nothing, 
    BackdropBreakpoint, 
    js.Object, 
    js.Array[template], 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      typingsJapgolly.ionicAngular.directivesOverlaysModalMod.IonModal, 
      `ion-modal`, 
      scala.Nothing, 
      BackdropBreakpoint, 
      js.Object, 
      js.Array[template], 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "IonModal.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesOverlaysModalMod.IonModal, scala.Nothing] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesOverlaysModalMod.IonModal, scala.Nothing]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

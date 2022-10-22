package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.StopPropagation
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-backdrop`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonBackdrop")
@js.native
open class IonBackdrop protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonBackdrop {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Emitted when the backdrop is tapped.
    */
  var ionBackdropTap: EventEmitter[CustomEvent] = js.native
  
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  /* CompleteClass */
  var stopPropagation: Boolean = js.native
  
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  /* CompleteClass */
  var tappable: Boolean = js.native
  
  /**
    * If `true`, the backdrop will be visible.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonBackdrop {
  
  @JSImport("@ionic/angular/directives/proxies", "IonBackdrop")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonBackdrop.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonBackdrop, 
    `ion-backdrop`, 
    scala.Nothing, 
    StopPropagation, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonBackdrop, 
      `ion-backdrop`, 
      scala.Nothing, 
      StopPropagation, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonBackdrop.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonBackdrop, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonBackdrop, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.Alt
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-img`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonImg")
@js.native
open class IonImg protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonImg {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Emitted when the img fails to load
    */
  var ionError: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the image has finished loading
    */
  var ionImgDidLoad: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the img src has been set
    */
  var ionImgWillLoad: EventEmitter[CustomEvent] = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonImg {
  
  @JSImport("@ionic/angular/directives/proxies", "IonImg")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonImg.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[IonImg, `ion-img`, scala.Nothing, Alt, js.Object, scala.Nothing, js.Array[Asterisk], `false`] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[IonImg, `ion-img`, scala.Nothing, Alt, js.Object, scala.Nothing, js.Array[Asterisk], `false`]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonImg.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonImg, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonImg, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

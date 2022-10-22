package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.CloseIcon
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-fab-button`
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonFabButton")
@js.native
open class IonFabButton protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonFabButton {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /**
    * If `true`, the fab button will be show a close icon.
    */
  /* CompleteClass */
  var activated: Boolean = js.native
  
  /**
    * The icon name to use for the close icon. This will appear when the fab button is pressed. Only applies if it is the main button inside of a fab containing a fab list.
    */
  /* CompleteClass */
  var closeIcon: String = js.native
  
  /**
    * If `true`, the user cannot interact with the fab button.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Emitted when the button loses focus.
    */
  var ionBlur: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the button has focus.
    */
  var ionFocus: EventEmitter[CustomEvent] = js.native
  
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  var routerDirection: RouterDirection = js.native
  
  /**
    * If `true`, the fab button will show when in a fab-list.
    */
  /* CompleteClass */
  var show: Boolean = js.native
  
  /**
    * If `true`, the fab button will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  /* CompleteClass */
  var translucent: Boolean = js.native
  
  /**
    * The type of the button.
    */
  /* CompleteClass */
  var `type`: submit | reset | button = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonFabButton {
  
  @JSImport("@ionic/angular/directives/proxies", "IonFabButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonFabButton.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonFabButton, 
    `ion-fab-button`, 
    scala.Nothing, 
    CloseIcon, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonFabButton, 
      `ion-fab-button`, 
      scala.Nothing, 
      CloseIcon, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonFabButton.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonFabButton, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonFabButton, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

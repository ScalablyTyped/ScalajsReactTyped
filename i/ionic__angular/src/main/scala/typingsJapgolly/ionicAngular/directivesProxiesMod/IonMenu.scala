package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.ContentId
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-menu`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonMenu")
@js.native
open class IonMenu protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonMenu {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Emitted when the menu is closed.
    */
  var ionDidClose: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the menu is open.
    */
  var ionDidOpen: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the menu is about to be closed.
    */
  var ionWillClose: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the menu is about to be opened.
    */
  var ionWillOpen: EventEmitter[CustomEvent] = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonMenu {
  
  @JSImport("@ionic/angular/directives/proxies", "IonMenu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonMenu.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonMenu, 
    `ion-menu`, 
    scala.Nothing, 
    ContentId, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonMenu, 
      `ion-menu`, 
      scala.Nothing, 
      ContentId, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonMenu.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonMenu, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonMenu, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

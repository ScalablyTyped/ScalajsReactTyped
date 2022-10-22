package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
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

@JSImport("@ionic/angular/directives/proxies", "IonContent")
@js.native
open class IonContent protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonContent {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Emitted while scrolling. This event is disabled by default.
    Set `scrollEvents` to `true` to enable.
    */
  var ionScroll: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the scroll has ended. This event is disabled by default.
    Set `scrollEvents` to `true` to enable.
    */
  var ionScrollEnd: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the scroll has started. This event is disabled by default.
    Set `scrollEvents` to `true` to enable.
    */
  var ionScrollStart: EventEmitter[CustomEvent] = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonContent {
  
  @JSImport("@ionic/angular/directives/proxies", "IonContent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonContent.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonContent, 
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
      IonContent, 
      `ion-content`, 
      scala.Nothing, 
      ForceOverscroll, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonContent.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonContent, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonContent, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

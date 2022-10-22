package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.Animation
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-nav`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonNav")
@js.native
open class IonNav protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonNav {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Event fired when the nav has changed components
    */
  var ionNavDidChange: EventEmitter[CustomEvent] = js.native
  
  /**
    * Event fired when the nav will change components
    */
  var ionNavWillChange: EventEmitter[CustomEvent] = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonNav {
  
  @JSImport("@ionic/angular/directives/proxies", "IonNav")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonNav.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonNav, 
    `ion-nav`, 
    scala.Nothing, 
    Animation, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonNav, 
      `ion-nav`, 
      scala.Nothing, 
      Animation, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonNav.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonNav, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonNav, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

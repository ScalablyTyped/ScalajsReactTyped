package typingsJapgolly.ionicAngular

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.TemplateRef
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.BackdropBreakpoint
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-modal`
import typingsJapgolly.ionicAngular.ionicAngularStrings.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesOverlaysModalMod {
  
  @JSImport("@ionic/angular/directives/overlays/modal", "IonModal")
  @js.native
  open class IonModal protected ()
    extends StObject
       with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonModal {
    def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
    
    /**
      * Emitted after the modal has dismissed. Shorthand for ionModalDidDismiss.
      */
    var didDismiss: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted after the modal has presented. Shorthand for ionModalWillDismiss.
      */
    var didPresent: EventEmitter[CustomEvent] = js.native
    
    /* protected */ var el: HTMLElement = js.native
    
    /**
      * Emitted after the modal breakpoint has changed.
      */
    var ionBreakpointDidChange: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted after the modal has dismissed.
      */
    var ionModalDidDismiss: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted after the modal has presented.
      **/
    var ionModalDidPresent: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted before the modal has dismissed.
      */
    var ionModalWillDismiss: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted before the modal has presented.
      */
    var ionModalWillPresent: EventEmitter[CustomEvent] = js.native
    
    var isCmpOpen: Boolean = js.native
    
    var template: TemplateRef[Any] = js.native
    
    /**
      * Emitted before the modal has dismissed. Shorthand for ionModalWillDismiss.
      */
    var willDismiss: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted before the modal has presented. Shorthand for ionModalWillPresent.
      */
    var willPresent: EventEmitter[CustomEvent] = js.native
    
    /* protected */ var z: NgZone = js.native
  }
  /* static members */
  object IonModal {
    
    @JSImport("@ionic/angular/directives/overlays/modal", "IonModal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/overlays/modal", "IonModal.\u0275cmp")
    @js.native
    def ɵcmp: ɵɵComponentDeclaration[
        IonModal, 
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
          IonModal, 
          `ion-modal`, 
          scala.Nothing, 
          BackdropBreakpoint, 
          js.Object, 
          js.Array[template], 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/overlays/modal", "IonModal.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IonModal, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonModal, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}

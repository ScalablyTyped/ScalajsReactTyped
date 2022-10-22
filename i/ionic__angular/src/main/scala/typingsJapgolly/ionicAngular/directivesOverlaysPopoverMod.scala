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
import typingsJapgolly.ionicAngular.anon.Alignment
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-popover`
import typingsJapgolly.ionicAngular.ionicAngularStrings.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesOverlaysPopoverMod {
  
  @JSImport("@ionic/angular/directives/overlays/popover", "IonPopover")
  @js.native
  open class IonPopover protected ()
    extends StObject
       with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonPopover {
    def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
    
    /**
      * Emitted after the popover has dismissed. Shorthand for ionPopoverDidDismiss.
      */
    var didDismiss: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted after the popover has presented. Shorthand for ionPopoverWillDismiss.
      */
    var didPresent: EventEmitter[CustomEvent] = js.native
    
    /* protected */ var el: HTMLElement = js.native
    
    /**
      * Emitted after the popover has dismissed.
      */
    var ionPopoverDidDismiss: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted after the popover has presented.
      */
    var ionPopoverDidPresent: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted after the popover has dismissed.
      */
    var ionPopoverWillDismiss: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted before the popover has presented.
      */
    var ionPopoverWillPresent: EventEmitter[CustomEvent] = js.native
    
    var isCmpOpen: Boolean = js.native
    
    var template: TemplateRef[Any] = js.native
    
    /**
      * Emitted after the popover has presented. Shorthand for ionPopoverWillDismiss.
      */
    var willDismiss: EventEmitter[CustomEvent] = js.native
    
    /**
      * Emitted before the popover has presented. Shorthand for ionPopoverWillPresent.
      */
    var willPresent: EventEmitter[CustomEvent] = js.native
    
    /* protected */ var z: NgZone = js.native
  }
  /* static members */
  object IonPopover {
    
    @JSImport("@ionic/angular/directives/overlays/popover", "IonPopover")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/overlays/popover", "IonPopover.\u0275cmp")
    @js.native
    def ɵcmp: ɵɵComponentDeclaration[
        IonPopover, 
        `ion-popover`, 
        scala.Nothing, 
        Alignment, 
        js.Object, 
        js.Array[template], 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵcmp_=(
      x: ɵɵComponentDeclaration[
          IonPopover, 
          `ion-popover`, 
          scala.Nothing, 
          Alignment, 
          js.Object, 
          js.Array[template], 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/overlays/popover", "IonPopover.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IonPopover, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonPopover, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}

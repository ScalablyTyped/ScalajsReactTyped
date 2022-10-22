package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.directivesControlValueAccessorsValueAccessorMod.ValueAccessor
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesControlValueAccessorsSelectValueAccessorMod {
  
  @JSImport("@ionic/angular/directives/control-value-accessors/select-value-accessor", "SelectValueAccessorDirective")
  @js.native
  open class SelectValueAccessorDirective protected () extends ValueAccessor {
    def this(injector: Injector, el: ElementRef[Any]) = this()
    
    def _handleChangeEvent(el: Any): Unit = js.native
  }
  /* static members */
  object SelectValueAccessorDirective {
    
    @JSImport("@ionic/angular/directives/control-value-accessors/select-value-accessor", "SelectValueAccessorDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/control-value-accessors/select-value-accessor", "SelectValueAccessorDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        SelectValueAccessorDirective, 
        /* ion-range, ion-select, ion-radio-group, ion-segment, ion-datetime */ String, 
        scala.Nothing, 
        js.Object, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          SelectValueAccessorDirective, 
          /* ion-range, ion-select, ion-radio-group, ion-segment, ion-datetime */ String, 
          scala.Nothing, 
          js.Object, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/control-value-accessors/select-value-accessor", "SelectValueAccessorDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[SelectValueAccessorDirective, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[SelectValueAccessorDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}

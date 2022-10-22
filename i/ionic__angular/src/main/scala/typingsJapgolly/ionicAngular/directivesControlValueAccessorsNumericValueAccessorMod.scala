package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.directivesControlValueAccessorsValueAccessorMod.ValueAccessor
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-input[typeEqualssignnumber]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesControlValueAccessorsNumericValueAccessorMod {
  
  @JSImport("@ionic/angular/directives/control-value-accessors/numeric-value-accessor", "NumericValueAccessorDirective")
  @js.native
  open class NumericValueAccessorDirective protected () extends ValueAccessor {
    def this(injector: Injector, el: ElementRef[Any]) = this()
    
    def _handleIonChange(el: Any): Unit = js.native
  }
  /* static members */
  object NumericValueAccessorDirective {
    
    @JSImport("@ionic/angular/directives/control-value-accessors/numeric-value-accessor", "NumericValueAccessorDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/control-value-accessors/numeric-value-accessor", "NumericValueAccessorDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        NumericValueAccessorDirective, 
        `ion-input[typeEqualssignnumber]`, 
        scala.Nothing, 
        js.Object, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          NumericValueAccessorDirective, 
          `ion-input[typeEqualssignnumber]`, 
          scala.Nothing, 
          js.Object, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/control-value-accessors/numeric-value-accessor", "NumericValueAccessorDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[NumericValueAccessorDirective, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[NumericValueAccessorDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}

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

object directivesControlValueAccessorsTextValueAccessorMod {
  
  @JSImport("@ionic/angular/directives/control-value-accessors/text-value-accessor", "TextValueAccessorDirective")
  @js.native
  open class TextValueAccessorDirective protected () extends ValueAccessor {
    def this(injector: Injector, el: ElementRef[Any]) = this()
    
    def _handleInputEvent(el: Any): Unit = js.native
  }
  /* static members */
  object TextValueAccessorDirective {
    
    @JSImport("@ionic/angular/directives/control-value-accessors/text-value-accessor", "TextValueAccessorDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/control-value-accessors/text-value-accessor", "TextValueAccessorDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        TextValueAccessorDirective, 
        /* ion-input:not([type=number]),ion-textarea,ion-searchbar */ String, 
        scala.Nothing, 
        js.Object, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          TextValueAccessorDirective, 
          /* ion-input:not([type=number]),ion-textarea,ion-searchbar */ String, 
          scala.Nothing, 
          js.Object, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/control-value-accessors/text-value-accessor", "TextValueAccessorDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[TextValueAccessorDirective, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[TextValueAccessorDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}

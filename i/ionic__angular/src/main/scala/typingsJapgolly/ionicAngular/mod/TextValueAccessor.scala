package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.directivesControlValueAccessorsTextValueAccessorMod.TextValueAccessorDirective
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "TextValueAccessor")
@js.native
open class TextValueAccessor protected () extends TextValueAccessorDirective {
  def this(injector: Injector, el: ElementRef[Any]) = this()
}
/* static members */
object TextValueAccessor {
  
  @JSImport("@ionic/angular", "TextValueAccessor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "TextValueAccessor.\u0275dir")
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
  
  @JSImport("@ionic/angular", "TextValueAccessor.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[TextValueAccessorDirective, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[TextValueAccessorDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.directivesControlValueAccessorsBooleanValueAccessorMod.BooleanValueAccessorDirective
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-checkboxCommaion-toggle`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "BooleanValueAccessor")
@js.native
open class BooleanValueAccessor protected () extends BooleanValueAccessorDirective {
  def this(injector: Injector, el: ElementRef[Any]) = this()
}
/* static members */
object BooleanValueAccessor {
  
  @JSImport("@ionic/angular", "BooleanValueAccessor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "BooleanValueAccessor.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    BooleanValueAccessorDirective, 
    `ion-checkboxCommaion-toggle`, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      BooleanValueAccessorDirective, 
      `ion-checkboxCommaion-toggle`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "BooleanValueAccessor.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[BooleanValueAccessorDirective, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[BooleanValueAccessorDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

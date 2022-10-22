package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.directivesControlValueAccessorsRadioValueAccessorMod.RadioValueAccessorDirective
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-radio`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "RadioValueAccessor")
@js.native
open class RadioValueAccessor protected () extends RadioValueAccessorDirective {
  def this(injector: Injector, el: ElementRef[Any]) = this()
}
/* static members */
object RadioValueAccessor {
  
  @JSImport("@ionic/angular", "RadioValueAccessor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "RadioValueAccessor.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    RadioValueAccessorDirective, 
    `ion-radio`, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      RadioValueAccessorDirective, 
      `ion-radio`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "RadioValueAccessor.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RadioValueAccessorDirective, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RadioValueAccessorDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

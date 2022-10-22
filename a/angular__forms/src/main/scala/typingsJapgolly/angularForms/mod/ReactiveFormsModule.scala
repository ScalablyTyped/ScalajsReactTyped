package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.ModuleWithProviders
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectorDeclaration
import typingsJapgolly.angularCore.mod.ɵɵNgModuleDeclaration
import typingsJapgolly.angularForms.anon.TypeofFormArrayName
import typingsJapgolly.angularForms.anon.TypeofFormControlDirectiv
import typingsJapgolly.angularForms.anon.TypeofFormControlName
import typingsJapgolly.angularForms.anon.TypeofFormGroupDirective
import typingsJapgolly.angularForms.anon.TypeofFormGroupName
import typingsJapgolly.angularForms.anon.TypeofɵInternalFormsShare
import typingsJapgolly.angularForms.anon.WarnOnNgModelWithFormControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "ReactiveFormsModule")
@js.native
open class ReactiveFormsModule () extends StObject
/* static members */
object ReactiveFormsModule {
  
  @JSImport("@angular/forms", "ReactiveFormsModule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @description
    * Provides options for configuring the reactive forms module.
    *
    * @param opts An object of configuration options
    * * `warnOnNgModelWithFormControl` Configures when to emit a warning when an `ngModel`
    * binding is used with reactive form directives.
    */
  inline def withConfig(opts: WarnOnNgModelWithFormControl): ModuleWithProviders[ReactiveFormsModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(opts.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[ReactiveFormsModule]]
  
  @JSImport("@angular/forms", "ReactiveFormsModule.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ReactiveFormsModule, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ReactiveFormsModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "ReactiveFormsModule.\u0275inj")
  @js.native
  def ɵinj: ɵɵInjectorDeclaration[ReactiveFormsModule] = js.native
  inline def ɵinj_=(x: ɵɵInjectorDeclaration[ReactiveFormsModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "ReactiveFormsModule.\u0275mod")
  @js.native
  def ɵmod: ɵɵNgModuleDeclaration[
    ReactiveFormsModule, 
    js.Tuple5[
      TypeofFormControlDirectiv, 
      TypeofFormGroupDirective, 
      TypeofFormControlName, 
      TypeofFormGroupName, 
      TypeofFormArrayName
    ], 
    scala.Nothing, 
    js.Tuple6[
      TypeofɵInternalFormsShare, 
      TypeofFormControlDirectiv, 
      TypeofFormGroupDirective, 
      TypeofFormControlName, 
      TypeofFormGroupName, 
      TypeofFormArrayName
    ]
  ] = js.native
  inline def ɵmod_=(
    x: ɵɵNgModuleDeclaration[
      ReactiveFormsModule, 
      js.Tuple5[
        TypeofFormControlDirectiv, 
        TypeofFormGroupDirective, 
        TypeofFormControlName, 
        TypeofFormGroupName, 
        TypeofFormArrayName
      ], 
      scala.Nothing, 
      js.Tuple6[
        TypeofɵInternalFormsShare, 
        TypeofFormControlDirectiv, 
        TypeofFormGroupDirective, 
        TypeofFormControlName, 
        TypeofFormGroupName, 
        TypeofFormArrayName
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
}

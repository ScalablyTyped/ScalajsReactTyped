package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.`[formControlName]Comma[ngModel]Comma[formControl]`
import typingsJapgolly.angularForms.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgControlStatus")
@js.native
open class NgControlStatus protected ()
  extends StObject
     with AbstractControlStatus {
  def this(cd: NgControl) = this()
}
/* static members */
object NgControlStatus {
  
  @JSImport("@angular/forms", "NgControlStatus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "NgControlStatus.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgControlStatus, 
    `[formControlName]Comma[ngModel]Comma[formControl]`, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgControlStatus, 
      `[formControlName]Comma[ngModel]Comma[formControl]`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "NgControlStatus.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgControlStatus, js.Array[`4`]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgControlStatus, js.Array[`4`]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

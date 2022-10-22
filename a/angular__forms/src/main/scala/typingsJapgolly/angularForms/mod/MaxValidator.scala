package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "MaxValidator")
@js.native
open class MaxValidator ()
  extends StObject
     with AbstractValidatorDirective {
  
  /* private */ /* CompleteClass */
  var _onChange: Any = js.native
  
  /* private */ /* CompleteClass */
  var _validator: Any = js.native
  
  /**
    * @description
    * Determines whether this validator should be active or not based on an input.
    * Base class implementation checks whether an input is defined (if the value is different from
    * `null` and `undefined`). Validator classes that extend this base class can override this
    * function with the logic specific to a particular validator directive.
    */
  /* CompleteClass */
  override def enabled(input: Any): Boolean = js.native
  
  /**
    * @description
    * Tracks changes to the max bound to this directive.
    */
  var max: String | Double | Null = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /** @nodoc */
  /* CompleteClass */
  @JSName("registerOnValidatorChange")
  override def registerOnValidatorChange_MAbstractValidatorDirective(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * @description
    * Method that performs synchronous validation against the provided control.
    *
    * @param control The control to validate against.
    *
    * @returns A map of validation errors if validation fails,
    * otherwise null.
    */
  /* CompleteClass */
  override def validate(control: AbstractControl[Any, Any]): ValidationErrors | Null = js.native
}
/* static members */
object MaxValidator {
  
  @JSImport("@angular/forms", "MaxValidator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "MaxValidator.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    MaxValidator, 
    /* input[type=number][max][formControlName],input[type=number][max][formControl],input[type=number][max][ngModel] */ String, 
    scala.Nothing, 
    Max, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      MaxValidator, 
      /* input[type=number][max][formControlName],input[type=number][max][formControl],input[type=number][max][ngModel] */ String, 
      scala.Nothing, 
      Max, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "MaxValidator.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[MaxValidator, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[MaxValidator, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}

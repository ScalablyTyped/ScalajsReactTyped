package typingsJapgolly.formstate

import typingsJapgolly.formstate.libCoreFormStateLazyMod.ValidatableArray
import typingsJapgolly.formstate.libCoreFormStateMod.ValidatableMapOrArray
import typingsJapgolly.formstate.libCoreTypesMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formstate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formstate", "FieldState")
  @js.native
  open class FieldState[TValue] protected ()
    extends typingsJapgolly.formstate.libCoreFieldStateMod.FieldState[TValue] {
    def this(_initValue: TValue) = this()
  }
  
  @JSImport("formstate", "FormState")
  @js.native
  open class FormState[TValue /* <: ValidatableMapOrArray */] protected ()
    extends typingsJapgolly.formstate.libCoreFormStateMod.FormState[TValue] {
    def this(/**
      * SubItems can be any Validatable
      */
    $: TValue) = this()
  }
  
  @JSImport("formstate", "FormStateLazy")
  @js.native
  open class FormStateLazy[TValue /* <: ValidatableArray */] protected ()
    extends typingsJapgolly.formstate.libCoreFormStateLazyMod.FormStateLazy[TValue] {
    def this(/** It is a function as fields can change over time */
    getFields: js.Function0[TValue]) = this()
  }
  
  inline def applyValidators[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyValidators")(value.asInstanceOf[js.Any], validators.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String | Null]]]
}

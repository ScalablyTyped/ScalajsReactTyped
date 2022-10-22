package typingsJapgolly.rcFieldForm

import typingsJapgolly.rcFieldForm.esInterfaceMod.InternalNamePath
import typingsJapgolly.rcFieldForm.esInterfaceMod.RuleError
import typingsJapgolly.rcFieldForm.esInterfaceMod.RuleObject
import typingsJapgolly.rcFieldForm.esInterfaceMod.StoreValue
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateOptions
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.parallel
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsValidateUtilMod {
  
  @JSImport("rc-field-form/es/utils/validateUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  inline def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any], messageVariables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  
  inline def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: parallel
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  inline def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: parallel,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any], messageVariables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
}

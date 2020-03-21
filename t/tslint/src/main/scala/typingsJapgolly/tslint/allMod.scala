package typingsJapgolly.tslint

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/configs/all", JSImport.Namespace)
@js.native
object allMod extends js.Object {
  val RULES_EXCLUDED_FROM_ALL_CONFIG: js.Array[String] = js.native
  @js.native
  object jsRules
    extends /* key */ StringDictionary[js.Any]
  
  @js.native
  object rules extends js.Object {
    var `adjacent-overload-signatures`: Boolean = js.native
    var align: AnonOptionsArray = js.native
    var `array-type`: AnonOptionsString = js.native
    var `arrow-parens`: Boolean = js.native
    var `arrow-return-shorthand`: AnonOptionsString = js.native
    var `await-promise`: Boolean = js.native
    var `ban-comma-operator`: Boolean = js.native
    var `ban-ts-ignore`: Boolean = js.native
    var `ban-types`: AnonOptions = js.native
    var `binary-expression-operand-order`: Boolean = js.native
    var `callable-types`: Boolean = js.native
    var `class-name`: Boolean = js.native
    var `comment-format`: AnonOptionsArray = js.native
    var `comment-type`: AnonOptionsArray = js.native
    var `completed-docs`: Boolean = js.native
    var curly: Boolean = js.native
    var `cyclomatic-complexity`: Boolean = js.native
    var deprecation: Boolean = js.native
    var encoding: Boolean = js.native
    var eofline: Boolean = js.native
    var `file-name-casing`: AnonOptionsString = js.native
    var forin: Boolean = js.native
    var `function-constructor`: Boolean = js.native
    var `import-spacing`: Boolean = js.native
    var `increment-decrement`: Boolean = js.native
    var indent: AnonOptionsArray = js.native
    var `interface-name`: Boolean = js.native
    var `interface-over-type-literal`: Boolean = js.native
    var `invalid-void`: Boolean = js.native
    var `jsdoc-format`: AnonOptionsString = js.native
    var `label-position`: Boolean = js.native
    var `linebreak-style`: AnonOptionsString = js.native
    var `match-default-export-name`: Boolean = js.native
    var `max-classes-per-file`: AnonOptionsNumber = js.native
    var `max-file-line-count`: AnonOptionsNumber = js.native
    var `max-line-length`: AnonOptionsAnonLimit = js.native
    var `member-access`: AnonOptionsArray = js.native
    var `member-ordering`: AnonOptionsAnonAlphabetize = js.native
    var `new-parens`: Boolean = js.native
    var `newline-before-return`: Boolean = js.native
    var `newline-per-chained-call`: Boolean = js.native
    var `no-angle-bracket-type-assertion`: Boolean = js.native
    var `no-any`: Boolean = js.native
    var `no-arg`: Boolean = js.native
    var `no-async-without-await`: Boolean = js.native
    var `no-bitwise`: Boolean = js.native
    var `no-boolean-literal-compare`: Boolean = js.native
    var `no-conditional-assignment`: Boolean = js.native
    var `no-consecutive-blank-lines`: Boolean = js.native
    var `no-console`: Boolean = js.native
    var `no-construct`: Boolean = js.native
    var `no-debugger`: Boolean = js.native
    var `no-default-export`: Boolean = js.native
    var `no-default-import`: Boolean = js.native
    var `no-duplicate-imports`: Boolean = js.native
    var `no-duplicate-super`: Boolean = js.native
    var `no-duplicate-switch-case`: Boolean = js.native
    var `no-duplicate-variable`: AnonOptionsArray = js.native
    var `no-dynamic-delete`: Boolean = js.native
    var `no-empty`: Boolean = js.native
    var `no-empty-interface`: Boolean = js.native
    var `no-eval`: Boolean = js.native
    var `no-floating-promises`: Boolean = js.native
    var `no-for-in`: Boolean = js.native
    var `no-for-in-array`: Boolean = js.native
    var `no-implicit-dependencies`: Boolean = js.native
    var `no-import-side-effect`: Boolean = js.native
    var `no-inferrable-types`: AnonOptionsArray = js.native
    var `no-inferred-empty-object-type`: Boolean = js.native
    var `no-internal-module`: Boolean = js.native
    var `no-invalid-template-strings`: Boolean = js.native
    var `no-irregular-whitespace`: Boolean = js.native
    var `no-magic-numbers`: Boolean = js.native
    var `no-mergeable-namespace`: Boolean = js.native
    var `no-misused-new`: Boolean = js.native
    var `no-namespace`: Boolean = js.native
    var `no-non-null-assertion`: Boolean = js.native
    var `no-null-keyword`: Boolean = js.native
    var `no-null-undefined-union`: Boolean = js.native
    var `no-object-literal-type-assertion`: Boolean = js.native
    var `no-parameter-properties`: Boolean = js.native
    var `no-parameter-reassignment`: Boolean = js.native
    var `no-promise-as-boolean`: Boolean = js.native
    var `no-redundant-jsdoc`: Boolean = js.native
    var `no-reference`: Boolean = js.native
    var `no-reference-import`: Boolean = js.native
    var `no-require-imports`: Boolean = js.native
    var `no-restricted-globals`: Boolean = js.native
    var `no-return-await`: Boolean = js.native
    var `no-shadowed-variable`: Boolean = js.native
    var `no-sparse-arrays`: Boolean = js.native
    var `no-string-literal`: Boolean = js.native
    var `no-string-throw`: Boolean = js.native
    var `no-submodule-imports`: Boolean = js.native
    var `no-tautology-expression`: Boolean = js.native
    var `no-this-assignment`: Boolean = js.native
    var `no-trailing-whitespace`: Boolean = js.native
    var `no-unbound-method`: Boolean = js.native
    var `no-unnecessary-callback-wrapper`: Boolean = js.native
    var `no-unnecessary-class`: AnonOptionsArray = js.native
    var `no-unnecessary-initializer`: Boolean = js.native
    var `no-unnecessary-qualifier`: Boolean = js.native
    var `no-unnecessary-type-assertion`: Boolean = js.native
    var `no-unsafe-any`: Boolean = js.native
    var `no-unsafe-finally`: Boolean = js.native
    var `no-unused-expression`: Boolean = js.native
    var `no-use-before-declare`: Boolean = js.native
    var `no-var-keyword`: Boolean = js.native
    var `no-var-requires`: Boolean = js.native
    var `no-void-expression`: Boolean = js.native
    var `number-literal-format`: Boolean = js.native
    var `object-literal-key-quotes`: AnonOptionsString = js.native
    var `object-literal-shorthand`: Boolean = js.native
    var `object-literal-sort-keys`: Boolean = js.native
    var `one-line`: AnonOptionsArray = js.native
    var `one-variable-per-declaration`: Boolean = js.native
    var `only-arrow-functions`: Boolean = js.native
    var `ordered-imports`: AnonOptionsAnonGroupedimports = js.native
    var `prefer-conditional-expression`: Boolean = js.native
    var `prefer-const`: Boolean = js.native
    var `prefer-for-of`: Boolean = js.native
    var `prefer-function-over-method`: Boolean = js.native
    var `prefer-method-signature`: Boolean = js.native
    var `prefer-object-spread`: Boolean = js.native
    var `prefer-readonly`: Boolean = js.native
    var `prefer-switch`: Boolean = js.native
    var `prefer-template`: Boolean = js.native
    var `prefer-while`: Boolean = js.native
    var `promise-function-async`: Boolean = js.native
    var quotemark: AnonOptionsArray = js.native
    var radix: Boolean = js.native
    var `restrict-plus-operands`: Boolean = js.native
    var `return-undefined`: Boolean = js.native
    var semicolon: AnonOptionsArray = js.native
    var `space-before-function-paren`: AnonOptionsAnonAnonymous = js.native
    var `space-within-parens`: AnonOptionsNumber = js.native
    var `static-this`: Boolean = js.native
    var `strict-boolean-expressions`: Boolean = js.native
    var `strict-comparisons`: Boolean = js.native
    var `strict-string-expressions`: Boolean = js.native
    var `strict-type-predicates`: Boolean = js.native
    var `switch-default`: Boolean = js.native
    var `switch-final-break`: Boolean = js.native
    var `trailing-comma`: AnonOptionsAnonEsSpecCompliant = js.native
    var `triple-equals`: Boolean = js.native
    var `type-literal-delimiter`: Boolean = js.native
    var typedef: AnonOptionsArray = js.native
    var `typedef-whitespace`: Anon0 = js.native
    var `unified-signatures`: Boolean = js.native
    var `unnecessary-bind`: Boolean = js.native
    var `unnecessary-constructor`: Boolean = js.native
    var `unnecessary-else`: Boolean = js.native
    var `use-default-type-parameter`: Boolean = js.native
    var `use-isnan`: Boolean = js.native
    var `variable-name`: AnonOptionsArray = js.native
    var whitespace: AnonOptionsArray = js.native
  }
  
}


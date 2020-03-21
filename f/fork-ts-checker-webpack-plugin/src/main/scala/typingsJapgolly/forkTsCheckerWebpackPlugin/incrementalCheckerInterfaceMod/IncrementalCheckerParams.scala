package typingsJapgolly.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forkTsCheckerWebpackPlugin.AnonGetFormattedLints
import typingsJapgolly.forkTsCheckerWebpackPlugin.Typeofts
import typingsJapgolly.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import typingsJapgolly.std.ReturnType
import typingsJapgolly.tslint.mod.RuleFailure
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.ModuleResolutionHost
import typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementalCheckerParams extends ApiIncrementalCheckerParams {
  var vue: Boolean
  var watchPaths: js.Array[String]
  var workDivision: Double
  var workNumber: Double
}

object IncrementalCheckerParams {
  @scala.inline
  def apply(
    checkSyntacticErrors: Boolean,
    compilerOptions: CompilerOptions,
    context: String,
    createNormalizedMessageFromDiagnostic: Diagnostic => CallbackTo[NormalizedMessage],
    createNormalizedMessageFromRuleFailure: RuleFailure => CallbackTo[NormalizedMessage],
    linterAutoFix: Boolean,
    linterConfigFile: String | Boolean,
    programConfigFile: String,
    typescript: Typeofts,
    vue: Boolean,
    watchPaths: js.Array[String],
    workDivision: Double,
    workNumber: Double,
    eslinter: ReturnType[js.Function1[/* eslintOptions */ js.Object, AnonGetFormattedLints]] = null,
    resolveModuleName: (/* typescript */ Typeofts, /* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => CallbackTo[ResolvedModuleWithFailedLookupLocations] = null,
    resolveTypeReferenceDirective: (/* typescript */ Typeofts, /* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => CallbackTo[ResolvedTypeReferenceDirectiveWithFailedLookupLocations] = null
  ): IncrementalCheckerParams = {
    val __obj = js.Dynamic.literal(checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], linterAutoFix = linterAutoFix.asInstanceOf[js.Any], linterConfigFile = linterConfigFile.asInstanceOf[js.Any], programConfigFile = programConfigFile.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any], watchPaths = watchPaths.asInstanceOf[js.Any], workDivision = workDivision.asInstanceOf[js.Any], workNumber = workNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("createNormalizedMessageFromDiagnostic")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.Diagnostic) => createNormalizedMessageFromDiagnostic(t0).runNow()))
    __obj.updateDynamic("createNormalizedMessageFromRuleFailure")(js.Any.fromFunction1((t0: typingsJapgolly.tslint.mod.RuleFailure) => createNormalizedMessageFromRuleFailure(t0).runNow()))
    if (eslinter != null) __obj.updateDynamic("eslinter")(eslinter.asInstanceOf[js.Any])
    if (resolveModuleName != null) __obj.updateDynamic("resolveModuleName")(js.Any.fromFunction5((t0: /* typescript */ typingsJapgolly.forkTsCheckerWebpackPlugin.Typeofts, t1: /* moduleName */ java.lang.String, t2: /* containingFile */ java.lang.String, t3: /* compilerOptions */ typingsJapgolly.typescript.mod.CompilerOptions, t4: /* moduleResolutionHost */ typingsJapgolly.typescript.mod.ModuleResolutionHost) => resolveModuleName(t0, t1, t2, t3, t4).runNow()))
    if (resolveTypeReferenceDirective != null) __obj.updateDynamic("resolveTypeReferenceDirective")(js.Any.fromFunction5((t0: /* typescript */ typingsJapgolly.forkTsCheckerWebpackPlugin.Typeofts, t1: /* typeDirectiveName */ java.lang.String, t2: /* containingFile */ java.lang.String, t3: /* compilerOptions */ typingsJapgolly.typescript.mod.CompilerOptions, t4: /* moduleResolutionHost */ typingsJapgolly.typescript.mod.ModuleResolutionHost) => resolveTypeReferenceDirective(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IncrementalCheckerParams]
  }
}


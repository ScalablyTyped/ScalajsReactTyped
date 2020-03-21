package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
class ImmutableCompilationSettings protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings {
  def this(
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    watch: Boolean,
    noResolve: Boolean,
    allowAutomaticSemicolonInsertion: Boolean,
    noImplicitAny: Boolean,
    noLib: Boolean,
    codeGenTarget: typingsJapgolly.typescriptServices.TypeScript.LanguageVersion,
    moduleGenTarget: typingsJapgolly.typescriptServices.TypeScript.ModuleGenTarget,
    outFileOption: String,
    outDirOption: String,
    mapSourceFiles: Boolean,
    mapRoot: String,
    sourceRoot: String,
    generateDeclarationFiles: Boolean,
    useCaseSensitiveFileResolution: Boolean,
    gatherDiagnostics: Boolean,
    codepage: Double,
    createFileLog: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
object ImmutableCompilationSettings extends js.Object {
  var _defaultSettings: js.Any = js.native
  def defaultSettings(): typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
  def fromCompilationSettings(settings: typingsJapgolly.typescriptServices.TypeScript.CompilationSettings): typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
}


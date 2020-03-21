package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProgramOptions extends js.Object {
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  var host: js.UndefOr[CompilerHost] = js.undefined
  var oldProgram: js.UndefOr[Program] = js.undefined
  var options: CompilerOptions
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.undefined
  var rootNames: js.Array[java.lang.String]
}

object CreateProgramOptions {
  @scala.inline
  def apply(
    options: CompilerOptions,
    rootNames: js.Array[java.lang.String],
    configFileParsingDiagnostics: js.Array[Diagnostic] = null,
    host: CompilerHost = null,
    oldProgram: Program = null,
    projectReferences: js.Array[ProjectReference] = null
  ): CreateProgramOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    if (configFileParsingDiagnostics != null) __obj.updateDynamic("configFileParsingDiagnostics")(configFileParsingDiagnostics.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (oldProgram != null) __obj.updateDynamic("oldProgram")(oldProgram.asInstanceOf[js.Any])
    if (projectReferences != null) __obj.updateDynamic("projectReferences")(projectReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgramOptions]
  }
}


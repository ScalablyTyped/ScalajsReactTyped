package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranspileOptions extends js.Object {
  var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var moduleName: js.UndefOr[String] = js.undefined
  var renamedDependencies: js.UndefOr[MapLike[String]] = js.undefined
  var reportDiagnostics: js.UndefOr[Boolean] = js.undefined
  var transformers: js.UndefOr[CustomTransformers] = js.undefined
}

object TranspileOptions {
  @scala.inline
  def apply(
    compilerOptions: CompilerOptions = null,
    fileName: String = null,
    moduleName: String = null,
    renamedDependencies: MapLike[String] = null,
    reportDiagnostics: js.UndefOr[Boolean] = js.undefined,
    transformers: CustomTransformers = null
  ): TranspileOptions = {
    val __obj = js.Dynamic.literal()
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName.asInstanceOf[js.Any])
    if (renamedDependencies != null) __obj.updateDynamic("renamedDependencies")(renamedDependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(reportDiagnostics)) __obj.updateDynamic("reportDiagnostics")(reportDiagnostics.asInstanceOf[js.Any])
    if (transformers != null) __obj.updateDynamic("transformers")(transformers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranspileOptions]
  }
}


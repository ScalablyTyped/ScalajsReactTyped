package typingsJapgolly.gulpTypescript.projectMod

import typingsJapgolly.gulpTypescript.Typeofts
import typingsJapgolly.gulpTypescript.typesMod.FinalTransformers
import typingsJapgolly.gulpTypescript.typesMod.TsConfig
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/project", "setupProject")
@js.native
object setupProject extends js.Object {
  def apply(
    projectDirectory: String,
    configFileName: String,
    rawConfig: js.Any,
    config: TsConfig,
    options: CompilerOptions,
    projectReferences: js.Array[ProjectReference],
    typescript: Typeofts,
    finalTransformers: FinalTransformers
  ): Project = js.native
}


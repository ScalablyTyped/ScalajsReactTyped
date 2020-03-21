package typingsJapgolly.ionicCliFramework.mod

import typingsJapgolly.ionicCliFramework.completionMod.CompletionFormatterDeps
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.ICommand
import typingsJapgolly.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "CompletionFormatter")
@js.native
abstract class CompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
  extends typingsJapgolly.ionicCliFramework.libMod.CompletionFormatter[C, N, M, I, O] {
  def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
}


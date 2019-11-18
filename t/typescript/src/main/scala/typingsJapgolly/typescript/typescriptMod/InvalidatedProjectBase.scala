package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidatedProjectBase extends js.Object {
  val kind: InvalidatedProjectKind = js.native
  val project: ResolvedConfigFileName = js.native
  /**
    *  To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly
    */
  def done(): ExitStatus = js.native
  def done(cancellationToken: CancellationToken): ExitStatus = js.native
  def done(cancellationToken: CancellationToken, writeFile: WriteFileCallback): ExitStatus = js.native
  def done(
    cancellationToken: CancellationToken,
    writeFile: WriteFileCallback,
    customTransformers: CustomTransformers
  ): ExitStatus = js.native
  def getCompilerOptions(): CompilerOptions = js.native
  def getCurrentDirectory(): String = js.native
}


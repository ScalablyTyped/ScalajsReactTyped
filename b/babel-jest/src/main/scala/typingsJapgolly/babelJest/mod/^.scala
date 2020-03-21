package typingsJapgolly.babelJest.mod

import typingsJapgolly.babelCore.mod.TransformOptions
import typingsJapgolly.babelJest.babelJestBooleans.`true`
import typingsJapgolly.std.TransformStreamDefaultControllerCallback
import typingsJapgolly.std.TransformStreamDefaultControllerTransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-jest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var canInstrument: `true` = js.native
  var flush: js.UndefOr[TransformStreamDefaultControllerCallback[_]] = js.native
  var readableType: js.UndefOr[scala.Nothing] = js.native
  var start: js.UndefOr[TransformStreamDefaultControllerCallback[_]] = js.native
  var transform: js.UndefOr[TransformStreamDefaultControllerTransformCallback[_, _]] = js.native
  var writableType: js.UndefOr[scala.Nothing] = js.native
  def createTransformer(): BabelJestTransformer = js.native
  def createTransformer(options: TransformOptions): BabelJestTransformer = js.native
}


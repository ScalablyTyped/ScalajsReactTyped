package typingsJapgolly.plottable.commonsMod

import typingsJapgolly.plottable.datasetMod.Dataset
import typingsJapgolly.plottable.interfacesMod.IAccessor
import typingsJapgolly.plottable.interfacesMod.IRangeProjector
import typingsJapgolly.plottable.scaleMod.TransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransformableAccessorScaleBinding[D, R] extends js.Object {
  @JSName("accessor")
  var accessor_Original: IAccessor[_] = js.native
  var postScale: js.UndefOr[IRangeProjector[R]] = js.native
  var scale: js.UndefOr[TransformableScale[D, R]] = js.native
  def accessor(datum: js.Any, index: Double, dataset: Dataset): js.Any = js.native
}


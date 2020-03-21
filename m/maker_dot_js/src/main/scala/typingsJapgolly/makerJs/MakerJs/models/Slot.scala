package typingsJapgolly.makerJs.MakerJs.models

import typingsJapgolly.makerJs.MakerJs.IModel
import typingsJapgolly.makerJs.MakerJs.IModelMap
import typingsJapgolly.makerJs.MakerJs.IPathMap
import typingsJapgolly.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Slot")
@js.native
class Slot protected () extends IModel {
  def this(origin: IPoint, endPoint: IPoint, radius: Double) = this()
  def this(origin: IPoint, endPoint: IPoint, radius: Double, isolateCaps: Boolean) = this()
  @JSName("models")
  var models_Slot: IModelMap = js.native
  @JSName("origin")
  var origin_Slot: IPoint = js.native
  @JSName("paths")
  var paths_Slot: IPathMap = js.native
}


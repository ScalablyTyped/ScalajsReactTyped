package typingsJapgolly.agGrid.mainMod

import typingsJapgolly.agGrid.exportParamsMod.ExportParams
import typingsJapgolly.agGrid.gridSerializerMod.GridSerializingSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "BaseCreator")
@js.native
abstract class BaseCreator[T, S /* <: GridSerializingSession[T] */, P /* <: ExportParams[T] */] ()
  extends typingsJapgolly.agGrid.csvCreatorMod.BaseCreator[T, S, P]


package typingsJapgolly.agGrid.mainMod

import typingsJapgolly.agGrid.contextMod.ContextParams
import typingsJapgolly.agGrid.iLoggerMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "Context")
@js.native
class Context protected ()
  extends typingsJapgolly.agGrid.contextMod.Context {
  def this(params: ContextParams, logger: ILogger) = this()
}


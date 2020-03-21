package typingsJapgolly.semanticUiReact.gridGridMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.gridColumnMod.GridColumnProps
import typingsJapgolly.semanticUiReact.gridRowMod.GridRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridComponent extends FunctionComponent[GridProps] {
  var Column: StatelessComponent[GridColumnProps] = js.native
  var Row: StatelessComponent[GridRowProps] = js.native
}


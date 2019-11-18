package typingsJapgolly.d3DashTransition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashTransitionMod {
  import typingsJapgolly.d3DashSelection.d3DashSelectionMod.BaseType
  import typingsJapgolly.d3DashSelection.d3DashSelectionMod.Selection

  type SelectionOrTransition[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] = (Selection[GElement, Datum, PElement, PDatum]) | (Transition[GElement, Datum, PElement, PDatum])
}

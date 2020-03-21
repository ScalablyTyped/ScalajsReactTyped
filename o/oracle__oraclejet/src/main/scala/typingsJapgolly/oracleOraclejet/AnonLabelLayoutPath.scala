package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink
import typingsJapgolly.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelLayoutPath extends js.Object {
  def labelLayout(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): LabelLayout
  def path(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): String
}

object AnonLabelLayoutPath {
  @scala.inline
  def apply(
    labelLayout: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => CallbackTo[LabelLayout],
    path: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => CallbackTo[String]
  ): AnonLabelLayoutPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("labelLayout")(js.Any.fromFunction2((t0: typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext, t1: typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink) => labelLayout(t0, t1).runNow()))
    __obj.updateDynamic("path")(js.Any.fromFunction2((t0: typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext, t1: typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink) => path(t0, t1).runNow()))
    __obj.asInstanceOf[AnonLabelLayoutPath]
  }
}


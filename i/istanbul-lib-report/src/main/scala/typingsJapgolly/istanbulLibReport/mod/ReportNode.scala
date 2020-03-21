package typingsJapgolly.istanbulLibReport.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.istanbulLibCoverage.mod.CoverageSummary
import typingsJapgolly.istanbulLibCoverage.mod.FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportNode extends Node {
  var children: js.Array[ReportNode]
  var fileCoverage: FileCoverage
  var parent: ReportNode | Null
  var path: String
  def addChild(child: ReportNode): Unit
  def asRelative(p: String): String
  def getChildren(): js.Array[Node]
  def getCoverageSummary(filesOnly: Boolean): CoverageSummary
  def getFileCoverage(): FileCoverage
  def getParent(): Node
  def getQualifiedName(): String
  def getRelativeName(): String
  def isSummary(): Boolean
}

object ReportNode {
  @scala.inline
  def apply(
    addChild: ReportNode => Callback,
    asRelative: String => CallbackTo[String],
    children: js.Array[ReportNode],
    fileCoverage: FileCoverage,
    getChildren: CallbackTo[js.Array[Node]],
    getCoverageSummary: Boolean => CallbackTo[CoverageSummary],
    getFileCoverage: CallbackTo[FileCoverage],
    getParent: CallbackTo[Node],
    getQualifiedName: CallbackTo[String],
    getRelativeName: CallbackTo[String],
    isRoot: CallbackTo[Boolean],
    isSummary: CallbackTo[Boolean],
    path: String,
    visit: (Visitor[Node], js.Any) => Callback,
    parent: ReportNode = null
  ): ReportNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], fileCoverage = fileCoverage.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("addChild")(js.Any.fromFunction1((t0: typingsJapgolly.istanbulLibReport.mod.ReportNode) => addChild(t0).runNow()))
    __obj.updateDynamic("asRelative")(js.Any.fromFunction1((t0: java.lang.String) => asRelative(t0).runNow()))
    __obj.updateDynamic("getChildren")(getChildren.toJsFn)
    __obj.updateDynamic("getCoverageSummary")(js.Any.fromFunction1((t0: scala.Boolean) => getCoverageSummary(t0).runNow()))
    __obj.updateDynamic("getFileCoverage")(getFileCoverage.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getQualifiedName")(getQualifiedName.toJsFn)
    __obj.updateDynamic("getRelativeName")(getRelativeName.toJsFn)
    __obj.updateDynamic("isRoot")(isRoot.toJsFn)
    __obj.updateDynamic("isSummary")(isSummary.toJsFn)
    __obj.updateDynamic("visit")(js.Any.fromFunction2((t0: typingsJapgolly.istanbulLibReport.mod.Visitor[typingsJapgolly.istanbulLibReport.mod.Node], t1: js.Any) => visit(t0, t1).runNow()))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportNode]
  }
}


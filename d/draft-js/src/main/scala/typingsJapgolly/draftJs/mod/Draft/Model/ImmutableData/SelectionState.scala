package typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ trait SelectionState extends js.Object {
  def getAnchorKey(): String
  def getAnchorOffset(): Double
  def getEndKey(): String
  def getEndOffset(): Double
  def getFocusKey(): String
  def getFocusOffset(): Double
  def getHasFocus(): Boolean
  def getIsBackward(): Boolean
  def getStartKey(): String
  def getStartOffset(): Double
  /**
    * Return whether the specified range overlaps with an edge of the
    * SelectionState.
    */
  def hasEdgeWithin(blockKey: String, start: Double, end: Double): Boolean
  def isCollapsed(): Boolean
  def serialize(): String
}

object SelectionState {
  @scala.inline
  def apply(
    getAnchorKey: CallbackTo[String],
    getAnchorOffset: CallbackTo[Double],
    getEndKey: CallbackTo[String],
    getEndOffset: CallbackTo[Double],
    getFocusKey: CallbackTo[String],
    getFocusOffset: CallbackTo[Double],
    getHasFocus: CallbackTo[Boolean],
    getIsBackward: CallbackTo[Boolean],
    getStartKey: CallbackTo[String],
    getStartOffset: CallbackTo[Double],
    hasEdgeWithin: (String, Double, Double) => CallbackTo[Boolean],
    isCollapsed: CallbackTo[Boolean],
    serialize: CallbackTo[String]
  ): SelectionState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAnchorKey")(getAnchorKey.toJsFn)
    __obj.updateDynamic("getAnchorOffset")(getAnchorOffset.toJsFn)
    __obj.updateDynamic("getEndKey")(getEndKey.toJsFn)
    __obj.updateDynamic("getEndOffset")(getEndOffset.toJsFn)
    __obj.updateDynamic("getFocusKey")(getFocusKey.toJsFn)
    __obj.updateDynamic("getFocusOffset")(getFocusOffset.toJsFn)
    __obj.updateDynamic("getHasFocus")(getHasFocus.toJsFn)
    __obj.updateDynamic("getIsBackward")(getIsBackward.toJsFn)
    __obj.updateDynamic("getStartKey")(getStartKey.toJsFn)
    __obj.updateDynamic("getStartOffset")(getStartOffset.toJsFn)
    __obj.updateDynamic("hasEdgeWithin")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => hasEdgeWithin(t0, t1, t2).runNow()))
    __obj.updateDynamic("isCollapsed")(isCollapsed.toJsFn)
    __obj.updateDynamic("serialize")(serialize.toJsFn)
    __obj.asInstanceOf[SelectionState]
  }
}


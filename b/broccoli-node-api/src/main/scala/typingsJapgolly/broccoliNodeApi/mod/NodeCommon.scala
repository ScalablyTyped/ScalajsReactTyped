package typingsJapgolly.broccoliNodeApi.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCommon[T /* <: NodeInfo */] extends js.Object {
  /**
    The node's feature set, indicating the API version
    */
  var __broccoliFeatures__ : FeatureSet
  /**
    A function to be called by the Builder, taking the Builder's feature set as
    an argument and returning a `NodeInfo` object
    */
  def __broccoliGetInfo__(builderFeatures: FeatureSet): T
}

object NodeCommon {
  @scala.inline
  def apply[T /* <: NodeInfo */](__broccoliFeatures__ : FeatureSet, __broccoliGetInfo__ : FeatureSet => CallbackTo[T]): NodeCommon[T] = {
    val __obj = js.Dynamic.literal(__broccoliFeatures__ = __broccoliFeatures__.asInstanceOf[js.Any])
    __obj.updateDynamic("__broccoliGetInfo__")(js.Any.fromFunction1((t0: typingsJapgolly.broccoliNodeApi.mod.FeatureSet) => __broccoliGetInfo__(t0).runNow()))
    __obj.asInstanceOf[NodeCommon[T]]
  }
}


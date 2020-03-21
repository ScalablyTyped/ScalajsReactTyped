package typingsJapgolly.vis.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenClusterOptions extends js.Object {
  /**
    * A function that can be used to manually position the nodes after the cluster is opened.
    * The containedNodesPositions contain the positions of the nodes in the cluster at the
    * moment they were clustered. This function is expected to return the newPositions,
    * which can be the containedNodesPositions (altered) or a new object.
    * This has to be an object with keys equal to the nodeIds that exist in the
    * containedNodesPositions and an {x:x,y:y} position object.
    *
    * For all nodeIds not listed in this returned object,
    * we will position them at the location of the cluster.
    * This is also the default behaviour when no releaseFunction is defined.
    */
  def releaseFunction(clusterPosition: Position, containedNodesPositions: StringDictionary[Position]): StringDictionary[Position]
}

object OpenClusterOptions {
  @scala.inline
  def apply(releaseFunction: (Position, StringDictionary[Position]) => CallbackTo[StringDictionary[Position]]): OpenClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("releaseFunction")(js.Any.fromFunction2((t0: typingsJapgolly.vis.mod.Position, t1: org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vis.mod.Position]) => releaseFunction(t0, t1).runNow()))
    __obj.asInstanceOf[OpenClusterOptions]
  }
}


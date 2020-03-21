package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScriptRequest extends js.Object {
  /**
    * A list of the edges in the DAG.
    */
  var DagEdges: js.UndefOr[typingsJapgolly.awsSdk.glueMod.DagEdges] = js.native
  /**
    * A list of the nodes in the DAG.
    */
  var DagNodes: js.UndefOr[typingsJapgolly.awsSdk.glueMod.DagNodes] = js.native
  /**
    * The programming language of the resulting code from the DAG.
    */
  var Language: js.UndefOr[typingsJapgolly.awsSdk.glueMod.Language] = js.native
}

object CreateScriptRequest {
  @scala.inline
  def apply(DagEdges: DagEdges = null, DagNodes: DagNodes = null, Language: Language = null): CreateScriptRequest = {
    val __obj = js.Dynamic.literal()
    if (DagEdges != null) __obj.updateDynamic("DagEdges")(DagEdges.asInstanceOf[js.Any])
    if (DagNodes != null) __obj.updateDynamic("DagNodes")(DagNodes.asInstanceOf[js.Any])
    if (Language != null) __obj.updateDynamic("Language")(Language.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScriptRequest]
  }
}


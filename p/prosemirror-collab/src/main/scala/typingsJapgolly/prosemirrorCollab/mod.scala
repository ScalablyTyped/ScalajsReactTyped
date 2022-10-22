package typingsJapgolly.prosemirrorCollab

import typingsJapgolly.prosemirrorCollab.anon.ClientID
import typingsJapgolly.prosemirrorCollab.anon.MapSelectionBackward
import typingsJapgolly.prosemirrorCollab.anon.Origins
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Plugin
import typingsJapgolly.prosemirrorState.mod.Transaction
import typingsJapgolly.prosemirrorTransform.mod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-collab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collab(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("collab")().asInstanceOf[Plugin[Any]]
  inline def collab(config: ClientID): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("collab")(config.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  inline def getVersion(state: EditorState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def receiveTransaction[S /* <: Schema[Any, Any] */](state: EditorState, steps: js.Array[Step], clientIDs: js.Array[Double | String]): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveTransaction")(state.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], clientIDs.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def receiveTransaction[S /* <: Schema[Any, Any] */](
    state: EditorState,
    steps: js.Array[Step],
    clientIDs: js.Array[Double | String],
    options: MapSelectionBackward
  ): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveTransaction")(state.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], clientIDs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  inline def sendableSteps[S /* <: Schema[Any, Any] */](state: EditorState): js.UndefOr[Origins | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendableSteps")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Origins | Null]]
}

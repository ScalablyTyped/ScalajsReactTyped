package typingsJapgolly.broccoliNodeApi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.broccoliNodeApi.AnonCachePath
import typingsJapgolly.broccoliNodeApi.broccoliNodeApiStrings.source
import typingsJapgolly.broccoliNodeApi.broccoliNodeApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.broccoliNodeApi.mod.SourceNodeInfo
  - typingsJapgolly.broccoliNodeApi.mod.TransformNodeInfo
*/
trait NodeInfo extends js.Object

object NodeInfo {
  @scala.inline
  def SourceNodeInfo(
    instantiationStack: String,
    name: String,
    nodeType: source,
    sourceDirectory: String,
    watched: Boolean,
    annotation: String = null
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], sourceDirectory = sourceDirectory.asInstanceOf[js.Any], watched = watched.asInstanceOf[js.Any])
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
  @scala.inline
  def TransformNodeInfo(
    getCallbackObject: CallbackTo[CallbackObject],
    inputNodes: js.Array[InputNode],
    instantiationStack: String,
    name: String,
    needsCache: Boolean,
    nodeType: transform,
    persistentOutput: Boolean,
    setup: (FeatureSet, AnonCachePath) => Callback,
    trackInputChanges: Boolean,
    volatile: Boolean,
    annotation: String = null
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(inputNodes = inputNodes.asInstanceOf[js.Any], instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsCache = needsCache.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], persistentOutput = persistentOutput.asInstanceOf[js.Any], trackInputChanges = trackInputChanges.asInstanceOf[js.Any], volatile = volatile.asInstanceOf[js.Any])
    __obj.updateDynamic("getCallbackObject")(getCallbackObject.toJsFn)
    __obj.updateDynamic("setup")(js.Any.fromFunction2((t0: typingsJapgolly.broccoliNodeApi.mod.FeatureSet, t1: typingsJapgolly.broccoliNodeApi.AnonCachePath) => setup(t0, t1).runNow()))
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
}


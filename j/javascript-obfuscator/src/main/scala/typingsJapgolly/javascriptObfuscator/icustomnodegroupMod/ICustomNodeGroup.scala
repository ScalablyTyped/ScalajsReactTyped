package typingsJapgolly.javascriptObfuscator.icustomnodegroupMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptObfuscator.icustomnodeMod.ICustomNode
import typingsJapgolly.javascriptObfuscator.iinitializableMod.IInitializable
import typingsJapgolly.javascriptObfuscator.istacktracedataMod.IStackTraceData
import typingsJapgolly.javascriptObfuscator.tnodewithstatementsMod.TNodeWithStatements
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomNodeGroup
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param nodeWithStatements
    * @param stackTraceData
    */
  def appendCustomNodes(nodeWithStatements: TNodeWithStatements, stackTraceData: js.Array[IStackTraceData]): Unit
  /**
    * @returns {ObfuscationEvent}
    */
  def getAppendEvent(): js.Any
  /**
    * @type {Map <CustomNode, ICustomNode>}
    */
  def getCustomNodes(): Map[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomNode */ _, 
    ICustomNode
  ]
  def initialize(): Unit
}

object ICustomNodeGroup {
  @scala.inline
  def apply(
    appendCustomNodes: (TNodeWithStatements, js.Array[IStackTraceData]) => Callback,
    getAppendEvent: CallbackTo[js.Any],
    getCustomNodes: CallbackTo[Map[js.Any, ICustomNode]],
    initialize: Callback
  ): ICustomNodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendCustomNodes")(js.Any.fromFunction2((t0: typingsJapgolly.javascriptObfuscator.tnodewithstatementsMod.TNodeWithStatements, t1: js.Array[typingsJapgolly.javascriptObfuscator.istacktracedataMod.IStackTraceData]) => appendCustomNodes(t0, t1).runNow()))
    __obj.updateDynamic("getAppendEvent")(getAppendEvent.toJsFn)
    __obj.updateDynamic("getCustomNodes")(getCustomNodes.toJsFn)
    __obj.updateDynamic("initialize")(initialize.toJsFn)
    __obj.asInstanceOf[ICustomNodeGroup]
  }
}


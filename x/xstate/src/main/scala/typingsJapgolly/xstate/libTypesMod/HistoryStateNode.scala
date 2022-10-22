package typingsJapgolly.xstate.libTypesMod

import typingsJapgolly.xstate.anon.Context
import typingsJapgolly.xstate.libStateNodeMod.StateNode
import typingsJapgolly.xstate.libTypegenTypesMod.TypegenDisabled
import typingsJapgolly.xstate.xstateStrings.deep
import typingsJapgolly.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryStateNode[TContext] extends StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled] {
  
  @JSName("history")
  var history_HistoryStateNode: shallow | deep = js.native
  
  @JSName("target")
  var target_FHistoryStateNode: js.UndefOr[StateValue] = js.native
}

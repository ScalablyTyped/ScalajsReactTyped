package typingsJapgolly.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("xstate/lib/types", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes & String] = js.native
  
  @js.native
  sealed trait After
    extends StObject
       with ActionTypes
  /* "xstate.after" */ val After: typingsJapgolly.xstate.libTypesMod.ActionTypes.After & String = js.native
  
  @js.native
  sealed trait Assign
    extends StObject
       with ActionTypes
  /* "xstate.assign" */ val Assign: typingsJapgolly.xstate.libTypesMod.ActionTypes.Assign & String = js.native
  
  @js.native
  sealed trait Cancel
    extends StObject
       with ActionTypes
  /* "xstate.cancel" */ val Cancel: typingsJapgolly.xstate.libTypesMod.ActionTypes.Cancel & String = js.native
  
  @js.native
  sealed trait Choose
    extends StObject
       with ActionTypes
  /* "xstate.choose" */ val Choose: typingsJapgolly.xstate.libTypesMod.ActionTypes.Choose & String = js.native
  
  @js.native
  sealed trait DoneInvoke
    extends StObject
       with ActionTypes
  /* "done.invoke" */ val DoneInvoke: typingsJapgolly.xstate.libTypesMod.ActionTypes.DoneInvoke & String = js.native
  
  @js.native
  sealed trait DoneState
    extends StObject
       with ActionTypes
  /* "done.state" */ val DoneState: typingsJapgolly.xstate.libTypesMod.ActionTypes.DoneState & String = js.native
  
  @js.native
  sealed trait ErrorCommunication
    extends StObject
       with ActionTypes
  /* "error.communication" */ val ErrorCommunication: typingsJapgolly.xstate.libTypesMod.ActionTypes.ErrorCommunication & String = js.native
  
  @js.native
  sealed trait ErrorCustom
    extends StObject
       with ActionTypes
  /* "xstate.error" */ val ErrorCustom: typingsJapgolly.xstate.libTypesMod.ActionTypes.ErrorCustom & String = js.native
  
  @js.native
  sealed trait ErrorExecution
    extends StObject
       with ActionTypes
  /* "error.execution" */ val ErrorExecution: typingsJapgolly.xstate.libTypesMod.ActionTypes.ErrorExecution & String = js.native
  
  @js.native
  sealed trait ErrorPlatform
    extends StObject
       with ActionTypes
  /* "error.platform" */ val ErrorPlatform: typingsJapgolly.xstate.libTypesMod.ActionTypes.ErrorPlatform & String = js.native
  
  @js.native
  sealed trait Init
    extends StObject
       with ActionTypes
  /* "xstate.init" */ val Init: typingsJapgolly.xstate.libTypesMod.ActionTypes.Init & String = js.native
  
  @js.native
  sealed trait Invoke
    extends StObject
       with ActionTypes
  /* "xstate.invoke" */ val Invoke: typingsJapgolly.xstate.libTypesMod.ActionTypes.Invoke & String = js.native
  
  @js.native
  sealed trait Log
    extends StObject
       with ActionTypes
  /* "xstate.log" */ val Log: typingsJapgolly.xstate.libTypesMod.ActionTypes.Log & String = js.native
  
  @js.native
  sealed trait NullEvent
    extends StObject
       with ActionTypes
  /* "" */ val NullEvent: typingsJapgolly.xstate.libTypesMod.ActionTypes.NullEvent & String = js.native
  
  @js.native
  sealed trait Pure
    extends StObject
       with ActionTypes
  /* "xstate.pure" */ val Pure: typingsJapgolly.xstate.libTypesMod.ActionTypes.Pure & String = js.native
  
  @js.native
  sealed trait Raise
    extends StObject
       with ActionTypes
  /* "xstate.raise" */ val Raise: typingsJapgolly.xstate.libTypesMod.ActionTypes.Raise & String = js.native
  
  @js.native
  sealed trait Send
    extends StObject
       with ActionTypes
  /* "xstate.send" */ val Send: typingsJapgolly.xstate.libTypesMod.ActionTypes.Send & String = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with ActionTypes
  /* "xstate.start" */ val Start: typingsJapgolly.xstate.libTypesMod.ActionTypes.Start & String = js.native
  
  @js.native
  sealed trait Stop
    extends StObject
       with ActionTypes
  /* "xstate.stop" */ val Stop: typingsJapgolly.xstate.libTypesMod.ActionTypes.Stop & String = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with ActionTypes
  /* "xstate.update" */ val Update: typingsJapgolly.xstate.libTypesMod.ActionTypes.Update & String = js.native
}

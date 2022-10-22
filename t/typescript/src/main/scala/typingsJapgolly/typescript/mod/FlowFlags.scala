package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowFlags extends StObject
@JSImport("typescript", "FlowFlags")
@js.native
object FlowFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowFlags & Double] = js.native
  
  @js.native
  sealed trait ArrayMutation
    extends StObject
       with FlowFlags
  /* 256 */ val ArrayMutation: typingsJapgolly.typescript.mod.FlowFlags.ArrayMutation & Double = js.native
  
  @js.native
  sealed trait Assignment
    extends StObject
       with FlowFlags
  /* 16 */ val Assignment: typingsJapgolly.typescript.mod.FlowFlags.Assignment & Double = js.native
  
  @js.native
  sealed trait BranchLabel
    extends StObject
       with FlowFlags
  /* 4 */ val BranchLabel: typingsJapgolly.typescript.mod.FlowFlags.BranchLabel & Double = js.native
  
  @js.native
  sealed trait Call
    extends StObject
       with FlowFlags
  /* 512 */ val Call: typingsJapgolly.typescript.mod.FlowFlags.Call & Double = js.native
  
  @js.native
  sealed trait Condition
    extends StObject
       with FlowFlags
  /* 96 */ val Condition: typingsJapgolly.typescript.mod.FlowFlags.Condition & Double = js.native
  
  @js.native
  sealed trait FalseCondition
    extends StObject
       with FlowFlags
  /* 64 */ val FalseCondition: typingsJapgolly.typescript.mod.FlowFlags.FalseCondition & Double = js.native
  
  @js.native
  sealed trait Label
    extends StObject
       with FlowFlags
  /* 12 */ val Label: typingsJapgolly.typescript.mod.FlowFlags.Label & Double = js.native
  
  @js.native
  sealed trait LoopLabel
    extends StObject
       with FlowFlags
  /* 8 */ val LoopLabel: typingsJapgolly.typescript.mod.FlowFlags.LoopLabel & Double = js.native
  
  @js.native
  sealed trait ReduceLabel
    extends StObject
       with FlowFlags
  /* 1024 */ val ReduceLabel: typingsJapgolly.typescript.mod.FlowFlags.ReduceLabel & Double = js.native
  
  @js.native
  sealed trait Referenced
    extends StObject
       with FlowFlags
  /* 2048 */ val Referenced: typingsJapgolly.typescript.mod.FlowFlags.Referenced & Double = js.native
  
  @js.native
  sealed trait Shared
    extends StObject
       with FlowFlags
  /* 4096 */ val Shared: typingsJapgolly.typescript.mod.FlowFlags.Shared & Double = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with FlowFlags
  /* 2 */ val Start: typingsJapgolly.typescript.mod.FlowFlags.Start & Double = js.native
  
  @js.native
  sealed trait SwitchClause
    extends StObject
       with FlowFlags
  /* 128 */ val SwitchClause: typingsJapgolly.typescript.mod.FlowFlags.SwitchClause & Double = js.native
  
  @js.native
  sealed trait TrueCondition
    extends StObject
       with FlowFlags
  /* 32 */ val TrueCondition: typingsJapgolly.typescript.mod.FlowFlags.TrueCondition & Double = js.native
  
  @js.native
  sealed trait Unreachable
    extends StObject
       with FlowFlags
  /* 1 */ val Unreachable: typingsJapgolly.typescript.mod.FlowFlags.Unreachable & Double = js.native
}

package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentSubSystem extends StObject
@JSImport("azdata", "AgentSubSystem")
@js.native
object AgentSubSystem extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentSubSystem & Double] = js.native
  
  @js.native
  sealed trait ActiveScripting
    extends StObject
       with AgentSubSystem
  /* 2 */ val ActiveScripting: typingsJapgolly.azdata.mod.AgentSubSystem.ActiveScripting & Double = js.native
  
  @js.native
  sealed trait AnalysisCommands
    extends StObject
       with AgentSubSystem
  /* 10 */ val AnalysisCommands: typingsJapgolly.azdata.mod.AgentSubSystem.AnalysisCommands & Double = js.native
  
  @js.native
  sealed trait AnalysisQuery
    extends StObject
       with AgentSubSystem
  /* 9 */ val AnalysisQuery: typingsJapgolly.azdata.mod.AgentSubSystem.AnalysisQuery & Double = js.native
  
  @js.native
  sealed trait CmdExec
    extends StObject
       with AgentSubSystem
  /* 3 */ val CmdExec: typingsJapgolly.azdata.mod.AgentSubSystem.CmdExec & Double = js.native
  
  @js.native
  sealed trait Distribution
    extends StObject
       with AgentSubSystem
  /* 6 */ val Distribution: typingsJapgolly.azdata.mod.AgentSubSystem.Distribution & Double = js.native
  
  @js.native
  sealed trait LogReader
    extends StObject
       with AgentSubSystem
  /* 5 */ val LogReader: typingsJapgolly.azdata.mod.AgentSubSystem.LogReader & Double = js.native
  
  @js.native
  sealed trait Merge
    extends StObject
       with AgentSubSystem
  /* 7 */ val Merge: typingsJapgolly.azdata.mod.AgentSubSystem.Merge & Double = js.native
  
  @js.native
  sealed trait PowerShell
    extends StObject
       with AgentSubSystem
  /* 12 */ val PowerShell: typingsJapgolly.azdata.mod.AgentSubSystem.PowerShell & Double = js.native
  
  @js.native
  sealed trait QueueReader
    extends StObject
       with AgentSubSystem
  /* 8 */ val QueueReader: typingsJapgolly.azdata.mod.AgentSubSystem.QueueReader & Double = js.native
  
  @js.native
  sealed trait Snapshot
    extends StObject
       with AgentSubSystem
  /* 4 */ val Snapshot: typingsJapgolly.azdata.mod.AgentSubSystem.Snapshot & Double = js.native
  
  @js.native
  sealed trait Ssis
    extends StObject
       with AgentSubSystem
  /* 11 */ val Ssis: typingsJapgolly.azdata.mod.AgentSubSystem.Ssis & Double = js.native
  
  @js.native
  sealed trait TransactSql
    extends StObject
       with AgentSubSystem
  /* 1 */ val TransactSql: typingsJapgolly.azdata.mod.AgentSubSystem.TransactSql & Double = js.native
}

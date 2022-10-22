package typingsJapgolly.tcomb.mod

import typingsJapgolly.tcomb.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tcomb.mod.ApplyCommand
  - typingsJapgolly.tcomb.mod.PushCommand
  - typingsJapgolly.tcomb.mod.RemoveCommand
  - typingsJapgolly.tcomb.mod.SetCommand
  - typingsJapgolly.tcomb.mod.SpliceCommand
  - typingsJapgolly.tcomb.mod.SwapCommand
  - typingsJapgolly.tcomb.mod.UnshiftCommand
  - typingsJapgolly.tcomb.mod.MergeCommand
*/
trait Command extends StObject
object Command {
  
  inline def ApplyCommand($apply: js.Function): typingsJapgolly.tcomb.mod.ApplyCommand = {
    val __obj = js.Dynamic.literal($apply = $apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tcomb.mod.ApplyCommand]
  }
  
  inline def MergeCommand($merge: js.Object): typingsJapgolly.tcomb.mod.MergeCommand = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tcomb.mod.MergeCommand]
  }
  
  inline def PushCommand($push: js.Array[scala.Any]): typingsJapgolly.tcomb.mod.PushCommand = {
    val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tcomb.mod.PushCommand]
  }
  
  inline def RemoveCommand($remove: js.Array[java.lang.String]): typingsJapgolly.tcomb.mod.RemoveCommand = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tcomb.mod.RemoveCommand]
  }
  
  inline def SetCommand($set: scala.Any): typingsJapgolly.tcomb.mod.SetCommand = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tcomb.mod.SetCommand]
  }
  
  inline def SpliceCommand($splice: js.Array[js.Array[scala.Any]]): typingsJapgolly.tcomb.mod.SpliceCommand = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tcomb.mod.SpliceCommand]
  }
  
  inline def SwapCommand($swap: From): typingsJapgolly.tcomb.mod.SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tcomb.mod.SwapCommand]
  }
  
  inline def UnshiftCommand($unshift: js.Array[scala.Any]): typingsJapgolly.tcomb.mod.UnshiftCommand = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tcomb.mod.UnshiftCommand]
  }
}

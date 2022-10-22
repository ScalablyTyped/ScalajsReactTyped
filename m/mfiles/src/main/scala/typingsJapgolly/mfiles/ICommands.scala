package typingsJapgolly.mfiles

import typingsJapgolly.mfiles.MFiles.BuiltinCommand
import typingsJapgolly.mfiles.MFiles.CommandLocation
import typingsJapgolly.mfiles.MFiles.CommandState
import typingsJapgolly.mfiles.MFiles.DefaultIcon
import typingsJapgolly.mfiles.MFiles.MenuLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommands extends StObject {
  
  def AddCustomCommandToMenu(customCommand: Double, location: MenuLocation, orderPriority: Double): Unit = js.native
  
  def CreateCustomCommand(commandName: String): Double = js.native
  
  def DeleteCustomCommand(customCommand: Double): Unit = js.native
  
  val Events: ICommandsEvents = js.native
  
  def ExecuteCommand(command: Double, arguments: Any): Unit = js.native
  def ExecuteCommand(command: BuiltinCommand, arguments: Any): Unit = js.native
  
  def GetCommandName(command: Double): String = js.native
  def GetCommandName(command: BuiltinCommand): String = js.native
  
  def GetCommandState(
    command: Double,
    location: CommandLocation,
    includeBuiltInState: Boolean,
    includeScriptSpecifiedState: Boolean
  ): CommandState = js.native
  def GetCommandState(
    command: BuiltinCommand,
    location: CommandLocation,
    includeBuiltInState: Boolean,
    includeScriptSpecifiedState: Boolean
  ): CommandState = js.native
  
  def RemoveCustomCommandFromMenu(customCommand: Double, location: MenuLocation): Unit = js.native
  
  def SetCommandState(command: Double, location: CommandLocation, state: CommandState): Unit = js.native
  def SetCommandState(command: BuiltinCommand, location: CommandLocation, state: CommandState): Unit = js.native
  
  def SetIcon(customCommand: Double, icon: DefaultIcon): Unit = js.native
  
  def SetIconFromPath(customCommand: Double, iconPath: String): Unit = js.native
}

package typingsJapgolly.kendoUi.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.kendoUi.kendo.ui.filemanager.FileManagerCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoffilemanager extends StObject {
  
  var FileManagerCommand: Instantiable0[typingsJapgolly.kendoUi.kendo.ui.filemanager.FileManagerCommand] & TypeofFileManagerCommand
  
  val commands: Typeofcommands
}
object Typeoffilemanager {
  
  inline def apply(
    FileManagerCommand: Instantiable0[FileManagerCommand] & TypeofFileManagerCommand,
    commands: Typeofcommands
  ): Typeoffilemanager = {
    val __obj = js.Dynamic.literal(FileManagerCommand = FileManagerCommand.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoffilemanager]
  }
  
  extension [Self <: Typeoffilemanager](x: Self) {
    
    inline def setCommands(value: Typeofcommands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setFileManagerCommand(value: Instantiable0[FileManagerCommand] & TypeofFileManagerCommand): Self = StObject.set(x, "FileManagerCommand", value.asInstanceOf[js.Any])
  }
}

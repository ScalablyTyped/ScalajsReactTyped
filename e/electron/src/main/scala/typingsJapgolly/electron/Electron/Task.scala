package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/task
  /**
    * The command line arguments when `program` is executed.
    */
  var arguments: String
  
  /**
    * Description of this task.
    */
  var description: String
  
  /**
    * The icon index in the icon file. If an icon file consists of two or more icons,
    * set this value to identify the icon. If an icon file consists of one icon, this
    * value is 0.
    */
  var iconIndex: Double
  
  /**
    * The absolute path to an icon to be displayed in a JumpList, which can be an
    * arbitrary resource file that contains an icon. You can usually specify
    * `process.execPath` to show the icon of the program.
    */
  var iconPath: String
  
  /**
    * Path of the program to execute, usually you should specify `process.execPath`
    * which opens the current program.
    */
  var program: String
  
  /**
    * The string to be displayed in a JumpList.
    */
  var title: String
  
  /**
    * The working directory. Default is empty.
    */
  var workingDirectory: js.UndefOr[String] = js.undefined
}
object Task {
  
  inline def apply(
    arguments: String,
    description: String,
    iconIndex: Double,
    iconPath: String,
    program: String,
    title: String
  ): Task = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconIndex = iconIndex.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIconIndex(value: Double): Self = StObject.set(x, "iconIndex", value.asInstanceOf[js.Any])
    
    inline def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}

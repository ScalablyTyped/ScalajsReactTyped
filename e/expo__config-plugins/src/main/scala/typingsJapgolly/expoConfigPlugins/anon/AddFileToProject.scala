package typingsJapgolly.expoConfigPlugins.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFileToProject extends StObject {
  
  def addFileToProject(props: File): Unit
  
  var filepath: String
  
  var groupName: String
  
  var project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  
  var targetUuid: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object AddFileToProject {
  
  inline def apply(
    addFileToProject: File => Callback,
    filepath: String,
    groupName: String,
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): AddFileToProject = {
    val __obj = js.Dynamic.literal(addFileToProject = js.Any.fromFunction1((t0: File) => addFileToProject(t0).runNow()), filepath = filepath.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFileToProject]
  }
  
  extension [Self <: AddFileToProject](x: Self) {
    
    inline def setAddFileToProject(value: File => Callback): Self = StObject.set(x, "addFileToProject", js.Any.fromFunction1((t0: File) => value(t0).runNow()))
    
    inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setTargetUuid(value: String): Self = StObject.set(x, "targetUuid", value.asInstanceOf[js.Any])
    
    inline def setTargetUuidUndefined: Self = StObject.set(x, "targetUuid", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}

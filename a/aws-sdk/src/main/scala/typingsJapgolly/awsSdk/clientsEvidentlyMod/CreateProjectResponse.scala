package typingsJapgolly.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResponse extends StObject {
  
  /**
    * A structure that contains information about the created project.
    */
  var project: Project
}
object CreateProjectResponse {
  
  inline def apply(project: Project): CreateProjectResponse = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResponse]
  }
  
  extension [Self <: CreateProjectResponse](x: Self) {
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}

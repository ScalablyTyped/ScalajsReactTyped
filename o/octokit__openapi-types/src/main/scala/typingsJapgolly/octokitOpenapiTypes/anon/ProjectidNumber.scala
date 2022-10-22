package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectidNumber extends StObject {
  
  /** The unique identifier of the project. */
  var project_id: Double
}
object ProjectidNumber {
  
  inline def apply(project_id: Double): ProjectidNumber = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidNumber]
  }
  
  extension [Self <: ProjectidNumber](x: Self) {
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminResource extends StObject {
  
  var projects: ProjectsResource
}
object AdminResource {
  
  inline def apply(projects: ProjectsResource): AdminResource = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminResource]
  }
  
  extension [Self <: AdminResource](x: Self) {
    
    inline def setProjects(value: ProjectsResource): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}

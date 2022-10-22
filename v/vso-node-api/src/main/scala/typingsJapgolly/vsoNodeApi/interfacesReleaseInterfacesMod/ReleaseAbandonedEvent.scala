package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseAbandonedEvent extends StObject {
  
  var project: ProjectReference
  
  var release: Release
}
object ReleaseAbandonedEvent {
  
  inline def apply(project: ProjectReference, release: Release): ReleaseAbandonedEvent = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseAbandonedEvent]
  }
  
  extension [Self <: ReleaseAbandonedEvent](x: Self) {
    
    inline def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}

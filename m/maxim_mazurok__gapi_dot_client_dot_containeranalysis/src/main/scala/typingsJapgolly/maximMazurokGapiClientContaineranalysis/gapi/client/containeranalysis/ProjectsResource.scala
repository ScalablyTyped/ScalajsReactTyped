package typingsJapgolly.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var notes: NotesResource
  
  var occurrences: OccurrencesResource
}
object ProjectsResource {
  
  inline def apply(notes: NotesResource, occurrences: OccurrencesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(notes = notes.asInstanceOf[js.Any], occurrences = occurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setNotes(value: NotesResource): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setOccurrences(value: OccurrencesResource): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
  }
}

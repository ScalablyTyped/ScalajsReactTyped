package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactUriQueryResult extends StObject {
  
  /**
    * A Dictionary that maps a list of work item references to the given list of artifact URI.
    */
  var artifactUrisQueryResult: StringDictionary[js.Array[WorkItemReference]]
}
object ArtifactUriQueryResult {
  
  inline def apply(artifactUrisQueryResult: StringDictionary[js.Array[WorkItemReference]]): ArtifactUriQueryResult = {
    val __obj = js.Dynamic.literal(artifactUrisQueryResult = artifactUrisQueryResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactUriQueryResult]
  }
  
  extension [Self <: ArtifactUriQueryResult](x: Self) {
    
    inline def setArtifactUrisQueryResult(value: StringDictionary[js.Array[WorkItemReference]]): Self = StObject.set(x, "artifactUrisQueryResult", value.asInstanceOf[js.Any])
  }
}

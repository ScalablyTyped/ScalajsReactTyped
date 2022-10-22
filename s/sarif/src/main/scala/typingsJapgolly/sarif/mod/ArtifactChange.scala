package typingsJapgolly.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactChange extends StObject {
  
  /**
    * The location of the artifact to change.
    */
  var artifactLocation: ArtifactLocation
  
  /**
    * Key/value pairs that provide additional information about the change.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * An array of replacement objects, each of which represents the replacement of a single region in a single
    * artifact specified by 'artifactLocation'.
    */
  var replacements: js.Array[Replacement]
}
object ArtifactChange {
  
  inline def apply(artifactLocation: ArtifactLocation, replacements: js.Array[Replacement]): ArtifactChange = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactChange]
  }
  
  extension [Self <: ArtifactChange](x: Self) {
    
    inline def setArtifactLocation(value: ArtifactLocation): Self = StObject.set(x, "artifactLocation", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReplacements(value: js.Array[Replacement]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
    
    inline def setReplacementsVarargs(value: Replacement*): Self = StObject.set(x, "replacements", js.Array(value*))
  }
}

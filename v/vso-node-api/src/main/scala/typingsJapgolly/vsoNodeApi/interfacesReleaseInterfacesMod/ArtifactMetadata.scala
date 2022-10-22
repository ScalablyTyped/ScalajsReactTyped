package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactMetadata extends StObject {
  
  /**
    * Sets alias of artifact.
    */
  var alias: String
  
  /**
    * Sets instance reference of artifact. e.g. for build artifact it is build number.
    */
  var instanceReference: BuildVersion
}
object ArtifactMetadata {
  
  inline def apply(alias: String, instanceReference: BuildVersion): ArtifactMetadata = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], instanceReference = instanceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactMetadata]
  }
  
  extension [Self <: ArtifactMetadata](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setInstanceReference(value: BuildVersion): Self = StObject.set(x, "instanceReference", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
  */
trait LocalObjectReference extends StObject {
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String
}
object LocalObjectReference {
  
  inline def apply(name: String): LocalObjectReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalObjectReference]
  }
  
  extension [Self <: LocalObjectReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

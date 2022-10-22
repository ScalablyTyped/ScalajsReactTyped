package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Force extends StObject {
  
  /**
    * @description Indicates whether to force the update or to make sure the update is a fast-forward update. Leaving this out or setting it to `false` will make sure you're not overwriting work.
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /** @description The SHA1 value to set this reference to */
  var sha: String
}
object Force {
  
  inline def apply(sha: String): Force = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  
  extension [Self <: Force](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}

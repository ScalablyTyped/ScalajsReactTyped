package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED.
  */
trait RollbackConfigPatch extends StObject {
  
  /**
    * The revision to rollback to. If set to 0, rollback to the last revision.
    */
  var revision: Double
}
object RollbackConfigPatch {
  
  inline def apply(revision: Double): RollbackConfigPatch = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfigPatch]
  }
  
  extension [Self <: RollbackConfigPatch](x: Self) {
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}

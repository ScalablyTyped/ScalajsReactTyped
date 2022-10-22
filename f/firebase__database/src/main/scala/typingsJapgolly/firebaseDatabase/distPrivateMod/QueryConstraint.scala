package typingsJapgolly.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@firebase/database/dist/private", "QueryConstraint")
@js.native
open class QueryConstraint () extends StObject {
  
  /**
    * Takes the provided `Query` and returns a copy of the `Query` with this
    * `QueryConstraint` applied.
    */
  def _apply[T](
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _QueryImpl */ Any
  ): Any = js.native
  
  /** The type of this query constraints */
  val `type`: QueryConstraintType = js.native
}

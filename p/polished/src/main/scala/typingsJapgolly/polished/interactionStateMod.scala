package typingsJapgolly.polished

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("polished/lib/types/interactionState", JSImport.Namespace)
@js.native
object interactionStateMod extends js.Object {
  trait _InteractionState extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - scala.Null
    - typingsJapgolly.polished.polishedStrings.active
    - typingsJapgolly.polished.polishedStrings.focus
    - typingsJapgolly.polished.polishedStrings.hover
  */
  type InteractionState = _InteractionState | Unit | Null
}


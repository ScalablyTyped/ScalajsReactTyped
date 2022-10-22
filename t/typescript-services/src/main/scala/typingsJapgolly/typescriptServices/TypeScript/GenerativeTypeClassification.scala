package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GenerativeTypeClassification extends StObject
@JSGlobal("TypeScript.GenerativeTypeClassification")
@js.native
object GenerativeTypeClassification extends StObject {
  
  @js.native
  sealed trait Closed
    extends StObject
       with GenerativeTypeClassification
  
  @js.native
  sealed trait InfinitelyExpanding
    extends StObject
       with GenerativeTypeClassification
  
  @js.native
  sealed trait Open
    extends StObject
       with GenerativeTypeClassification
  
  @js.native
  sealed trait Unknown
    extends StObject
       with GenerativeTypeClassification
}

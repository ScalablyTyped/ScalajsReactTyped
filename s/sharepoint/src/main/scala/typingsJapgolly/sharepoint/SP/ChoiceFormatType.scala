package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChoiceFormatType extends StObject
@JSGlobal("SP.ChoiceFormatType")
@js.native
object ChoiceFormatType extends StObject {
  
  @js.native
  sealed trait dropdown
    extends StObject
       with ChoiceFormatType
  
  @js.native
  sealed trait radioButtons
    extends StObject
       with ChoiceFormatType
}

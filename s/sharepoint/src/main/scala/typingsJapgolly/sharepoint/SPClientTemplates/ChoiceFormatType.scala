package typingsJapgolly.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChoiceFormatType extends StObject
@JSGlobal("SPClientTemplates.ChoiceFormatType")
@js.native
object ChoiceFormatType extends StObject {
  
  @js.native
  sealed trait Dropdown
    extends StObject
       with ChoiceFormatType
  
  @js.native
  sealed trait Radio
    extends StObject
       with ChoiceFormatType
}

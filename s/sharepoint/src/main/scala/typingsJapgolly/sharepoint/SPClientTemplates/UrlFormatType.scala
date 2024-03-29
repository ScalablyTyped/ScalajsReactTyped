package typingsJapgolly.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UrlFormatType extends StObject
@JSGlobal("SPClientTemplates.UrlFormatType")
@js.native
object UrlFormatType extends StObject {
  
  @js.native
  sealed trait Hyperlink
    extends StObject
       with UrlFormatType
  
  @js.native
  sealed trait Image
    extends StObject
       with UrlFormatType
}

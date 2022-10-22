package typingsJapgolly.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialAttachmentKind extends StObject
@JSGlobal("SP.Social.SocialAttachmentKind")
@js.native
object SocialAttachmentKind extends StObject {
  
  @js.native
  sealed trait document
    extends StObject
       with SocialAttachmentKind
  
  @js.native
  sealed trait image
    extends StObject
       with SocialAttachmentKind
  
  @js.native
  sealed trait video
    extends StObject
       with SocialAttachmentKind
}

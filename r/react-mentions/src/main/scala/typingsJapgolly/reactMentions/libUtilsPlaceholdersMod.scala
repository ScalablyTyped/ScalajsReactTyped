package typingsJapgolly.reactMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPlaceholdersMod {
  
  @js.native
  sealed trait PLACEHOLDERS extends StObject
  @JSImport("react-mentions/lib/utils/placeholders", "PLACEHOLDERS")
  @js.native
  object PLACEHOLDERS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PLACEHOLDERS & String] = js.native
    
    @js.native
    sealed trait display
      extends StObject
         with PLACEHOLDERS
    /* "__display__" */ val display: typingsJapgolly.reactMentions.libUtilsPlaceholdersMod.PLACEHOLDERS.display & String = js.native
    
    @js.native
    sealed trait id
      extends StObject
         with PLACEHOLDERS
    /* "__id__" */ val id: typingsJapgolly.reactMentions.libUtilsPlaceholdersMod.PLACEHOLDERS.id & String = js.native
  }
}

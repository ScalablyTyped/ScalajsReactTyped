package typingsJapgolly.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listIntents` operation. */
object ListIntentsConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned intents will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListIntentsConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort & String] = js.native
    
    @js.native
    sealed trait INTENT
      extends StObject
         with Sort
    /* "intent" */ val INTENT: typingsJapgolly.watsonDeveloperCloud.assistantV1Mod.ListIntentsConstants.Sort.INTENT & String = js.native
    
    @js.native
    sealed trait UPDATED
      extends StObject
         with Sort
    /* "updated" */ val UPDATED: typingsJapgolly.watsonDeveloperCloud.assistantV1Mod.ListIntentsConstants.Sort.UPDATED & String = js.native
  }
}

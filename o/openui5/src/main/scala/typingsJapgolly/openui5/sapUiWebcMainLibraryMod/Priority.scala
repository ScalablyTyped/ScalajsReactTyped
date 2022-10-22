package typingsJapgolly.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Priority extends StObject
@JSImport("sap/ui/webc/main/library", "Priority")
@js.native
object Priority extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Priority & String] = js.native
  
  /**
    * High priority.
    */
  @js.native
  sealed trait High
    extends StObject
       with Priority
  /* "High" */ val High: typingsJapgolly.openui5.sapUiWebcMainLibraryMod.Priority.High & String = js.native
  
  /**
    * Low priority.
    */
  @js.native
  sealed trait Low
    extends StObject
       with Priority
  /* "Low" */ val Low: typingsJapgolly.openui5.sapUiWebcMainLibraryMod.Priority.Low & String = js.native
  
  /**
    * Medium priority.
    */
  @js.native
  sealed trait Medium
    extends StObject
       with Priority
  /* "Medium" */ val Medium: typingsJapgolly.openui5.sapUiWebcMainLibraryMod.Priority.Medium & String = js.native
  
  /**
    * Default, none priority.
    */
  @js.native
  sealed trait None
    extends StObject
       with Priority
  /* "None" */ val None: typingsJapgolly.openui5.sapUiWebcMainLibraryMod.Priority.None & String = js.native
}

package typingsJapgolly.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListSeparators extends StObject
@JSImport("sap/ui/webc/main/library", "ListSeparators")
@js.native
object ListSeparators extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListSeparators & String] = js.native
  
  /**
    * Separators between the items including the last and the first one.
    */
  @js.native
  sealed trait All
    extends StObject
       with ListSeparators
  /* "All" */ val All: typingsJapgolly.openui5.sapUiWebcMainLibraryMod.ListSeparators.All & String = js.native
  
  /**
    * Separators between the items. **Note:** This enumeration depends on the theme.
    */
  @js.native
  sealed trait Inner
    extends StObject
       with ListSeparators
  /* "Inner" */ val Inner: typingsJapgolly.openui5.sapUiWebcMainLibraryMod.ListSeparators.Inner & String = js.native
  
  /**
    * No item separators.
    */
  @js.native
  sealed trait None
    extends StObject
       with ListSeparators
  /* "None" */ val None: typingsJapgolly.openui5.sapUiWebcMainLibraryMod.ListSeparators.None & String = js.native
}

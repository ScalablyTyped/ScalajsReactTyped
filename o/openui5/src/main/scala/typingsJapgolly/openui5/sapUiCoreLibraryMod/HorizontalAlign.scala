package typingsJapgolly.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalAlign extends StObject
@JSImport("sap/ui/core/library", "HorizontalAlign")
@js.native
object HorizontalAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HorizontalAlign & String] = js.native
  
  /**
    * Locale-specific positioning at the beginning of the line
    */
  @js.native
  sealed trait Begin
    extends StObject
       with HorizontalAlign
  /* "Begin" */ val Begin: typingsJapgolly.openui5.sapUiCoreLibraryMod.HorizontalAlign.Begin & String = js.native
  
  /**
    * Centered alignment of text
    */
  @js.native
  sealed trait Center
    extends StObject
       with HorizontalAlign
  /* "Center" */ val Center: typingsJapgolly.openui5.sapUiCoreLibraryMod.HorizontalAlign.Center & String = js.native
  
  /**
    * Locale-specific positioning at the end of the line
    */
  @js.native
  sealed trait End
    extends StObject
       with HorizontalAlign
  /* "End" */ val End: typingsJapgolly.openui5.sapUiCoreLibraryMod.HorizontalAlign.End & String = js.native
  
  /**
    * Hard option for left alignment
    */
  @js.native
  sealed trait Left
    extends StObject
       with HorizontalAlign
  /* "Left" */ val Left: typingsJapgolly.openui5.sapUiCoreLibraryMod.HorizontalAlign.Left & String = js.native
  
  /**
    * Hard option for right alignment
    */
  @js.native
  sealed trait Right
    extends StObject
       with HorizontalAlign
  /* "Right" */ val Right: typingsJapgolly.openui5.sapUiCoreLibraryMod.HorizontalAlign.Right & String = js.native
}

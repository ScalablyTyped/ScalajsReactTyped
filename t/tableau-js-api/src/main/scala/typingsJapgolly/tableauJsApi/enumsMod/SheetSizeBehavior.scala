package typingsJapgolly.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SheetSizeBehavior extends StObject
@JSImport("tableau-js-api/enums", "SheetSizeBehavior")
@js.native
object SheetSizeBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SheetSizeBehavior & String] = js.native
  
  @js.native
  sealed trait ATLEAST
    extends StObject
       with SheetSizeBehavior
  /* "atleast" */ val ATLEAST: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.ATLEAST & String = js.native
  
  @js.native
  sealed trait ATMOST
    extends StObject
       with SheetSizeBehavior
  /* "atmost" */ val ATMOST: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.ATMOST & String = js.native
  
  @js.native
  sealed trait AUTOMATIC
    extends StObject
       with SheetSizeBehavior
  /* "automatic" */ val AUTOMATIC: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.AUTOMATIC & String = js.native
  
  @js.native
  sealed trait EXACTLY
    extends StObject
       with SheetSizeBehavior
  /* "exactly" */ val EXACTLY: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.EXACTLY & String = js.native
  
  @js.native
  sealed trait RANGE
    extends StObject
       with SheetSizeBehavior
  /* "range" */ val RANGE: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.RANGE & String = js.native
}

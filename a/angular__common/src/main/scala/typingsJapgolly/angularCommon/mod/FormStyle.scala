package typingsJapgolly.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormStyle extends StObject
@JSImport("@angular/common", "FormStyle")
@js.native
object FormStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormStyle & Double] = js.native
  
  @js.native
  sealed trait Format
    extends StObject
       with FormStyle
  /* 0 */ val Format: typingsJapgolly.angularCommon.mod.FormStyle.Format & Double = js.native
  
  @js.native
  sealed trait Standalone
    extends StObject
       with FormStyle
  /* 1 */ val Standalone: typingsJapgolly.angularCommon.mod.FormStyle.Standalone & Double = js.native
}

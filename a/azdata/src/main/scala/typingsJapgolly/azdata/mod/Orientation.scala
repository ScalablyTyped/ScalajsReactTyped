package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends StObject
@JSImport("azdata", "Orientation")
@js.native
object Orientation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation & String] = js.native
  
  @js.native
  sealed trait Horizontal
    extends StObject
       with Orientation
  /* "horizontal" */ val Horizontal: typingsJapgolly.azdata.mod.Orientation.Horizontal & String = js.native
  
  @js.native
  sealed trait Vertical
    extends StObject
       with Orientation
  /* "vertical" */ val Vertical: typingsJapgolly.azdata.mod.Orientation.Vertical & String = js.native
}

package typingsJapgolly.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends StObject
@JSGlobal("ClipperLib.Direction")
@js.native
object Direction extends StObject {
  
  @js.native
  sealed trait dLeftToRight
    extends StObject
       with Direction
  
  @js.native
  sealed trait dRightToLeft
    extends StObject
       with Direction
}

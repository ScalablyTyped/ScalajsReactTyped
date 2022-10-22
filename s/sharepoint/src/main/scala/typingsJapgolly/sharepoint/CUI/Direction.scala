package typingsJapgolly.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends StObject
@JSGlobal("CUI.Direction")
@js.native
object Direction extends StObject {
  
  @js.native
  sealed trait LTR
    extends StObject
       with Direction
  
  @js.native
  sealed trait RTL
    extends StObject
       with Direction
}

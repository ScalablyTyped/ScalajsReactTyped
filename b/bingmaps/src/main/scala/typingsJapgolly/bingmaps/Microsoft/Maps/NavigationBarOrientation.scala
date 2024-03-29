package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationBarOrientation extends StObject
@JSGlobal("Microsoft.Maps.NavigationBarOrientation")
@js.native
object NavigationBarOrientation extends StObject {
  
  /** Repositions the buttons in the navigation bar such that they are aligned horizontally. */
  @js.native
  sealed trait horizontal
    extends StObject
       with NavigationBarOrientation
  
  /** Repositions the buttons in the navigation bar such that they are aligned vertically. */
  @js.native
  sealed trait vertical
    extends StObject
       with NavigationBarOrientation
}

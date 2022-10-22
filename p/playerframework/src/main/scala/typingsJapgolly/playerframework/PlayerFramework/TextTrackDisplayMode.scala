package typingsJapgolly.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackDisplayMode extends StObject
@JSGlobal("PlayerFramework.TextTrackDisplayMode")
@js.native
object TextTrackDisplayMode extends StObject {
  
  /**
    * Indicates tracks should be displayed using both custom and native UI. This is useful for debugging.
    */
  @js.native
  sealed trait all
    extends StObject
       with TextTrackDisplayMode
  
  /**
    * Indicates tracks should be displayed using custom UI.
    */
  @js.native
  sealed trait custom
    extends StObject
       with TextTrackDisplayMode
  
  /**
    * Indicates tracks should be displayed using native UI.
    */
  @js.native
  sealed trait native
    extends StObject
       with TextTrackDisplayMode
  
  /**
    * Indicates tracks should not be displayed.
    */
  @js.native
  sealed trait none
    extends StObject
       with TextTrackDisplayMode
}

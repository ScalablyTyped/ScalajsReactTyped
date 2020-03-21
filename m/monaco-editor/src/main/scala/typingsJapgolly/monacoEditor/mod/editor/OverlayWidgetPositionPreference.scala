package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayWidgetPositionPreference extends js.Object

@JSImport("monaco-editor", "editor.OverlayWidgetPositionPreference")
@js.native
object OverlayWidgetPositionPreference extends js.Object {
  /**
    * Position the overlay widget in the bottom right corner
    */
  @js.native
  sealed trait BOTTOM_RIGHT_CORNER extends OverlayWidgetPositionPreference
  
  /**
    * Position the overlay widget in the top center
    */
  @js.native
  sealed trait TOP_CENTER extends OverlayWidgetPositionPreference
  
  /**
    * Position the overlay widget in the top right corner
    */
  @js.native
  sealed trait TOP_RIGHT_CORNER extends OverlayWidgetPositionPreference
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayWidgetPositionPreference with Double] = js.native
  /* 1 */ @js.native
  object BOTTOM_RIGHT_CORNER extends TopLevel[BOTTOM_RIGHT_CORNER with Double]
  
  /* 2 */ @js.native
  object TOP_CENTER extends TopLevel[TOP_CENTER with Double]
  
  /* 0 */ @js.native
  object TOP_RIGHT_CORNER extends TopLevel[TOP_RIGHT_CORNER with Double]
  
}


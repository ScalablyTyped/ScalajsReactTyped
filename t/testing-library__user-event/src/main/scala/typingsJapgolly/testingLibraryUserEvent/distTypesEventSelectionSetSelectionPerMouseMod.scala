package typingsJapgolly.testingLibraryUserEvent

import org.scalajs.dom.Range
import typingsJapgolly.testingLibraryUserEvent.anon.ClickCount
import typingsJapgolly.testingLibraryUserEvent.distTypesEventSelectionMod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventSelectionSetSelectionPerMouseMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection/setSelectionPerMouse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSelectionPerMouseDown(hasDocumentTargetClickCountNodeOffset: ClickCount): js.UndefOr[Range | SelectionRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelectionPerMouseDown")(hasDocumentTargetClickCountNodeOffset.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Range | SelectionRange]]
}

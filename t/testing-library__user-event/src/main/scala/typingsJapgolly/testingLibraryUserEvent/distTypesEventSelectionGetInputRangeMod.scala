package typingsJapgolly.testingLibraryUserEvent

import org.scalajs.dom.Range
import typingsJapgolly.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node
import typingsJapgolly.testingLibraryUserEvent.distTypesDocumentUIMod.UISelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventSelectionGetInputRangeMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection/getInputRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInputRange(focusNode: Node): js.UndefOr[UISelectionRange | Range] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputRange")(focusNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[UISelectionRange | Range]]
}

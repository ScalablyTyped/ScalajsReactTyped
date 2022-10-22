package typingsJapgolly.tinymce.mod

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tinymce", "FocusManager")
@js.native
open class FocusManager () extends StObject
/* static members */
object FocusManager {
  
  @JSImport("tinymce", "FocusManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEditorUIElement(elm: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorUIElement")(elm.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

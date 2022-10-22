package typingsJapgolly.mediumEditor

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.mediumEditor.MediumEditor.CoreOptions
import typingsJapgolly.mediumEditor.MediumEditor.elementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("medium-editor", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typingsJapgolly.mediumEditor.MediumEditor.MediumEditor {
    // Initialization Functions
    def this(elements: elementType) = this()
    def this(elements: elementType, options: CoreOptions) = this()
  }
  @JSImport("medium-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Object & typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  
  type _To = js.Object & typingsJapgolly.mediumEditor.MediumEditor.MediumEditor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = ^
}

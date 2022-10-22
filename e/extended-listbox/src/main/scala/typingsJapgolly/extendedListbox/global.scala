package typingsJapgolly.extendedListbox

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MultiSelectListBox")
  @js.native
  open class MultiSelectListBox protected ()
    extends StObject
       with BaseListBox {
    def this(domElement: HTMLElement) = this()
    def this(domElement: HTMLElement, options: ListBoxSettings) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("SingleSelectListBox")
  @js.native
  open class SingleSelectListBox protected ()
    extends StObject
       with BaseListBox {
    def this(domElement: HTMLElement) = this()
    def this(domElement: HTMLElement, options: ListBoxSettings) = this()
  }
}

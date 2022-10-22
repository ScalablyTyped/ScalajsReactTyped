package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.Document
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.ChangeType
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewRendererMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/renderer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Renderer {
    def this(
      domConverter: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default,
      selection: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentselectionMod.default
    ) = this()
  }
  
  @js.native
  trait Renderer extends StObject {
    
    val domConverter: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default = js.native
    
    val domDocuments: Set[Document] = js.native
    
    def isFocused: Boolean = js.native
    /* protected */ def isFocused_=(value: Boolean): Unit = js.native
    
    def isSelecting: Boolean = js.native
    /* protected */ def isSelecting_=(value: Boolean): Unit = js.native
    
    /**
      * Marks a view node to be updated in the DOM by {@link #render `render()`}.
      *
      * Note that only view nodes whose parents have corresponding DOM elements need to be marked to be synchronized.
      * @see #markedAttributes
      * @see #markedChildren
      * @see #markedTexts
      */
    def markToSync(`type`: ChangeType, node: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default): Unit = js.native
    
    val markedAttributes: Set[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    val markedChildren: Set[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    val markedTexts: Set[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    /**
      * Renders all buffered changes ({@link #markedAttributes}, {@link #markedChildren} and {@link #markedTexts}) and
      * the current view selection (if needed) to the DOM by applying a minimal set of changes to it.
      *
      * Renderer tries not to break the text composition (e.g. IME) and x-index of the selection,
      * so it does as little as it is needed to update the DOM.
      *
      * Renderer also handles {@link module:engine/view/filler fillers}. Especially, it checks if the inline filler is needed
      * at the selection position and adds or removes it. To prevent breaking text composition inline filler will not be
      * removed as long as the selection is in the text node which needed it at first.
      */
    def render(): Unit = js.native
    
    val selection: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentselectionMod.default = js.native
  }
}

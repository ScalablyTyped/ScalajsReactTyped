package typingsJapgolly.ckeditor4.CKEDITOR.plugins

import typingsJapgolly.ckeditor4.CKEDITOR.event
import typingsJapgolly.ckeditor4.CKEDITOR.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyformatting {
  
  @js.native
  trait state
    extends StObject
       with event {
    
    var editor: typingsJapgolly.ckeditor4.CKEDITOR.editor = js.native
    
    var filter: typingsJapgolly.ckeditor4.CKEDITOR.filter = js.native
    
    var sticky: Boolean = js.native
    
    var styles: js.Array[style] = js.native
  }
}

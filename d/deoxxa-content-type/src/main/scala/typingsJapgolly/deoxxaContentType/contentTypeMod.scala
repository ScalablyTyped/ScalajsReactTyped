package typingsJapgolly.deoxxaContentType

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.deoxxaContentType.ContentType.MediaType
import typingsJapgolly.deoxxaContentType.ContentType.MediaTypeStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentTypeMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("content-type", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MediaType {
    def this(s: String) = this()
    def this(s: String, p: Any) = this()
    
    /* CompleteClass */
    var params: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("content-type", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MediaTypeStatic = js.native
  
  type _To = js.Object & MediaTypeStatic
  
  /* This means you don't have to write `^`, but can instead just say `contentTypeMod.foo` */
  override def _to: js.Object & MediaTypeStatic = ^
}

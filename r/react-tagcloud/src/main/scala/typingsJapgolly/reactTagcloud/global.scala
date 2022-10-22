package typingsJapgolly.reactTagcloud

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactTagcloud.ReactTagCloud_.DefaultRendererFactory
import typingsJapgolly.reactTagcloud.ReactTagCloud_.TagCloudProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // export = TagCloud
  object reactTagCloud {
    
    @JSGlobal("reactTagCloud.DefaultRenderer")
    @js.native
    val DefaultRenderer: DefaultRendererFactory = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("reactTagCloud.TagCloud")
    @js.native
    open class TagCloud protected ()
      extends Component[TagCloudProps, js.Object, Any] {
      def this(props: TagCloudProps) = this()
      def this(props: TagCloudProps, context: Any) = this()
    }
    @JSGlobal("reactTagCloud.TagCloud")
    @js.native
    val TagCloud: ComponentClassP[TagCloudProps & js.Object] = js.native
  }
}

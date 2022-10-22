package typingsJapgolly.reactTagcloud

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactTagcloud.ReactTagCloud_.DefaultRendererFactory
import typingsJapgolly.reactTagcloud.ReactTagCloud_.TagCloudProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tagcloud", "DefaultRenderer")
  @js.native
  val DefaultRenderer: DefaultRendererFactory = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-tagcloud", "TagCloud")
  @js.native
  open class TagCloud protected ()
    extends Component[TagCloudProps, js.Object, Any] {
    def this(props: TagCloudProps) = this()
    def this(props: TagCloudProps, context: Any) = this()
  }
  @JSImport("react-tagcloud", "TagCloud")
  @js.native
  val TagCloud: ComponentClassP[TagCloudProps & js.Object] = js.native
}

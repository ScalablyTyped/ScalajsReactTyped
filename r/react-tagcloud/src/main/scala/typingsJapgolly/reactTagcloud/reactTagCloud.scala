package typingsJapgolly.reactTagcloud

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.reactTagcloud.ReactTagCloud_.DefaultRendererFactory
import typingsJapgolly.reactTagcloud.ReactTagCloud_.TagCloudClass
import typingsJapgolly.reactTagcloud.ReactTagCloud_.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// export = TagCloud
@JSGlobal("reactTagCloud")
@js.native
object reactTagCloud extends js.Object {
  @js.native
  class TagCloud protected ()
    extends Component[TagCloudProps, ComponentState, js.Any] {
    def this(props: TagCloudProps) = this()
    def this(props: TagCloudProps, context: js.Any) = this()
  }
  
  val DefaultRenderer: DefaultRendererFactory = js.native
  @js.native
  object TagCloud extends TopLevel[TagCloudClass]
  
}


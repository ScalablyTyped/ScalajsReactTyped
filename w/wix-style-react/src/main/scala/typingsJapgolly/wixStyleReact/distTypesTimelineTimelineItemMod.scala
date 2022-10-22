package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.CustomPrefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimelineTimelineItemMod {
  
  /** A timeline item is a display of a timeline event */
  @JSImport("wix-style-react/dist/types/Timeline/TimelineItem", JSImport.Default)
  @js.native
  open class default protected () extends TimelineItem {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Timeline/TimelineItem", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Timeline/TimelineItem", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Timeline/TimelineItem", "default.propTypes.idx")
      @js.native
      val idx: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Timeline/TimelineItem", "default.propTypes.item")
      @js.native
      val item: Validator[InferProps[CustomPrefix]] = js.native
    }
  }
  
  /** A timeline item is a display of a timeline event */
  @js.native
  trait TimelineItem extends PureComponent[Any, Any, Any]
}

package typingsJapgolly.reactInfiniteScrollComponent

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactInfiniteScrollComponent.anon.HasMore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStoriesInfiniteScrollWithHeightMod {
  
  @JSImport("react-infinite-scroll-component/dist/stories/InfiniteScrollWithHeight", JSImport.Default)
  @js.native
  open class default () extends App
  
  @js.native
  trait App
    extends Component[js.Object, js.Object, Any] {
    
    def fetchMoreData(): Unit = js.native
    
    @JSName("state")
    var state_App: HasMore = js.native
  }
}

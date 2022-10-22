package typingsJapgolly.reactWindowInfiniteLoader.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactWindowInfiniteLoader.anon.OnItemsRendered
import typingsJapgolly.reactWindowInfiniteLoader.mod.InfiniteLoaderProps
import typingsJapgolly.reactWindowInfiniteLoader.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactWindowInfiniteLoader {
  
  inline def apply(
    children: OnItemsRendered => Node,
    isItemLoaded: Double => Boolean,
    itemCount: Double,
    loadMoreItems: (Double, Double) => js.Promise[Unit] | Unit
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount.asInstanceOf[js.Any], loadMoreItems = js.Any.fromFunction2(loadMoreItems))
    new Builder(js.Array(this.component, __props.asInstanceOf[InfiniteLoaderProps]))
  }
  
  @JSImport("react-window-infinite-loader", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def minimumBatchSize(value: Double): this.type = set("minimumBatchSize", value.asInstanceOf[js.Any])
    
    inline def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InfiniteLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

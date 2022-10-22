package typingsJapgolly.reactInfinite.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_InfiniteProps863782198[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def containerHeight(value: Double): this.type = set("containerHeight", value.asInstanceOf[js.Any])
  
  inline def displayBottomUpwards(value: Boolean): this.type = set("displayBottomUpwards", value.asInstanceOf[js.Any])
  
  inline def handleScroll(value: /* node */ Element => Callback): this.type = set("handleScroll", js.Any.fromFunction1((t0: /* node */ Element) => value(t0).runNow()))
  
  inline def infiniteLoadBeginBottomOffset(value: Double): this.type = set("infiniteLoadBeginBottomOffset", value.asInstanceOf[js.Any])
  
  inline def infiniteLoadBeginEdgeOffset(value: Double): this.type = set("infiniteLoadBeginEdgeOffset", value.asInstanceOf[js.Any])
  
  inline def isInfiniteLoading(value: Boolean): this.type = set("isInfiniteLoading", value.asInstanceOf[js.Any])
  
  inline def loadingSpinnerDelegate(value: VdomElement): this.type = set("loadingSpinnerDelegate", value.rawElement.asInstanceOf[js.Any])
  
  inline def onInfiniteLoad(value: Callback): this.type = set("onInfiniteLoad", value.toJsFn)
  
  inline def preloadAdditionalHeight(value: Double | js.Object): this.type = set("preloadAdditionalHeight", value.asInstanceOf[js.Any])
  
  inline def preloadBatchSize(value: Double | js.Object): this.type = set("preloadBatchSize", value.asInstanceOf[js.Any])
  
  inline def timeScrollStateLastsForAfterUserScrolls(value: Double): this.type = set("timeScrollStateLastsForAfterUserScrolls", value.asInstanceOf[js.Any])
  
  inline def useWindowAsScrollContainer(value: Boolean): this.type = set("useWindowAsScrollContainer", value.asInstanceOf[js.Any])
}

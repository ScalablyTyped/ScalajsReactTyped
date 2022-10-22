package typingsJapgolly.reactInfiniteScrollComponent.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactInfiniteScrollComponent.mod.Props
import typingsJapgolly.reactInfiniteScrollComponent.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactInfiniteScrollComponent {
  
  inline def apply(dataLength: Double, hasMore: Boolean, next: CallbackTo[Any]): Builder = {
    val __props = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], next = next.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-infinite-scroll-component", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def endMessage(value: VdomNode): this.type = set("endMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def endMessageNull: this.type = set("endMessage", null)
    
    inline def endMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("endMessage", js.Array(value*))
    
    inline def endMessageVdomElement(value: VdomElement): this.type = set("endMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def hasChildren(value: Boolean): this.type = set("hasChildren", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def initialScrollY(value: Double): this.type = set("initialScrollY", value.asInstanceOf[js.Any])
    
    inline def inverse(value: Boolean): this.type = set("inverse", value.asInstanceOf[js.Any])
    
    inline def loader(value: VdomNode): this.type = set("loader", value.rawNode.asInstanceOf[js.Any])
    
    inline def loaderNull: this.type = set("loader", null)
    
    inline def loaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loader", js.Array(value*))
    
    inline def loaderVdomElement(value: VdomElement): this.type = set("loader", value.rawElement.asInstanceOf[js.Any])
    
    inline def onScroll(value: /* e */ MouseEvent => Any): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    inline def pullDownToRefresh(value: Boolean): this.type = set("pullDownToRefresh", value.asInstanceOf[js.Any])
    
    inline def pullDownToRefreshContent(value: VdomNode): this.type = set("pullDownToRefreshContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def pullDownToRefreshContentNull: this.type = set("pullDownToRefreshContent", null)
    
    inline def pullDownToRefreshContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("pullDownToRefreshContent", js.Array(value*))
    
    inline def pullDownToRefreshContentVdomElement(value: VdomElement): this.type = set("pullDownToRefreshContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def pullDownToRefreshThreshold(value: Double): this.type = set("pullDownToRefreshThreshold", value.asInstanceOf[js.Any])
    
    inline def refreshFunction(value: CallbackTo[Any]): this.type = set("refreshFunction", value.toJsFn)
    
    inline def releaseToRefreshContent(value: VdomNode): this.type = set("releaseToRefreshContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def releaseToRefreshContentNull: this.type = set("releaseToRefreshContent", null)
    
    inline def releaseToRefreshContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("releaseToRefreshContent", js.Array(value*))
    
    inline def releaseToRefreshContentVdomElement(value: VdomElement): this.type = set("releaseToRefreshContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def scrollThreshold(value: Double | String): this.type = set("scrollThreshold", value.asInstanceOf[js.Any])
    
    inline def scrollableTarget(value: VdomNode): this.type = set("scrollableTarget", value.rawNode.asInstanceOf[js.Any])
    
    inline def scrollableTargetNull: this.type = set("scrollableTarget", null)
    
    inline def scrollableTargetVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("scrollableTarget", js.Array(value*))
    
    inline def scrollableTargetVdomElement(value: VdomElement): this.type = set("scrollableTarget", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

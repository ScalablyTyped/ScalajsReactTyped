package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.wixStyleReact.distTypesSelectorListContentMod.SelectorListContentProps
import typingsJapgolly.wixStyleReact.distTypesSelectorListContentMod.SelectorListImageShape
import typingsJapgolly.wixStyleReact.distTypesSelectorListContentMod.SelectorListImageSize
import typingsJapgolly.wixStyleReact.distTypesSelectorListContentMod.SelectorListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectorListContent {
  
  inline def apply(
    checkIsSelected: SelectorListItem => Boolean,
    items: js.Array[SelectorListItem],
    loadMore: Callback,
    onToggle: SelectorListItem => Callback,
    searchValue: String
  ): Builder = {
    val __props = js.Dynamic.literal(checkIsSelected = js.Any.fromFunction1(checkIsSelected), items = items.asInstanceOf[js.Any], loadMore = loadMore.toJsFn, onToggle = js.Any.fromFunction1((t0: SelectorListItem) => onToggle(t0).runNow()), searchValue = searchValue.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectorListContentProps]))
  }
  
  @JSImport("wix-style-react", "SelectorListContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checkIndeterminate(value: /* item */ SelectorListItem => Boolean): this.type = set("checkIndeterminate", js.Any.fromFunction1(value))
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def emptyState(value: VdomNode): this.type = set("emptyState", value.rawNode.asInstanceOf[js.Any])
    
    inline def emptyStateNull: this.type = set("emptyState", null)
    
    inline def emptyStateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyState", js.Array(value*))
    
    inline def emptyStateVdomElement(value: VdomElement): this.type = set("emptyState", value.rawElement.asInstanceOf[js.Any])
    
    inline def hasMore(value: Boolean): this.type = set("hasMore", value.asInstanceOf[js.Any])
    
    inline def imageShape(value: SelectorListImageShape): this.type = set("imageShape", value.asInstanceOf[js.Any])
    
    inline def imageSize(value: SelectorListImageSize): this.type = set("imageSize", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollRef(value: Ref[Any]): this.type = set("infiniteScrollRef", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollRefFunction1(value: Any | Null => Callback): this.type = set("infiniteScrollRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def infiniteScrollRefNull: this.type = set("infiniteScrollRef", null)
    
    inline def isEmpty(value: Boolean): this.type = set("isEmpty", value.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def noResultsFound(value: Boolean): this.type = set("noResultsFound", value.asInstanceOf[js.Any])
    
    inline def renderNoResults(value: /* searchValue */ String => Node): this.type = set("renderNoResults", js.Any.fromFunction1(value))
    
    inline def topScrollableContent(value: VdomNode): this.type = set("topScrollableContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def topScrollableContentNull: this.type = set("topScrollableContent", null)
    
    inline def topScrollableContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("topScrollableContent", js.Array(value*))
    
    inline def topScrollableContentVdomElement(value: VdomElement): this.type = set("topScrollableContent", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectorListContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

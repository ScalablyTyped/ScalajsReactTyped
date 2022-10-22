package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.ItemsTotalCount
import typingsJapgolly.wixStyleReact.anon.RenderList
import typingsJapgolly.wixStyleReact.distTypesSelectorListContentMod.SelectorListImageShape
import typingsJapgolly.wixStyleReact.distTypesSelectorListContentMod.SelectorListImageSize
import typingsJapgolly.wixStyleReact.distTypesSelectorListContentMod.SelectorListItem
import typingsJapgolly.wixStyleReact.distTypesSelectorListMod.SelectorListCommonProps
import typingsJapgolly.wixStyleReact.distTypesSelectorListMod.SelectorListMultipleProps
import typingsJapgolly.wixStyleReact.distTypesSelectorListMod.SelectorListSingleProps
import typingsJapgolly.wixStyleReact.wixStyleReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectorList {
  
  object SelectorListMultiplePropsSelectorListCommonProps {
    
    inline def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[ItemsTotalCount]
    ): Builder = {
      val __props = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource), multiple = true)
      new Builder(js.Array(this.component, __props.asInstanceOf[SelectorListMultipleProps & SelectorListCommonProps]))
    }
    
    @JSImport("wix-style-react", "SelectorList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SelectorList] {
      
      inline def children(value: /* args */ RenderList => Node): this.type = set("children", js.Any.fromFunction1(value))
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
      
      inline def deselectAllText(value: String): this.type = set("deselectAllText", value.asInstanceOf[js.Any])
      
      inline def emptyState(value: VdomNode): this.type = set("emptyState", value.rawNode.asInstanceOf[js.Any])
      
      inline def emptyStateNull: this.type = set("emptyState", null)
      
      inline def emptyStateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyState", js.Array(value*))
      
      inline def emptyStateVdomElement(value: VdomElement): this.type = set("emptyState", value.rawElement.asInstanceOf[js.Any])
      
      inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def imageShape(value: SelectorListImageShape): this.type = set("imageShape", value.asInstanceOf[js.Any])
      
      inline def imageSize(value: SelectorListImageSize): this.type = set("imageSize", value.asInstanceOf[js.Any])
      
      inline def initialAmountToLoad(value: Double): this.type = set("initialAmountToLoad", value.asInstanceOf[js.Any])
      
      inline def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
      
      inline def onSelect(value: /* item */ SelectorListItem => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* item */ SelectorListItem) => value(t0).runNow()))
      
      inline def renderNoResults(value: /* searchValue */ String => Node): this.type = set("renderNoResults", js.Any.fromFunction1(value))
      
      inline def searchDebounceMs(value: Double): this.type = set("searchDebounceMs", value.asInstanceOf[js.Any])
      
      inline def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def selectAllText(value: String): this.type = set("selectAllText", value.asInstanceOf[js.Any])
      
      inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def subtitleNull: this.type = set("subtitle", null)
      
      inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
      
      inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def withSearch(value: Boolean): this.type = set("withSearch", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: SelectorListMultipleProps & SelectorListCommonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SelectorListSinglePropsSelectorListCommonProps {
    
    inline def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[ItemsTotalCount]
    ): Builder = {
      val __props = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource))
      new Builder(js.Array(this.component, __props.asInstanceOf[SelectorListSingleProps & SelectorListCommonProps]))
    }
    
    @JSImport("wix-style-react", "SelectorList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SelectorList] {
      
      inline def children(value: /* args */ RenderList => Node): this.type = set("children", js.Any.fromFunction1(value))
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
      
      inline def deselectAllText(value: String): this.type = set("deselectAllText", value.asInstanceOf[js.Any])
      
      inline def emptyState(value: VdomNode): this.type = set("emptyState", value.rawNode.asInstanceOf[js.Any])
      
      inline def emptyStateNull: this.type = set("emptyState", null)
      
      inline def emptyStateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyState", js.Array(value*))
      
      inline def emptyStateVdomElement(value: VdomElement): this.type = set("emptyState", value.rawElement.asInstanceOf[js.Any])
      
      inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def imageShape(value: SelectorListImageShape): this.type = set("imageShape", value.asInstanceOf[js.Any])
      
      inline def imageSize(value: SelectorListImageSize): this.type = set("imageSize", value.asInstanceOf[js.Any])
      
      inline def initialAmountToLoad(value: Double): this.type = set("initialAmountToLoad", value.asInstanceOf[js.Any])
      
      inline def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
      
      inline def multiple(value: `false`): this.type = set("multiple", value.asInstanceOf[js.Any])
      
      inline def onSelect(value: /* item */ SelectorListItem => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* item */ SelectorListItem) => value(t0).runNow()))
      
      inline def renderNoResults(value: /* searchValue */ String => Node): this.type = set("renderNoResults", js.Any.fromFunction1(value))
      
      inline def searchDebounceMs(value: Double): this.type = set("searchDebounceMs", value.asInstanceOf[js.Any])
      
      inline def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def selectAllText(value: String): this.type = set("selectAllText", value.asInstanceOf[js.Any])
      
      inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def subtitleNull: this.type = set("subtitle", null)
      
      inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
      
      inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def withSearch(value: Boolean): this.type = set("withSearch", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: SelectorListSingleProps & SelectorListCommonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}

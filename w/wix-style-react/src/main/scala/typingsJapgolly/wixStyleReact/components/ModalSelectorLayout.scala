package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.TotalCount
import typingsJapgolly.wixStyleReact.distTypesModalSelectorLayoutMod.ModalSelectorLayoutCommonProps
import typingsJapgolly.wixStyleReact.distTypesModalSelectorLayoutMod.ModalSelectorLayoutImageShape
import typingsJapgolly.wixStyleReact.distTypesModalSelectorLayoutMod.ModalSelectorLayoutImageSize
import typingsJapgolly.wixStyleReact.distTypesModalSelectorLayoutMod.ModalSelectorLayoutItem
import typingsJapgolly.wixStyleReact.distTypesModalSelectorLayoutMod.ModalSelectorLayoutMultipleProps
import typingsJapgolly.wixStyleReact.distTypesModalSelectorLayoutMod.ModalSelectorLayoutSingleProps
import typingsJapgolly.wixStyleReact.wixStyleReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalSelectorLayout {
  
  object ModalSelectorLayoutMultiplePropsModalSelectorLayoutCommonProps {
    
    inline def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[TotalCount]
    ): Builder = {
      val __props = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource), multiple = true)
      new Builder(js.Array(this.component, __props.asInstanceOf[ModalSelectorLayoutMultipleProps & ModalSelectorLayoutCommonProps]))
    }
    
    @JSImport("wix-style-react", "ModalSelectorLayout")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.ModalSelectorLayout] {
      
      inline def cancelButtonText(value: String): this.type = set("cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
      
      inline def deselectAllText(value: String): this.type = set("deselectAllText", value.asInstanceOf[js.Any])
      
      inline def disableConfirmation(value: Boolean): this.type = set("disableConfirmation", value.asInstanceOf[js.Any])
      
      inline def emptyState(value: VdomNode): this.type = set("emptyState", value.rawNode.asInstanceOf[js.Any])
      
      inline def emptyStateNull: this.type = set("emptyState", null)
      
      inline def emptyStateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyState", js.Array(value*))
      
      inline def emptyStateVdomElement(value: VdomElement): this.type = set("emptyState", value.rawElement.asInstanceOf[js.Any])
      
      inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def imageShape(value: ModalSelectorLayoutImageShape): this.type = set("imageShape", value.asInstanceOf[js.Any])
      
      inline def imageSize(value: ModalSelectorLayoutImageSize): this.type = set("imageSize", value.asInstanceOf[js.Any])
      
      inline def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
      
      inline def noResultsFoundStateFactory(value: /* searchValue */ String => Node): this.type = set("noResultsFoundStateFactory", js.Any.fromFunction1(value))
      
      inline def okButtonText(value: String): this.type = set("okButtonText", value.asInstanceOf[js.Any])
      
      inline def onCancel(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCancel", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onClose(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onOk(value: /* selectedItems */ js.Array[ModalSelectorLayoutItem] => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: /* selectedItems */ js.Array[ModalSelectorLayoutItem]) => value(t0).runNow()))
      
      inline def onSelect(value: /* item */ ModalSelectorLayoutItem => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* item */ ModalSelectorLayoutItem) => value(t0).runNow()))
      
      inline def searchDebounceMs(value: Double): this.type = set("searchDebounceMs", value.asInstanceOf[js.Any])
      
      inline def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def selectAllText(value: String): this.type = set("selectAllText", value.asInstanceOf[js.Any])
      
      inline def sideActions(value: VdomNode): this.type = set("sideActions", value.rawNode.asInstanceOf[js.Any])
      
      inline def sideActionsNull: this.type = set("sideActions", null)
      
      inline def sideActionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sideActions", js.Array(value*))
      
      inline def sideActionsVdomElement(value: VdomElement): this.type = set("sideActions", value.rawElement.asInstanceOf[js.Any])
      
      inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def subtitleNull: this.type = set("subtitle", null)
      
      inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
      
      inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
      
      inline def titleNull: this.type = set("title", null)
      
      inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
      
      inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
      
      inline def withSearch(value: Boolean): this.type = set("withSearch", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ModalSelectorLayoutMultipleProps & ModalSelectorLayoutCommonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ModalSelectorLayoutSinglePropsModalSelectorLayoutCommonProps {
    
    inline def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[TotalCount]
    ): Builder = {
      val __props = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource))
      new Builder(js.Array(this.component, __props.asInstanceOf[ModalSelectorLayoutSingleProps & ModalSelectorLayoutCommonProps]))
    }
    
    @JSImport("wix-style-react", "ModalSelectorLayout")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.ModalSelectorLayout] {
      
      inline def cancelButtonText(value: String): this.type = set("cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
      
      inline def deselectAllText(value: String): this.type = set("deselectAllText", value.asInstanceOf[js.Any])
      
      inline def disableConfirmation(value: Boolean): this.type = set("disableConfirmation", value.asInstanceOf[js.Any])
      
      inline def emptyState(value: VdomNode): this.type = set("emptyState", value.rawNode.asInstanceOf[js.Any])
      
      inline def emptyStateNull: this.type = set("emptyState", null)
      
      inline def emptyStateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyState", js.Array(value*))
      
      inline def emptyStateVdomElement(value: VdomElement): this.type = set("emptyState", value.rawElement.asInstanceOf[js.Any])
      
      inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def imageShape(value: ModalSelectorLayoutImageShape): this.type = set("imageShape", value.asInstanceOf[js.Any])
      
      inline def imageSize(value: ModalSelectorLayoutImageSize): this.type = set("imageSize", value.asInstanceOf[js.Any])
      
      inline def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
      
      inline def multiple(value: `false`): this.type = set("multiple", value.asInstanceOf[js.Any])
      
      inline def noResultsFoundStateFactory(value: /* searchValue */ String => Node): this.type = set("noResultsFoundStateFactory", js.Any.fromFunction1(value))
      
      inline def okButtonText(value: String): this.type = set("okButtonText", value.asInstanceOf[js.Any])
      
      inline def onCancel(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCancel", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onClose(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onOk(value: /* selectedItem */ ModalSelectorLayoutItem => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: /* selectedItem */ ModalSelectorLayoutItem) => value(t0).runNow()))
      
      inline def onSelect(value: /* item */ ModalSelectorLayoutItem => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* item */ ModalSelectorLayoutItem) => value(t0).runNow()))
      
      inline def searchDebounceMs(value: Double): this.type = set("searchDebounceMs", value.asInstanceOf[js.Any])
      
      inline def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def selectAllText(value: String): this.type = set("selectAllText", value.asInstanceOf[js.Any])
      
      inline def sideActions(value: VdomNode): this.type = set("sideActions", value.rawNode.asInstanceOf[js.Any])
      
      inline def sideActionsNull: this.type = set("sideActions", null)
      
      inline def sideActionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sideActions", js.Array(value*))
      
      inline def sideActionsVdomElement(value: VdomElement): this.type = set("sideActions", value.rawElement.asInstanceOf[js.Any])
      
      inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def subtitleNull: this.type = set("subtitle", null)
      
      inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
      
      inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
      
      inline def titleNull: this.type = set("title", null)
      
      inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
      
      inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
      
      inline def withSearch(value: Boolean): this.type = set("withSearch", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ModalSelectorLayoutSingleProps & ModalSelectorLayoutCommonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}

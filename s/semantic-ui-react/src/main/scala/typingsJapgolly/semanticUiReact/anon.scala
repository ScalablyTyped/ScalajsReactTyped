package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabPaneMod.TabPaneProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[TProps /* <: Record[String, Any] */] extends StObject {
    
    // Not all TProps can have `children`, without this condition it will match to "any"
    var children: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps extends {  children :any} ? TProps['children'] | semantic-ui-react.semantic-ui-react/dist/commonjs/generic.ShorthandRenderFunction<react.react.ElementType<TProps>, TProps> : semantic-ui-react.semantic-ui-react/dist/commonjs/generic.ShorthandRenderFunction<react.react.ElementType<TProps>, TProps> */ js.Any
      ] = js.undefined
  }
  object Children {
    
    inline def apply[TProps /* <: Record[String, Any] */](): Children[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[TProps]]
    }
    
    extension [Self <: Children[?], TProps /* <: Record[String, Any] */](x: Self & Children[TProps]) {
      
      inline def setChildren(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TProps extends {  children :any} ? TProps['children'] | semantic-ui-react.semantic-ui-react/dist/commonjs/generic.ShorthandRenderFunction<react.react.ElementType<TProps>, TProps> : semantic-ui-react.semantic-ui-react/dist/commonjs/generic.ShorthandRenderFunction<react.react.ElementType<TProps>, TProps> */ js.Any
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait MenuItem extends StObject {
    
    var menuItem: js.UndefOr[Any] = js.undefined
    
    var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.undefined
    
    var render: js.UndefOr[js.Function0[Node]] = js.undefined
  }
  object MenuItem {
    
    inline def apply(): MenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItem]
    }
    
    extension [Self <: MenuItem](x: Self) {
      
      inline def setMenuItem(value: Any): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
      
      inline def setMenuItemUndefined: Self = StObject.set(x, "menuItem", js.undefined)
      
      inline def setPane(value: SemanticShorthandItem[TabPaneProps]): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
      
      inline def setPaneFunction3(
        value: (/* component */ ElementType, TabPaneProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "pane", js.Any.fromFunction3(value))
      
      inline def setPaneNull: Self = StObject.set(x, "pane", null)
      
      inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
      
      inline def setPaneVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "pane", js.Array(value*))
      
      inline def setPaneVdomElement(value: VdomElement): Self = StObject.set(x, "pane", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRender(value: CallbackTo[Node]): Self = StObject.set(x, "render", value.toJsFn)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  /* Inlined std.Pick<semantic-ui-react.semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout.SearchCategoryLayoutProps, 'categoryContent' | 'resultsContent'> */
  trait PickSearchCategoryLayoutP extends StObject {
    
    var categoryContent: Element
    
    var resultsContent: Element
  }
  object PickSearchCategoryLayoutP {
    
    inline def apply(categoryContent: VdomElement, resultsContent: VdomElement): PickSearchCategoryLayoutP = {
      val __obj = js.Dynamic.literal(categoryContent = categoryContent.rawElement.asInstanceOf[js.Any], resultsContent = resultsContent.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickSearchCategoryLayoutP]
    }
    
    extension [Self <: PickSearchCategoryLayoutP](x: Self) {
      
      inline def setCategoryContent(value: VdomElement): Self = StObject.set(x, "categoryContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setResultsContent(value: VdomElement): Self = StObject.set(x, "resultsContent", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@fluentui/react-component-ref.@fluentui/react-component-ref/dist/es/Ref.RefProps> */
  trait ReadonlyRefProps extends StObject {
    
    val children: Element
    
    val innerRef: Ref[HTMLElement]
  }
  object ReadonlyRefProps {
    
    inline def apply(children: VdomElement): ReadonlyRefProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], innerRef = null)
      __obj.asInstanceOf[ReadonlyRefProps]
    }
    
    extension [Self <: ReadonlyRefProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
}

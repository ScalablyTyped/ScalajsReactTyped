package typingsJapgolly.mdxJsReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.mdx.typesMod.MDXComponents
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@mdx-js/react/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mdx-js/react/lib", "MDXContext")
  @js.native
  val MDXContext: Context[Components] = js.native
  
  inline def MDXProvider(hasComponentsChildrenDisableParentContext: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MDXProvider")(hasComponentsChildrenDisableParentContext.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useMDXComponents(): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")().asInstanceOf[Components]
  inline def useMDXComponents(components: MDXComponents): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")(components.asInstanceOf[js.Any]).asInstanceOf[Components]
  inline def useMDXComponents(components: MergeComponents): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")(components.asInstanceOf[js.Any]).asInstanceOf[Components]
  
  inline def withMDXComponents(Component: ComponentType[Any]): js.Function1[
    /* props */ (Record[String, Any]) & typingsJapgolly.mdxJsReact.anon.Components, 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMDXComponents")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ (Record[String, Any]) & typingsJapgolly.mdxJsReact.anon.Components, 
    Element
  ]]
  
  type Components = MDXComponents
  
  type MergeComponents = js.Function1[/* currentComponents */ Components, Components]
  
  trait Props extends StObject {
    
    /**
      * Children.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Mapping of names for JSX components to React components.
      */
    var components: js.UndefOr[MDXComponents] = js.undefined
    
    /**
      * Turn off outer component context.
      */
    var disableParentContext: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponents(value: MDXComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDisableParentContext(value: Boolean): Self = StObject.set(x, "disableParentContext", value.asInstanceOf[js.Any])
      
      inline def setDisableParentContextUndefined: Self = StObject.set(x, "disableParentContext", js.undefined)
    }
  }
  
  type ReactNode = Node
}

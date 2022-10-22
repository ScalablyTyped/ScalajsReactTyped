package typingsJapgolly.reactMedia

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Window
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Q](props: MultiQueryProps[Q]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait BaseProps extends StObject {
    
    var render: js.UndefOr[js.Function0[Node]] = js.undefined
    
    var targetWindow: js.UndefOr[Window] = js.undefined
  }
  object BaseProps {
    
    inline def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    extension [Self <: BaseProps](x: Self) {
      
      inline def setRender(value: CallbackTo[Node]): Self = StObject.set(x, "render", value.toJsFn)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTargetWindow(value: Window): Self = StObject.set(x, "targetWindow", value.asInstanceOf[js.Any])
      
      inline def setTargetWindowUndefined: Self = StObject.set(x, "targetWindow", js.undefined)
    }
  }
  
  /**
    * The type of the `queries` prop
    */
  type MediaQueries = StringDictionary[MediaQueryValue]
  
  type MediaQueryObject = StringDictionary[Boolean | Double | String]
  
  /**
    * All allowed forms of media query inputs
    */
  type MediaQueryValue = String | MediaQueryObject | js.Array[MediaQueryObject]
  
  trait MultiQueryProps[Queries]
    extends StObject
       with BaseProps {
    
    var children: js.UndefOr[(js.Function1[/* matches */ QueryResults[Queries], Node]) | Node] = js.undefined
    
    var defaultMatches: js.UndefOr[Partial[QueryResults[Queries]]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* matches */ QueryResults[Queries], Unit]] = js.undefined
    
    var queries: Queries
  }
  object MultiQueryProps {
    
    inline def apply[Queries](queries: Queries): MultiQueryProps[Queries] = {
      val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiQueryProps[Queries]]
    }
    
    extension [Self <: MultiQueryProps[?], Queries](x: Self & MultiQueryProps[Queries]) {
      
      inline def setChildren(value: (js.Function1[/* matches */ QueryResults[Queries], Node]) | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* matches */ QueryResults[Queries] => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultMatches(value: Partial[QueryResults[Queries]]): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
      
      inline def setOnChange(value: /* matches */ QueryResults[Queries] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* matches */ QueryResults[Queries]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setQueries(value: Queries): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The type of returned `matches` in case the `queries` prop is provided. The keys on `matches`
    * are inferred from the shape of `queries`.
    *
    * @example
    *
    * <Media queries={{ small: '...', medium: '...' }}>{
    *   // matches: { small: boolean, medium: boolean }
    *   matches => {}
    * }</Media>
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof Queries ]: boolean}
    }}}
    */
  @js.native
  trait QueryResults[Queries] extends StObject
  
  trait SingleQueryProps
    extends StObject
       with BaseProps {
    
    var children: js.UndefOr[(js.Function1[/* matches */ Boolean, Node]) | Node] = js.undefined
    
    var defaultMatches: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
    
    var query: MediaQueryValue
  }
  object SingleQueryProps {
    
    inline def apply(query: MediaQueryValue): SingleQueryProps = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleQueryProps]
    }
    
    extension [Self <: SingleQueryProps](x: Self) {
      
      inline def setChildren(value: (js.Function1[/* matches */ Boolean, Node]) | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* matches */ Boolean => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultMatches(value: Boolean): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
      
      inline def setOnChange(value: /* matches */ Boolean => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* matches */ Boolean) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setQuery(value: MediaQueryValue): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryVarargs(value: MediaQueryObject*): Self = StObject.set(x, "query", js.Array(value*))
    }
  }
}

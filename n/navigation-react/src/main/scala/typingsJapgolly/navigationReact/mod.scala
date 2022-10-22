package typingsJapgolly.navigationReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.navigation.mod.FluentNavigator
import typingsJapgolly.navigation.mod.State
import typingsJapgolly.navigation.mod.StateContext
import typingsJapgolly.navigation.mod.StateNavigator
import typingsJapgolly.navigationReact.navigationReactStrings.add
import typingsJapgolly.navigationReact.navigationReactStrings.none
import typingsJapgolly.navigationReact.navigationReactStrings.replace
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("navigation-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("navigation-react", "FluentLink")
  @js.native
  open class FluentLink[NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */] protected ()
    extends Component[FluentLinkProps[NavigationInfo, Key], js.Object, Any] {
    def this(props: FluentLinkProps[NavigationInfo, Key]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FluentLinkProps[NavigationInfo, Key], context: Any) = this()
  }
  
  @JSImport("navigation-react", "NavigationBackLink")
  @js.native
  open class NavigationBackLink protected ()
    extends Component[NavigationBackLinkProps, js.Object, Any] {
    def this(props: NavigationBackLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationBackLinkProps, context: Any) = this()
  }
  
  @JSImport("navigation-react", "NavigationContext")
  @js.native
  def NavigationContext: (Context[NavigationEvent[Any, Any]]) & (Context[NavigationEvent[Any, String]]) = js.native
  inline def NavigationContext_=(x: (Context[NavigationEvent[Any, Any]]) & (Context[NavigationEvent[Any, String]])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NavigationContext")(x.asInstanceOf[js.Any])
  
  @JSImport("navigation-react", "NavigationHandler")
  @js.native
  open class NavigationHandler protected ()
    extends Component[NavigationHandlerProps, js.Object, Any] {
    def this(props: NavigationHandlerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationHandlerProps, context: Any) = this()
  }
  
  @JSImport("navigation-react", "NavigationLink")
  @js.native
  open class NavigationLink[NavigationInfo /* <: StringDictionary[Any] */, StateKey /* <: /* keyof NavigationInfo */ String */] protected ()
    extends Component[NavigationLinkProps[NavigationInfo, StateKey], js.Object, Any] {
    def this(props: NavigationLinkProps[NavigationInfo, StateKey]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationLinkProps[NavigationInfo, StateKey], context: Any) = this()
  }
  
  @JSImport("navigation-react", "RefreshLink")
  @js.native
  open class RefreshLink[NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */] protected ()
    extends Component[RefreshLinkProps[NavigationInfo, Key], js.Object, Any] {
    def this(props: RefreshLinkProps[NavigationInfo, Key]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefreshLinkProps[NavigationInfo, Key], context: Any) = this()
  }
  
  @JSImport("navigation-react", "SceneView")
  @js.native
  open class SceneView[NavigationInfo /* <: StringDictionary[Any] */] protected ()
    extends Component[SceneViewProps[NavigationInfo], js.Object, Any] {
    def this(props: SceneViewProps[NavigationInfo]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SceneViewProps[NavigationInfo], context: Any) = this()
  }
  
  trait FluentLinkProps[NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */]
    extends StObject
       with LinkProps {
    
    /**
      * The function that fluently navigates to a State
      */
    def navigate(fluentNavigator: FluentNavigator[NavigationInfo, Key]): FluentNavigator[NavigationInfo, String]
    
    /**
      * Indicates whether to inherit the current context
      */
    var withContext: js.UndefOr[Boolean] = js.undefined
  }
  object FluentLinkProps {
    
    inline def apply[NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */](navigate: FluentNavigator[NavigationInfo, Key] => FluentNavigator[NavigationInfo, String]): FluentLinkProps[NavigationInfo, Key] = {
      val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[FluentLinkProps[NavigationInfo, Key]]
    }
    
    extension [Self <: FluentLinkProps[?, ?], NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */](x: Self & (FluentLinkProps[NavigationInfo, Key])) {
      
      inline def setNavigate(value: FluentNavigator[NavigationInfo, Key] => FluentNavigator[NavigationInfo, String]): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setWithContext(value: Boolean): Self = StObject.set(x, "withContext", value.asInstanceOf[js.Any])
      
      inline def setWithContextUndefined: Self = StObject.set(x, "withContext", js.undefined)
    }
  }
  
  trait LinkProps
    extends StObject
       with ClassAttributes[HTMLAnchorElement]
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    /**
      * Determines the effect on browser history
      */
    var historyAction: js.UndefOr[add | replace | none] = js.undefined
    
    /**
      * Handles Link click events
      */
    var navigating: js.UndefOr[
        js.Function2[/* e */ ReactMouseEventFrom[HTMLAnchorElement], /* link */ String, Boolean]
      ] = js.undefined
    
    /**
      * React function that enables concurrent rendering when navigating
      */
    var startTransition: js.UndefOr[js.Function1[/* transition */ js.Function0[Unit], Unit]] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setHistoryAction(value: add | replace | none): Self = StObject.set(x, "historyAction", value.asInstanceOf[js.Any])
      
      inline def setHistoryActionUndefined: Self = StObject.set(x, "historyAction", js.undefined)
      
      inline def setNavigating(value: (/* e */ ReactMouseEventFrom[HTMLAnchorElement], /* link */ String) => Boolean): Self = StObject.set(x, "navigating", js.Any.fromFunction2(value))
      
      inline def setNavigatingUndefined: Self = StObject.set(x, "navigating", js.undefined)
      
      inline def setStartTransition(value: /* transition */ js.Function0[Unit] => Callback): Self = StObject.set(x, "startTransition", js.Any.fromFunction1((t0: /* transition */ js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setStartTransitionUndefined: Self = StObject.set(x, "startTransition", js.undefined)
    }
  }
  
  trait NavigationBackLinkProps
    extends StObject
       with LinkProps {
    
    /**
      * Starting at 1, The number of Crumb steps to go back
      */
    var distance: Double
  }
  object NavigationBackLinkProps {
    
    inline def apply(distance: Double): NavigationBackLinkProps = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationBackLinkProps]
    }
    
    extension [Self <: NavigationBackLinkProps](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationEvent[NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */] extends StObject {
    
    /**
      * The current asynchronous data
      */
    var asyncData: Any
    
    /**
      * The NavigationData for the current State
      */
    var data: /* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? NavigationInfo[Key] : any */ js.Any
    
    /**
      * The last State displayed before the current State
      */
    var oldState: State[String, Any]
    
    /**
      * The current State
      */
    var state: State[
        Key & String, 
        /* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? NavigationInfo[Key] : any */ js.Any
      ]
    
    /**
      * State navigator for the current context
      */
    var stateNavigator: StateNavigator[NavigationInfo, Key]
  }
  object NavigationEvent {
    
    inline def apply[NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */](
      asyncData: Any,
      data: /* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? NavigationInfo[Key] : any */ js.Any,
      oldState: State[String, Any],
      state: State[
          Key & String, 
          /* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? NavigationInfo[Key] : any */ js.Any
        ],
      stateNavigator: StateNavigator[NavigationInfo, Key]
    ): NavigationEvent[NavigationInfo, Key] = {
      val __obj = js.Dynamic.literal(asyncData = asyncData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateNavigator = stateNavigator.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationEvent[NavigationInfo, Key]]
    }
    
    extension [Self <: NavigationEvent[?, ?], NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */](x: Self & (NavigationEvent[NavigationInfo, Key])) {
      
      inline def setAsyncData(value: Any): Self = StObject.set(x, "asyncData", value.asInstanceOf[js.Any])
      
      inline def setData(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? NavigationInfo[Key] : any */ js.Any
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOldState(value: State[String, Any]): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
      
      inline def setState(
        value: State[
              Key & String, 
              /* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? NavigationInfo[Key] : any */ js.Any
            ]
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNavigator(value: StateNavigator[NavigationInfo, Key]): Self = StObject.set(x, "stateNavigator", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationHandlerProps extends StObject {
    
    /**
      * The rendered content
      */
    var children: Node
    
    /**
      * The state navigator that triggers navigation events
      */
    var stateNavigator: StateNavigator[Any, String]
  }
  object NavigationHandlerProps {
    
    inline def apply(stateNavigator: StateNavigator[Any, String]): NavigationHandlerProps = {
      val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[NavigationHandlerProps]
    }
    
    extension [Self <: NavigationHandlerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStateNavigator(value: StateNavigator[Any, String]): Self = StObject.set(x, "stateNavigator", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationLinkProps[NavigationInfo /* <: StringDictionary[Any] */, StateKey /* <: /* keyof NavigationInfo */ String */]
    extends StObject
       with RefreshLinkProps[NavigationInfo, StateKey] {
    
    /**
      * The key of the State to navigate to
      */
    var stateKey: StateKey & (/* keyof NavigationInfo */ String)
  }
  object NavigationLinkProps {
    
    inline def apply[NavigationInfo /* <: StringDictionary[Any] */, StateKey /* <: /* keyof NavigationInfo */ String */](stateKey: StateKey & (/* keyof NavigationInfo */ String)): NavigationLinkProps[NavigationInfo, StateKey] = {
      val __obj = js.Dynamic.literal(stateKey = stateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationLinkProps[NavigationInfo, StateKey]]
    }
    
    extension [Self <: NavigationLinkProps[?, ?], NavigationInfo /* <: StringDictionary[Any] */, StateKey /* <: /* keyof NavigationInfo */ String */](x: Self & (NavigationLinkProps[NavigationInfo, StateKey])) {
      
      inline def setStateKey(value: StateKey & (/* keyof NavigationInfo */ String)): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshLinkProps[NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */]
    extends StObject
       with LinkProps {
    
    /**
      * The Css Class to display when the Link is active
      */
    var activeCssClass: js.UndefOr[String] = js.undefined
    
    /**
      * The style to display when the Link is active
      */
    var activeStyle: js.UndefOr[Any] = js.undefined
    
    /**
      * The data to add from the current NavigationData
      */
    var currentDataKeys: js.UndefOr[
        (String & (/* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? keyof NavigationInfo[Key] : any */ js.Any)) | (js.Array[
          String & (/* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? keyof NavigationInfo[Key] : any */ js.Any)
        ])
      ] = js.undefined
    
    /**
      * Indicates whether the Link is disabled when active
      */
    var disableActive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fragment identifier
      */
    var hash: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether to include all the current NavigationData
      */
    var includeCurrentData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The NavigationData to pass
      */
    var navigationData: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? NavigationInfo[Key] : any */ js.Any
      ] = js.undefined
  }
  object RefreshLinkProps {
    
    inline def apply[NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */](): RefreshLinkProps[NavigationInfo, Key] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshLinkProps[NavigationInfo, Key]]
    }
    
    extension [Self <: RefreshLinkProps[?, ?], NavigationInfo /* <: StringDictionary[Any] */, Key /* <: /* keyof NavigationInfo */ String */](x: Self & (RefreshLinkProps[NavigationInfo, Key])) {
      
      inline def setActiveCssClass(value: String): Self = StObject.set(x, "activeCssClass", value.asInstanceOf[js.Any])
      
      inline def setActiveCssClassUndefined: Self = StObject.set(x, "activeCssClass", js.undefined)
      
      inline def setActiveStyle(value: Any): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setCurrentDataKeys(
        value: (String & (/* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? keyof NavigationInfo[Key] : any */ js.Any)) | (js.Array[
              String & (/* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? keyof NavigationInfo[Key] : any */ js.Any)
            ])
      ): Self = StObject.set(x, "currentDataKeys", value.asInstanceOf[js.Any])
      
      inline def setCurrentDataKeysUndefined: Self = StObject.set(x, "currentDataKeys", js.undefined)
      
      inline def setCurrentDataKeysVarargs(
        value: (String & (/* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? keyof NavigationInfo[Key] : any */ js.Any))*
      ): Self = StObject.set(x, "currentDataKeys", js.Array(value*))
      
      inline def setDisableActive(value: Boolean): Self = StObject.set(x, "disableActive", value.asInstanceOf[js.Any])
      
      inline def setDisableActiveUndefined: Self = StObject.set(x, "disableActive", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setIncludeCurrentData(value: Boolean): Self = StObject.set(x, "includeCurrentData", value.asInstanceOf[js.Any])
      
      inline def setIncludeCurrentDataUndefined: Self = StObject.set(x, "includeCurrentData", js.undefined)
      
      inline def setNavigationData(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Key extends keyof NavigationInfo ? NavigationInfo[Key] : any */ js.Any
      ): Self = StObject.set(x, "navigationData", value.asInstanceOf[js.Any])
      
      inline def setNavigationDataUndefined: Self = StObject.set(x, "navigationData", js.undefined)
    }
  }
  
  trait SceneViewProps[NavigationInfo /* <: StringDictionary[Any] */] extends StObject {
    
    /**
      * A function or the State key(s) that activate the View
      */
    var active: (/* keyof NavigationInfo */ String) | (js.Array[/* keyof NavigationInfo */ String]) | (js.Function1[/* stateContext */ StateContext[String, Any], Boolean])
    
    /**
      * The view
      */
    var children: Node
  }
  object SceneViewProps {
    
    inline def apply[NavigationInfo /* <: StringDictionary[Any] */](
      active: (/* keyof NavigationInfo */ String) | (js.Array[/* keyof NavigationInfo */ String]) | (js.Function1[/* stateContext */ StateContext[String, Any], Boolean])
    ): SceneViewProps[NavigationInfo] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[SceneViewProps[NavigationInfo]]
    }
    
    extension [Self <: SceneViewProps[?], NavigationInfo /* <: StringDictionary[Any] */](x: Self & SceneViewProps[NavigationInfo]) {
      
      inline def setActive(
        value: (/* keyof NavigationInfo */ String) | (js.Array[/* keyof NavigationInfo */ String]) | (js.Function1[/* stateContext */ StateContext[String, Any], Boolean])
      ): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveFunction1(value: /* stateContext */ StateContext[String, Any] => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
      
      inline def setActiveVarargs(value: (/* keyof NavigationInfo */ String)*): Self = StObject.set(x, "active", js.Array(value*))
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

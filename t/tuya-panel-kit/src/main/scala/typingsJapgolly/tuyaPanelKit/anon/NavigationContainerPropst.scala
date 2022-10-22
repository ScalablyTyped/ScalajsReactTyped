package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationContainerRef
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.DocumentTitleOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.LinkingOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.InitialState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationAction
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core.NavigationContainerProps & {  theme :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.Theme | undefined,   linking :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.LinkingOptions | undefined,   fallback :react.react.ReactNode | undefined,   documentTitle :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.DocumentTitleOptions | undefined,   onReady :(): void | undefined} & react.react.RefAttributes<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.NavigationContainerRef> */
trait NavigationContainerPropst extends StObject {
  
  /**
    * Children elements to render.
    */
  var children: Node
  
  // tslint:disable-next-line no-redundant-undefined
  var documentTitle: js.UndefOr[DocumentTitleOptions] = js.undefined
  
  var fallback: js.UndefOr[Node] = js.undefined
  
  /**
    * Whether this navigation container should be independent of parent containers.
    * If this is not set to `true`, this container cannot be nested inside another container.
    * Setting it to `true` disconnects any children navigators from parent container.
    */
  var independent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Initial navigation state for the child navigators.
    */
  var initialState: js.UndefOr[InitialState] = js.undefined
  
  var key: js.UndefOr[typingsJapgolly.react.mod.Key | Null] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var linking: js.UndefOr[LinkingOptions] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback which is called with the latest navigation state when it changes.
    */
  var onStateChange: js.UndefOr[js.Function1[/* state */ js.UndefOr[NavigationState[ParamListBase]], Unit]] = js.undefined
  
  /**
    * Callback which is called when an action is not handled.
    */
  var onUnhandledAction: js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]] = js.undefined
  
  var ref: js.UndefOr[Ref[NavigationContainerRef]] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var theme: js.UndefOr[typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.Theme] = js.undefined
}
object NavigationContainerPropst {
  
  inline def apply(): NavigationContainerPropst = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[NavigationContainerPropst]
  }
  
  extension [Self <: NavigationContainerPropst](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDocumentTitle(value: DocumentTitleOptions): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
    
    inline def setFallback(value: VdomNode): Self = StObject.set(x, "fallback", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFallbackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fallback", js.Array(value*))
    
    inline def setFallbackVdomElement(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
    
    inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    
    inline def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLinking(value: LinkingOptions): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
    
    inline def setLinkingUndefined: Self = StObject.set(x, "linking", js.undefined)
    
    inline def setOnReady(value: Callback): Self = StObject.set(x, "onReady", value.toJsFn)
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Callback): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1((t0: /* state */ js.UndefOr[NavigationState[ParamListBase]]) => value(t0).runNow()))
    
    inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    inline def setOnUnhandledAction(value: /* action */ NavigationAction => Callback): Self = StObject.set(x, "onUnhandledAction", js.Any.fromFunction1((t0: /* action */ NavigationAction) => value(t0).runNow()))
    
    inline def setOnUnhandledActionUndefined: Self = StObject.set(x, "onUnhandledAction", js.undefined)
    
    inline def setRef(value: Ref[NavigationContainerRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: NavigationContainerRef | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: NavigationContainerRef | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}

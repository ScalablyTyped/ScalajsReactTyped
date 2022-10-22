package typingsJapgolly.reactNativeNavigation

import typingsJapgolly.reactNativeNavigation.anon.AnimationType
import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersConstantsMod.NavigationConstants
import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typingsJapgolly.reactNativeNavigation.libDistSrcComponentsModalMod.RNNModalProps
import typingsJapgolly.reactNativeNavigation.libDistSrcEventsCommandsObserverMod.CommandsObserver
import typingsJapgolly.reactNativeNavigation.libDistSrcEventsComponentEventsObserverMod.ComponentEventsObserver
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesNavigationComponentPropsMod.NavigationComponentProps
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Options
import typingsJapgolly.reactNativeNavigation.libDistSrcNavigationDelegateMod.NavigationDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-navigation", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName & String
      ] = js.native
    
    /* "dismissAllModals" */ val DismissAllModals: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.DismissAllModals & String = js.native
    
    /* "dismissAllOverlays" */ val DismissAllOverlays: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.DismissAllOverlays & String = js.native
    
    /* "dismissModal" */ val DismissModal: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.DismissModal & String = js.native
    
    /* "dismissOverlay" */ val DismissOverlay: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.DismissOverlay & String = js.native
    
    /* "getLaunchArgs" */ val GetLaunchArgs: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.GetLaunchArgs & String = js.native
    
    /* "mergeOptions" */ val MergeOptions: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.MergeOptions & String = js.native
    
    /* "pop" */ val Pop: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.Pop & String = js.native
    
    /* "popTo" */ val PopTo: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.PopTo & String = js.native
    
    /* "popToRoot" */ val PopToRoot: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.PopToRoot & String = js.native
    
    /* "push" */ val Push: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.Push & String = js.native
    
    /* "setDefaultOptions" */ val SetDefaultOptions: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.SetDefaultOptions & String = js.native
    
    /* "setRoot" */ val SetRoot: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.SetRoot & String = js.native
    
    /* "setStackRoot" */ val SetStackRoot: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.SetStackRoot & String = js.native
    
    /* "showModal" */ val ShowModal: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.ShowModal & String = js.native
    
    /* "showOverlay" */ val ShowOverlay: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.ShowOverlay & String = js.native
    
    /* "updateProps" */ val UpdateProps: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.UpdateProps & String = js.native
  }
  
  @JSImport("react-native-navigation", "Constants")
  @js.native
  /* private */ open class Constants ()
    extends typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersConstantsMod.Constants
  /* static members */
  object Constants {
    
    @JSImport("react-native-navigation", "Constants")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): js.Promise[NavigationConstants] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[NavigationConstants]]
    
    inline def getSync(): NavigationConstants = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")().asInstanceOf[NavigationConstants]
  }
  
  @JSImport("react-native-navigation", "EventsRegistry")
  @js.native
  open class EventsRegistry protected ()
    extends typingsJapgolly.reactNativeNavigation.libDistSrcEventsEventsRegistryMod.EventsRegistry {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
  }
  
  @JSImport("react-native-navigation", "Modal")
  @js.native
  open class Modal protected ()
    extends typingsJapgolly.reactNativeNavigation.libDistSrcComponentsModalMod.Modal {
    def this(props: RNNModalProps) = this()
  }
  /* static members */
  object Modal {
    
    @JSImport("react-native-navigation", "Modal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-navigation", "Modal.defaultProps")
    @js.native
    def defaultProps: AnimationType = js.native
    inline def defaultProps_=(x: AnimationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-navigation", "Navigation")
  @js.native
  val Navigation: NavigationDelegate = js.native
  
  @JSImport("react-native-navigation", "NavigationComponent")
  @js.native
  open class NavigationComponent[Props, State, Snapshot] protected ()
    extends typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesNavigationComponentMod.NavigationComponent[Props, State, Snapshot] {
    def this(props: Props & NavigationComponentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props & NavigationComponentProps, context: Any) = this()
  }
  /* static members */
  object NavigationComponent {
    
    @JSImport("react-native-navigation", "NavigationComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Options used to apply a style configuration when the screen appears.
      *
      * This field can either contain the concrete options to be applied, or a generator function
      * which accepts props and returns an Options object.
      */
    @JSImport("react-native-navigation", "NavigationComponent.options")
    @js.native
    def options: (js.Function1[/* props */ js.UndefOr[Any], Options]) | Options = js.native
    inline def options_=(x: (js.Function1[/* props */ js.UndefOr[Any], Options]) | Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-navigation", "OptionsModalPresentationStyle")
  @js.native
  object OptionsModalPresentationStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle & String
      ] = js.native
    
    /* "currentContext" */ val currentContext: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle.currentContext & String = js.native
    
    /* "formSheet" */ val formSheet: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle.formSheet & String = js.native
    
    /* "fullScreen" */ val fullScreen: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle.fullScreen & String = js.native
    
    /* "none" */ val none: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle.none & String = js.native
    
    /* "overCurrentContext" */ val overCurrentContext: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle.overCurrentContext & String = js.native
    
    /* "overFullScreen" */ val overFullScreen: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle.overFullScreen & String = js.native
    
    /* "pageSheet" */ val pageSheet: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle.pageSheet & String = js.native
    
    /* "popover" */ val popover: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalPresentationStyle.popover & String = js.native
  }
  
  @JSImport("react-native-navigation", "OptionsModalTransitionStyle")
  @js.native
  object OptionsModalTransitionStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle & String
      ] = js.native
    
    /* "coverVertical" */ val coverVertical: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle.coverVertical & String = js.native
    
    /* "crossDissolve" */ val crossDissolve: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle.crossDissolve & String = js.native
    
    /* "flipHorizontal" */ val flipHorizontal: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle.flipHorizontal & String = js.native
    
    /* "partialCurl" */ val partialCurl: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle.partialCurl & String = js.native
  }
}

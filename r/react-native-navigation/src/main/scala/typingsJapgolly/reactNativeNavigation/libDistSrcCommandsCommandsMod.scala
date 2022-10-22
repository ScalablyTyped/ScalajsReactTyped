package typingsJapgolly.reactNativeNavigation

import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersNativeCommandsSenderMod.NativeCommandsSender
import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersUniqueIdProviderMod.UniqueIdProvider
import typingsJapgolly.reactNativeNavigation.libDistSrcCommandsLayoutTreeCrawlerMod.LayoutTreeCrawler
import typingsJapgolly.reactNativeNavigation.libDistSrcCommandsLayoutTreeParserMod.LayoutTreeParser
import typingsJapgolly.reactNativeNavigation.libDistSrcCommandsOptionsCrawlerMod.OptionsCrawler
import typingsJapgolly.reactNativeNavigation.libDistSrcCommandsOptionsProcessorMod.OptionsProcessor
import typingsJapgolly.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typingsJapgolly.reactNativeNavigation.libDistSrcEventsCommandsObserverMod.CommandsObserver
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesLayoutMod.Layout
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesLayoutMod.LayoutRoot
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Options
import typingsJapgolly.reactNativeNavigation.libDistSrcProcessorsLayoutProcessorMod.LayoutProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcCommandsCommandsMod {
  
  @JSImport("react-native-navigation/lib/dist/src/commands/Commands", "Commands")
  @js.native
  open class Commands protected () extends StObject {
    def this(
      store: Store,
      nativeCommandsSender: NativeCommandsSender,
      layoutTreeParser: LayoutTreeParser,
      layoutTreeCrawler: LayoutTreeCrawler,
      commandsObserver: CommandsObserver,
      uniqueIdProvider: UniqueIdProvider,
      optionsProcessor: OptionsProcessor,
      layoutProcessor: LayoutProcessor,
      optionsCrawler: OptionsCrawler
    ) = this()
    
    /* private */ val commandsObserver: Any = js.native
    
    def dismissAllModals(): js.Promise[Any] = js.native
    def dismissAllModals(mergeOptions: Options): js.Promise[Any] = js.native
    
    def dismissAllOverlays(): js.Promise[Any] = js.native
    
    def dismissModal(componentId: String): js.Promise[Any] = js.native
    def dismissModal(componentId: String, mergeOptions: Options): js.Promise[Any] = js.native
    
    def dismissOverlay(componentId: String): js.Promise[Any] = js.native
    
    def getLaunchArgs(): js.Promise[Any] = js.native
    
    /* private */ val layoutProcessor: Any = js.native
    
    /* private */ val layoutTreeCrawler: Any = js.native
    
    /* private */ val layoutTreeParser: Any = js.native
    
    def mergeOptions(componentId: String, options: Options): Unit = js.native
    
    /* private */ val nativeCommandsSender: Any = js.native
    
    /* private */ val optionsCrawler: Any = js.native
    
    /* private */ val optionsProcessor: Any = js.native
    
    def pop(componentId: String): js.Promise[Any] = js.native
    def pop(componentId: String, mergeOptions: Options): js.Promise[Any] = js.native
    
    def popTo(componentId: String): js.Promise[Any] = js.native
    def popTo(componentId: String, mergeOptions: Options): js.Promise[Any] = js.native
    
    def popToRoot(componentId: String): js.Promise[Any] = js.native
    def popToRoot(componentId: String, mergeOptions: Options): js.Promise[Any] = js.native
    
    def push(componentId: String, simpleApi: Layout[js.Object]): js.Promise[Any] = js.native
    
    def setDefaultOptions(options: Options): Unit = js.native
    
    def setRoot(simpleApi: LayoutRoot): js.Promise[Any] = js.native
    
    def setStackRoot(componentId: String, children: js.Array[Layout[js.Object]]): js.Promise[Any] = js.native
    
    def showModal(layout: Layout[js.Object]): js.Promise[Any] = js.native
    
    def showOverlay(simpleApi: Layout[js.Object]): js.Promise[Any] = js.native
    
    /* private */ val store: Any = js.native
    
    /* private */ val uniqueIdProvider: Any = js.native
    
    def updateProps(componentId: String, props: js.Object): Unit = js.native
    def updateProps(componentId: String, props: js.Object, callback: js.Function0[Unit]): Unit = js.native
  }
}

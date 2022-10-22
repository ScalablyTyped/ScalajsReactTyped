package typingsJapgolly.reactNativeNavigation

import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersAssetResolverMod.AssetService
import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersColorServiceMod.ColorService
import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersUniqueIdProviderMod.UniqueIdProvider
import typingsJapgolly.reactNativeNavigation.libDistSrcCommandsDeprecationsMod.Deprecations
import typingsJapgolly.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Options
import typingsJapgolly.reactNativeNavigation.libDistSrcProcessorsOptionProcessorsStoreMod.OptionProcessorsStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcCommandsOptionsProcessorMod {
  
  @JSImport("react-native-navigation/lib/dist/src/commands/OptionsProcessor", "OptionsProcessor")
  @js.native
  open class OptionsProcessor protected () extends StObject {
    def this(
      store: Store,
      uniqueIdProvider: UniqueIdProvider,
      optionProcessorsRegistry: OptionProcessorsStore,
      colorService: ColorService,
      assetService: AssetService,
      deprecations: Deprecations
    ) = this()
    
    /* private */ var assetService: Any = js.native
    
    /* private */ var colorService: Any = js.native
    
    /* private */ var convertDeprecatedViewAnimationApiToNewStackAnimationApi: Any = js.native
    
    /* private */ var deprecations: Any = js.native
    
    /* private */ var isNewStackAnimationApi: Any = js.native
    
    /* private */ var optionProcessorsRegistry: Any = js.native
    
    /* private */ var processAnimation: Any = js.native
    
    /* private */ var processButtonsPassProps: Any = js.native
    
    /* private */ var processColor: Any = js.native
    
    /* private */ var processColorAndroid: Any = js.native
    
    /* private */ var processColorIOS: Any = js.native
    
    /* private */ var processComponent: Any = js.native
    
    def processDefaultOptions(options: Options, commandName: CommandName): Unit = js.native
    
    /* private */ var processDismissModal: Any = js.native
    
    /* private */ var processImage: Any = js.native
    
    /* private */ var processInterpolation: Any = js.native
    
    /* private */ var processObject: Any = js.native
    
    def processOptions(commandName: CommandName): Unit = js.native
    def processOptions(commandName: CommandName, options: Unit, props: Any): Unit = js.native
    def processOptions(commandName: CommandName, options: Options): Unit = js.native
    def processOptions(commandName: CommandName, options: Options, props: Any): Unit = js.native
    
    /* private */ var processPop: Any = js.native
    
    /* private */ var processPush: Any = js.native
    
    /* private */ var processSearchBar: Any = js.native
    
    /* private */ var processSetRootAnimation: Any = js.native
    
    /* private */ var processSetStackRoot: Any = js.native
    
    /* private */ var processShowModal: Any = js.native
    
    /* private */ var processWithRegisteredProcessor: Any = js.native
    
    /* private */ var resolveObjectPath: Any = js.native
    
    /* private */ var store: Any = js.native
    
    /* private */ var uniqueIdProvider: Any = js.native
  }
}

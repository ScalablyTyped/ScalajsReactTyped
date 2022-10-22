package typingsJapgolly.reactNativeMaps

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.MapManagerCommand
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.NativeComponent
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.UIManagerCommand
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapLocalTileMod {
  
  /* was `typeof MapLocalTile` */
  @JSImport("react-native-maps/lib/MapLocalTile", JSImport.Default)
  @js.native
  open class default () extends MapLocalTile
  
  @JSImport("react-native-maps/lib/MapLocalTile", "MapLocalTile")
  @js.native
  open class MapLocalTile protected ()
    extends Component[MapLocalTileProps, js.Object, Any] {
    def this(props: MapLocalTileProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapLocalTileProps, context: Any) = this()
    
    @JSName("context")
    var context_MapLocalTile: ContextType[Context[Provider]] = js.native
    
    def getMapManagerCommand(name: String): MapManagerCommand = js.native
    
    def getNativeComponent(): NativeComponent[NativeProps] = js.native
    
    def getUIManagerCommand(name: String): UIManagerCommand = js.native
  }
  
  trait MapLocalTileProps
    extends StObject
       with ViewProps {
    
    /**
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var pathTemplate: String
    
    /**
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var tileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to true to use pathTemplate to open files from Android's AssetManager. The default is false.
      * @platform android
      */
    var useAssets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object MapLocalTileProps {
    
    inline def apply(pathTemplate: String): MapLocalTileProps = {
      val __obj = js.Dynamic.literal(pathTemplate = pathTemplate.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapLocalTileProps]
    }
    
    extension [Self <: MapLocalTileProps](x: Self) {
      
      inline def setPathTemplate(value: String): Self = StObject.set(x, "pathTemplate", value.asInstanceOf[js.Any])
      
      inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setUseAssets(value: Boolean): Self = StObject.set(x, "useAssets", value.asInstanceOf[js.Any])
      
      inline def setUseAssetsUndefined: Self = StObject.set(x, "useAssets", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type NativeProps = MapLocalTileProps
  
  /* was `typeof MapLocalTile` */
  type _default = MapLocalTile
}

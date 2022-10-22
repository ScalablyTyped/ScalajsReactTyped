package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.carbonComponentsStrings.clickable
import typingsJapgolly.carbonComponents.carbonComponentsStrings.expandable
import typingsJapgolly.carbonComponents.carbonComponentsStrings.selectable
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTileTileMod {
  
  @JSImport("carbon-components/components/tile/tile", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Tile {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: TileOptions) = this()
    
    /* CompleteClass */
    override def _getClass(`type`: expandable | clickable | selectable): String = js.native
    
    /* CompleteClass */
    override def _hookActions(tileClass: String): Unit = js.native
    
    /* CompleteClass */
    override def _setTileHeight(): Unit = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/tile/tile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/tile/tile", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Tile extends StObject {
    
    def _getClass(`type`: expandable | clickable | selectable): String
    
    def _hookActions(tileClass: String): Unit
    
    def _setTileHeight(): Unit
    
    def release(): Unit
  }
  object Tile {
    
    inline def apply(
      _getClass: expandable | clickable | selectable => String,
      _hookActions: String => Callback,
      _setTileHeight: Callback,
      release: Callback
    ): Tile = {
      val __obj = js.Dynamic.literal(_getClass = js.Any.fromFunction1(_getClass), _hookActions = js.Any.fromFunction1((t0: String) => _hookActions(t0).runNow()), _setTileHeight = _setTileHeight.toJsFn, release = release.toJsFn)
      __obj.asInstanceOf[Tile]
    }
    
    extension [Self <: Tile](x: Self) {
      
      inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
      
      inline def set_getClass(value: expandable | clickable | selectable => String): Self = StObject.set(x, "_getClass", js.Any.fromFunction1(value))
      
      inline def set_hookActions(value: String => Callback): Self = StObject.set(x, "_hookActions", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def set_setTileHeight(value: Callback): Self = StObject.set(x, "_setTileHeight", value.toJsFn)
    }
  }
  
  trait TileOptions extends StObject {
    
    var classClickableTile: String
    
    var classExpandedTile: String
    
    var classSelectableTile: String
    
    var selectorAboveTheFold: String
    
    var selectorInit: String
    
    var selectorTileInput: String
  }
  object TileOptions {
    
    inline def apply(
      classClickableTile: String,
      classExpandedTile: String,
      classSelectableTile: String,
      selectorAboveTheFold: String,
      selectorInit: String,
      selectorTileInput: String
    ): TileOptions = {
      val __obj = js.Dynamic.literal(classClickableTile = classClickableTile.asInstanceOf[js.Any], classExpandedTile = classExpandedTile.asInstanceOf[js.Any], classSelectableTile = classSelectableTile.asInstanceOf[js.Any], selectorAboveTheFold = selectorAboveTheFold.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorTileInput = selectorTileInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileOptions]
    }
    
    extension [Self <: TileOptions](x: Self) {
      
      inline def setClassClickableTile(value: String): Self = StObject.set(x, "classClickableTile", value.asInstanceOf[js.Any])
      
      inline def setClassExpandedTile(value: String): Self = StObject.set(x, "classExpandedTile", value.asInstanceOf[js.Any])
      
      inline def setClassSelectableTile(value: String): Self = StObject.set(x, "classSelectableTile", value.asInstanceOf[js.Any])
      
      inline def setSelectorAboveTheFold(value: String): Self = StObject.set(x, "selectorAboveTheFold", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorTileInput(value: String): Self = StObject.set(x, "selectorTileInput", value.asInstanceOf[js.Any])
    }
  }
}

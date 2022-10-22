package typingsJapgolly.videojsHlsQualitySelector

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.videojsHlsQualitySelector.srcConcreteMenuItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Adds a quality selector menu for HLS sources played in videojs.
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("videojs-hls-quality-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("videojs-hls-quality-selector", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  /**
    * VideoJS HLS Quality Selector Plugin class.
    */
  trait HlsQualitySelectorPlugin extends StObject {
    
    /**
      * Binds listener for quality level changes.
      */
    def bindPlayerEvents(): Unit
    
    /**
      * Adds the quality menu button to the player control bar.
      */
    def createQualityButton(): Unit
    
    /**
      * Return the current set quality or 'auto'
      */
    def getCurrentQuality(): String
    
    /**
      * Returns HLS Plugin
      *
      * @return - videojs-hls-contrib plugin.
      */
    def getHls(): Any
    
    /**
      * Builds individual quality menu items.
      *
      * @param  item - Individual quality menu item.
      * @return - Menu item
      */
    def getQualityMenuItem(item: Item): default
    
    /**
      * Executed when a quality level is added from HLS playlist.
      */
    def onAddQualityLevel(): Unit
    
    /**
      * Set inner button text.
      *
      * @param text - the text to display in the button.
      */
    def setButtonInnerText(text: String): Unit
  }
  object HlsQualitySelectorPlugin {
    
    inline def apply(
      bindPlayerEvents: Callback,
      createQualityButton: Callback,
      getCurrentQuality: CallbackTo[String],
      getHls: CallbackTo[Any],
      getQualityMenuItem: Item => default,
      onAddQualityLevel: Callback,
      setButtonInnerText: String => Callback
    ): HlsQualitySelectorPlugin = {
      val __obj = js.Dynamic.literal(bindPlayerEvents = bindPlayerEvents.toJsFn, createQualityButton = createQualityButton.toJsFn, getCurrentQuality = getCurrentQuality.toJsFn, getHls = getHls.toJsFn, getQualityMenuItem = js.Any.fromFunction1(getQualityMenuItem), onAddQualityLevel = onAddQualityLevel.toJsFn, setButtonInnerText = js.Any.fromFunction1((t0: String) => setButtonInnerText(t0).runNow()))
      __obj.asInstanceOf[HlsQualitySelectorPlugin]
    }
    
    extension [Self <: HlsQualitySelectorPlugin](x: Self) {
      
      inline def setBindPlayerEvents(value: Callback): Self = StObject.set(x, "bindPlayerEvents", value.toJsFn)
      
      inline def setCreateQualityButton(value: Callback): Self = StObject.set(x, "createQualityButton", value.toJsFn)
      
      inline def setGetCurrentQuality(value: CallbackTo[String]): Self = StObject.set(x, "getCurrentQuality", value.toJsFn)
      
      inline def setGetHls(value: CallbackTo[Any]): Self = StObject.set(x, "getHls", value.toJsFn)
      
      inline def setGetQualityMenuItem(value: Item => default): Self = StObject.set(x, "getQualityMenuItem", js.Any.fromFunction1(value))
      
      inline def setOnAddQualityLevel(value: Callback): Self = StObject.set(x, "onAddQualityLevel", value.toJsFn)
      
      inline def setSetButtonInnerText(value: String => Callback): Self = StObject.set(x, "setButtonInnerText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait Item extends StObject {
    
    var label: String
    
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object Item {
    
    inline def apply(label: String): Item = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var displayCurrentQuality: js.UndefOr[Boolean] = js.undefined
    
    var placementIndex: js.UndefOr[Double] = js.undefined
    
    var vjsIconClass: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisplayCurrentQuality(value: Boolean): Self = StObject.set(x, "displayCurrentQuality", value.asInstanceOf[js.Any])
      
      inline def setDisplayCurrentQualityUndefined: Self = StObject.set(x, "displayCurrentQuality", js.undefined)
      
      inline def setPlacementIndex(value: Double): Self = StObject.set(x, "placementIndex", value.asInstanceOf[js.Any])
      
      inline def setPlacementIndexUndefined: Self = StObject.set(x, "placementIndex", js.undefined)
      
      inline def setVjsIconClass(value: String): Self = StObject.set(x, "vjsIconClass", value.asInstanceOf[js.Any])
      
      inline def setVjsIconClassUndefined: Self = StObject.set(x, "vjsIconClass", js.undefined)
    }
  }
  
  /* augmented module */
  object videoJsAugmentingMod {
    
    trait VideoJsPlayer extends StObject {
      
      var hlsQualitySelector: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof hlsQualitySelector */ Any
    }
    object VideoJsPlayer {
      
      inline def apply(
        hlsQualitySelector: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof hlsQualitySelector */ Any
      ): VideoJsPlayer = {
        val __obj = js.Dynamic.literal(hlsQualitySelector = hlsQualitySelector.asInstanceOf[js.Any])
        __obj.asInstanceOf[VideoJsPlayer]
      }
      
      extension [Self <: VideoJsPlayer](x: Self) {
        
        inline def setHlsQualitySelector(
          value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof hlsQualitySelector */ Any
        ): Self = StObject.set(x, "hlsQualitySelector", value.asInstanceOf[js.Any])
      }
    }
  }
}

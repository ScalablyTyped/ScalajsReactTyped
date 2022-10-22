package typingsJapgolly.videojsHlsQualitySelector

import japgolly.scalajs.react.Callback
import typingsJapgolly.videojsHlsQualitySelector.mod.HlsQualitySelectorPlugin
import typingsJapgolly.videojsHlsQualitySelector.mod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConcreteMenuItemMod {
  
  @JSImport("videojs-hls-quality-selector/src/ConcreteMenuItem", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ConcreteMenuItem {
    /**
      * Menu item constructor.
      *
      * @param player - vjs player
      * @param item - Item object
      * @param qualityButton - The containing button.
      * @param plugin - This plugin instance.
      */
    def this(
      player: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.Player */ Any,
      item: Item,
      qualityButton: typingsJapgolly.videojsHlsQualitySelector.srcConcreteButtonMod.default,
      plugin: HlsQualitySelectorPlugin
    ) = this()
    
    /**
      * Click event for menu item.
      */
    /* CompleteClass */
    override def handleClick(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.MenuItem * / any */ trait ConcreteMenuItem extends StObject {
    
    /**
      * Click event for menu item.
      */
    def handleClick(): Unit
  }
  object ConcreteMenuItem {
    
    inline def apply(handleClick: Callback): ConcreteMenuItem = {
      val __obj = js.Dynamic.literal(handleClick = handleClick.toJsFn)
      __obj.asInstanceOf[ConcreteMenuItem]
    }
    
    extension [Self <: ConcreteMenuItem](x: Self) {
      
      inline def setHandleClick(value: Callback): Self = StObject.set(x, "handleClick", value.toJsFn)
    }
  }
}

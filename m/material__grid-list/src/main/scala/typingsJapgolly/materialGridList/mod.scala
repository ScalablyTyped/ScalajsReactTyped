package typingsJapgolly.materialGridList

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialGridList.adapterMod.MDCGridListAdapter
import typingsJapgolly.materialGridList.anon.PartialMDCGridListAdapter
import typingsJapgolly.materialGridList.anon.TILESELECTOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/grid-list", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialGridList.foundationMod.default {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/grid-list", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list", "default.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
  
  @JSImport("@material/grid-list", "MDCGridList")
  @js.native
  open class MDCGridList protected ()
    extends typingsJapgolly.materialGridList.componentMod.MDCGridList {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialGridList.foundationMod.MDCGridListFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCGridList {
    
    @JSImport("@material/grid-list", "MDCGridList")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialGridList.componentMod.MDCGridList = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialGridList.componentMod.MDCGridList]
  }
  
  @JSImport("@material/grid-list", "MDCGridListFoundation")
  @js.native
  open class MDCGridListFoundation ()
    extends typingsJapgolly.materialGridList.foundationMod.MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  object MDCGridListFoundation {
    
    @JSImport("@material/grid-list", "MDCGridListFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list", "MDCGridListFoundation.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
  
  object strings {
    
    @JSImport("@material/grid-list", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/grid-list", "strings.TILES_SELECTOR")
    @js.native
    def TILES_SELECTOR: String = js.native
    inline def TILES_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILES_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/grid-list", "strings.TILE_SELECTOR")
    @js.native
    def TILE_SELECTOR: String = js.native
    inline def TILE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILE_SELECTOR")(x.asInstanceOf[js.Any])
  }
}

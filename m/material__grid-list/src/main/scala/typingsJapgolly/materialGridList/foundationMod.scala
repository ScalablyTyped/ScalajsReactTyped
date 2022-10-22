package typingsJapgolly.materialGridList

import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialGridList.adapterMod.MDCGridListAdapter
import typingsJapgolly.materialGridList.anon.PartialMDCGridListAdapter
import typingsJapgolly.materialGridList.anon.TILESELECTOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/grid-list/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/grid-list/foundation", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list/foundation", "default.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
  
  @JSImport("@material/grid-list/foundation", "MDCGridListFoundation")
  @js.native
  open class MDCGridListFoundation () extends MDCFoundation[MDCGridListAdapter] {
    def this(adapter: PartialMDCGridListAdapter) = this()
    
    def alignCenter(): Unit = js.native
  }
  /* static members */
  object MDCGridListFoundation {
    
    @JSImport("@material/grid-list/foundation", "MDCGridListFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list/foundation", "MDCGridListFoundation.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
}

package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.commonMod.CellValue
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import typingsJapgolly.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsSearchSearchMod {
  
  @JSImport("handsontable/plugins/search/search", "Search")
  @js.native
  open class Search protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def getCallback(): SearchCallback = js.native
    
    def getQueryMethod(): SearchQueryMethod = js.native
    
    def getSearchResultClass(): String = js.native
    
    def isEnabled(): Boolean = js.native
    
    def query(queryStr: String): js.Array[Any] = js.native
    def query(queryStr: String, callback: Unit, queryMethod: SearchQueryMethod): js.Array[Any] = js.native
    def query(queryStr: String, callback: SearchCallback): js.Array[Any] = js.native
    def query(queryStr: String, callback: SearchCallback, queryMethod: SearchQueryMethod): js.Array[Any] = js.native
    
    def setCallback(newCallback: SearchCallback): Unit = js.native
    
    def setQueryMethod(newQueryMethod: SearchQueryMethod): Unit = js.native
    
    def setSearchResultClass(newElementClass: String): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var callback: js.UndefOr[SearchCallback] = js.undefined
    
    var queryMethod: js.UndefOr[SearchQueryMethod] = js.undefined
    
    var searchResultClass: js.UndefOr[String] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setCallback(
        value: (/* instance */ default, /* row */ Double, /* column */ Double, /* value */ CellValue, /* result */ Boolean) => Callback
      ): Self = StObject.set(x, "callback", js.Any.fromFunction5((t0: /* instance */ default, t1: /* row */ Double, t2: /* column */ Double, t3: /* value */ CellValue, t4: /* result */ Boolean) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setQueryMethod(
        value: (/* queryStr */ String, /* value */ CellValue, /* cellProperties */ CellProperties) => Boolean
      ): Self = StObject.set(x, "queryMethod", js.Any.fromFunction3(value))
      
      inline def setQueryMethodUndefined: Self = StObject.set(x, "queryMethod", js.undefined)
      
      inline def setSearchResultClass(value: String): Self = StObject.set(x, "searchResultClass", value.asInstanceOf[js.Any])
      
      inline def setSearchResultClassUndefined: Self = StObject.set(x, "searchResultClass", js.undefined)
    }
  }
  
  type SearchCallback = js.Function5[
    /* instance */ default, 
    /* row */ Double, 
    /* column */ Double, 
    /* value */ CellValue, 
    /* result */ Boolean, 
    Unit
  ]
  
  type SearchQueryMethod = js.Function3[
    /* queryStr */ String, 
    /* value */ CellValue, 
    /* cellProperties */ CellProperties, 
    Boolean
  ]
  
  type Settings = Boolean | DetailedSettings
}

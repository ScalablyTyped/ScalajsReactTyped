package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.anon.IdAttribute
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojarraydataproviderMod {
  
  @JSImport("@oracle/oraclejet/ojarraydataprovider", JSImport.Namespace)
  @js.native
  open class ^[K, D] protected ()
    extends StObject
       with ArrayDataProvider[K, D] {
    def this(data: js.Array[Any]) = this()
    def this(data: js.Function0[js.Array[Any]]) = this()
    def this(data: js.Array[Any], options: IdAttribute[D]) = this()
    def this(data: js.Function0[js.Array[Any]], options: IdAttribute[D]) = this()
  }
  
  @js.native
  trait ArrayDataProvider[K, D]
    extends StObject
       with DataProvider[K, D] {
    
    def addEventListener(eventType: String, listener: EventListener): Unit = js.native
    
    def getCapability(): Any = js.native
    
    def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
  }
  
  trait SortComparators[D] extends StObject {
    
    var comparators: Map[/* keyof D */ String, js.Function2[/* a */ Any, /* b */ Any, Double]]
  }
  object SortComparators {
    
    inline def apply[D](comparators: Map[/* keyof D */ String, js.Function2[/* a */ Any, /* b */ Any, Double]]): SortComparators[D] = {
      val __obj = js.Dynamic.literal(comparators = comparators.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortComparators[D]]
    }
    
    extension [Self <: SortComparators[?], D](x: Self & SortComparators[D]) {
      
      inline def setComparators(value: Map[/* keyof D */ String, js.Function2[/* a */ Any, /* b */ Any, Double]]): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
    }
  }
}

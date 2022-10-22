package typingsJapgolly.cheerioSelect

import typingsJapgolly.cssWhat.libEsTypesMod.PseudoSelector
import typingsJapgolly.cssWhat.libEsTypesMod.Selector
import typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Pseudo
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPositionalsMod {
  
  @JSImport("cheerio-select/lib/esm/positionals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cheerio-select/lib/esm/positionals", "filterNames")
  @js.native
  val filterNames: Set[String] = js.native
  
  inline def getLimit(filter: Filter, data: String, partLimit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLimit")(filter.asInstanceOf[js.Any], data.asInstanceOf[js.Any], partLimit.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getLimit(filter: Filter, data: Null, partLimit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLimit")(filter.asInstanceOf[js.Any], data.asInstanceOf[js.Any], partLimit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isFilter(s: Selector): /* is cheerio-select.cheerio-select/lib/esm/positionals.CheerioSelector */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFilter")(s.asInstanceOf[js.Any]).asInstanceOf[/* is cheerio-select.cheerio-select/lib/esm/positionals.CheerioSelector */ Boolean]
  
  trait CheerioSelector
    extends StObject
       with PseudoSelector {
    
    @JSName("data")
    var data_CheerioSelector: String | Null
    
    @JSName("name")
    var name_CheerioSelector: Filter
  }
  object CheerioSelector {
    
    inline def apply(name: Filter, `type`: Pseudo): CheerioSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheerioSelector]
    }
    
    extension [Self <: CheerioSelector](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setName(value: Filter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.first
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.last
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.eq
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.nth
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.gt
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.lt
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.even
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.odd
    - typingsJapgolly.cheerioSelect.cheerioSelectStrings.not
  */
  trait Filter extends StObject
  object Filter {
    
    inline def eq: typingsJapgolly.cheerioSelect.cheerioSelectStrings.eq = "eq".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.eq]
    
    inline def even: typingsJapgolly.cheerioSelect.cheerioSelectStrings.even = "even".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.even]
    
    inline def first: typingsJapgolly.cheerioSelect.cheerioSelectStrings.first = "first".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.first]
    
    inline def gt: typingsJapgolly.cheerioSelect.cheerioSelectStrings.gt = "gt".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.gt]
    
    inline def last: typingsJapgolly.cheerioSelect.cheerioSelectStrings.last = "last".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.last]
    
    inline def lt: typingsJapgolly.cheerioSelect.cheerioSelectStrings.lt = "lt".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.lt]
    
    inline def not: typingsJapgolly.cheerioSelect.cheerioSelectStrings.not = "not".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.not]
    
    inline def nth: typingsJapgolly.cheerioSelect.cheerioSelectStrings.nth = "nth".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.nth]
    
    inline def odd: typingsJapgolly.cheerioSelect.cheerioSelectStrings.odd = "odd".asInstanceOf[typingsJapgolly.cheerioSelect.cheerioSelectStrings.odd]
  }
}

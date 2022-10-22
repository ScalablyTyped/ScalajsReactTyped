package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Href
import typingsJapgolly.baseui.dataTableTypesMod.ColumnOptions
import typingsJapgolly.baseui.dataTableTypesMod.SharedColumnOptions
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableColumnAnchorMod {
  
  @JSImport("baseui/data-table/column-anchor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): AnchorColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[AnchorColumn]
  
  type AnchorColumn = ColumnOptions[Value, FilterParameters]
  
  type FilterParameters = js.Object
  
  trait Options
    extends StObject
       with SharedColumnOptions[Value] {
    
    var elementAs: js.UndefOr[ReplacementElementAs | String] = js.undefined
  }
  object Options {
    
    inline def apply(mapDataToValue: Any => Value, title: String): Options = {
      val __obj = js.Dynamic.literal(mapDataToValue = js.Any.fromFunction1(mapDataToValue), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setElementAs(value: ReplacementElementAs | String): Self = StObject.set(x, "elementAs", value.asInstanceOf[js.Any])
      
      inline def setElementAsUndefined: Self = StObject.set(x, "elementAs", js.undefined)
    }
  }
  
  type ReplacementElementAs = ComponentType[Href]
  
  trait Value extends StObject {
    
    var content: String
    
    var href: String
  }
  object Value {
    
    inline def apply(content: String, href: String): Value = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
}

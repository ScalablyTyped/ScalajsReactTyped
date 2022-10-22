package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grommet.grommetStrings.all
import typingsJapgolly.grommet.grommetStrings.none
import typingsJapgolly.grommet.grommetStrings.some
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand[TRowType] extends StObject {
  
  var expand: js.UndefOr[js.Array[String]] = js.undefined
  
  var expandable: js.UndefOr[js.Array[String]] = js.undefined
  
  var onExpand: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[String], Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.Function2[/* select */ js.Array[String | Double], /* datum */ TRowType, Unit]] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[StringDictionary[all | some | none]] = js.undefined
}
object Expand {
  
  inline def apply[TRowType](): Expand[TRowType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expand[TRowType]]
  }
  
  extension [Self <: Expand[?], TRowType](x: Self & Expand[TRowType]) {
    
    inline def setExpand(value: js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value*))
    
    inline def setExpandable(value: js.Array[String]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    inline def setExpandableVarargs(value: String*): Self = StObject.set(x, "expandable", js.Array(value*))
    
    inline def setOnExpand(value: /* expandedKeys */ js.Array[String] => Callback): Self = StObject.set(x, "onExpand", js.Any.fromFunction1((t0: /* expandedKeys */ js.Array[String]) => value(t0).runNow()))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOnSelect(value: (/* select */ js.Array[String | Double], /* datum */ TRowType) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* select */ js.Array[String | Double], t1: /* datum */ TRowType) => (value(t0, t1)).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setSelect(value: StringDictionary[all | some | none]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}

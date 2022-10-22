package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autocomplete extends StObject {
  
  def search(
    keyword: String,
    callback: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]
  ): Unit
}
object Autocomplete {
  
  inline def apply(
    search: (String, js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => Callback
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2((t0: String, t1: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => (search(t0, t1)).runNow()))
    __obj.asInstanceOf[Autocomplete]
  }
  
  extension [Self <: Autocomplete](x: Self) {
    
    inline def setSearch(
      value: (String, js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => Callback
    ): Self = StObject.set(x, "search", js.Any.fromFunction2((t0: String, t1: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => (value(t0, t1)).runNow()))
  }
}

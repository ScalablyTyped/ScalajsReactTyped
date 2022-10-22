package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SearchBarProps_1864943061[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def filterActive(value: Boolean): this.type = set("filterActive", value.asInstanceOf[js.Any])
  
  inline def onClearSearch(value: Callback): this.type = set("onClearSearch", value.toJsFn)
  
  inline def onFilterLinesWithMatches(value: /* isFiltered */ Boolean => Callback): this.type = set("onFilterLinesWithMatches", js.Any.fromFunction1((t0: /* isFiltered */ Boolean) => value(t0).runNow()))
  
  inline def onSearch(value: /* keyword */ String => Callback): this.type = set("onSearch", js.Any.fromFunction1((t0: /* keyword */ String) => value(t0).runNow()))
  
  inline def resultsCount(value: Double): this.type = set("resultsCount", value.asInstanceOf[js.Any])
}

package typingsJapgolly.tablesorter

import typingsJapgolly.jquery.JQuery.jqXHR
import typingsJapgolly.tablesorter.mod.global.HTMLElement
import typingsJapgolly.tablesorter.mod.global.JQuery
import typingsJapgolly.tablesorter.pagingPagerDataPartMod.PagerDataPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingAjaxDataProcessorMod {
  
  type AjaxDataProcessor[TElement] = js.Function3[
    /* data */ Any, 
    /* table */ TElement, 
    /* request */ jqXHR[Any], 
    PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[Double, JQuery[HTMLElement] | js.Array[js.Array[Any]], js.UndefOr[js.Array[String]]])
  ]
}

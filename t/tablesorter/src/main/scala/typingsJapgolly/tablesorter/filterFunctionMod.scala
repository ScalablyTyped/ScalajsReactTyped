package typingsJapgolly.tablesorter

import typingsJapgolly.tablesorter.mod._Global_.HTMLElement
import typingsJapgolly.tablesorter.mod._Global_.JQuery
import typingsJapgolly.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/FilterFunction", JSImport.Namespace)
@js.native
object filterFunctionMod extends js.Object {
  type FilterFunction[TElement] = js.Function7[
    /* originalContent */ String, 
    /* normalizedText */ String, 
    /* filterInput */ String, 
    /* index */ Double, 
    /* row */ JQuery[HTMLElement], 
    /* config */ TablesorterConfigurationStore[TElement], 
    /* data */ js.Object, 
    Boolean
  ]
}


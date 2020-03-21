package typingsJapgolly.sizzle.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.sizzle.mod.Selectors.AttrHandleFunctions
import typingsJapgolly.sizzle.mod.Selectors.CreatePseudoFunction
import typingsJapgolly.sizzle.mod.Selectors.FilterFunctions
import typingsJapgolly.sizzle.mod.Selectors.FindFunctions
import typingsJapgolly.sizzle.mod.Selectors.Matches
import typingsJapgolly.sizzle.mod.Selectors.PreFilterFunctions
import typingsJapgolly.sizzle.mod.Selectors.PseudoFunction
import typingsJapgolly.sizzle.mod.Selectors.PseudoFunctions
import typingsJapgolly.sizzle.mod.Selectors.SetFilterFunctions
import typingsJapgolly.std.Document_
import typingsJapgolly.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectors extends js.Object {
  var attrHandle: AttrHandleFunctions
  var cacheLength: Double
  var filter: FilterFunctions
  var find: FindFunctions
  var `match`: Matches
  var preFilter: PreFilterFunctions
  var pseudos: PseudoFunctions
  var setFilters: SetFilterFunctions
  def createPseudo(fn: CreatePseudoFunction): PseudoFunction
}

@JSImport("sizzle", "Selectors")
@js.native
object Selectors extends js.Object {
  type AttrHandleFunction = js.Function3[/* elem */ js.Any, /* casePreservedName */ String, /* isXML */ Boolean, String]
  type AttrHandleFunctions = StringDictionary[AttrHandleFunction]
  type CreatePseudoFunction = js.Function1[/* repeated */ js.Any, PseudoFunction]
  type FilterFunction = js.Function2[/* element */ String, /* repeated */ String, Boolean]
  type FilterFunctions = StringDictionary[FilterFunction]
  type FindFunction = js.Function3[
    /* match */ RegExpMatchArray, 
    /* context */ Element | Document_, 
    /* isXML */ Boolean, 
    js.Array[Element] | Unit
  ]
  type FindFunctions = StringDictionary[FindFunction]
  type Matches = StringDictionary[js.RegExp]
  type PreFilterFunction = js.Function1[/* match */ RegExpMatchArray, js.Array[String]]
  type PreFilterFunctions = StringDictionary[PreFilterFunction]
  type PseudoFunction = js.Function1[/* elem */ Element, Boolean]
  type PseudoFunctions = StringDictionary[PseudoFunction]
  type SetFilterFunction = js.Function3[
    /* elements */ js.Array[Element], 
    /* argument */ Double, 
    /* not */ Boolean, 
    js.Array[Element]
  ]
  type SetFilterFunctions = StringDictionary[SetFilterFunction]
}


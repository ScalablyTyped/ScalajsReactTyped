package typingsJapgolly.d3DashSelection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashSelectionMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.std.Document
  import typingsJapgolly.std.Element
  import typingsJapgolly.std.HTMLElement
  import typingsJapgolly.std.SVGGElement
  import typingsJapgolly.std.SVGSVGElement
  import typingsJapgolly.std.Window

  type BaseType = Element | EnterElement | Document | Window | Null
  type ContainerElement = HTMLElement | SVGSVGElement | SVGGElement
  type NamespaceMap = StringDictionary[String]
  type SelectionFn = js.Function0[Selection[HTMLElement, js.Any, Null, js.UndefOr[scala.Nothing]]]
  type ValueFn[T /* <: BaseType */, Datum, Result] = js.ThisFunction3[
    /* this */ T, 
    /* datum */ Datum, 
    /* index */ Double, 
    /* groups */ js.Array[T] | ArrayLike[T], 
    Result
  ]
}

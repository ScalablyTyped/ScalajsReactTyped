package typingsJapgolly.semanticUiReact.searchSearchMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typingsJapgolly.semanticUiReact.searchResultMod.SearchResultProps
import typingsJapgolly.semanticUiReact.searchResultsMod.SearchResultsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchComponent extends ComponentClass[SearchProps, ComponentState] {
  var Category: StatelessComponent[SearchCategoryProps] = js.native
  var Result: ComponentClassP[SearchResultProps with js.Object] = js.native
  var Results: StatelessComponent[SearchResultsProps] = js.native
}


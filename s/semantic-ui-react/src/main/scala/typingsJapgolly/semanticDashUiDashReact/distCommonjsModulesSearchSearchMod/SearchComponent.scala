package typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSearchSearchMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.reactMod.ComponentClass
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.StatelessComponent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultsMod.SearchResultsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchComponent extends ComponentClass[SearchProps, ComponentState] {
  var Category: StatelessComponent[SearchCategoryProps] = js.native
  var Result: ComponentClassP[SearchResultProps with js.Object] = js.native
  var Results: StatelessComponent[SearchResultsProps] = js.native
}


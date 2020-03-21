package typingsJapgolly.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KnockoutComponentTypes {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.knockout.KnockoutComponentTypes.ViewModelFunction
    - typingsJapgolly.knockout.KnockoutComponentTypes.ViewModelSharedInstance
    - typingsJapgolly.knockout.KnockoutComponentTypes.ViewModelFactoryFunction
    - typingsJapgolly.knockout.KnockoutComponentTypes.AMDModule
  */
  type ViewModel = typingsJapgolly.knockout.KnockoutComponentTypes._ViewModel | typingsJapgolly.knockout.KnockoutComponentTypes.ViewModelFunction
  // viewmodel types
  type ViewModelFunction = js.Function1[/* params */ js.UndefOr[js.Any], js.Any]
}

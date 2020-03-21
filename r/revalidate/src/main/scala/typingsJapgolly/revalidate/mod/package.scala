package typingsJapgolly.revalidate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Comparer = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  type ComposeConfig = typingsJapgolly.revalidate.mod.Config with typingsJapgolly.revalidate.mod.Multiple
  type ComposedCurryableValidator = js.Function1[
    /* config */ js.UndefOr[java.lang.String | typingsJapgolly.revalidate.mod.ComposeConfig], 
    typingsJapgolly.revalidate.mod.ConfiguredValidator
  ]
  type ConfigurableValidator = typingsJapgolly.revalidate.mod.UnconfiguredValidator with typingsJapgolly.revalidate.mod.CurryableValidator
  type ConfiguredCombinedValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  type ConfiguredValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  type CurryableValidator = js.Function1[
    /* config */ js.UndefOr[java.lang.String | typingsJapgolly.revalidate.mod.Config], 
    typingsJapgolly.revalidate.mod.ConfiguredValidator
  ]
  type MessageCreator = (js.Function1[/* field */ js.Any, js.Any]) | java.lang.String
  type UnconfiguredValidator = js.Function3[
    /* config */ js.UndefOr[java.lang.String | typingsJapgolly.revalidate.mod.Config], 
    /* value */ js.UndefOr[js.Any], 
    /* allValues */ js.UndefOr[js.Any], 
    js.Any
  ]
  type Validator = typingsJapgolly.revalidate.mod.ConfiguredValidator with typingsJapgolly.revalidate.mod.UnconfiguredValidator
  type ValidatorImpl = js.Function1[
    /* message */ js.Any, 
    js.Function2[/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], js.Any]
  ]
}

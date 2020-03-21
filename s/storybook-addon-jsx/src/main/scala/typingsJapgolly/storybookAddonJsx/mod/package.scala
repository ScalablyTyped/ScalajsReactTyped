package typingsJapgolly.storybookAddonJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddWithJSXFunc[StoryFnReturnType] = js.Function3[
    /* kind */ java.lang.String, 
    /* fn */ js.Function0[japgolly.scalajs.react.raw.React.Node], 
    /* options */ js.UndefOr[typingsJapgolly.storybookAddonJsx.mod.AddonParameters], 
    typingsJapgolly.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  type displayNameFunc = js.Function1[/* element */ japgolly.scalajs.react.raw.React.Element, java.lang.String]
}

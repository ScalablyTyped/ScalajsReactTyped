package typingsJapgolly.atStorybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.atStorybookApi.atStorybookApiMod.API

  type Collection = StringDictionary[Addon]
  type Loader = js.Function1[/* api */ API, Unit]
}

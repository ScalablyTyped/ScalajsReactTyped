package typingsJapgolly.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type JobAttributesData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResultCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], scala.Unit]
}

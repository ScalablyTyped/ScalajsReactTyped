package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.Dictionary
import typingsJapgolly.cypress.lodashMod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy1x1[T, S] extends js.Object {
  def apply(): NumericDictionary[S] = js.native
  def apply(`object`: Dictionary[T]): Dictionary[S] = js.native
  def apply(`object`: NumericDictionary[T]): NumericDictionary[S] = js.native
}


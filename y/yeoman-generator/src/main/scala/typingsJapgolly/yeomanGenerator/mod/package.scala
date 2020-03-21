package typingsJapgolly.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Answers = typingsJapgolly.inquirer.mod.Answers
  type Callback = js.Function1[/* err */ js.Any, scala.Unit]
  type Question[T /* <: typingsJapgolly.yeomanGenerator.mod.Answers */] = typingsJapgolly.inquirer.mod.DistinctQuestion[T] with typingsJapgolly.yeomanGenerator.AnonStore
  type Questions[A /* <: typingsJapgolly.yeomanGenerator.mod.Answers */] = typingsJapgolly.yeomanGenerator.mod.Question[A] | js.Array[typingsJapgolly.yeomanGenerator.mod.Question[A]] | typingsJapgolly.rxjs.mod.Observable_[typingsJapgolly.yeomanGenerator.mod.Question[A]]
}

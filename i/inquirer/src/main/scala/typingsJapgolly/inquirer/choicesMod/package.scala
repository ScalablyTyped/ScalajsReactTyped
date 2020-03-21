package typingsJapgolly.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object choicesMod {
  /**
    * Represents a property-name of any choice-type.
    *
    * @template T
    * The type of the answers.
    */
  type ChoiceProperty[T] = typingsJapgolly.inquirer.mod.KeyUnion[
    typingsJapgolly.inquirer.mod.UnionToIntersection[typingsJapgolly.inquirer.choicesMod.RealChoice[T]]
  ]
  /**
    * Represents a valid choice for the `Choices` class.
    *
    * @template T
    * The type of the answers.
    */
  type DistinctChoice[T] = /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer.BaseChoiceMap<T>[keyof inquirer.inquirer.BaseChoiceMap<T>] */ js.Any
  /**
    * Represents a valid real choice for the `Choices` class.
    *
    * @template T
    * The type of the answers.
    */
  type RealChoice[T] = typingsJapgolly.std.Exclude[
    typingsJapgolly.inquirer.choicesMod.DistinctChoice[T], 
    typingsJapgolly.inquirer.AnonType
  ]
}

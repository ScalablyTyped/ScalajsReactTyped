package typingsJapgolly.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type OptionPredicate[O /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function2[
    /* option */ O, 
    /* value */ js.UndefOr[typingsJapgolly.ionicCliFramework.definitionsMod.ParsedArg], 
    scala.Boolean
  ]
}

package typingsJapgolly.atAngularCore.atAngularCoreMod

import typingsJapgolly.atAngularCore.atAngularCoreNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveDefFeature extends js.Object {
  /**
    * Marks a feature as something that {@link InheritDefinitionFeature} will execute
    * during inheritance.
    *
    * NOTE: DO NOT SET IN ROOT OF MODULE! Doing so will result in tree-shakers/bundlers
    * identifying the change as a side effect, and the feature will be included in
    * every bundle.
    */
  var ngInherit: js.UndefOr[`true`] = js.native
  def apply[T](directiveDef: ɵDirectiveDef[T]): Unit = js.native
}


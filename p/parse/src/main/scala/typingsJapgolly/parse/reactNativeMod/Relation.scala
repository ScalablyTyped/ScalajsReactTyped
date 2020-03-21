package typingsJapgolly.parse.reactNativeMod

import typingsJapgolly.parse.mod._Global_.Parse.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class that is used to access all of the children of a many-to-many relationship.
  * Each instance of Parse.Relation is associated with a particular parent object and key.
  */
@JSImport("parse/react-native", "Relation")
@js.native
class Relation[S /* <: typingsJapgolly.parse.mod._Global_.Parse.Object[Attributes] */, T /* <: typingsJapgolly.parse.mod._Global_.Parse.Object[Attributes] */] ()
  extends typingsJapgolly.parse.mod.Relation[S, T] {
  def this(parent: S) = this()
  def this(parent: S, key: String) = this()
}


package typingsJapgolly.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescQuery[T]
  extends KeyableQuery[T]
     with CountableQuery[T]
     with ExecutableQuery[T]
     with FilterableQuery[T]
     with DescableQuery[T]
     with ModifiableQuery[T]
     with MappableQuery[T]


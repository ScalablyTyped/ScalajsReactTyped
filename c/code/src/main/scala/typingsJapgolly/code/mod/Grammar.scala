package typingsJapgolly.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grammar[T] extends js.Object {
  /** Connecting word. */
  var a: AssertionChain[T]
  /** Connecting word. */
  var an: AssertionChain[T]
  /** Connecting word. */
  var and: AssertionChain[T]
  /** Connecting word. */
  var at: AssertionChain[T]
  /** Connecting word. */
  var be: AssertionChain[T]
  /** Connecting word. */
  var have: AssertionChain[T]
  /** Connecting word. */
  var in: AssertionChain[T]
  /** Connecting word. */
  var to: AssertionChain[T]
}

object Grammar {
  @scala.inline
  def apply[T](
    a: AssertionChain[T],
    an: AssertionChain[T],
    and: AssertionChain[T],
    at: AssertionChain[T],
    be: AssertionChain[T],
    have: AssertionChain[T],
    in: AssertionChain[T],
    to: AssertionChain[T]
  ): Grammar[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], an = an.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Grammar[T]]
  }
}


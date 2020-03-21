package typingsJapgolly.jest.mod.jest

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jest.AnonBOLDWEIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jest.jest.jest.MatcherUtils & std.Readonly<jest.jest.jest.MatcherState> */
@js.native
trait MatcherContext
  extends /* other */ StringDictionary[js.Any] {
  val assertionCalls: Double = js.native
  val currentTestName: String = js.native
  val expand: Boolean = js.native
  val expectedAssertionsNumber: (Double | Null) with Double = js.native
  val isExpectingAssertions: js.UndefOr[Boolean] = js.native
  val isNot: Boolean = js.native
  val promise: String = js.native
  val suppressedErrors: js.Array[_] with js.Array[js.Error] = js.native
  val testPath: String = js.native
  var utils: AnonBOLDWEIGHT = js.native
  def dontThrow(): Unit = js.native
  /**
    *  This is a deep-equality function that will return true if two objects have the same values (recursively).
    */
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[EqualityTester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[EqualityTester], strictCheck: Boolean): Boolean = js.native
}


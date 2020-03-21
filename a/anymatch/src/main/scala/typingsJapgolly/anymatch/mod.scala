package typingsJapgolly.anymatch

import typingsJapgolly.anymatch.anymatchBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anymatch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait CurrriedMatcher extends js.Object {
    def apply(testString: String): Boolean = js.native
    def apply(testString: String, returnIndex: Boolean): Boolean = js.native
    def apply(testString: String, returnIndex: Boolean, startIndex: Double): Boolean = js.native
    def apply(testString: String, returnIndex: Boolean, startIndex: Double, endIndex: Double): Boolean = js.native
    def apply(testString: String, returnIndex: `true`): Double = js.native
    def apply(testString: String, returnIndex: `true`, startIndex: Double): Double = js.native
    def apply(testString: String, returnIndex: `true`, startIndex: Double, endIndex: Double): Double = js.native
    def apply(testString: js.Array[String]): Boolean = js.native
    def apply(testString: js.Array[String], returnIndex: Boolean): Boolean = js.native
    def apply(testString: js.Array[String], returnIndex: Boolean, startIndex: Double): Boolean = js.native
    def apply(testString: js.Array[String], returnIndex: Boolean, startIndex: Double, endIndex: Double): Boolean = js.native
    def apply(testString: js.Array[String], returnIndex: `true`): Double = js.native
    def apply(testString: js.Array[String], returnIndex: `true`, startIndex: Double): Double = js.native
    def apply(testString: js.Array[String], returnIndex: `true`, startIndex: Double, endIndex: Double): Double = js.native
  }
  
  def apply(matcher: Matcher): CurrriedMatcher = js.native
  def apply(matcher: Matcher, testString: String): Boolean = js.native
  def apply(matcher: Matcher, testString: String, returnIndex: Boolean): Boolean = js.native
  def apply(matcher: Matcher, testString: String, returnIndex: Boolean, startIndex: Double): Boolean = js.native
  def apply(matcher: Matcher, testString: String, returnIndex: Boolean, startIndex: Double, endIndex: Double): Boolean = js.native
  def apply(matcher: Matcher, testString: String, returnIndex: `true`): Double = js.native
  def apply(matcher: Matcher, testString: String, returnIndex: `true`, startIndex: Double): Double = js.native
  def apply(matcher: Matcher, testString: String, returnIndex: `true`, startIndex: Double, endIndex: Double): Double = js.native
  def apply(matcher: Matcher, testString: js.Array[String]): Boolean = js.native
  def apply(matcher: Matcher, testString: js.Array[String], returnIndex: Boolean): Boolean = js.native
  def apply(matcher: Matcher, testString: js.Array[String], returnIndex: Boolean, startIndex: Double): Boolean = js.native
  def apply(
    matcher: Matcher,
    testString: js.Array[String],
    returnIndex: Boolean,
    startIndex: Double,
    endIndex: Double
  ): Boolean = js.native
  def apply(matcher: Matcher, testString: js.Array[String], returnIndex: `true`): Double = js.native
  def apply(matcher: Matcher, testString: js.Array[String], returnIndex: `true`, startIndex: Double): Double = js.native
  def apply(
    matcher: Matcher,
    testString: js.Array[String],
    returnIndex: `true`,
    startIndex: Double,
    endIndex: Double
  ): Double = js.native
  type Matcher = MatcherType | js.Array[MatcherType]
  type MatcherType = String | js.RegExp | (js.Function1[/* repeated */ String, Boolean])
}


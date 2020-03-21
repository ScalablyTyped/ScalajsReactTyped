package typingsJapgolly.universalRouter

import typingsJapgolly.pathToRegexp.mod.Key
import typingsJapgolly.pathToRegexp.mod.MatchFunction
import typingsJapgolly.pathToRegexp.mod.ParseOptions
import typingsJapgolly.pathToRegexp.mod.Path
import typingsJapgolly.pathToRegexp.mod.PathFunction
import typingsJapgolly.pathToRegexp.mod.RegExpOptions
import typingsJapgolly.pathToRegexp.mod.Token
import typingsJapgolly.pathToRegexp.mod.TokensToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  def apply(path: Path): js.RegExp = js.native
  def apply(path: Path, keys: js.Array[Key]): js.RegExp = js.native
  def apply(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): js.RegExp = js.native
  def compile[P /* <: js.Object */](path: String): PathFunction[P] = js.native
  def compile[P /* <: js.Object */](path: String, options: ParseOptions with TokensToFunctionOptions): PathFunction[P] = js.native
  def `match`[P /* <: js.Object */](path: String): MatchFunction[P] = js.native
  def `match`[P /* <: js.Object */](path: String, options: ParseOptions): MatchFunction[P] = js.native
  def parse(path: String): js.Array[Token] = js.native
  def parse(path: String, options: ParseOptions): js.Array[Token] = js.native
  def regexpToFunction[P /* <: js.Object */](re: js.RegExp, keys: js.Array[Key]): MatchFunction[P] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token]): PathFunction[P] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token], options: TokensToFunctionOptions): PathFunction[P] = js.native
  def tokensToRegExp(tokens: js.Array[Token]): js.RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key]): js.RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key], options: RegExpOptions): js.RegExp = js.native
}


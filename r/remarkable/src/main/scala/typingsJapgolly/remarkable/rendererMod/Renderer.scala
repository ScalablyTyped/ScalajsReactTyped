package typingsJapgolly.remarkable.rendererMod

import typingsJapgolly.remarkable.libMod.ContentToken
import typingsJapgolly.remarkable.libMod.Env
import typingsJapgolly.remarkable.libMod.GetBreak
import typingsJapgolly.remarkable.libMod.Options
import typingsJapgolly.remarkable.libMod.Remarkable
import typingsJapgolly.remarkable.libMod.Rules
import typingsJapgolly.remarkable.libMod.Token
import typingsJapgolly.remarkable.remarkableStrings.Linefeed
import typingsJapgolly.remarkable.remarkableStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renderer class. Renders HTML and exposes `rules` to allow
  * local modifications.
  */
@js.native
trait Renderer extends js.Object {
  /**
    * Exported helper, for custom rules only.
    */
  @JSName("getBreak")
  var getBreak_Original: GetBreak = js.native
  var rules: Rules = js.native
  /**
    * Exported helper, for custom rules only.
    */
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed = js.native
  /**
    * Render a string of HTML with the given `tokens` and
    * `options`.
    */
  def render(tokens: js.Array[Token], options: Options, env: Env): String = js.native
  /**
    * Render a string of inline HTML with the given `tokens` and
    * `options`.
    */
  def renderInline(tokens: js.Array[Token], options: Options, env: Env): String = js.native
}


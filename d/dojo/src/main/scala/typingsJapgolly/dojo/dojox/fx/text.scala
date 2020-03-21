package typingsJapgolly.dojo.dojox.fx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/text.html
  *
  *
  */
trait text extends js.Object {
  /**
    * Split a block of text into words or letters and backspace them in sequence
    * Returns an animation that will split the text into spans of words
    * or characters that appear as if they were being backspaced (or typed) in real-time.
    *
    * @param args args.interval: Float - The number of milliseconds between each piece's animation(default is determined by text length and args.duration);args.wordDelay: Integer - The number of milliseconds between each word(only effective when args.unhide = true)args.fixed: Boolean - If true, only style.opacity changes; otherwise, style.displaychanges between none and inline, adding realism (default = false)args.random: Float - If true, pieces have a random delay. The value defines how muchrandomness is introduced (only effective when args.unhide = true)args.unhide: Boolean - If true, the animation is reversed
    */
  def backspace(args: js.Object): Unit
  /**
    *
    * @param args
    */
  def blockFadeIn(args: js.Object): Unit
  /**
    * Split a block of text into words or letters and fade them
    * Returns an animation that will split the text into spans of words
    * or characters that fade in or out.
    *
    * @param args args.words: Boolean - If true, text will be split into words rather than charactersargs.interval: Float - The number of milliseconds between each piece's animation (default is 0)args.random: Float - If true, pieces have a random delay. The value defines how much                 randomness is introducedargs.reverseOrder: Boolean - If true, pieces animate in reversed orderargs.unhide: Boolean - If true, the animation is reversed
    */
  def blockFadeOut(args: js.Object): Unit
  /**
    *
    * @param args
    */
  def build(args: js.Object): Unit
  /**
    *
    * @param args
    */
  def converge(args: js.Object): Unit
  /**
    * Split a block of text into words or letters and let them fall
    * Returns an animation that will split the text into spans of words
    * or characters that drop.
    *
    * @param args args.crop: Boolean - If true, pieces will be positioned relatively rather than absolutelyargs.words: Boolean - If true, text will be split into words rather than charactersargs.interval: Float - The number of milliseconds between each piece's animationargs.distance: Float - The number of the node's heights to drop (default is 1.5)args.fade: Boolean - If true, pieces fade out while in motion (default is true)args.random: Float - If set, pieces fall in random order. The value defines how much                 randomness is introducedargs.reverseOrder: Boolean - If true, pieces animate in reversed orderargs.unhide: Boolean - If true, the peices fall from above and land in place
    */
  def disintegrate(args: js.Object): Unit
  /**
    * Explode a block of text into words or letters
    * Returns an animation that will split the text into a spans
    * of words or characters that fly away from the center.
    *
    * @param args args.crop: Boolean - If true, pieces will be positioned relatively rather than absolutelyargs.words: Boolean - If true, text will be split into words rather than charactersargs.random: Float - If set, pieces fly to random distances, for random durations,                 and in slightly random directions. The value defines how much                 randomness is introduced.args.distance: Float - Multiplier for the distance the pieces fly (even when random)args.fade: Boolean - If true, pieces fade out while in motion (default is true)args.fadeEasing: Function - If args.fade is true, the fade animations use this easing functionargs.unhide: Boolean - If true, the animation is reversedargs.sync: Boolean - If args.unhide is true, all the pieces converge at the same time                 (default is true)
    */
  def explode(args: js.Object): Unit
  /**
    *
    * @param args
    */
  def `type`(args: js.Object): Unit
}

object text {
  @scala.inline
  def apply(
    backspace: js.Object => Callback,
    blockFadeIn: js.Object => Callback,
    blockFadeOut: js.Object => Callback,
    build: js.Object => Callback,
    converge: js.Object => Callback,
    disintegrate: js.Object => Callback,
    explode: js.Object => Callback,
    `type`: js.Object => Callback
  ): text = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backspace")(js.Any.fromFunction1((t0: js.Object) => backspace(t0).runNow()))
    __obj.updateDynamic("blockFadeIn")(js.Any.fromFunction1((t0: js.Object) => blockFadeIn(t0).runNow()))
    __obj.updateDynamic("blockFadeOut")(js.Any.fromFunction1((t0: js.Object) => blockFadeOut(t0).runNow()))
    __obj.updateDynamic("build")(js.Any.fromFunction1((t0: js.Object) => build(t0).runNow()))
    __obj.updateDynamic("converge")(js.Any.fromFunction1((t0: js.Object) => converge(t0).runNow()))
    __obj.updateDynamic("disintegrate")(js.Any.fromFunction1((t0: js.Object) => disintegrate(t0).runNow()))
    __obj.updateDynamic("explode")(js.Any.fromFunction1((t0: js.Object) => explode(t0).runNow()))
    __obj.updateDynamic("type")(js.Any.fromFunction1((t0: js.Object) => `type`(t0).runNow()))
    __obj.asInstanceOf[text]
  }
}


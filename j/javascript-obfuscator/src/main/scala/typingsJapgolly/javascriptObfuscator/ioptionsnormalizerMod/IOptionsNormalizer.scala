package typingsJapgolly.javascriptObfuscator.ioptionsnormalizerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptObfuscator.ioptionsMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsNormalizer extends js.Object {
  /**
    * @param {IOptions} options
    * @returns {IOptions}
    */
  def normalize(options: IOptions): IOptions
}

object IOptionsNormalizer {
  @scala.inline
  def apply(normalize: IOptions => CallbackTo[IOptions]): IOptionsNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("normalize")(js.Any.fromFunction1((t0: typingsJapgolly.javascriptObfuscator.ioptionsMod.IOptions) => normalize(t0).runNow()))
    __obj.asInstanceOf[IOptionsNormalizer]
  }
}


package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.extractorMod.Extractor
import typingsJapgolly.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtractor extends js.Object {
  var extractor: Extractor
  var staticReflector: StaticReflector
}

object AnonExtractor {
  @scala.inline
  def apply(extractor: Extractor, staticReflector: StaticReflector): AnonExtractor = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], staticReflector = staticReflector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtractor]
  }
}


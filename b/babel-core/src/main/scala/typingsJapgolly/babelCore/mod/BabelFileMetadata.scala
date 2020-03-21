package typingsJapgolly.babelCore.mod

import typingsJapgolly.babelCore.AnonLoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileMetadata extends js.Object {
  var marked: js.Array[AnonLoc]
  var modules: BabelFileModulesMetadata
  var usedHelpers: js.Array[String]
}

object BabelFileMetadata {
  @scala.inline
  def apply(marked: js.Array[AnonLoc], modules: BabelFileModulesMetadata, usedHelpers: js.Array[String]): BabelFileMetadata = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], usedHelpers = usedHelpers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BabelFileMetadata]
  }
}


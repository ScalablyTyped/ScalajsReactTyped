package typingsJapgolly.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationModuleImport extends js.Object {
  var documentName: String
  var fragmentName: String
  var fragmentPropName: String
  var kind: String
}

object NormalizationModuleImport {
  @scala.inline
  def apply(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): NormalizationModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NormalizationModuleImport]
  }
}


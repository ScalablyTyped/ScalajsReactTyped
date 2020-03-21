package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmldsigjs.canonicalizerMod.XmlCanonicalizer
import typingsJapgolly.xmldsigjs.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/transforms/c14n", JSImport.Namespace)
@js.native
object c14nMod extends js.Object {
  @js.native
  class XmlDsigC14NTransform () extends Transform {
    var xmlCanonicalizer: XmlCanonicalizer = js.native
  }
  
  @js.native
  class XmlDsigC14NWithCommentsTransform () extends XmlDsigC14NTransform
  
}


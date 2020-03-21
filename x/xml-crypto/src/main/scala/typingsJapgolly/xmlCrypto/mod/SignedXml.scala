package typingsJapgolly.xmlCrypto.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Node
import typingsJapgolly.xmlCrypto.AnonAttrs
import typingsJapgolly.xmlCrypto.AnonCanonicalizationAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-crypto", "SignedXml")
@js.native
class SignedXml () extends js.Object {
  def this(idMode: String) = this()
  def this(idMode: String, options: AnonCanonicalizationAlgorithm) = this()
  def this(idMode: Null, options: AnonCanonicalizationAlgorithm) = this()
  var canonicalizationAlgorithm: String = js.native
  var keyInfoProvider: FileKeyInfo = js.native
  var references: js.Array[Reference] = js.native
  var signatureAlgorithm: String = js.native
  var signingKey: Buffer | String = js.native
  var validationErrors: js.Array[String] = js.native
  def addReference(
    xpath: String,
    transforms: js.UndefOr[js.Array[String]],
    digestAlgorithm: js.UndefOr[String],
    uri: js.UndefOr[String],
    digestValue: js.UndefOr[String],
    inclusiveNamespacesPrefixList: js.UndefOr[String],
    isEmptyUri: js.UndefOr[Boolean]
  ): Unit = js.native
  def checkSignature(xml: String): Boolean = js.native
  def computeSignature(xml: String): Unit = js.native
  def computeSignature(xml: String, opts: AnonAttrs): Unit = js.native
  def getOriginalXmlWithIds(): String = js.native
  def getSignatureXml(): String = js.native
  def getSignedXml(): String = js.native
  def loadSignature(signatureNode: String): Unit = js.native
  def loadSignature(signatureNode: Node): Unit = js.native
}

/* static members */
@JSImport("xml-crypto", "SignedXml")
@js.native
object SignedXml extends js.Object {
  var CanonicalizationAlgorithms: StringDictionary[Instantiable0[TransformationAlgorithm]] = js.native
  var HashAlgorithms: StringDictionary[Instantiable0[HashAlgorithm]] = js.native
  var SignatureAlgorithms: StringDictionary[Instantiable0[SignatureAlgorithm]] = js.native
}


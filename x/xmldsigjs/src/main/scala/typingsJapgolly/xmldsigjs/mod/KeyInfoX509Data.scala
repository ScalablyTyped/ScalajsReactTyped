package typingsJapgolly.xmldsigjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "KeyInfoX509Data")
@js.native
open class KeyInfoX509Data ()
  extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosMod.KeyInfoX509Data {
  def this(cert: typingsJapgolly.xmldsigjs.buildTypesPkiMod.X509Certificate) = this()
  def this(rgbCert: js.typedarray.Uint8Array) = this()
  def this(
    cert: typingsJapgolly.xmldsigjs.buildTypesPkiMod.X509Certificate,
    includeOptions: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption
  ) = this()
}

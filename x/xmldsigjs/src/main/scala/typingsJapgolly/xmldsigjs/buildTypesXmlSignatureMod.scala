package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmldsigjs.buildTypesXmlDataObjectMod.DataObjects
import typingsJapgolly.xmldsigjs.buildTypesXmlXmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlSignatureMod {
  
  @JSImport("xmldsigjs/build/types/xml/signature", "Signature")
  @js.native
  open class Signature () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    /**
      * Gets or sets the ID of the current Signature.
      */
    var Id: String = js.native
    
    /**
      * Gets or sets the KeyInfo of the current Signature.
      */
    var KeyInfo: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfoMod.KeyInfo = js.native
    
    var ObjectList: DataObjects = js.native
    
    /**
      * Gets or sets the value of the digital signature.
      */
    var SignatureValue: js.typedarray.Uint8Array | Null = js.native
    
    /**
      * Gets or sets the SignedInfo of the current Signature.
      */
    var SignedInfo: typingsJapgolly.xmldsigjs.buildTypesXmlSignedInfoMod.SignedInfo = js.native
  }
}

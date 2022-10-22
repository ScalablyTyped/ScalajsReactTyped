package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesXmlAnyMod.Any
import typingsJapgolly.xadesjs.buildTypesXmlDateTimeMod.XadesDateTime
import typingsJapgolly.xadesjs.buildTypesXmlSigningCertificateMod.DigestAlgAndValueType
import typingsJapgolly.xadesjs.buildTypesXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty
import typingsJapgolly.xadesjs.buildTypesXmlXmlBaseMod.XadesCollection
import typingsJapgolly.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlCompleteRevocationRefsMod {
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "CRLIdentifier")
  @js.native
  open class CRLIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var IssueTime: XadesDateTime = js.native
    
    var Issuer: String = js.native
    
    var Number: Double = js.native
    
    var URI: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "CRLRef")
  @js.native
  open class CRLRef () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CRLIdentifier: typingsJapgolly.xadesjs.buildTypesXmlCompleteRevocationRefsMod.CRLIdentifier = js.native
    
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "CRLRefs")
  @js.native
  open class CRLRefs () extends XadesCollection[CRLRef] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "CompleteRevocationRefs")
  @js.native
  open class CompleteRevocationRefs () extends UnsignedSignatureProperty {
    def this(properties: js.Object) = this()
    
    var CRLRefs: typingsJapgolly.xadesjs.buildTypesXmlCompleteRevocationRefsMod.CRLRefs = js.native
    
    var Id: String = js.native
    
    var OCSPRefs: typingsJapgolly.xadesjs.buildTypesXmlCompleteRevocationRefsMod.OCSPRefs = js.native
    
    var OtherRefs: typingsJapgolly.xadesjs.buildTypesXmlCompleteRevocationRefsMod.OtherRefs = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "OCSPIdentifier")
  @js.native
  open class OCSPIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var ProducedAt: XadesDateTime = js.native
    
    var ResponderID: typingsJapgolly.xadesjs.buildTypesXmlCompleteRevocationRefsMod.ResponderID = js.native
    
    var URI: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "OCSPRef")
  @js.native
  open class OCSPRef () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
    
    var OCSPIdentifier: typingsJapgolly.xadesjs.buildTypesXmlCompleteRevocationRefsMod.OCSPIdentifier = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "OCSPRefs")
  @js.native
  open class OCSPRefs () extends XadesCollection[OCSPRef] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "OtherRef")
  @js.native
  open class OtherRef () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "OtherRefs")
  @js.native
  open class OtherRefs () extends XadesCollection[OtherRef] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/complete_revocation_refs", "ResponderID")
  @js.native
  open class ResponderID () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var ByKey: js.typedarray.Uint8Array = js.native
    
    var ByName: String = js.native
  }
}

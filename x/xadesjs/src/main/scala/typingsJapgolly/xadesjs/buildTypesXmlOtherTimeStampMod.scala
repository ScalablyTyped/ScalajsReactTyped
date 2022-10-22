package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesXmlGenericTimeStampMod.EncapsulatedTimeStampCollection
import typingsJapgolly.xadesjs.buildTypesXmlGenericTimeStampMod.ReferenceInfos
import typingsJapgolly.xadesjs.buildTypesXmlGenericTimeStampMod.XMLTimeStampCollection
import typingsJapgolly.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlOtherTimeStampMod {
  
  @JSImport("xadesjs/build/types/xml/other_time_stamp", "OtherTimeStamp")
  @js.native
  open class OtherTimeStamp () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CanonicalizationMethod: typingsJapgolly.xmldsigjs.mod.CanonicalizationMethod = js.native
    
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    
    var Id: String = js.native
    
    var ReferenceInfo: ReferenceInfos = js.native
    
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
}

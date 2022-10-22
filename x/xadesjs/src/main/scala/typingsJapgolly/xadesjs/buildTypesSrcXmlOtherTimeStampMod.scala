package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesSrcXmlGenericTimeStampMod.EncapsulatedTimeStampCollection
import typingsJapgolly.xadesjs.buildTypesSrcXmlGenericTimeStampMod.ReferenceInfos
import typingsJapgolly.xadesjs.buildTypesSrcXmlGenericTimeStampMod.XMLTimeStampCollection
import typingsJapgolly.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlOtherTimeStampMod {
  
  @JSImport("xadesjs/build/types/src/xml/other_time_stamp", "OtherTimeStamp")
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

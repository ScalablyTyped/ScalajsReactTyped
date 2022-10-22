package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesSrcXmlCommitmentTypeIndicationMod.CommitmentTypeIndication
import typingsJapgolly.xadesjs.buildTypesSrcXmlDataObjectFormatMod.DataObjectFormat
import typingsJapgolly.xadesjs.buildTypesSrcXmlXadesTimeStampMod.XAdESTimeStamp
import typingsJapgolly.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesCollection
import typingsJapgolly.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlSignedDataObjectPropertiesMod {
  
  @JSImport("xadesjs/build/types/src/xml/signed_data_object_properties", "AllDataObjectsTimeStamp")
  @js.native
  open class AllDataObjectsTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signed_data_object_properties", "AllDataObjectsTimeStampCollection")
  @js.native
  open class AllDataObjectsTimeStampCollection () extends XadesCollection[AllDataObjectsTimeStamp] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signed_data_object_properties", "CommitmentTypeIndicationCollection")
  @js.native
  open class CommitmentTypeIndicationCollection () extends XadesCollection[CommitmentTypeIndication] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signed_data_object_properties", "DataObjectFormatCollection")
  @js.native
  open class DataObjectFormatCollection () extends XadesCollection[DataObjectFormat] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signed_data_object_properties", "IndividualDataObjectsTimeStamp")
  @js.native
  open class IndividualDataObjectsTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signed_data_object_properties", "IndividualDataObjectsTimeStampCollection")
  @js.native
  open class IndividualDataObjectsTimeStampCollection () extends XadesCollection[IndividualDataObjectsTimeStamp] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signed_data_object_properties", "SignedDataObjectProperties")
  @js.native
  open class SignedDataObjectProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var AllDataObjectsTimeStamps: AllDataObjectsTimeStampCollection = js.native
    
    var CommitmentTypeIndications: CommitmentTypeIndicationCollection = js.native
    
    var DataObjectFormats: DataObjectFormatCollection = js.native
    
    var Id: String = js.native
    
    var IndividualDataObjectsTimeStamps: IndividualDataObjectsTimeStampCollection = js.native
  }
}

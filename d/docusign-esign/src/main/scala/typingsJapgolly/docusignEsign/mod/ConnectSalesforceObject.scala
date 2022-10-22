package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectSalesforceObject extends StObject {
  
  /**
    * When set to **true**, the `connectSalesforceObject` is active.
    */
  var active: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the `connectSalesforceObject`.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the `connectSalesforceObject`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var insert: js.UndefOr[String] = js.undefined
  
  /**
    * When **true**, Salesforce is updated only when the envelope is complete.
    */
  var onCompleteOnly: js.UndefOr[String] = js.undefined
  
  /**
    * The DocuSign and Salesforce fields that you want to use to match a Salesforce object with DocuSign information. This information tells Connect when to send updates to Salesforce.
    */
  var selectFields: js.UndefOr[
    js.Array[
      /* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField
    ]
  ] = js.undefined
  
  /**
    * The Salesforce.com object type, such as `case`, `contact`, or `opportunity`.
    */
  var sfObject: js.UndefOr[String] = js.undefined
  
  /**
    * A name for the Salesforce object.
    *
    * **Note**: You can enter any name for the object. It does not have to match the `sfObject` property.
    */
  var sfObjectName: js.UndefOr[String] = js.undefined
  
  /**
    * The DocuSign and Salesforce fields that you want to update.
    *
    * **Note**: You can choose to update SalesForce (with information from DocuSign) only, update DocuSign only, or both.
    */
  var updateFields: js.UndefOr[
    js.Array[
      /* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField
    ]
  ] = js.undefined
}
object ConnectSalesforceObject {
  
  inline def apply(): ConnectSalesforceObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectSalesforceObject]
  }
  
  extension [Self <: ConnectSalesforceObject](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInsert(value: String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setOnCompleteOnly(value: String): Self = StObject.set(x, "onCompleteOnly", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteOnlyUndefined: Self = StObject.set(x, "onCompleteOnly", js.undefined)
    
    inline def setSelectFields(
      value: js.Array[
          /* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField
        ]
    ): Self = StObject.set(x, "selectFields", value.asInstanceOf[js.Any])
    
    inline def setSelectFieldsUndefined: Self = StObject.set(x, "selectFields", js.undefined)
    
    inline def setSelectFieldsVarargs(
      value: (/* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField)*
    ): Self = StObject.set(x, "selectFields", js.Array(value*))
    
    inline def setSfObject(value: String): Self = StObject.set(x, "sfObject", value.asInstanceOf[js.Any])
    
    inline def setSfObjectName(value: String): Self = StObject.set(x, "sfObjectName", value.asInstanceOf[js.Any])
    
    inline def setSfObjectNameUndefined: Self = StObject.set(x, "sfObjectName", js.undefined)
    
    inline def setSfObjectUndefined: Self = StObject.set(x, "sfObject", js.undefined)
    
    inline def setUpdateFields(
      value: js.Array[
          /* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField
        ]
    ): Self = StObject.set(x, "updateFields", value.asInstanceOf[js.Any])
    
    inline def setUpdateFieldsUndefined: Self = StObject.set(x, "updateFields", js.undefined)
    
    inline def setUpdateFieldsVarargs(
      value: (/* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField)*
    ): Self = StObject.set(x, "updateFields", js.Array(value*))
  }
}

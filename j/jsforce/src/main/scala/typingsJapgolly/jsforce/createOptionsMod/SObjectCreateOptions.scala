package typingsJapgolly.jsforce.createOptionsMod

import typingsJapgolly.jsforce.salesforceIdMod.SalesforceId
import typingsJapgolly.jsforce.salesforceObjectOptionsMod.SObjectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SObjectCreateOptions extends SObjectOptions {
  var AccountSource: js.UndefOr[String] = js.undefined
  var BillingCity: js.UndefOr[String] = js.undefined
  var BillingCountry: js.UndefOr[String] = js.undefined
  var BillingLatitude: js.UndefOr[Double] = js.undefined
  var BillingLongitude: js.UndefOr[Double] = js.undefined
  var BillingPostalCode: js.UndefOr[String] = js.undefined
  var BillingState: js.UndefOr[String] = js.undefined
  var BillingStreet: js.UndefOr[String] = js.undefined
  var CreatedById: js.UndefOr[SalesforceId] = js.undefined
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  var Description: js.UndefOr[String] = js.undefined
  var Industry: js.UndefOr[String] = js.undefined
  var IsDeleted: js.UndefOr[Boolean] = js.undefined
  var Jigsaw: js.UndefOr[String] = js.undefined
  var JigsawCompanyId: js.UndefOr[String] = js.undefined
  var LastActivityDate: js.UndefOr[js.Date] = js.undefined
  var LastModifiedById: js.UndefOr[SalesforceId] = js.undefined
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  var LastReferencedDate: js.UndefOr[js.Date] = js.undefined
  var LastViewedDate: js.UndefOr[js.Date] = js.undefined
  var MasterRecordId: js.UndefOr[SalesforceId] = js.undefined
  var NumberOfEmployees: js.UndefOr[Double] = js.undefined
  var OwnerId: js.UndefOr[SalesforceId] = js.undefined
  var ParentId: js.UndefOr[SalesforceId] = js.undefined
  var Phone: js.UndefOr[String] = js.undefined
  var ShippingCity: js.UndefOr[String] = js.undefined
  var ShippingCountry: js.UndefOr[String] = js.undefined
  var ShippingLatitude: js.UndefOr[Double] = js.undefined
  var ShippingLongitude: js.UndefOr[Double] = js.undefined
  var ShippingPostalCode: js.UndefOr[String] = js.undefined
  var ShippingState: js.UndefOr[String] = js.undefined
  var ShippingStreet: js.UndefOr[String] = js.undefined
  var SicDesc: js.UndefOr[String] = js.undefined
  var SystemModstamp: js.UndefOr[js.Date] = js.undefined
  var Type: js.UndefOr[String] = js.undefined
  var Website: js.UndefOr[String] = js.undefined
}

object SObjectCreateOptions {
  @scala.inline
  def apply(
    AccountSource: String = null,
    BillingCity: String = null,
    BillingCountry: String = null,
    BillingLatitude: Int | Double = null,
    BillingLongitude: Int | Double = null,
    BillingPostalCode: String = null,
    BillingState: String = null,
    BillingStreet: String = null,
    CreatedById: SalesforceId = null,
    CreatedDate: js.Date = null,
    Description: String = null,
    ExtId__c: String = null,
    Id: SalesforceId = null,
    Industry: String = null,
    IsDeleted: js.UndefOr[Boolean] = js.undefined,
    Jigsaw: String = null,
    JigsawCompanyId: String = null,
    LastActivityDate: js.Date = null,
    LastModifiedById: SalesforceId = null,
    LastModifiedDate: js.Date = null,
    LastReferencedDate: js.Date = null,
    LastViewedDate: js.Date = null,
    MasterRecordId: SalesforceId = null,
    Name: String = null,
    NumberOfEmployees: Int | Double = null,
    OwnerId: SalesforceId = null,
    ParentId: SalesforceId = null,
    Phone: String = null,
    ShippingCity: String = null,
    ShippingCountry: String = null,
    ShippingLatitude: Int | Double = null,
    ShippingLongitude: Int | Double = null,
    ShippingPostalCode: String = null,
    ShippingState: String = null,
    ShippingStreet: String = null,
    SicDesc: String = null,
    SystemModstamp: js.Date = null,
    Type: String = null,
    Website: String = null
  ): SObjectCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (AccountSource != null) __obj.updateDynamic("AccountSource")(AccountSource.asInstanceOf[js.Any])
    if (BillingCity != null) __obj.updateDynamic("BillingCity")(BillingCity.asInstanceOf[js.Any])
    if (BillingCountry != null) __obj.updateDynamic("BillingCountry")(BillingCountry.asInstanceOf[js.Any])
    if (BillingLatitude != null) __obj.updateDynamic("BillingLatitude")(BillingLatitude.asInstanceOf[js.Any])
    if (BillingLongitude != null) __obj.updateDynamic("BillingLongitude")(BillingLongitude.asInstanceOf[js.Any])
    if (BillingPostalCode != null) __obj.updateDynamic("BillingPostalCode")(BillingPostalCode.asInstanceOf[js.Any])
    if (BillingState != null) __obj.updateDynamic("BillingState")(BillingState.asInstanceOf[js.Any])
    if (BillingStreet != null) __obj.updateDynamic("BillingStreet")(BillingStreet.asInstanceOf[js.Any])
    if (CreatedById != null) __obj.updateDynamic("CreatedById")(CreatedById.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExtId__c != null) __obj.updateDynamic("ExtId__c")(ExtId__c.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Industry != null) __obj.updateDynamic("Industry")(Industry.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDeleted)) __obj.updateDynamic("IsDeleted")(IsDeleted.asInstanceOf[js.Any])
    if (Jigsaw != null) __obj.updateDynamic("Jigsaw")(Jigsaw.asInstanceOf[js.Any])
    if (JigsawCompanyId != null) __obj.updateDynamic("JigsawCompanyId")(JigsawCompanyId.asInstanceOf[js.Any])
    if (LastActivityDate != null) __obj.updateDynamic("LastActivityDate")(LastActivityDate.asInstanceOf[js.Any])
    if (LastModifiedById != null) __obj.updateDynamic("LastModifiedById")(LastModifiedById.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (LastReferencedDate != null) __obj.updateDynamic("LastReferencedDate")(LastReferencedDate.asInstanceOf[js.Any])
    if (LastViewedDate != null) __obj.updateDynamic("LastViewedDate")(LastViewedDate.asInstanceOf[js.Any])
    if (MasterRecordId != null) __obj.updateDynamic("MasterRecordId")(MasterRecordId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NumberOfEmployees != null) __obj.updateDynamic("NumberOfEmployees")(NumberOfEmployees.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId.asInstanceOf[js.Any])
    if (Phone != null) __obj.updateDynamic("Phone")(Phone.asInstanceOf[js.Any])
    if (ShippingCity != null) __obj.updateDynamic("ShippingCity")(ShippingCity.asInstanceOf[js.Any])
    if (ShippingCountry != null) __obj.updateDynamic("ShippingCountry")(ShippingCountry.asInstanceOf[js.Any])
    if (ShippingLatitude != null) __obj.updateDynamic("ShippingLatitude")(ShippingLatitude.asInstanceOf[js.Any])
    if (ShippingLongitude != null) __obj.updateDynamic("ShippingLongitude")(ShippingLongitude.asInstanceOf[js.Any])
    if (ShippingPostalCode != null) __obj.updateDynamic("ShippingPostalCode")(ShippingPostalCode.asInstanceOf[js.Any])
    if (ShippingState != null) __obj.updateDynamic("ShippingState")(ShippingState.asInstanceOf[js.Any])
    if (ShippingStreet != null) __obj.updateDynamic("ShippingStreet")(ShippingStreet.asInstanceOf[js.Any])
    if (SicDesc != null) __obj.updateDynamic("SicDesc")(SicDesc.asInstanceOf[js.Any])
    if (SystemModstamp != null) __obj.updateDynamic("SystemModstamp")(SystemModstamp.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Website != null) __obj.updateDynamic("Website")(Website.asInstanceOf[js.Any])
    __obj.asInstanceOf[SObjectCreateOptions]
  }
}


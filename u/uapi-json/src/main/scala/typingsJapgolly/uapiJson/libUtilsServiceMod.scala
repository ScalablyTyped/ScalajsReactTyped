package typingsJapgolly.uapiJson

import typingsJapgolly.uapiJson.anon.CurrencyConvert
import typingsJapgolly.uapiJson.anon.From
import typingsJapgolly.uapiJson.libSettingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsServiceMod {
  
  @JSImport("uapi-json/lib/UtilsService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUtilsService(settings: Settings): CurrencyConvert = ^.asInstanceOf[js.Dynamic].applyDynamic("createUtilsService")(settings.asInstanceOf[js.Any]).asInstanceOf[CurrencyConvert]
  
  trait CurrencyConvertParams extends StObject {
    
    var currencies: js.Array[From]
  }
  object CurrencyConvertParams {
    
    inline def apply(currencies: js.Array[From]): CurrencyConvertParams = {
      val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyConvertParams]
    }
    
    extension [Self <: CurrencyConvertParams](x: Self) {
      
      inline def setCurrencies(value: js.Array[From]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
      
      inline def setCurrenciesVarargs(value: From*): Self = StObject.set(x, "currencies", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.uapiJson.uapiJsonStrings.AccountingReferenceType
    - typingsJapgolly.uapiJson.uapiJsonStrings.AccountingRemarkType
    - typingsJapgolly.uapiJson.uapiJsonStrings.Airport
    - typingsJapgolly.uapiJson.uapiJsonStrings.AirAndRailMiscType
    - typingsJapgolly.uapiJson.uapiJsonStrings.AirAndRailSupplierType
    - typingsJapgolly.uapiJson.uapiJsonStrings.BusinessType
    - typingsJapgolly.uapiJson.uapiJsonStrings.Carrier
    - typingsJapgolly.uapiJson.uapiJsonStrings.City
    - typingsJapgolly.uapiJson.uapiJsonStrings.CityAirport
    - typingsJapgolly.uapiJson.uapiJsonStrings.Country
    - typingsJapgolly.uapiJson.uapiJsonStrings.Currency
    - typingsJapgolly.uapiJson.uapiJsonStrings.EmailType
    - typingsJapgolly.uapiJson.uapiJsonStrings.Equipment
    - typingsJapgolly.uapiJson.uapiJsonStrings.FulfillmentType
    - typingsJapgolly.uapiJson.uapiJsonStrings.GeoPoliticalArea
    - typingsJapgolly.uapiJson.uapiJsonStrings.HotelAmenities
    - typingsJapgolly.uapiJson.uapiJsonStrings.HotelMealPlans
    - typingsJapgolly.uapiJson.uapiJsonStrings.HotelMiscType
    - typingsJapgolly.uapiJson.uapiJsonStrings.HotelRateCategory
    - typingsJapgolly.uapiJson.uapiJsonStrings.HotelRoomViewType
    - typingsJapgolly.uapiJson.uapiJsonStrings.HotelSupplierType
    - typingsJapgolly.uapiJson.uapiJsonStrings.HotelTaxType
    - typingsJapgolly.uapiJson.uapiJsonStrings.TRMLocation
    - typingsJapgolly.uapiJson.uapiJsonStrings.MerchandisingOfferType
    - typingsJapgolly.uapiJson.uapiJsonStrings.PassengerTypeCode
    - typingsJapgolly.uapiJson.uapiJsonStrings.PaymentFormatType
    - typingsJapgolly.uapiJson.uapiJsonStrings.PaymentType
    - typingsJapgolly.uapiJson.uapiJsonStrings.PosChannel
    - typingsJapgolly.uapiJson.uapiJsonStrings.PersonGenderType
    - typingsJapgolly.uapiJson.uapiJsonStrings.ReferencePointSearch
    - typingsJapgolly.uapiJson.uapiJsonStrings.ResourceCategoryType
    - typingsJapgolly.uapiJson.uapiJsonStrings.RoleCategoryType
    - typingsJapgolly.uapiJson.uapiJsonStrings.SsrType
    - typingsJapgolly.uapiJson.uapiJsonStrings.State
    - typingsJapgolly.uapiJson.uapiJsonStrings.StateProvince
    - typingsJapgolly.uapiJson.uapiJsonStrings.SupplierType
    - typingsJapgolly.uapiJson.uapiJsonStrings.TaxCategory
    - typingsJapgolly.uapiJson.uapiJsonStrings.Title
    - typingsJapgolly.uapiJson.uapiJsonStrings.VehicleMiscType
    - typingsJapgolly.uapiJson.uapiJsonStrings.VehicleSpecialEquipment
    - typingsJapgolly.uapiJson.uapiJsonStrings.VehicleSupplierType
  */
  trait DataType extends StObject
  object DataType {
    
    inline def AccountingReferenceType: typingsJapgolly.uapiJson.uapiJsonStrings.AccountingReferenceType = "AccountingReferenceType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.AccountingReferenceType]
    
    inline def AccountingRemarkType: typingsJapgolly.uapiJson.uapiJsonStrings.AccountingRemarkType = "AccountingRemarkType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.AccountingRemarkType]
    
    inline def AirAndRailMiscType: typingsJapgolly.uapiJson.uapiJsonStrings.AirAndRailMiscType = "AirAndRailMiscType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.AirAndRailMiscType]
    
    inline def AirAndRailSupplierType: typingsJapgolly.uapiJson.uapiJsonStrings.AirAndRailSupplierType = "AirAndRailSupplierType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.AirAndRailSupplierType]
    
    inline def Airport: typingsJapgolly.uapiJson.uapiJsonStrings.Airport = "Airport".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.Airport]
    
    inline def BusinessType: typingsJapgolly.uapiJson.uapiJsonStrings.BusinessType = "BusinessType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.BusinessType]
    
    inline def Carrier: typingsJapgolly.uapiJson.uapiJsonStrings.Carrier = "Carrier".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.Carrier]
    
    inline def City: typingsJapgolly.uapiJson.uapiJsonStrings.City = "City".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.City]
    
    inline def CityAirport: typingsJapgolly.uapiJson.uapiJsonStrings.CityAirport = "CityAirport".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.CityAirport]
    
    inline def Country: typingsJapgolly.uapiJson.uapiJsonStrings.Country = "Country".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.Country]
    
    inline def Currency: typingsJapgolly.uapiJson.uapiJsonStrings.Currency = "Currency".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.Currency]
    
    inline def EmailType: typingsJapgolly.uapiJson.uapiJsonStrings.EmailType = "EmailType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.EmailType]
    
    inline def Equipment: typingsJapgolly.uapiJson.uapiJsonStrings.Equipment = "Equipment".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.Equipment]
    
    inline def FulfillmentType: typingsJapgolly.uapiJson.uapiJsonStrings.FulfillmentType = "FulfillmentType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.FulfillmentType]
    
    inline def GeoPoliticalArea: typingsJapgolly.uapiJson.uapiJsonStrings.GeoPoliticalArea = "GeoPoliticalArea".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.GeoPoliticalArea]
    
    inline def HotelAmenities: typingsJapgolly.uapiJson.uapiJsonStrings.HotelAmenities = "HotelAmenities".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.HotelAmenities]
    
    inline def HotelMealPlans: typingsJapgolly.uapiJson.uapiJsonStrings.HotelMealPlans = "HotelMealPlans".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.HotelMealPlans]
    
    inline def HotelMiscType: typingsJapgolly.uapiJson.uapiJsonStrings.HotelMiscType = "HotelMiscType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.HotelMiscType]
    
    inline def HotelRateCategory: typingsJapgolly.uapiJson.uapiJsonStrings.HotelRateCategory = "HotelRateCategory".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.HotelRateCategory]
    
    inline def HotelRoomViewType: typingsJapgolly.uapiJson.uapiJsonStrings.HotelRoomViewType = "HotelRoomViewType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.HotelRoomViewType]
    
    inline def HotelSupplierType: typingsJapgolly.uapiJson.uapiJsonStrings.HotelSupplierType = "HotelSupplierType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.HotelSupplierType]
    
    inline def HotelTaxType: typingsJapgolly.uapiJson.uapiJsonStrings.HotelTaxType = "HotelTaxType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.HotelTaxType]
    
    inline def MerchandisingOfferType: typingsJapgolly.uapiJson.uapiJsonStrings.MerchandisingOfferType = "MerchandisingOfferType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.MerchandisingOfferType]
    
    inline def PassengerTypeCode: typingsJapgolly.uapiJson.uapiJsonStrings.PassengerTypeCode = "PassengerTypeCode".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.PassengerTypeCode]
    
    inline def PaymentFormatType: typingsJapgolly.uapiJson.uapiJsonStrings.PaymentFormatType = "PaymentFormatType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.PaymentFormatType]
    
    inline def PaymentType: typingsJapgolly.uapiJson.uapiJsonStrings.PaymentType = "PaymentType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.PaymentType]
    
    inline def PersonGenderType: typingsJapgolly.uapiJson.uapiJsonStrings.PersonGenderType = "PersonGenderType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.PersonGenderType]
    
    inline def PosChannel: typingsJapgolly.uapiJson.uapiJsonStrings.PosChannel = "PosChannel".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.PosChannel]
    
    inline def ReferencePointSearch: typingsJapgolly.uapiJson.uapiJsonStrings.ReferencePointSearch = "ReferencePointSearch".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.ReferencePointSearch]
    
    inline def ResourceCategoryType: typingsJapgolly.uapiJson.uapiJsonStrings.ResourceCategoryType = "ResourceCategoryType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.ResourceCategoryType]
    
    inline def RoleCategoryType: typingsJapgolly.uapiJson.uapiJsonStrings.RoleCategoryType = "RoleCategoryType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.RoleCategoryType]
    
    inline def SsrType: typingsJapgolly.uapiJson.uapiJsonStrings.SsrType = "SsrType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.SsrType]
    
    inline def State: typingsJapgolly.uapiJson.uapiJsonStrings.State = "State".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.State]
    
    inline def StateProvince: typingsJapgolly.uapiJson.uapiJsonStrings.StateProvince = "StateProvince".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.StateProvince]
    
    inline def SupplierType: typingsJapgolly.uapiJson.uapiJsonStrings.SupplierType = "SupplierType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.SupplierType]
    
    inline def TRMLocation: typingsJapgolly.uapiJson.uapiJsonStrings.TRMLocation = "TRMLocation".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.TRMLocation]
    
    inline def TaxCategory: typingsJapgolly.uapiJson.uapiJsonStrings.TaxCategory = "TaxCategory".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.TaxCategory]
    
    inline def Title: typingsJapgolly.uapiJson.uapiJsonStrings.Title = "Title".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.Title]
    
    inline def VehicleMiscType: typingsJapgolly.uapiJson.uapiJsonStrings.VehicleMiscType = "VehicleMiscType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.VehicleMiscType]
    
    inline def VehicleSpecialEquipment: typingsJapgolly.uapiJson.uapiJsonStrings.VehicleSpecialEquipment = "VehicleSpecialEquipment".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.VehicleSpecialEquipment]
    
    inline def VehicleSupplierType: typingsJapgolly.uapiJson.uapiJsonStrings.VehicleSupplierType = "VehicleSupplierType".asInstanceOf[typingsJapgolly.uapiJson.uapiJsonStrings.VehicleSupplierType]
  }
  
  trait ReferenceDataParams extends StObject {
    
    var TraceId: String
    
    var dataType: DataType
  }
  object ReferenceDataParams {
    
    inline def apply(TraceId: String, dataType: DataType): ReferenceDataParams = {
      val __obj = js.Dynamic.literal(TraceId = TraceId.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceDataParams]
    }
    
    extension [Self <: ReferenceDataParams](x: Self) {
      
      inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setTraceId(value: String): Self = StObject.set(x, "TraceId", value.asInstanceOf[js.Any])
    }
  }
}

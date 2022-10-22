package typingsJapgolly.countryListJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("country-list-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("country-list-js", "all")
  @js.native
  val all: CountriesMap = js.native
  
  @JSImport("country-list-js", "cache")
  @js.native
  val cache: Cache_ = js.native
  
  inline def capitals(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("capitals")().asInstanceOf[js.Array[String]]
  
  inline def continents(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("continents")().asInstanceOf[js.Array[String]]
  
  inline def findByCapital(capital: String): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByCapital")(capital.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  
  inline def findByCurrency(currency: String): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByCurrency")(currency.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  
  inline def findByIso2(iso2: String): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByIso2")(iso2.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  
  inline def findByIso3(iso3: String): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByIso3")(iso3.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  
  inline def findByName(name: String): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByName")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  
  inline def findByPhoneNbr(phone: String): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByPhoneNbr")(phone.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  
  inline def findByProvince(province: String): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByProvince")(province.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  
  inline def ls(member: CountryRecordMember): js.Array[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ls")(member.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[String]]]
  
  inline def names(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("names")().asInstanceOf[js.Array[String]]
  
  trait Cache_ extends StObject {
    
    var capital: js.UndefOr[CountriesMap] = js.undefined
    
    var currency: js.UndefOr[CountriesMap] = js.undefined
    
    var iso3: js.UndefOr[CountriesMap] = js.undefined
    
    var name: js.UndefOr[CountriesMap] = js.undefined
    
    var province: js.UndefOr[CountriesMap] = js.undefined
  }
  object Cache_ {
    
    inline def apply(): Cache_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache_]
    }
    
    extension [Self <: Cache_](x: Self) {
      
      inline def setCapital(value: CountriesMap): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
      
      inline def setCapitalUndefined: Self = StObject.set(x, "capital", js.undefined)
      
      inline def setCurrency(value: CountriesMap): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setIso3(value: CountriesMap): Self = StObject.set(x, "iso3", value.asInstanceOf[js.Any])
      
      inline def setIso3Undefined: Self = StObject.set(x, "iso3", js.undefined)
      
      inline def setName(value: CountriesMap): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProvince(value: CountriesMap): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      inline def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
    }
  }
  
  type CountriesMap = StringDictionary[Country]
  
  trait Country extends StObject {
    
    var capital: String
    
    var code: CountryCode
    
    var continent: String
    
    var currency: Currency
    
    var dialing_code: String
    
    var name: String
    
    var provinces: js.Array[Province]
    
    var region: String
  }
  object Country {
    
    inline def apply(
      capital: String,
      code: CountryCode,
      continent: String,
      currency: Currency,
      dialing_code: String,
      name: String,
      provinces: js.Array[Province],
      region: String
    ): Country = {
      val __obj = js.Dynamic.literal(capital = capital.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], continent = continent.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dialing_code = dialing_code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provinces = provinces.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setCapital(value: String): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
      
      inline def setCode(value: CountryCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDialing_code(value: String): Self = StObject.set(x, "dialing_code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProvinces(value: js.Array[Province]): Self = StObject.set(x, "provinces", value.asInstanceOf[js.Any])
      
      inline def setProvincesVarargs(value: Province*): Self = StObject.set(x, "provinces", js.Array(value*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait CountryCode extends StObject {
    
    var iso2: String
    
    var iso3: String
  }
  object CountryCode {
    
    inline def apply(iso2: String, iso3: String): CountryCode = {
      val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any], iso3 = iso3.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryCode]
    }
    
    extension [Self <: CountryCode](x: Self) {
      
      inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      inline def setIso3(value: String): Self = StObject.set(x, "iso3", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.countryListJs.countryListJsStrings.name
    - typingsJapgolly.countryListJs.countryListJsStrings.region
    - typingsJapgolly.countryListJs.countryListJsStrings.capital
    - typingsJapgolly.countryListJs.countryListJsStrings.continent
    - typingsJapgolly.countryListJs.countryListJsStrings.dialing_code
    - typingsJapgolly.countryListJs.countryListJsStrings.code
    - typingsJapgolly.countryListJs.countryListJsStrings.currency
    - typingsJapgolly.countryListJs.countryListJsStrings.provinces
  */
  trait CountryRecordMember extends StObject
  object CountryRecordMember {
    
    inline def capital: typingsJapgolly.countryListJs.countryListJsStrings.capital = "capital".asInstanceOf[typingsJapgolly.countryListJs.countryListJsStrings.capital]
    
    inline def code: typingsJapgolly.countryListJs.countryListJsStrings.code = "code".asInstanceOf[typingsJapgolly.countryListJs.countryListJsStrings.code]
    
    inline def continent: typingsJapgolly.countryListJs.countryListJsStrings.continent = "continent".asInstanceOf[typingsJapgolly.countryListJs.countryListJsStrings.continent]
    
    inline def currency: typingsJapgolly.countryListJs.countryListJsStrings.currency = "currency".asInstanceOf[typingsJapgolly.countryListJs.countryListJsStrings.currency]
    
    inline def dialing_code: typingsJapgolly.countryListJs.countryListJsStrings.dialing_code = "dialing_code".asInstanceOf[typingsJapgolly.countryListJs.countryListJsStrings.dialing_code]
    
    inline def name: typingsJapgolly.countryListJs.countryListJsStrings.name = "name".asInstanceOf[typingsJapgolly.countryListJs.countryListJsStrings.name]
    
    inline def provinces: typingsJapgolly.countryListJs.countryListJsStrings.provinces = "provinces".asInstanceOf[typingsJapgolly.countryListJs.countryListJsStrings.provinces]
    
    inline def region: typingsJapgolly.countryListJs.countryListJsStrings.region = "region".asInstanceOf[typingsJapgolly.countryListJs.countryListJsStrings.region]
  }
  
  trait Currency extends StObject {
    
    var code: String
    
    var decimal: String
    
    var symbol: String
  }
  object Currency {
    
    inline def apply(code: String, decimal: String, symbol: String): Currency = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    extension [Self <: Currency](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Province extends StObject {
    
    var alias: js.Array[String] | Null
    
    var name: String
    
    var region: js.UndefOr[String] = js.undefined
    
    var short: js.UndefOr[String] = js.undefined
  }
  object Province {
    
    inline def apply(name: String): Province = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], alias = null)
      __obj.asInstanceOf[Province]
    }
    
    extension [Self <: Province](x: Self) {
      
      inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasNull: Self = StObject.set(x, "alias", null)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    }
  }
}

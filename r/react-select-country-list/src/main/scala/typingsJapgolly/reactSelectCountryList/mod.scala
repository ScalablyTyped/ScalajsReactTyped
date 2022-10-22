package typingsJapgolly.reactSelectCountryList

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSelectCountryList.mod.ReactSelectCountries.Countries
import typingsJapgolly.reactSelectCountryList.mod.ReactSelectCountries.CountryData
import typingsJapgolly.reactSelectCountryList.mod.ReactSelectCountries.LabelValueMap
import typingsJapgolly.reactSelectCountryList.mod.ReactSelectCountries.NativeCountries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): CountryList = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CountryList]
  
  @JSImport("react-select-country-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CountryList extends StObject {
    
    var data: js.Array[CountryData]
    
    def getData(): js.Array[CountryData]
    
    def getLabel(value: String): String
    
    def getLabelList(): LabelValueMap
    
    def getLabels(): js.Array[String]
    
    def getValue(label: String): String
    
    def getValueList(): LabelValueMap
    
    def getValues(): js.Array[String]
    
    var labelMap: LabelValueMap
    
    def native(): NativeCountries
    
    def setEmpty(label: String): Countries
    
    def setLabel(value: String, label: String): Countries
    
    var valueMap: LabelValueMap
  }
  object CountryList {
    
    inline def apply(
      data: js.Array[CountryData],
      getData: CallbackTo[js.Array[CountryData]],
      getLabel: String => String,
      getLabelList: CallbackTo[LabelValueMap],
      getLabels: CallbackTo[js.Array[String]],
      getValue: String => String,
      getValueList: CallbackTo[LabelValueMap],
      getValues: CallbackTo[js.Array[String]],
      labelMap: LabelValueMap,
      native: CallbackTo[NativeCountries],
      setEmpty: String => Countries,
      setLabel: (String, String) => Countries,
      valueMap: LabelValueMap
    ): CountryList = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getData = getData.toJsFn, getLabel = js.Any.fromFunction1(getLabel), getLabelList = getLabelList.toJsFn, getLabels = getLabels.toJsFn, getValue = js.Any.fromFunction1(getValue), getValueList = getValueList.toJsFn, getValues = getValues.toJsFn, labelMap = labelMap.asInstanceOf[js.Any], native = native.toJsFn, setEmpty = js.Any.fromFunction1(setEmpty), setLabel = js.Any.fromFunction2(setLabel), valueMap = valueMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryList]
    }
    
    extension [Self <: CountryList](x: Self) {
      
      inline def setData(value: js.Array[CountryData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: CountryData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGetData(value: CallbackTo[js.Array[CountryData]]): Self = StObject.set(x, "getData", value.toJsFn)
      
      inline def setGetLabel(value: String => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
      
      inline def setGetLabelList(value: CallbackTo[LabelValueMap]): Self = StObject.set(x, "getLabelList", value.toJsFn)
      
      inline def setGetLabels(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getLabels", value.toJsFn)
      
      inline def setGetValue(value: String => String): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGetValueList(value: CallbackTo[LabelValueMap]): Self = StObject.set(x, "getValueList", value.toJsFn)
      
      inline def setGetValues(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getValues", value.toJsFn)
      
      inline def setLabelMap(value: LabelValueMap): Self = StObject.set(x, "labelMap", value.asInstanceOf[js.Any])
      
      inline def setNative(value: CallbackTo[NativeCountries]): Self = StObject.set(x, "native", value.toJsFn)
      
      inline def setSetEmpty(value: String => Countries): Self = StObject.set(x, "setEmpty", js.Any.fromFunction1(value))
      
      inline def setSetLabel(value: (String, String) => Countries): Self = StObject.set(x, "setLabel", js.Any.fromFunction2(value))
      
      inline def setValueMap(value: LabelValueMap): Self = StObject.set(x, "valueMap", value.asInstanceOf[js.Any])
    }
  }
  
  object ReactSelectCountries {
    
    trait Countries extends StObject {
      
      var data: js.Array[CountryData]
      
      var labelMap: LabelValueMap
      
      var valueMap: LabelValueMap
    }
    object Countries {
      
      inline def apply(data: js.Array[CountryData], labelMap: LabelValueMap, valueMap: LabelValueMap): Countries = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], labelMap = labelMap.asInstanceOf[js.Any], valueMap = valueMap.asInstanceOf[js.Any])
        __obj.asInstanceOf[Countries]
      }
      
      extension [Self <: Countries](x: Self) {
        
        inline def setData(value: js.Array[CountryData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataVarargs(value: CountryData*): Self = StObject.set(x, "data", js.Array(value*))
        
        inline def setLabelMap(value: LabelValueMap): Self = StObject.set(x, "labelMap", value.asInstanceOf[js.Any])
        
        inline def setValueMap(value: LabelValueMap): Self = StObject.set(x, "valueMap", value.asInstanceOf[js.Any])
      }
    }
    
    trait CountryData extends StObject {
      
      var label: String
      
      var value: String
    }
    object CountryData {
      
      inline def apply(label: String, value: String): CountryData = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[CountryData]
      }
      
      extension [Self <: CountryData](x: Self) {
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    type LabelValueMap = StringDictionary[String]
    
    trait NativeCountries
      extends StObject
         with Countries {
      
      var nativeData: js.Array[CountryData]
    }
    object NativeCountries {
      
      inline def apply(
        data: js.Array[CountryData],
        labelMap: LabelValueMap,
        nativeData: js.Array[CountryData],
        valueMap: LabelValueMap
      ): NativeCountries = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], labelMap = labelMap.asInstanceOf[js.Any], nativeData = nativeData.asInstanceOf[js.Any], valueMap = valueMap.asInstanceOf[js.Any])
        __obj.asInstanceOf[NativeCountries]
      }
      
      extension [Self <: NativeCountries](x: Self) {
        
        inline def setNativeData(value: js.Array[CountryData]): Self = StObject.set(x, "nativeData", value.asInstanceOf[js.Any])
        
        inline def setNativeDataVarargs(value: CountryData*): Self = StObject.set(x, "nativeData", js.Array(value*))
      }
    }
  }
}

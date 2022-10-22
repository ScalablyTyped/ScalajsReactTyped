package typingsJapgolly.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vegaTypings.typesRuntimeMod.TypeInference
import typingsJapgolly.vegaTypings.typesSpecOnTriggerMod.OnTrigger
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.typesSpecTransformMod.Transforms
import typingsJapgolly.vegaTypings.vegaTypingsStrings.auto
import typingsJapgolly.vegaTypings.vegaTypingsStrings.csv
import typingsJapgolly.vegaTypings.vegaTypingsStrings.dsv
import typingsJapgolly.vegaTypings.vegaTypingsStrings.json
import typingsJapgolly.vegaTypings.vegaTypingsStrings.tsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecDataMod {
  
  trait BaseData
    extends StObject
       with Data {
    
    var name: String
    
    var on: js.UndefOr[js.Array[OnTrigger]] = js.undefined
    
    var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
  }
  object BaseData {
    
    inline def apply(name: String): BaseData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseData]
    }
    
    extension [Self <: BaseData](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOn(value: js.Array[OnTrigger]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOnVarargs(value: OnTrigger*): Self = StObject.set(x, "on", js.Array(value*))
      
      inline def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.typesSpecDataMod.SourceData
    - typingsJapgolly.vegaTypings.typesSpecDataMod.ValuesData
    - typingsJapgolly.vegaTypings.typesSpecDataMod.UrlData
    - typingsJapgolly.vegaTypings.typesSpecDataMod.BaseData
  */
  trait Data extends StObject
  object Data {
    
    inline def BaseData(name: String): typingsJapgolly.vegaTypings.typesSpecDataMod.BaseData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecDataMod.BaseData]
    }
    
    inline def SourceData(name: String, source: String | js.Array[String]): typingsJapgolly.vegaTypings.typesSpecDataMod.SourceData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecDataMod.SourceData]
    }
    
    inline def UrlData(name: String, url: URI | SignalRef): typingsJapgolly.vegaTypings.typesSpecDataMod.UrlData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecDataMod.UrlData]
    }
    
    inline def ValuesData(name: String, values: js.Array[Datum] | js.Object): typingsJapgolly.vegaTypings.typesSpecDataMod.ValuesData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecDataMod.ValuesData]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.boolean
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.number
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.date
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.string
  */
  trait DataType
    extends StObject
       with TypeInference
  object DataType {
    
    inline def boolean: typingsJapgolly.vegaTypings.vegaTypingsStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.boolean]
    
    inline def date: typingsJapgolly.vegaTypings.vegaTypingsStrings.date = "date".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.date]
    
    inline def number: typingsJapgolly.vegaTypings.vegaTypingsStrings.number = "number".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.number]
    
    inline def string: typingsJapgolly.vegaTypings.vegaTypingsStrings.string = "string".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.string]
  }
  
  type Datum = Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.typesSpecDataMod.FormatJSON
    - typingsJapgolly.vegaTypings.typesSpecDataMod.FormatSV
    - typingsJapgolly.vegaTypings.typesSpecDataMod.FormatDSV
    - typingsJapgolly.vegaTypings.typesSpecDataMod.FormatTopoJSON
    - typingsJapgolly.vegaTypings.anon.Parse
  */
  trait Format extends StObject
  object Format {
    
    inline def FormatDSV(delimiter: String): typingsJapgolly.vegaTypings.typesSpecDataMod.FormatDSV = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dsv")
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecDataMod.FormatDSV]
    }
    
    inline def FormatJSON(): typingsJapgolly.vegaTypings.typesSpecDataMod.FormatJSON = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("json")
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecDataMod.FormatJSON]
    }
    
    inline def FormatSV(`type`: csv | tsv): typingsJapgolly.vegaTypings.typesSpecDataMod.FormatSV = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecDataMod.FormatSV]
    }
    
    inline def Parse(parse: typingsJapgolly.vegaTypings.typesSpecDataMod.Parse): typingsJapgolly.vegaTypings.anon.Parse = {
      val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Parse]
    }
    
    inline def featurestringtypetopojson(feature: String): typingsJapgolly.vegaTypings.anon.featurestringtypetopojson = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("topojson")
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.featurestringtypetopojson]
    }
    
    inline def meshstringfilterinteriore(mesh: String): typingsJapgolly.vegaTypings.anon.meshstringfilterinteriore = {
      val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], filter = null)
      __obj.updateDynamic("type")("topojson")
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.meshstringfilterinteriore]
    }
  }
  
  trait FormatDSV
    extends StObject
       with Format {
    
    var delimiter: String
    
    var header: js.UndefOr[js.Array[String]] = js.undefined
    
    var parse: js.UndefOr[Parse] = js.undefined
    
    var `type`: dsv
  }
  object FormatDSV {
    
    inline def apply(delimiter: String): FormatDSV = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dsv")
      __obj.asInstanceOf[FormatDSV]
    }
    
    extension [Self <: FormatDSV](x: Self) {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setType(value: dsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatJSON
    extends StObject
       with Format {
    
    var copy: js.UndefOr[Boolean] = js.undefined
    
    var parse: js.UndefOr[Parse] = js.undefined
    
    var property: js.UndefOr[String | SignalRef] = js.undefined
    
    var `type`: json
  }
  object FormatJSON {
    
    inline def apply(): FormatJSON = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("json")
      __obj.asInstanceOf[FormatJSON]
    }
    
    extension [Self <: FormatJSON](x: Self) {
      
      inline def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setProperty(value: String | SignalRef): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setType(value: json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatSV
    extends StObject
       with Format {
    
    var header: js.UndefOr[js.Array[String]] = js.undefined
    
    var parse: js.UndefOr[Parse] = js.undefined
    
    var `type`: csv | tsv
  }
  object FormatSV {
    
    inline def apply(`type`: csv | tsv): FormatSV = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatSV]
    }
    
    extension [Self <: FormatSV](x: Self) {
      
      inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setType(value: csv | tsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.anon.featurestringtypetopojson
    - typingsJapgolly.vegaTypings.anon.meshstringfilterinteriore
  */
  trait FormatTopoJSON
    extends StObject
       with Format
  object FormatTopoJSON {
    
    inline def featurestringtypetopojson(feature: String): typingsJapgolly.vegaTypings.anon.featurestringtypetopojson = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("topojson")
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.featurestringtypetopojson]
    }
    
    inline def meshstringfilterinteriore(mesh: String): typingsJapgolly.vegaTypings.anon.meshstringfilterinteriore = {
      val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], filter = null)
      __obj.updateDynamic("type")("topojson")
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.meshstringfilterinteriore]
    }
  }
  
  type Parse = auto | (StringDictionary[DataType | String])
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vegaTypings.typesSpecDataMod.Data because Already inherited */ trait SourceData
    extends StObject
       with BaseData {
    
    var source: String | js.Array[String]
  }
  object SourceData {
    
    inline def apply(name: String, source: String | js.Array[String]): SourceData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceData]
    }
    
    extension [Self <: SourceData](x: Self) {
      
      inline def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
    }
  }
  
  type URI = String
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vegaTypings.typesSpecDataMod.Data because Already inherited */ trait UrlData
    extends StObject
       with BaseData {
    
    var async: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var format: js.UndefOr[Format | SignalRef] = js.undefined
    
    var url: URI | SignalRef
  }
  object UrlData {
    
    inline def apply(name: String, url: URI | SignalRef): UrlData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlData]
    }
    
    extension [Self <: UrlData](x: Self) {
      
      inline def setAsync(value: Boolean | SignalRef): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setFormat(value: Format | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setUrl(value: URI | SignalRef): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vegaTypings.typesSpecDataMod.Data because Already inherited */ trait ValuesData
    extends StObject
       with BaseData {
    
    var async: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var format: js.UndefOr[Format | SignalRef] = js.undefined
    
    var values: js.Array[Datum] | js.Object
  }
  object ValuesData {
    
    inline def apply(name: String, values: js.Array[Datum] | js.Object): ValuesData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValuesData]
    }
    
    extension [Self <: ValuesData](x: Self) {
      
      inline def setAsync(value: Boolean | SignalRef): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setFormat(value: Format | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setValues(value: js.Array[Datum] | js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Datum*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}

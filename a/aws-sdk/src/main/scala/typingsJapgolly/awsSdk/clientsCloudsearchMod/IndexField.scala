package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexField extends StObject {
  
  var DateArrayOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.DateArrayOptions] = js.undefined
  
  var DateOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.DateOptions] = js.undefined
  
  var DoubleArrayOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.DoubleArrayOptions] = js.undefined
  
  var DoubleOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.DoubleOptions] = js.undefined
  
  /**
    * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's indexing options.  Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.  The name score is reserved and cannot be used as a field name. To reference a document's ID, you can use the name _id. 
    */
  var IndexFieldName: DynamicFieldName
  
  var IndexFieldType: typingsJapgolly.awsSdk.clientsCloudsearchMod.IndexFieldType
  
  var IntArrayOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.IntArrayOptions] = js.undefined
  
  var IntOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.IntOptions] = js.undefined
  
  var LatLonOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.LatLonOptions] = js.undefined
  
  var LiteralArrayOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.LiteralArrayOptions] = js.undefined
  
  var LiteralOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.LiteralOptions] = js.undefined
  
  var TextArrayOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.TextArrayOptions] = js.undefined
  
  var TextOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.TextOptions] = js.undefined
}
object IndexField {
  
  inline def apply(IndexFieldName: DynamicFieldName, IndexFieldType: IndexFieldType): IndexField = {
    val __obj = js.Dynamic.literal(IndexFieldName = IndexFieldName.asInstanceOf[js.Any], IndexFieldType = IndexFieldType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexField]
  }
  
  extension [Self <: IndexField](x: Self) {
    
    inline def setDateArrayOptions(value: DateArrayOptions): Self = StObject.set(x, "DateArrayOptions", value.asInstanceOf[js.Any])
    
    inline def setDateArrayOptionsUndefined: Self = StObject.set(x, "DateArrayOptions", js.undefined)
    
    inline def setDateOptions(value: DateOptions): Self = StObject.set(x, "DateOptions", value.asInstanceOf[js.Any])
    
    inline def setDateOptionsUndefined: Self = StObject.set(x, "DateOptions", js.undefined)
    
    inline def setDoubleArrayOptions(value: DoubleArrayOptions): Self = StObject.set(x, "DoubleArrayOptions", value.asInstanceOf[js.Any])
    
    inline def setDoubleArrayOptionsUndefined: Self = StObject.set(x, "DoubleArrayOptions", js.undefined)
    
    inline def setDoubleOptions(value: DoubleOptions): Self = StObject.set(x, "DoubleOptions", value.asInstanceOf[js.Any])
    
    inline def setDoubleOptionsUndefined: Self = StObject.set(x, "DoubleOptions", js.undefined)
    
    inline def setIndexFieldName(value: DynamicFieldName): Self = StObject.set(x, "IndexFieldName", value.asInstanceOf[js.Any])
    
    inline def setIndexFieldType(value: IndexFieldType): Self = StObject.set(x, "IndexFieldType", value.asInstanceOf[js.Any])
    
    inline def setIntArrayOptions(value: IntArrayOptions): Self = StObject.set(x, "IntArrayOptions", value.asInstanceOf[js.Any])
    
    inline def setIntArrayOptionsUndefined: Self = StObject.set(x, "IntArrayOptions", js.undefined)
    
    inline def setIntOptions(value: IntOptions): Self = StObject.set(x, "IntOptions", value.asInstanceOf[js.Any])
    
    inline def setIntOptionsUndefined: Self = StObject.set(x, "IntOptions", js.undefined)
    
    inline def setLatLonOptions(value: LatLonOptions): Self = StObject.set(x, "LatLonOptions", value.asInstanceOf[js.Any])
    
    inline def setLatLonOptionsUndefined: Self = StObject.set(x, "LatLonOptions", js.undefined)
    
    inline def setLiteralArrayOptions(value: LiteralArrayOptions): Self = StObject.set(x, "LiteralArrayOptions", value.asInstanceOf[js.Any])
    
    inline def setLiteralArrayOptionsUndefined: Self = StObject.set(x, "LiteralArrayOptions", js.undefined)
    
    inline def setLiteralOptions(value: LiteralOptions): Self = StObject.set(x, "LiteralOptions", value.asInstanceOf[js.Any])
    
    inline def setLiteralOptionsUndefined: Self = StObject.set(x, "LiteralOptions", js.undefined)
    
    inline def setTextArrayOptions(value: TextArrayOptions): Self = StObject.set(x, "TextArrayOptions", value.asInstanceOf[js.Any])
    
    inline def setTextArrayOptionsUndefined: Self = StObject.set(x, "TextArrayOptions", js.undefined)
    
    inline def setTextOptions(value: TextOptions): Self = StObject.set(x, "TextOptions", value.asInstanceOf[js.Any])
    
    inline def setTextOptionsUndefined: Self = StObject.set(x, "TextOptions", js.undefined)
  }
}

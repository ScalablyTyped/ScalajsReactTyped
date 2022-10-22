package typingsJapgolly.jsonFormData

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalajs.dom.FileList
import org.scalajs.dom.FormData
import typingsJapgolly.jsonFormData.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("json-form-data", JSImport.Namespace)
  @js.native
  val ^ : FormDataFormatter = js.native
  
  type FormDataFormatter = js.Function2[/* json */ ValidJSON, /* opts */ js.UndefOr[FormatOptions], FormData]
  
  /**
    * Formatting options for modifying the final generated FormData object.
    *
    * ## Defaults
    *
    *     const defaultOpts = {
    *       initialFormData: new FormData(),
    *       showLeafArrayIndexes: true,
    *       includeNullValues: false,
    *       mapping: value => {
    *         if (typeof value === 'boolean') {
    *           return +value ? '1' : '0';
    *         }
    *
    *         return value;
    *       }
    *     }
    */
  trait FormatOptions extends StObject {
    
    /**
      * Include null values in output (default: `false`).
      *
      * ## Examples
      *
      *     const json = { foo: 1, bar: null };
      *     const withoutNullValues = asFormData(json, { includeNullValues: false });
      *     // => FormData {
      *     //   foo: '1'
      *     // }
      *     const withNullValues = asFormData(json, { includeNullValues: true });
      *     // => FormData {
      *     //   foo: '1'
      *     //   bar: 'null'
      *     // }
      *
      */
    var includeNullValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Existing form data which values will be appended to  (default: `new FormData()`).
      * This can be used to support environments that do not have a global FormData object.
      */
    var initialFormData: js.UndefOr[InitialFormData] = js.undefined
    
    /**
      * Modify outmost leaf values before calling formData.append. Default behaviour
      * is to output boolean values as '1'/'0' (true/false) and all other values
      * without modification.
      *
      * ## Examples
      *
      *     const json = { foo: true, bar: false };
      *     const data = asFormData(json);
      *     // => FormData {
      *     //   foo: '1',
      *     //   bar: '0',
      *     // }
      *     const mapping = value => `foo_${value}`;
      *     const custom = asFormData(json, { mapping });
      *     // => FormData {
      *     //   foo: 'foo_true',
      *     //   bar: 'foo_false'
      *     // }
      *
      */
    var mapping: js.UndefOr[js.Function1[/* value */ ValidJSONValue, String | Blob]] = js.undefined
    
    /**
      * Include index values in arrays (default: `true`).
      *
      * ## Examples
      *
      *     const json = { ids: [1, 2, 3] };
      *     const withArrayIndices = asFormData(json, { showLeafArrayIndex: true });
      *     // => FormData {
      *     //   ids[0]: '1',
      *     //   ids[1]: '2',
      *     //   ids[2]: '3',
      *     // }
      *     const withoutArrayIndices = asFormData(json, { showLeafArrayIndex: false });
      *     // => FormData {
      *     //   ids[]: '1',
      *     //   ids[]: '2',
      *     //   ids[]: '3',
      *     // }
      *
      */
    var showLeafArrayIndexes: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setIncludeNullValues(value: Boolean): Self = StObject.set(x, "includeNullValues", value.asInstanceOf[js.Any])
      
      inline def setIncludeNullValuesUndefined: Self = StObject.set(x, "includeNullValues", js.undefined)
      
      inline def setInitialFormData(value: InitialFormData): Self = StObject.set(x, "initialFormData", value.asInstanceOf[js.Any])
      
      inline def setInitialFormDataUndefined: Self = StObject.set(x, "initialFormData", js.undefined)
      
      inline def setMapping(value: /* value */ ValidJSONValue => String | Blob): Self = StObject.set(x, "mapping", js.Any.fromFunction1(value))
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      inline def setShowLeafArrayIndexes(value: Boolean): Self = StObject.set(x, "showLeafArrayIndexes", value.asInstanceOf[js.Any])
      
      inline def setShowLeafArrayIndexesUndefined: Self = StObject.set(x, "showLeafArrayIndexes", js.undefined)
    }
  }
  
  trait InitialFormData extends StObject {
    
    def append(name: String, value: String): Unit
    def append(name: String, value: String, fileName: String): Unit
    def append(name: String, value: Blob): Unit
    def append(name: String, value: Blob, fileName: String): Unit
    @JSName("append")
    var append_Original: FnCall
  }
  object InitialFormData {
    
    inline def apply(append: FnCall): InitialFormData = {
      val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialFormData]
    }
    
    extension [Self <: InitialFormData](x: Self) {
      
      inline def setAppend(value: FnCall): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidJSON
    extends StObject
       with /* key */ StringDictionary[ValidJSON | (js.Array[ValidJSON | ValidJSONValue]) | ValidJSONValue | FileList]
  object ValidJSON {
    
    inline def apply(): ValidJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidJSON]
    }
  }
  
  type ValidJSONValue = js.UndefOr[String | Double | Boolean | File | Blob | js.Date | Null]
  
  type _To = FormDataFormatter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FormDataFormatter = ^
}

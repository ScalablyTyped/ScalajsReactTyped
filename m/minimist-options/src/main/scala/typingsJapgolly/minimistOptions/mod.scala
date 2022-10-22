package typingsJapgolly.minimistOptions

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.minimist.mod.Opts
import typingsJapgolly.minimistOptions.minimistOptionsStrings.`boolean-array`
import typingsJapgolly.minimistOptions.minimistOptionsStrings.`number-array`
import typingsJapgolly.minimistOptions.minimistOptionsStrings.`string-array`
import typingsJapgolly.minimistOptions.minimistOptionsStrings.array
import typingsJapgolly.minimistOptions.minimistOptionsStrings.boolean
import typingsJapgolly.minimistOptions.minimistOptionsStrings.number
import typingsJapgolly.minimistOptions.minimistOptionsStrings.string
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimist-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Opts = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Opts]
  inline def default(options: Options): Opts = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Opts]
  
  trait BaseOption[TypeOptionType /* <: OptionType */, DefaultOptionType] extends StObject {
    
    /**
    	 * The default value for the option.
    	 */
    val default: js.UndefOr[DefaultOptionType] = js.undefined
    
    /**
    	 * An alias/list of aliases for the option.
    	 */
    val alias: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
    	 * The data type the option should be parsed to.
    	 */
    val `type`: js.UndefOr[TypeOptionType] = js.undefined
  }
  object BaseOption {
    
    inline def apply[TypeOptionType /* <: OptionType */, DefaultOptionType](): BaseOption[TypeOptionType, DefaultOptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOption[TypeOptionType, DefaultOptionType]]
    }
    
    extension [Self <: BaseOption[?, ?], TypeOptionType /* <: OptionType */, DefaultOptionType](x: Self & (BaseOption[TypeOptionType, DefaultOptionType])) {
      
      inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setDefault(value: DefaultOptionType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: TypeOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type BooleanArrayOption = BaseOption[`boolean-array`, js.Array[Boolean]]
  
  type BooleanOption = BaseOption[boolean, Boolean]
  
  type DefaultArrayOption = BaseOption[array, js.Array[String]]
  
  type MinimistOption = NonNullable[js.UndefOr[Boolean | (js.Function1[/* arg */ String, Boolean])]]
  
  type NumberArrayOption = BaseOption[`number-array`, js.Array[Double]]
  
  type NumberOption = BaseOption[number, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.minimistOptions.minimistOptionsStrings.string
    - typingsJapgolly.minimistOptions.minimistOptionsStrings.boolean
    - typingsJapgolly.minimistOptions.minimistOptionsStrings.number
    - typingsJapgolly.minimistOptions.minimistOptionsStrings.array
    - typingsJapgolly.minimistOptions.minimistOptionsStrings.`string-array`
    - typingsJapgolly.minimistOptions.minimistOptionsStrings.`boolean-array`
    - typingsJapgolly.minimistOptions.minimistOptionsStrings.`number-array`
  */
  trait OptionType extends StObject
  object OptionType {
    
    inline def array: typingsJapgolly.minimistOptions.minimistOptionsStrings.array = "array".asInstanceOf[typingsJapgolly.minimistOptions.minimistOptionsStrings.array]
    
    inline def boolean: typingsJapgolly.minimistOptions.minimistOptionsStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.minimistOptions.minimistOptionsStrings.boolean]
    
    inline def `boolean-array`: typingsJapgolly.minimistOptions.minimistOptionsStrings.`boolean-array` = "boolean-array".asInstanceOf[typingsJapgolly.minimistOptions.minimistOptionsStrings.`boolean-array`]
    
    inline def number: typingsJapgolly.minimistOptions.minimistOptionsStrings.number = "number".asInstanceOf[typingsJapgolly.minimistOptions.minimistOptionsStrings.number]
    
    inline def `number-array`: typingsJapgolly.minimistOptions.minimistOptionsStrings.`number-array` = "number-array".asInstanceOf[typingsJapgolly.minimistOptions.minimistOptionsStrings.`number-array`]
    
    inline def string: typingsJapgolly.minimistOptions.minimistOptionsStrings.string = "string".asInstanceOf[typingsJapgolly.minimistOptions.minimistOptionsStrings.string]
    
    inline def `string-array`: typingsJapgolly.minimistOptions.minimistOptionsStrings.`string-array` = "string-array".asInstanceOf[typingsJapgolly.minimistOptions.minimistOptionsStrings.`string-array`]
  }
  
  type Options = StringDictionary[
    OptionType | StringOption | BooleanOption | NumberOption | DefaultArrayOption | StringArrayOption | BooleanArrayOption | NumberArrayOption | MinimistOption
  ]
  
  type StringArrayOption = BaseOption[`string-array`, js.Array[String]]
  
  type StringOption = BaseOption[string, String]
}

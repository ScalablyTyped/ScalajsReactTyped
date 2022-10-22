package typingsJapgolly.jestGetType

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-get-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getType(value: Any): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(value.asInstanceOf[js.Any]).asInstanceOf[ValueType]
  
  inline def isPrimitive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jestGetType.jestGetTypeStrings.array
    - typingsJapgolly.jestGetType.jestGetTypeStrings.bigint
    - typingsJapgolly.jestGetType.jestGetTypeStrings.boolean
    - typingsJapgolly.jestGetType.jestGetTypeStrings.function
    - typingsJapgolly.jestGetType.jestGetTypeStrings.`null`
    - typingsJapgolly.jestGetType.jestGetTypeStrings.number
    - typingsJapgolly.jestGetType.jestGetTypeStrings.`object`
    - typingsJapgolly.jestGetType.jestGetTypeStrings.regexp
    - typingsJapgolly.jestGetType.jestGetTypeStrings.map
    - typingsJapgolly.jestGetType.jestGetTypeStrings.set
    - typingsJapgolly.jestGetType.jestGetTypeStrings.date
    - typingsJapgolly.jestGetType.jestGetTypeStrings.string
    - typingsJapgolly.jestGetType.jestGetTypeStrings.symbol
    - typingsJapgolly.jestGetType.jestGetTypeStrings.undefined
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def array: typingsJapgolly.jestGetType.jestGetTypeStrings.array = "array".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.array]
    
    inline def bigint: typingsJapgolly.jestGetType.jestGetTypeStrings.bigint = "bigint".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.bigint]
    
    inline def boolean: typingsJapgolly.jestGetType.jestGetTypeStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.boolean]
    
    inline def date: typingsJapgolly.jestGetType.jestGetTypeStrings.date = "date".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.date]
    
    inline def function: typingsJapgolly.jestGetType.jestGetTypeStrings.function = "function".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.function]
    
    inline def map: typingsJapgolly.jestGetType.jestGetTypeStrings.map = "map".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.map]
    
    inline def `null`: typingsJapgolly.jestGetType.jestGetTypeStrings.`null` = "null".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.`null`]
    
    inline def number: typingsJapgolly.jestGetType.jestGetTypeStrings.number = "number".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.number]
    
    inline def `object`: typingsJapgolly.jestGetType.jestGetTypeStrings.`object` = "object".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.`object`]
    
    inline def regexp: typingsJapgolly.jestGetType.jestGetTypeStrings.regexp = "regexp".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.regexp]
    
    inline def set: typingsJapgolly.jestGetType.jestGetTypeStrings.set = "set".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.set]
    
    inline def string: typingsJapgolly.jestGetType.jestGetTypeStrings.string = "string".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.string]
    
    inline def symbol: typingsJapgolly.jestGetType.jestGetTypeStrings.symbol = "symbol".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.symbol]
    
    inline def undefined: typingsJapgolly.jestGetType.jestGetTypeStrings.undefined = "undefined".asInstanceOf[typingsJapgolly.jestGetType.jestGetTypeStrings.undefined]
  }
}

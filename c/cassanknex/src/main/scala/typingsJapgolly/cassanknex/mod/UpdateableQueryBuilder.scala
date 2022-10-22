package typingsJapgolly.cassanknex.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Map
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateableQueryBuilder[T] extends StObject {
  
  def add(`object`: Partial[T]): this.type = js.native
  def add[K /* <: /* keyof T */ String */](
    key: K,
    value: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): TypeMatchedValue[T, K, js.Array[Any] | Set[Any], this.type] = js.native
  def add[K /* <: /* keyof T */ String */](
    key: K,
    value: StringDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): TypeMatchedValue[
    T, 
    K, 
    Map[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ], 
    this.type
  ] = js.native
  
  def decrement(column: /* keyof T */ String, amount: Double): this.type = js.native
  def decrement(`object`: Partial[T]): this.type = js.native
  
  def increment(column: /* keyof T */ String, amount: Double): this.type = js.native
  def increment(`object`: Partial[T]): this.type = js.native
  
  def remove(`object`: Partial[T]): this.type = js.native
  def remove[K /* <: /* keyof T */ String */](
    key: K,
    value: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
  
  def set(`object`: Partial[T]): this.type = js.native
  def set[K /* <: /* keyof T */ String */](key: K, value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): this.type = js.native
}

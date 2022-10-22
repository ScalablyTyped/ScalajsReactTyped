package typingsJapgolly.sugar.sugarjs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.sugar.sugarjs.Array.Chainable
import typingsJapgolly.sugar.sugarjs.Array.Constructor
import typingsJapgolly.sugar.sugarjs.Date.DateCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sugar extends StObject {
  
  def apply(): Sugar = js.native
  def apply(opts: ExtendOptions): Sugar = js.native
  
  def Array[T](): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def Array[T](obj: Double): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def Array[T](obj: Double, clone: Boolean): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def Array[T](obj: Unit, clone: Boolean): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def Array[T](obj: ArrayLike[T]): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def Array[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  @JSName("Array")
  var Array_Original: Constructor = js.native
  
  def Date(): typingsJapgolly.sugar.sugarjs.Date.Chainable[typingsJapgolly.sugar.Date] = js.native
  def Date(d: java.lang.String): typingsJapgolly.sugar.sugarjs.Date.Chainable[typingsJapgolly.sugar.Date] = js.native
  def Date(d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.sugarjs.Date.Chainable[typingsJapgolly.sugar.Date] = js.native
  def Date(d: Double): typingsJapgolly.sugar.sugarjs.Date.Chainable[typingsJapgolly.sugar.Date] = js.native
  def Date(d: Double, options: DateCreateOptions): typingsJapgolly.sugar.sugarjs.Date.Chainable[typingsJapgolly.sugar.Date] = js.native
  def Date(d: Unit, options: DateCreateOptions): typingsJapgolly.sugar.sugarjs.Date.Chainable[typingsJapgolly.sugar.Date] = js.native
  def Date(d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.sugarjs.Date.Chainable[typingsJapgolly.sugar.Date] = js.native
  def Date(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.sugarjs.Date.Chainable[typingsJapgolly.sugar.Date] = js.native
  @JSName("Date")
  var Date_Original: typingsJapgolly.sugar.sugarjs.Date.Constructor = js.native
  
  def Function(): typingsJapgolly.sugar.sugarjs.Function.Chainable[typingsJapgolly.sugar.Function] = js.native
  def Function(raw: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.sugarjs.Function.Chainable[typingsJapgolly.sugar.Function] = js.native
  @JSName("Function")
  var Function_Original: typingsJapgolly.sugar.sugarjs.Function.Constructor = js.native
  
  def Number(): typingsJapgolly.sugar.sugarjs.Number.Chainable[Double] = js.native
  def Number(raw: Double): typingsJapgolly.sugar.sugarjs.Number.Chainable[Double] = js.native
  @JSName("Number")
  var Number_Original: typingsJapgolly.sugar.sugarjs.Number.Constructor = js.native
  
  def Object(): typingsJapgolly.sugar.sugarjs.Object.Chainable[js.Object] = js.native
  def Object(raw: js.Object): typingsJapgolly.sugar.sugarjs.Object.Chainable[js.Object] = js.native
  @JSName("Object")
  var Object_Original: typingsJapgolly.sugar.sugarjs.Object.Constructor = js.native
  
  def RegExp(): typingsJapgolly.sugar.sugarjs.RegExp.Chainable[typingsJapgolly.sugar.RegExp] = js.native
  def RegExp(raw: typingsJapgolly.sugar.RegExp): typingsJapgolly.sugar.sugarjs.RegExp.Chainable[typingsJapgolly.sugar.RegExp] = js.native
  @JSName("RegExp")
  var RegExp_Original: typingsJapgolly.sugar.sugarjs.RegExp.Constructor = js.native
  
  def String(): typingsJapgolly.sugar.sugarjs.String.Chainable[java.lang.String] = js.native
  def String(raw: java.lang.String): typingsJapgolly.sugar.sugarjs.String.Chainable[java.lang.String] = js.native
  @JSName("String")
  var String_Original: typingsJapgolly.sugar.sugarjs.String.Constructor = js.native
  
  def createNamespace(name: java.lang.String): SugarNamespace = js.native
  
  def extend(): Sugar = js.native
  def extend(opts: ExtendOptions): Sugar = js.native
}

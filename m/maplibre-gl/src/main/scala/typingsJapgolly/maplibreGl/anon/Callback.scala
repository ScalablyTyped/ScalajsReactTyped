package typingsJapgolly.maplibreGl.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.maplibreGl.mod.StyleImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  def callback(): Unit
  def callback(error: js.Error): Unit
  def callback(error: js.Error, result: StringDictionary[StyleImage]): Unit
  def callback(error: Null, result: StringDictionary[StyleImage]): Unit
  def callback(error: Unit, result: StringDictionary[StyleImage]): Unit
  @JSName("callback")
  var callback_Original: typingsJapgolly.maplibreGl.mod.Callback[StringDictionary[StyleImage]]
  
  var ids: js.Array[String]
}
object Callback {
  
  inline def apply(
    callback: (/* error */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[StringDictionary[StyleImage] | Null]) => japgolly.scalajs.react.Callback,
    ids: js.Array[String]
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: /* error */ js.UndefOr[js.Error | Null], t1: /* result */ js.UndefOr[StringDictionary[StyleImage] | Null]) => (callback(t0, t1)).runNow()), ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  extension [Self <: Callback](x: Self) {
    
    inline def setCallback(
      value: (/* error */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[StringDictionary[StyleImage] | Null]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* error */ js.UndefOr[js.Error | Null], t1: /* result */ js.UndefOr[StringDictionary[StyleImage] | Null]) => (value(t0, t1)).runNow()))
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}

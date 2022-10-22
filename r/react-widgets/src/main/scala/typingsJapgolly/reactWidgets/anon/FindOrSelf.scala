package typingsJapgolly.reactWidgets.anon

import typingsJapgolly.reactWidgets.esmTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOrSelf extends StObject {
  
  def findOrSelf[TDataItem](data: js.Array[TDataItem], value: Value): TDataItem
  
  def includes(data: js.Array[typingsJapgolly.reactWidgets.esmTypesMod.DataItem], value: Value): Boolean
  
  def indexOf(data: js.Array[typingsJapgolly.reactWidgets.esmTypesMod.DataItem], value: Value): Double
  
  def matches(
    a: typingsJapgolly.reactWidgets.esmTypesMod.DataItem,
    b: typingsJapgolly.reactWidgets.esmTypesMod.DataItem
  ): Boolean
  
  def text(item: typingsJapgolly.reactWidgets.esmTypesMod.DataItem): String
  
  def value(item: typingsJapgolly.reactWidgets.esmTypesMod.DataItem): Any
}
object FindOrSelf {
  
  inline def apply(
    findOrSelf: (js.Array[Any], Value) => Any,
    includes: (js.Array[typingsJapgolly.reactWidgets.esmTypesMod.DataItem], Value) => Boolean,
    indexOf: (js.Array[typingsJapgolly.reactWidgets.esmTypesMod.DataItem], Value) => Double,
    matches: (typingsJapgolly.reactWidgets.esmTypesMod.DataItem, typingsJapgolly.reactWidgets.esmTypesMod.DataItem) => Boolean,
    text: typingsJapgolly.reactWidgets.esmTypesMod.DataItem => String,
    value: typingsJapgolly.reactWidgets.esmTypesMod.DataItem => Any
  ): FindOrSelf = {
    val __obj = js.Dynamic.literal(findOrSelf = js.Any.fromFunction2(findOrSelf), includes = js.Any.fromFunction2(includes), indexOf = js.Any.fromFunction2(indexOf), matches = js.Any.fromFunction2(matches), text = js.Any.fromFunction1(text), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[FindOrSelf]
  }
  
  extension [Self <: FindOrSelf](x: Self) {
    
    inline def setFindOrSelf(value: (js.Array[Any], Value) => Any): Self = StObject.set(x, "findOrSelf", js.Any.fromFunction2(value))
    
    inline def setIncludes(value: (js.Array[typingsJapgolly.reactWidgets.esmTypesMod.DataItem], Value) => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction2(value))
    
    inline def setIndexOf(value: (js.Array[typingsJapgolly.reactWidgets.esmTypesMod.DataItem], Value) => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction2(value))
    
    inline def setMatches(
      value: (typingsJapgolly.reactWidgets.esmTypesMod.DataItem, typingsJapgolly.reactWidgets.esmTypesMod.DataItem) => Boolean
    ): Self = StObject.set(x, "matches", js.Any.fromFunction2(value))
    
    inline def setText(value: typingsJapgolly.reactWidgets.esmTypesMod.DataItem => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    inline def setValue(value: typingsJapgolly.reactWidgets.esmTypesMod.DataItem => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}

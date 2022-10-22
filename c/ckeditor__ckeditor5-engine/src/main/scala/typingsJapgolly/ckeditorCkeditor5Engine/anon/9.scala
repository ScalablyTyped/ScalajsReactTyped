package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.UpcastConversionApi
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String | default | (js.Function2[
    /* el */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default, 
    /* api */ UpcastConversionApi, 
    default | Null
  ])
  
  var view: js.UndefOr[MatcherPattern] = js.undefined
}
object `9` {
  
  inline def apply(
    model: String | default | (js.Function2[
      /* el */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default, 
      /* api */ UpcastConversionApi, 
      default | Null
    ])
  ): `9` = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(
      value: String | default | (js.Function2[
          /* el */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default, 
          /* api */ UpcastConversionApi, 
          default | Null
        ])
    ): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelFunction2(
      value: (/* el */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default, /* api */ UpcastConversionApi) => default | Null
    ): Self = StObject.set(x, "model", js.Any.fromFunction2(value))
    
    inline def setView(value: MatcherPattern): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction1(
      value: /* element */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default => scala.Unit | Null | Attribute
    ): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

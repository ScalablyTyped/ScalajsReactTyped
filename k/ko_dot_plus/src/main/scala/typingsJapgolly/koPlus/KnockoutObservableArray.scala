package typingsJapgolly.koPlus

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Sortable type extensions
//
// extends the KnockoutObservableArray to add sorting methods
// see https://github.com/stevegreatrex/ko.plus#properties-and-functions
//
trait KnockoutObservableArray[T] extends StObject {
  
  def setSourceKey(key: String): Unit
  
  var sortDescending: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  var sortKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
}
object KnockoutObservableArray {
  
  inline def apply[T](
    setSourceKey: String => Callback,
    sortDescending: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    sortKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
  ): KnockoutObservableArray[T] = {
    val __obj = js.Dynamic.literal(setSourceKey = js.Any.fromFunction1((t0: String) => setSourceKey(t0).runNow()), sortDescending = sortDescending.asInstanceOf[js.Any], sortKey = sortKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutObservableArray[T]]
  }
  
  extension [Self <: KnockoutObservableArray[?], T](x: Self & KnockoutObservableArray[T]) {
    
    inline def setSetSourceKey(value: String => Callback): Self = StObject.set(x, "setSourceKey", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSortDescending(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    inline def setSortKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
    ): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
  }
}

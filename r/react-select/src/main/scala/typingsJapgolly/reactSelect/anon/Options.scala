package typingsJapgolly.reactSelect.anon

import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OnChangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[Option, IsMulti /* <: Boolean */] extends StObject {
  
  var option: js.UndefOr[Option] = js.undefined
  
  var options: js.UndefOr[typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Options[Option]] = js.undefined
  
  var value: OnChangeValue[Option, IsMulti]
}
object Options {
  
  inline def apply[Option, IsMulti /* <: Boolean */](value: OnChangeValue[Option, IsMulti]): Options[Option, IsMulti] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[Option, IsMulti]]
  }
  
  extension [Self <: Options[?, ?], Option, IsMulti /* <: Boolean */](x: Self & (Options[Option, IsMulti])) {
    
    inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setOptions(value: typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Options[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setValue(value: OnChangeValue[Option, IsMulti]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

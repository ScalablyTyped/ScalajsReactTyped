package typingsJapgolly.wordpressBlocks.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformEnter[T /* <: Record[String, Any] */]
  extends StObject
     with Transform[T] {
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var regExp: js.RegExp
  
  def transform(): BlockInstance[Partial[T]]
  
  var `type`: enter
}
object TransformEnter {
  
  inline def apply[T /* <: Record[String, Any] */](regExp: js.RegExp, transform: CallbackTo[BlockInstance[Partial[T]]]): TransformEnter[T] = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any], transform = transform.toJsFn)
    __obj.updateDynamic("type")("enter")
    __obj.asInstanceOf[TransformEnter[T]]
  }
  
  extension [Self <: TransformEnter[?], T /* <: Record[String, Any] */](x: Self & TransformEnter[T]) {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: CallbackTo[BlockInstance[Partial[T]]]): Self = StObject.set(x, "transform", value.toJsFn)
    
    inline def setType(value: enter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.wordpressBlocks.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockEditProps[T /* <: Record[String, Any] */]
  extends StObject
     with BlockSaveProps[T] {
  
  val className: String
  
  val clientId: String
  
  val isSelected: Boolean
  
  def setAttributes(attrs: Partial[T]): Unit
}
object BlockEditProps {
  
  inline def apply[T /* <: Record[String, Any] */](
    attributes: T,
    className: String,
    clientId: String,
    isSelected: Boolean,
    setAttributes: Partial[T] => Callback
  ): BlockEditProps[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], setAttributes = js.Any.fromFunction1((t0: Partial[T]) => setAttributes(t0).runNow()))
    __obj.asInstanceOf[BlockEditProps[T]]
  }
  
  extension [Self <: BlockEditProps[?], T /* <: Record[String, Any] */](x: Self & BlockEditProps[T]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setSetAttributes(value: Partial[T] => Callback): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1((t0: Partial[T]) => value(t0).runNow()))
  }
}

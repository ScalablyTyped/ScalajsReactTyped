package typingsJapgolly.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.wordpressComponents.wordpressComponentsStrings.a, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.abbr, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.address */ Any */] extends StObject {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.undefined
  
  var children: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.undefined
}
object Children {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.wordpressComponents.wordpressComponentsStrings.a, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.abbr, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.address */ Any */](): Children[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[T]]
  }
  
  extension [Self <: Children[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.wordpressComponents.wordpressComponentsStrings.a, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.abbr, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.address */ Any */](x: Self & Children[T]) {
    
    inline def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}

package typingsJapgolly.wordpressComponents.anon

import typingsJapgolly.wordpressComponents.cardMod.Card.CardSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.wordpressComponents.wordpressComponentsStrings.a, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.abbr, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.address */ Any */] extends StObject {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.undefined
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Add visual shading style.
    */
  var isShady: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[CardSize] = js.undefined
}
object As {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.wordpressComponents.wordpressComponentsStrings.a, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.abbr, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.address */ Any */](): As[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[T]]
  }
  
  extension [Self <: As[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.wordpressComponents.wordpressComponentsStrings.a, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.abbr, typingsJapgolly.wordpressComponents.wordpressComponentsStrings.address */ Any */](x: Self & As[T]) {
    
    inline def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIsShady(value: Boolean): Self = StObject.set(x, "isShady", value.asInstanceOf[js.Any])
    
    inline def setIsShadyUndefined: Self = StObject.set(x, "isShady", js.undefined)
    
    inline def setSize(value: CardSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

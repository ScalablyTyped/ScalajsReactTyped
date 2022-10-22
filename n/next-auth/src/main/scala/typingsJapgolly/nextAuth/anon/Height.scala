package typingsJapgolly.nextAuth.anon

import typingsJapgolly.nextAuth.nextAuthStrings.l
import typingsJapgolly.nextAuth.nextAuthStrings.m_
import typingsJapgolly.nextAuth.nextAuthStrings.o
import typingsJapgolly.nextAuth.nextAuthStrings.p
import typingsJapgolly.nextAuth.nextAuthStrings.q
import typingsJapgolly.nextAuth.nextAuthStrings.r
import typingsJapgolly.nextAuth.nextAuthStrings.s
import typingsJapgolly.nextAuth.nextAuthStrings.w
import typingsJapgolly.nextAuth.nextAuthStrings.x
import typingsJapgolly.nextAuth.nextAuthStrings.y
import typingsJapgolly.nextAuth.nextAuthStrings.z
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[s | m_ | x | l | o | p | q | r | y | z | w] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setType(value: s | m_ | typingsJapgolly.nextAuth.nextAuthStrings.x | l | o | p | q | r | y | z | w): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typingsJapgolly.nextAuth.anon

import typingsJapgolly.nextAuth.nextAuthStrings.a
import typingsJapgolly.nextAuth.nextAuthStrings.b
import typingsJapgolly.nextAuth.nextAuthStrings.c
import typingsJapgolly.nextAuth.nextAuthStrings.d
import typingsJapgolly.nextAuth.nextAuthStrings.e
import typingsJapgolly.nextAuth.nextAuthStrings.f_
import typingsJapgolly.nextAuth.nextAuthStrings.g
import typingsJapgolly.nextAuth.nextAuthStrings.h
import typingsJapgolly.nextAuth.nextAuthStrings.i
import typingsJapgolly.nextAuth.nextAuthStrings.j
import typingsJapgolly.nextAuth.nextAuthStrings.k
import typingsJapgolly.nextAuth.nextAuthStrings.l
import typingsJapgolly.nextAuth.nextAuthStrings.m_
import typingsJapgolly.nextAuth.nextAuthStrings.max
import typingsJapgolly.nextAuth.nextAuthStrings.n
import typingsJapgolly.nextAuth.nextAuthStrings.o
import typingsJapgolly.nextAuth.nextAuthStrings.p
import typingsJapgolly.nextAuth.nextAuthStrings.q
import typingsJapgolly.nextAuth.nextAuthStrings.r
import typingsJapgolly.nextAuth.nextAuthStrings.s
import typingsJapgolly.nextAuth.nextAuthStrings.temp
import typingsJapgolly.nextAuth.nextAuthStrings.w
import typingsJapgolly.nextAuth.nextAuthStrings.x
import typingsJapgolly.nextAuth.nextAuthStrings.y
import typingsJapgolly.nextAuth.nextAuthStrings.z
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Src extends StObject {
  
  var height: Double
  
  var src: js.UndefOr[String] = js.undefined
  
  var `type`: s | m_ | x | o | p | q | r | k | l | y | z | c | w | a | b | e | i | d | j | temp | h | g | n | f_ | max
  
  var url: String
  
  var width: Double
}
object Src {
  
  inline def apply(
    height: Double,
    `type`: s | m_ | x | o | p | q | r | k | l | y | z | c | w | a | b | e | i | d | j | temp | h | g | n | f_ | max,
    url: String,
    width: Double
  ): Src = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  extension [Self <: Src](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(
      value: s | m_ | typingsJapgolly.nextAuth.nextAuthStrings.x | o | p | q | r | k | l | y | z | c | w | a | b | e | i | d | j | temp | h | g | n | f_ | max
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

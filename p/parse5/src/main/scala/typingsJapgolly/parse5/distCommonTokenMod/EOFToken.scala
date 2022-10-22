package typingsJapgolly.parse5.distCommonTokenMod

import typingsJapgolly.parse5.distCommonTokenMod.TokenType.EOF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EOFToken
  extends StObject
     with TokenBase
     with Token {
  
  @JSName("type")
  val type_EOFToken: EOF
}
object EOFToken {
  
  inline def apply(`type`: EOF): EOFToken = {
    val __obj = js.Dynamic.literal(location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EOFToken]
  }
  
  extension [Self <: EOFToken](x: Self) {
    
    inline def setType(value: EOF): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

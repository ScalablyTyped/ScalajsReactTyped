package typingsJapgolly.pugLexer.mod

import typingsJapgolly.pugLexer.pugLexerStrings.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterToken
  extends StObject
     with LexToken[filter]
     with _Token {
  
  var `val`: String
}
object FilterToken {
  
  inline def apply(loc: Loc, `val`: String): FilterToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filter")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterToken]
  }
  
  extension [Self <: FilterToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}

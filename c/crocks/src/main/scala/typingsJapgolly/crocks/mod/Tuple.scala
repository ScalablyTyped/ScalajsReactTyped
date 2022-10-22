package typingsJapgolly.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tuple {
  
  @JSImport("crocks", "Tuple.default")
  @js.native
  open class default ()
    extends typingsJapgolly.crocks.tupleMod.default
  /* static members */
  object default {
    
    inline def apply(val1: scala.Any, val2: scala.Any): typingsJapgolly.crocks.tupleTupleMod.Tuple = (^.asInstanceOf[js.Dynamic].apply(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.crocks.tupleTupleMod.Tuple]
    
    @JSImport("crocks", "Tuple.default")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): typingsJapgolly.crocks.tupleTupleMod.Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typingsJapgolly.crocks.tupleTupleMod.Tuple]
    
    inline def of(`val`: scala.Any): typingsJapgolly.crocks.tupleTupleMod.Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.tupleTupleMod.Tuple]
  }
}

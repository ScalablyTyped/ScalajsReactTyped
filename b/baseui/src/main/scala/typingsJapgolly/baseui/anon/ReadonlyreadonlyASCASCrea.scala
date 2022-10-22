package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.ASC
import typingsJapgolly.baseui.baseuiStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{ readonly ASC :'ASC',  readonly DESC :'DESC'}> */
trait ReadonlyreadonlyASCASCrea extends StObject {
  
  val ASC: typingsJapgolly.baseui.baseuiStrings.ASC
  
  val DESC: typingsJapgolly.baseui.baseuiStrings.DESC
}
object ReadonlyreadonlyASCASCrea {
  
  inline def apply(): ReadonlyreadonlyASCASCrea = {
    val __obj = js.Dynamic.literal(ASC = "ASC", DESC = "DESC")
    __obj.asInstanceOf[ReadonlyreadonlyASCASCrea]
  }
  
  extension [Self <: ReadonlyreadonlyASCASCrea](x: Self) {
    
    inline def setASC(value: ASC): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
    
    inline def setDESC(value: DESC): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
  }
}

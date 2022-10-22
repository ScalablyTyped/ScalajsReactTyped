package typingsJapgolly.vscodeLanguageserver

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonUtilsUuidMod {
  
  @JSImport("vscode-languageserver/lib/common/utils/uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageserver/lib/common/utils/uuid", "empty")
  @js.native
  val empty: UUID = js.native
  
  inline def generateUuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUuid")().asInstanceOf[String]
  
  inline def isUUID(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(value: String): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[UUID]
  
  inline def v4(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[UUID]
  
  trait UUID extends StObject {
    
    /**
      * @returns the canonical representation in sets of hexadecimal numbers separated by dashes.
      */
    def asHex(): String
    
    def equals(other: UUID): Boolean
  }
  object UUID {
    
    inline def apply(asHex: CallbackTo[String], equals_ : UUID => Boolean): UUID = {
      val __obj = js.Dynamic.literal(asHex = asHex.toJsFn)
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[UUID]
    }
    
    extension [Self <: UUID](x: Self) {
      
      inline def setAsHex(value: CallbackTo[String]): Self = StObject.set(x, "asHex", value.toJsFn)
      
      inline def setEquals_(value: UUID => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    }
  }
}

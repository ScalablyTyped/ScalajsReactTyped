package typingsJapgolly.nodeTlv

import typingsJapgolly.nodeTlv.nodeTlvStrings.`context specific`
import typingsJapgolly.nodeTlv.nodeTlvStrings.`private`
import typingsJapgolly.nodeTlv.nodeTlvStrings.application
import typingsJapgolly.nodeTlv.nodeTlvStrings.constructed
import typingsJapgolly.nodeTlv.nodeTlvStrings.primitive
import typingsJapgolly.nodeTlv.nodeTlvStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clazz extends StObject {
    
    var clazz: js.UndefOr[universal | application | (`context specific`) | `private`] = js.undefined
    
    var encoding: primitive | constructed
  }
  object Clazz {
    
    inline def apply(encoding: primitive | constructed): Clazz = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clazz]
    }
    
    extension [Self <: Clazz](x: Self) {
      
      inline def setClazz(value: universal | application | (`context specific`) | `private`): Self = StObject.set(x, "clazz", value.asInstanceOf[js.Any])
      
      inline def setClazzUndefined: Self = StObject.set(x, "clazz", js.undefined)
      
      inline def setEncoding(value: primitive | constructed): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}

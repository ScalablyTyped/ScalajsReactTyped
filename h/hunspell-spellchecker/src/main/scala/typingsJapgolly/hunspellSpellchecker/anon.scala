package typingsJapgolly.hunspellSpellchecker

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aff extends StObject {
    
    var aff: Buffer
    
    var dic: Buffer
  }
  object Aff {
    
    inline def apply(aff: Buffer, dic: Buffer): Aff = {
      val __obj = js.Dynamic.literal(aff = aff.asInstanceOf[js.Any], dic = dic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aff]
    }
    
    extension [Self <: Aff](x: Self) {
      
      inline def setAff(value: Buffer): Self = StObject.set(x, "aff", value.asInstanceOf[js.Any])
      
      inline def setDic(value: Buffer): Self = StObject.set(x, "dic", value.asInstanceOf[js.Any])
    }
  }
}

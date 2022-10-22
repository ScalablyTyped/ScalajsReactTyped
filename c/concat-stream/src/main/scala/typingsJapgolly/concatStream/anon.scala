package typingsJapgolly.concatStream

import typingsJapgolly.concatStream.concatStreamStrings.`object`
import typingsJapgolly.concatStream.concatStreamStrings.array
import typingsJapgolly.concatStream.concatStreamStrings.buffer
import typingsJapgolly.concatStream.concatStreamStrings.string
import typingsJapgolly.concatStream.concatStreamStrings.u8
import typingsJapgolly.concatStream.concatStreamStrings.uint8
import typingsJapgolly.concatStream.concatStreamStrings.uint8array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var encoding: uint8array | u8 | uint8
  }
  object `0` {
    
    inline def apply(encoding: uint8array | u8 | uint8): `0` = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setEncoding(value: uint8array | u8 | uint8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var encoding: array
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(encoding = "array")
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setEncoding(value: array): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var encoding: string
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal(encoding = "string")
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setEncoding(value: string): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var encoding: js.UndefOr[buffer] = js.undefined
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: `object`
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal(encoding = "object")
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}

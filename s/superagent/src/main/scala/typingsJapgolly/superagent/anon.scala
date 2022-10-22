package typingsJapgolly.superagent

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.superagent.superagentStrings.auto
import typingsJapgolly.superagent.superagentStrings.basic
import typingsJapgolly.superagent.superagentStrings.bearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `type`: bearer
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("bearer")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setType(value: bearer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object ContentType {
    
    inline def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    extension [Self <: ContentType](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait Deadline extends StObject {
    
    var deadline: js.UndefOr[Double] = js.undefined
    
    var response: js.UndefOr[Double] = js.undefined
  }
  object Deadline {
    
    inline def apply(): Deadline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deadline]
    }
    
    extension [Self <: Deadline](x: Self) {
      
      inline def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      inline def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  trait Passphrase extends StObject {
    
    var passphrase: String
    
    var pfx: String | Buffer
  }
  object Passphrase {
    
    inline def apply(passphrase: String, pfx: String | Buffer): Passphrase = {
      val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passphrase]
    }
    
    extension [Self <: Passphrase](x: Self) {
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPfx(value: String | Buffer): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: basic | auto
  }
  object Type {
    
    inline def apply(`type`: basic | auto): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: basic | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

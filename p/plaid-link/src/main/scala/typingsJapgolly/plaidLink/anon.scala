package typingsJapgolly.plaidLink

import typingsJapgolly.plaidLink.mod.Plaid.CreateConfig
import typingsJapgolly.plaidLink.mod.Plaid.LinkHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create extends StObject {
    
    def create(params: CreateConfig): LinkHandler
    
    var version: String
  }
  object Create {
    
    inline def apply(create: CreateConfig => LinkHandler, version: String): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setCreate(value: CreateConfig => LinkHandler): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Institutionid extends StObject {
    
    var institution_id: String
    
    var name: String
  }
  object Institutionid {
    
    inline def apply(institution_id: String, name: String): Institutionid = {
      val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Institutionid]
    }
    
    extension [Self <: Institutionid](x: Self) {
      
      inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdentifierAndLinkNameTuple extends StObject {
  
  /**
    * The name of the link between the parent and the child object.
    */
  var LinkName: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.LinkName] = js.undefined
  
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
}
object ObjectIdentifierAndLinkNameTuple {
  
  inline def apply(): ObjectIdentifierAndLinkNameTuple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectIdentifierAndLinkNameTuple]
  }
  
  extension [Self <: ObjectIdentifierAndLinkNameTuple](x: Self) {
    
    inline def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}

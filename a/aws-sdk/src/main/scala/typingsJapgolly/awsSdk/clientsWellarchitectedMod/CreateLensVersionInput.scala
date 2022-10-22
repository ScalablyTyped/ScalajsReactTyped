package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLensVersionInput extends StObject {
  
  var ClientRequestToken: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ClientRequestToken
  
  /**
    * Set to true if this new major lens version.
    */
  var IsMajorVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.IsMajorVersion] = js.undefined
  
  var LensAlias: typingsJapgolly.awsSdk.clientsWellarchitectedMod.LensAlias
  
  /**
    * The version of the lens being created.
    */
  var LensVersion: typingsJapgolly.awsSdk.clientsWellarchitectedMod.LensVersion
}
object CreateLensVersionInput {
  
  inline def apply(ClientRequestToken: ClientRequestToken, LensAlias: LensAlias, LensVersion: LensVersion): CreateLensVersionInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], LensAlias = LensAlias.asInstanceOf[js.Any], LensVersion = LensVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLensVersionInput]
  }
  
  extension [Self <: CreateLensVersionInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setIsMajorVersion(value: IsMajorVersion): Self = StObject.set(x, "IsMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setIsMajorVersionUndefined: Self = StObject.set(x, "IsMajorVersion", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensVersion(value: LensVersion): Self = StObject.set(x, "LensVersion", value.asInstanceOf[js.Any])
  }
}

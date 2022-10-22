package typingsJapgolly.ipfsHttpClient.anon

import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidCID extends StObject {
  
  var cid: CID[Any, Double, Double, Version]
}
object CidCID {
  
  inline def apply(cid: CID[Any, Double, Double, Version]): CidCID = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidCID]
  }
  
  extension [Self <: CidCID](x: Self) {
    
    inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.shippo.mod.Shippo

import typingsJapgolly.shippo.anon.Create
import typingsJapgolly.shippo.anon.CreateList
import typingsJapgolly.shippo.anon.ListRetrieve
import typingsJapgolly.shippo.anon.Retrieve
import typingsJapgolly.shippo.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shippo extends StObject {
  
  var address: typingsJapgolly.shippo.anon.List
  
  var carrieraccount: ListRetrieve
  
  var parcel: CreateList
  
  var rate: `0`
  
  var shipment: Create
  
  var transaction: Retrieve
}
object Shippo {
  
  inline def apply(
    address: typingsJapgolly.shippo.anon.List,
    carrieraccount: ListRetrieve,
    parcel: CreateList,
    rate: `0`,
    shipment: Create,
    transaction: Retrieve
  ): typingsJapgolly.shippo.mod.Shippo.Shippo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], carrieraccount = carrieraccount.asInstanceOf[js.Any], parcel = parcel.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], shipment = shipment.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.shippo.mod.Shippo.Shippo]
  }
  
  extension [Self <: typingsJapgolly.shippo.mod.Shippo.Shippo](x: Self) {
    
    inline def setAddress(value: typingsJapgolly.shippo.anon.List): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCarrieraccount(value: ListRetrieve): Self = StObject.set(x, "carrieraccount", value.asInstanceOf[js.Any])
    
    inline def setParcel(value: CreateList): Self = StObject.set(x, "parcel", value.asInstanceOf[js.Any])
    
    inline def setRate(value: `0`): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setShipment(value: Create): Self = StObject.set(x, "shipment", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: Retrieve): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}

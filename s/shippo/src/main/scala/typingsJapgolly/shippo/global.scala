package typingsJapgolly.shippo

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.shippo.anon.Create
import typingsJapgolly.shippo.anon.CreateList
import typingsJapgolly.shippo.anon.ListRetrieve
import typingsJapgolly.shippo.anon.Retrieve
import typingsJapgolly.shippo.anon.`0`
import typingsJapgolly.shippo.mod.ShippoStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Shippo extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Shippo")
    @js.native
    open class ^ protected ()
      extends StObject
         with typingsJapgolly.shippo.mod.Shippo.Shippo {
      def this(token: String) = this()
      
      /* CompleteClass */
      var address: typingsJapgolly.shippo.anon.List = js.native
      
      /* CompleteClass */
      var carrieraccount: ListRetrieve = js.native
      
      /* CompleteClass */
      var parcel: CreateList = js.native
      
      /* CompleteClass */
      var rate: `0` = js.native
      
      /* CompleteClass */
      var shipment: Create = js.native
      
      /* CompleteClass */
      var transaction: Retrieve = js.native
    }
    
    @JSGlobal("Shippo")
    @js.native
    val ^ : ShippoStatic = js.native
    
    type _To = ShippoStatic
    
    /* This means you don't have to write `^`, but can instead just say `Shippo.foo` */
    override def _to: ShippoStatic = ^
  }
}

package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contact
  extends StObject
     with IContact
object Contact {
  
  inline def apply(fields: IVector[IContactField], name: String, thumbnail: IRandomAccessStreamReference): Contact = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

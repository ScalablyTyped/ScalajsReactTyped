package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactFieldCategory extends StObject
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
@js.native
object ContactFieldCategory extends StObject {
  
  @js.native
  sealed trait home
    extends StObject
       with ContactFieldCategory
  
  @js.native
  sealed trait mobile
    extends StObject
       with ContactFieldCategory
  
  @js.native
  sealed trait none
    extends StObject
       with ContactFieldCategory
  
  @js.native
  sealed trait other
    extends StObject
       with ContactFieldCategory
  
  @js.native
  sealed trait work
    extends StObject
       with ContactFieldCategory
}

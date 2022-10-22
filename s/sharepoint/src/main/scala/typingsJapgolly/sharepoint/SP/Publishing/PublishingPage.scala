package typingsJapgolly.sharepoint.SP.Publishing

import typingsJapgolly.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
import typingsJapgolly.sharepoint.SP.StringResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishingPage
  extends StObject
     with ScheduledItem {
  
  def addFriendlyUrl(friendlyUrlSegment: String, editableParent: NavigationTermSetItem, doAddToNavigation: Boolean): StringResult = js.native
}

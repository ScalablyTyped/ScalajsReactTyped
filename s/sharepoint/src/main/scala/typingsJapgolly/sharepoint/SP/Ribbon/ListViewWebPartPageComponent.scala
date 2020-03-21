package typingsJapgolly.sharepoint.SP.Ribbon

import typingsJapgolly.sharepoint.CUI.Page.PageComponent
import typingsJapgolly.sharepoint.SP.Application.UI.DefaultFormsInformation
import typingsJapgolly.sharepoint.SP.Application.UI.DefaultFormsInformationRequestor
import typingsJapgolly.sharepoint.SP.Application.UI.ViewInformationRequestor
import typingsJapgolly.sharepoint.SP.Application.UI.ViewSelectorGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Ribbon.ListViewWebPartPageComponent")
@js.native
class ListViewWebPartPageComponent ()
  extends PageComponent
     with ViewInformationRequestor
     with DefaultFormsInformationRequestor {
  /* CompleteClass */
  override def onDefaultFormsInformationRetrieveFailure(): Unit = js.native
  /* CompleteClass */
  override def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): Unit = js.native
  /* CompleteClass */
  override def onViewInformationReturned(viewGroups: ViewSelectorGroups): Unit = js.native
}


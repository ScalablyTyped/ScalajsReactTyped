package typingsJapgolly.sharepoint.SPClientTemplates

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContextFieldInForm extends RenderContextForm {
  var CurrentFieldSchema: FieldSchemaInForm
  var CurrentFieldValue: js.Any
  var CurrentGroup: Group
  var CurrentGroupIdx: Double
  var CurrentItems: js.Array[Item]
}

object RenderContextFieldInForm {
  @scala.inline
  def apply(
    CurrentFieldSchema: FieldSchemaInForm,
    CurrentFieldValue: js.Any,
    CurrentGroup: Group,
    CurrentGroupIdx: Double,
    CurrentItem: Item,
    CurrentItems: js.Array[Item],
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm,
    BaseViewID: Int | Double = null,
    CSRCustomLayout: js.UndefOr[Boolean] = js.undefined,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: String = null,
    CurrentLanguage: Int | Double = null,
    CurrentSelectedItems: js.Any = null,
    CurrentUICultureName: String = null,
    ListTemplateType: Int | Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: RenderContextFieldInForm => CallbackTo[String] = null,
    RenderFieldByName: (RenderContextFieldInForm, /* fieldName */ String) => CallbackTo[String] = null,
    RenderFields: RenderContextFieldInForm => CallbackTo[String] = null,
    RenderFooter: RenderContextFieldInForm => CallbackTo[String] = null,
    RenderGroups: RenderContextFieldInForm => CallbackTo[String] = null,
    RenderHeader: RenderContextFieldInForm => CallbackTo[String] = null,
    RenderItems: RenderContextFieldInForm => CallbackTo[String] = null,
    RenderView: RenderContextFieldInForm => CallbackTo[String] = null,
    SiteClientTag: String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContextFieldInForm = {
    val __obj = js.Dynamic.literal(CurrentFieldSchema = CurrentFieldSchema.asInstanceOf[js.Any], CurrentFieldValue = CurrentFieldValue.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], CurrentGroupIdx = CurrentGroupIdx.asInstanceOf[js.Any], CurrentItem = CurrentItem.asInstanceOf[js.Any], CurrentItems = CurrentItems.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (!js.isUndefined(CSRCustomLayout)) __obj.updateDynamic("CSRCustomLayout")(CSRCustomLayout.asInstanceOf[js.Any])
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode.asInstanceOf[js.Any])
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName.asInstanceOf[js.Any])
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
    if (CurrentSelectedItems != null) __obj.updateDynamic("CurrentSelectedItems")(CurrentSelectedItems.asInstanceOf[js.Any])
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName.asInstanceOf[js.Any])
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => RenderBody(t0).runNow()))
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm, t1: /* fieldName */ java.lang.String) => RenderFieldByName(t0, t1).runNow()))
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => RenderFields(t0).runNow()))
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => RenderFooter(t0).runNow()))
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => RenderGroups(t0).runNow()))
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => RenderHeader(t0).runNow()))
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => RenderItems(t0).runNow()))
    if (RenderView != null) __obj.updateDynamic("RenderView")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => RenderView(t0).runNow()))
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag.asInstanceOf[js.Any])
    if (Templates != null) __obj.updateDynamic("Templates")(Templates.asInstanceOf[js.Any])
    if (onRefreshFailed != null) __obj.updateDynamic("onRefreshFailed")(onRefreshFailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextFieldInForm]
  }
}


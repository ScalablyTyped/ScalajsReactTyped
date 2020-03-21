package typingsJapgolly.sharepoint.SPClientTemplates

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext extends js.Object {
  var BaseViewID: js.UndefOr[Double] = js.undefined
  var ControlMode: js.UndefOr[ClientControlMode] = js.undefined
  var CurrentCultureName: js.UndefOr[String] = js.undefined
  var CurrentLanguage: js.UndefOr[Double] = js.undefined
  var CurrentSelectedItems: js.UndefOr[js.Any] = js.undefined
  var CurrentUICultureName: js.UndefOr[String] = js.undefined
  var ListTemplateType: js.UndefOr[Double] = js.undefined
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  var RenderBody: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  var RenderFieldByName: js.UndefOr[js.Function2[/* renderContext */ this.type, /* fieldName */ String, String]] = js.undefined
  var RenderFields: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  var RenderFooter: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  var RenderGroups: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  var RenderHeader: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  var RenderItems: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  var RenderView: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  var SiteClientTag: js.UndefOr[String] = js.undefined
  var Templates: js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.Templates] = js.undefined
  var onRefreshFailed: js.UndefOr[js.Any] = js.undefined
}

object RenderContext {
  @scala.inline
  def apply(
    BaseViewID: Int | Double = null,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: String = null,
    CurrentLanguage: Int | Double = null,
    CurrentSelectedItems: js.Any = null,
    CurrentUICultureName: String = null,
    ListTemplateType: Int | Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: RenderContext => CallbackTo[String] = null,
    RenderFieldByName: (RenderContext, /* fieldName */ String) => CallbackTo[String] = null,
    RenderFields: RenderContext => CallbackTo[String] = null,
    RenderFooter: RenderContext => CallbackTo[String] = null,
    RenderGroups: RenderContext => CallbackTo[String] = null,
    RenderHeader: RenderContext => CallbackTo[String] = null,
    RenderItems: RenderContext => CallbackTo[String] = null,
    RenderView: RenderContext => CallbackTo[String] = null,
    SiteClientTag: String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContext = {
    val __obj = js.Dynamic.literal()
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode.asInstanceOf[js.Any])
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName.asInstanceOf[js.Any])
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
    if (CurrentSelectedItems != null) __obj.updateDynamic("CurrentSelectedItems")(CurrentSelectedItems.asInstanceOf[js.Any])
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName.asInstanceOf[js.Any])
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContext) => RenderBody(t0).runNow()))
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContext, t1: /* fieldName */ java.lang.String) => RenderFieldByName(t0, t1).runNow()))
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContext) => RenderFields(t0).runNow()))
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContext) => RenderFooter(t0).runNow()))
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContext) => RenderGroups(t0).runNow()))
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContext) => RenderHeader(t0).runNow()))
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContext) => RenderItems(t0).runNow()))
    if (RenderView != null) __obj.updateDynamic("RenderView")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SPClientTemplates.RenderContext) => RenderView(t0).runNow()))
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag.asInstanceOf[js.Any])
    if (Templates != null) __obj.updateDynamic("Templates")(Templates.asInstanceOf[js.Any])
    if (onRefreshFailed != null) __obj.updateDynamic("onRefreshFailed")(onRefreshFailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContext]
  }
}


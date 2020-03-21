package typingsJapgolly.sharepoint.SPClientTemplates

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldTemplateOverrides extends js.Object {
  /** Defines templates for rendering the field on a display form. */
  var DisplayForm: js.UndefOr[FieldInFormCallback] = js.undefined
  /** Defines templates for rendering the field on an edit form. */
  var EditForm: js.UndefOr[FieldInFormCallback] = js.undefined
  /** Defines templates for rendering the field on a new form. */
  var NewForm: js.UndefOr[FieldInFormCallback] = js.undefined
  /** Defines templates for rendering the field on a list view. */
  var View: js.UndefOr[FieldInViewCallback] = js.undefined
}

object FieldTemplateOverrides {
  @scala.inline
  def apply(
    DisplayForm: /* renderContext */ RenderContextFieldInForm => CallbackTo[String] = null,
    EditForm: /* renderContext */ RenderContextFieldInForm => CallbackTo[String] = null,
    NewForm: /* renderContext */ RenderContextFieldInForm => CallbackTo[String] = null,
    View: /* renderContext */ RenderContextFieldInView => CallbackTo[String] = null
  ): FieldTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    if (DisplayForm != null) __obj.updateDynamic("DisplayForm")(js.Any.fromFunction1((t0: /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => DisplayForm(t0).runNow()))
    if (EditForm != null) __obj.updateDynamic("EditForm")(js.Any.fromFunction1((t0: /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => EditForm(t0).runNow()))
    if (NewForm != null) __obj.updateDynamic("NewForm")(js.Any.fromFunction1((t0: /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm) => NewForm(t0).runNow()))
    if (View != null) __obj.updateDynamic("View")(js.Any.fromFunction1((t0: /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInView) => View(t0).runNow()))
    __obj.asInstanceOf[FieldTemplateOverrides]
  }
}


package typingsJapgolly.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SPClientTemplates {
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldCallback = js.Function1[
    /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContext, 
    java.lang.String
  ]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldInFormCallback = js.Function1[
    /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInForm, 
    java.lang.String
  ]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldInViewCallback = js.Function1[
    /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContextFieldInView, 
    java.lang.String
  ]
  type FieldTemplateMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.sharepoint.SPClientTemplates.FieldTemplateOverrides]
  type FieldTemplates = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.sharepoint.SPClientTemplates.FieldCallback]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type GroupCallback = js.Function1[
    /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContextGroupInView, 
    java.lang.String
  ]
  type Item = org.scalablytyped.runtime.StringDictionary[js.Any]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type ItemCallback = js.Function1[
    /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContext, 
    java.lang.String
  ]
  type RenderCallback = js.Function1[/* ctx */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContext, scala.Unit]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type SingleTemplateCallback = js.Function1[
    /* renderContext */ typingsJapgolly.sharepoint.SPClientTemplates.RenderContextInView, 
    java.lang.String
  ]
}

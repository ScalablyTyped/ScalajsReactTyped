package typingsJapgolly.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how to coerce data returned or set by the invoked method.
  *
  * @remarks
  * 
  * Application and platform support for each `CoercionType` is specified in the following requirement set descriptions.
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#htmlcoercion | HtmlCoercion}, (when using `Office.CoercionType.Html`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/image-coercion-requirement-sets | ImageCoercion 1.1} (when using `Office.CoercionType.Image`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#matrixcoercion | MatrixCoercion} (when using `Office.CoercionType.Matrix`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#ooxmlcoercion | OoxmlCoercion} (when using `Office.CoercionType.Ooxml`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#selection | Selection}
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#tablecoercion | TableCoercion} (when using `Office.CoercionType.Table`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#textcoercion | TextCoercion} (when using `Office.CoercionType.Text`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/image-coercion-requirement-sets#imagecoercion-12 | ImageCoercion 1.2} (when using `Office.CoercionType.XmlSvg`)
  * 
  */
@JSGlobal("Office.CoercionType")
@js.native
object CoercionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.officeJsPreview.Office.CoercionType & Double] = js.native
  
  /* 3 */ val Html: typingsJapgolly.officeJsPreview.Office.CoercionType.Html & Double = js.native
  
  /* 6 */ val Image: typingsJapgolly.officeJsPreview.Office.CoercionType.Image & Double = js.native
  
  /* 1 */ val Matrix: typingsJapgolly.officeJsPreview.Office.CoercionType.Matrix & Double = js.native
  
  /* 4 */ val Ooxml: typingsJapgolly.officeJsPreview.Office.CoercionType.Ooxml & Double = js.native
  
  /* 5 */ val SlideRange: typingsJapgolly.officeJsPreview.Office.CoercionType.SlideRange & Double = js.native
  
  /* 2 */ val Table: typingsJapgolly.officeJsPreview.Office.CoercionType.Table & Double = js.native
  
  /* 0 */ val Text: typingsJapgolly.officeJsPreview.Office.CoercionType.Text & Double = js.native
  
  /* 7 */ val XmlSvg: typingsJapgolly.officeJsPreview.Office.CoercionType.XmlSvg & Double = js.native
}

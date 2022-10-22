package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether the shape is scaled relative to its original or current size.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleType")
@js.native
object ShapeScaleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ShapeScaleType & String] = js.native
  
  /* "CurrentSize" */ val currentSize: typingsJapgolly.officeJs.Excel.ShapeScaleType.currentSize & String = js.native
  
  /* "OriginalSize" */ val originalSize: typingsJapgolly.officeJs.Excel.ShapeScaleType.originalSize & String = js.native
}

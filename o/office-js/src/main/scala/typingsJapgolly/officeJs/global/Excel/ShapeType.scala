package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the type of a shape.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeType")
@js.native
object ShapeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ShapeType & String] = js.native
  
  /* "GeometricShape" */ val geometricShape: typingsJapgolly.officeJs.Excel.ShapeType.geometricShape & String = js.native
  
  /* "Group" */ val group: typingsJapgolly.officeJs.Excel.ShapeType.group & String = js.native
  
  /* "Image" */ val image: typingsJapgolly.officeJs.Excel.ShapeType.image & String = js.native
  
  /* "Line" */ val line: typingsJapgolly.officeJs.Excel.ShapeType.line & String = js.native
  
  /* "Unsupported" */ val unsupported: typingsJapgolly.officeJs.Excel.ShapeType.unsupported & String = js.native
}

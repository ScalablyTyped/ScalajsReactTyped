package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerStyle.toJSON()`. */
trait SlicerStyleData extends StObject {
  
  /**
    * Specifies the name of the slicer style.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if this `SlicerStyle` object is read-only.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object SlicerStyleData {
  
  inline def apply(): SlicerStyleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerStyleData]
  }
  
  extension [Self <: SlicerStyleData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}

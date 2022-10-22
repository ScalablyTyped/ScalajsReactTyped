package typingsJapgolly.rcTable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTable.libInterfaceMod.AlignType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SummaryCellProps_81412118 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
  
  inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
}

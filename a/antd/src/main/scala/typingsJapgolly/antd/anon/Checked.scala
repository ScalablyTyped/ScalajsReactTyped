package typingsJapgolly.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  
  var halfChecked: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
}
object Checked {
  
  inline def apply(
    checked: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key],
    halfChecked: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  ): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setChecked(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "checked", js.Array(value*))
    
    inline def setHalfChecked(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "halfChecked", js.Array(value*))
  }
}

package typingsJapgolly.rcFieldForm.esInterfaceMod

import typingsJapgolly.rcFieldForm.rcFieldFormStrings.external
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcFieldForm.esInterfaceMod.ValueUpdateInfo
  - typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateFinishInfo
  - typingsJapgolly.rcFieldForm.esInterfaceMod.ResetInfo
  - typingsJapgolly.rcFieldForm.esInterfaceMod.RemoveInfo
  - typingsJapgolly.rcFieldForm.esInterfaceMod.SetFieldInfo
  - typingsJapgolly.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo
*/
trait NotifyInfo extends StObject
object NotifyInfo {
  
  inline def DependenciesUpdateInfo(relatedFields: js.Array[InternalNamePath]): typingsJapgolly.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependenciesUpdate")
    __obj.asInstanceOf[typingsJapgolly.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo]
  }
  
  inline def RemoveInfo(): typingsJapgolly.rcFieldForm.esInterfaceMod.RemoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[typingsJapgolly.rcFieldForm.esInterfaceMod.RemoveInfo]
  }
  
  inline def ResetInfo(): typingsJapgolly.rcFieldForm.esInterfaceMod.ResetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reset")
    __obj.asInstanceOf[typingsJapgolly.rcFieldForm.esInterfaceMod.ResetInfo]
  }
  
  inline def SetFieldInfo(data: FieldData): typingsJapgolly.rcFieldForm.esInterfaceMod.SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setField")
    __obj.asInstanceOf[typingsJapgolly.rcFieldForm.esInterfaceMod.SetFieldInfo]
  }
  
  inline def ValidateFinishInfo(): typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("validateFinish")
    __obj.asInstanceOf[typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateFinishInfo]
  }
  
  inline def ValueUpdateInfo(source: internal | external): typingsJapgolly.rcFieldForm.esInterfaceMod.ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("valueUpdate")
    __obj.asInstanceOf[typingsJapgolly.rcFieldForm.esInterfaceMod.ValueUpdateInfo]
  }
}

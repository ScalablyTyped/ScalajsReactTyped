package typingsJapgolly.awsSdkBuildTypes.buildApiModelMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.List
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Map
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Structure
*/
trait ComplexShape extends StObject
object ComplexShape {
  
  inline def List(member: Member): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.List]
  }
  
  inline def Map(key: Member, value: Member): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("map")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Map]
  }
  
  inline def Structure(members: StringDictionary[StructureMember]): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("structure")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Structure]
  }
}

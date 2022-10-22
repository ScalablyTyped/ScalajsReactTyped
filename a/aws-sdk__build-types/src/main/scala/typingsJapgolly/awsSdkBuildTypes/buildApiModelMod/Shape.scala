package typingsJapgolly.awsSdkBuildTypes.buildApiModelMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Blob
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Boolean
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Byte
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Character
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Double
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Float
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Integer
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.List
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Long
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Map
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Short
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.String
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Structure
  - typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Timestamp
*/
trait Shape extends StObject
object Shape {
  
  inline def Blob(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Blob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("blob")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Blob]
  }
  
  inline def Boolean(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Boolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Boolean]
  }
  
  inline def Byte(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Byte = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Byte]
  }
  
  inline def Character(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Character = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("character")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Character]
  }
  
  inline def Double(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Double = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Double]
  }
  
  inline def Float(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Float = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Float]
  }
  
  inline def Integer(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Integer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Integer]
  }
  
  inline def List(member: Member): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.List]
  }
  
  inline def Long(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Long = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Long]
  }
  
  inline def Map(key: Member, value: Member): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("map")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Map]
  }
  
  inline def Short(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Short = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Short]
  }
  
  inline def String(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.String]
  }
  
  inline def Structure(members: StringDictionary[StructureMember]): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("structure")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Structure]
  }
  
  inline def Timestamp(): typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.Timestamp]
  }
}

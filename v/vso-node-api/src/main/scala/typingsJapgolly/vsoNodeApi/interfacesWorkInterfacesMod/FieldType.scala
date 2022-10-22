package typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType & scala.Double] = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with FieldType
  /* 5 */ val Boolean: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.FieldType.Boolean & scala.Double = js.native
  
  @js.native
  sealed trait DateTime
    extends StObject
       with FieldType
  /* 3 */ val DateTime: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.FieldType.DateTime & scala.Double = js.native
  
  @js.native
  sealed trait Double
    extends StObject
       with FieldType
  /* 6 */ val Double: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.FieldType.Double & scala.Double = js.native
  
  @js.native
  sealed trait Integer
    extends StObject
       with FieldType
  /* 2 */ val Integer: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.FieldType.Integer & scala.Double = js.native
  
  @js.native
  sealed trait PlainText
    extends StObject
       with FieldType
  /* 1 */ val PlainText: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.FieldType.PlainText & scala.Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with FieldType
  /* 0 */ val String: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.FieldType.String & scala.Double = js.native
  
  @js.native
  sealed trait TreePath
    extends StObject
       with FieldType
  /* 4 */ val TreePath: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.FieldType.TreePath & scala.Double = js.native
}

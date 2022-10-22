package typingsJapgolly.rcTable

import typingsJapgolly.rcTable.libInterfaceMod.GetRowKey
import typingsJapgolly.rcTable.libInterfaceMod.Key
import typingsJapgolly.rcTable.libInterfaceMod.RenderExpandIconProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsExpandUtilMod {
  
  @JSImport("rc-table/lib/utils/expandUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAllChildrenKeys[RecordType](data: js.Array[RecordType], getRowKey: GetRowKey[RecordType], childrenColumnName: String): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllChildrenKeys")(data.asInstanceOf[js.Any], getRowKey.asInstanceOf[js.Any], childrenColumnName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def renderExpandIcon[RecordType](hasPrefixClsRecordOnExpandExpandedExpandable: RenderExpandIconProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderExpandIcon")(hasPrefixClsRecordOnExpandExpandedExpandable.asInstanceOf[js.Any]).asInstanceOf[Element]
}

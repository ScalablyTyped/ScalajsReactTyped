package typingsJapgolly.rcMenu

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcMenu.esInterfaceMod.ItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsNodeUtilMod {
  
  @JSImport("rc-menu/es/utils/nodeUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseChildren(children: Node, keyPath: js.Array[String]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseChildren")(children.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def parseChildren(children: Unit, keyPath: js.Array[String]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseChildren")(children.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def parseItems(children: Node, items: js.Array[ItemType], keyPath: js.Array[String]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseItems")(children.asInstanceOf[js.Any], items.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def parseItems(children: Node, items: Unit, keyPath: js.Array[String]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseItems")(children.asInstanceOf[js.Any], items.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def parseItems(children: Unit, items: js.Array[ItemType], keyPath: js.Array[String]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseItems")(children.asInstanceOf[js.Any], items.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def parseItems(children: Unit, items: Unit, keyPath: js.Array[String]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseItems")(children.asInstanceOf[js.Any], items.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
}

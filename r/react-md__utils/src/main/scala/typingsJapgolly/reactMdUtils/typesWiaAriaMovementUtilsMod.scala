package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.FocusType
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.KeyConfig
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.MovementKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaMovementUtilsMod {
  
  @JSImport("@react-md/utils/types/wia-aria/movement/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getItemId(id: String, i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")(id.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getKeyboardConfig(event: ReactKeyboardEventFrom[Element], keys: js.Array[KeyConfig]): KeyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyboardConfig")(event.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[KeyConfig | Null]
  inline def getKeyboardConfig(event: KeyboardEvent, keys: js.Array[KeyConfig]): KeyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyboardConfig")(event.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[KeyConfig | Null]
  
  inline def getStringifiedKeyConfig(config: KeyConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringifiedKeyConfig")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transformKeys(keys: js.Array[MovementKey], `type`: FocusType): js.Array[KeyConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformKeys")(keys.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[KeyConfig]]
}

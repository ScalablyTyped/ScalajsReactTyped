package typingsJapgolly.rcSelect

import typingsJapgolly.rcSelect.anon.ChildrenAsData
import typingsJapgolly.rcSelect.anon.Label
import typingsJapgolly.rcSelect.libInterfaceMod.FlattenOptionData
import typingsJapgolly.rcSelect.libSelectMod.BaseOptionType
import typingsJapgolly.rcSelect.libSelectMod.FieldNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsValueUtilMod {
  
  @JSImport("rc-select/lib/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fillFieldNames(fieldNames: Unit, childrenAsData: Boolean): Label = (^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any], childrenAsData.asInstanceOf[js.Any])).asInstanceOf[Label]
  inline def fillFieldNames(fieldNames: FieldNames, childrenAsData: Boolean): Label = (^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any], childrenAsData.asInstanceOf[js.Any])).asInstanceOf[Label]
  
  inline def flattenOptions[OptionType /* <: BaseOptionType */](options: js.Array[OptionType]): js.Array[FlattenOptionData[OptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlattenOptionData[OptionType]]]
  inline def flattenOptions[OptionType /* <: BaseOptionType */](options: js.Array[OptionType], hasFieldNamesChildrenAsData: ChildrenAsData): js.Array[FlattenOptionData[OptionType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenOptions")(options.asInstanceOf[js.Any], hasFieldNamesChildrenAsData.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenOptionData[OptionType]]]
  
  inline def getSeparatedContent(text: String, tokens: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeparatedContent")(text.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def injectPropsWithOption[T](option: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("injectPropsWithOption")(option.asInstanceOf[js.Any]).asInstanceOf[T]
}

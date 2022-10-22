package typingsJapgolly.antd

import typingsJapgolly.antd.anon.Offset
import typingsJapgolly.antd.libConfigProviderContextMod.DirectionType
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.PickerLocale
import typingsJapgolly.antd.libUtilMotionMod.SelectCommonPlacement
import typingsJapgolly.rcPicker.esInterfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerUtilMod {
  
  @JSImport("antd/lib/date-picker/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlaceholder(picker: Unit, locale: PickerLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceholder")(picker.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPlaceholder(picker: Unit, locale: PickerLocale, customizePlaceholder: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceholder")(picker.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], customizePlaceholder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPlaceholder(picker: PickerMode, locale: PickerLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceholder")(picker.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPlaceholder(picker: PickerMode, locale: PickerLocale, customizePlaceholder: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceholder")(picker.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], customizePlaceholder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRangePlaceholder(picker: Unit, locale: PickerLocale): js.UndefOr[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangePlaceholder")(picker.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, String]]]
  inline def getRangePlaceholder(picker: Unit, locale: PickerLocale, customizePlaceholder: js.Tuple2[String, String]): js.UndefOr[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangePlaceholder")(picker.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], customizePlaceholder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, String]]]
  inline def getRangePlaceholder(picker: PickerMode, locale: PickerLocale): js.UndefOr[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangePlaceholder")(picker.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, String]]]
  inline def getRangePlaceholder(picker: PickerMode, locale: PickerLocale, customizePlaceholder: js.Tuple2[String, String]): js.UndefOr[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangePlaceholder")(picker.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], customizePlaceholder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, String]]]
  
  inline def transPlacement2DropdownAlign(direction: DirectionType): Offset = ^.asInstanceOf[js.Dynamic].applyDynamic("transPlacement2DropdownAlign")(direction.asInstanceOf[js.Any]).asInstanceOf[Offset]
  inline def transPlacement2DropdownAlign(direction: DirectionType, placement: SelectCommonPlacement): Offset = (^.asInstanceOf[js.Dynamic].applyDynamic("transPlacement2DropdownAlign")(direction.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[Offset]
}

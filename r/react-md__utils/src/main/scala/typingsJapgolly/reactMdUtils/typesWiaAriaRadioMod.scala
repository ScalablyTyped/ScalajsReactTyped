package typingsJapgolly.reactMdUtils

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdUtils.typesWiaAriaRadioRadioGroupMod.RadioGroupProps
import typingsJapgolly.reactMdUtils.typesWiaAriaRadioRadioWidgetMod.RadioWidgetProps
import typingsJapgolly.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItem
import typingsJapgolly.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaRadioMod {
  
  @JSImport("@react-md/utils/types/wia-aria/radio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/radio", "RadioGroup")
  @js.native
  val RadioGroup: ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/radio", "RadioWidget")
  @js.native
  val RadioWidget: ForwardRefExoticComponent[RadioWidgetProps & RefAttributes[HTMLSpanElement]] = js.native
  
  inline def defaultGetRadioClassName(item: RadioItemStyleObject): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioClassName")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def defaultGetRadioStyle(item: RadioItemStyleObject): js.UndefOr[CSSProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioStyle")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CSSProperties]]
  
  inline def getRadioItemValue(value: RadioItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioItemValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}

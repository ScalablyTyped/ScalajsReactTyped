package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.libRadioInterfaceMod.RadioGroupProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioGroupMod extends Shortcut {
  
  @JSImport("antd/lib/radio/group", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLDivElement]]] = js.native
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `libRadioGroupMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLDivElement]]] = default
}

package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.antd.libCheckboxCheckboxMod.CheckboxProps
import typingsJapgolly.antd.libCheckboxGroupMod.CheckboxGroupProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxMod extends Shortcut {
  
  @JSImport("antd/lib/checkbox", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[CheckboxProps & RefAttributes[HTMLInputElement]] {
    
    var Group: MemoExoticComponent[ForwardRefExoticComponent[CheckboxGroupProps & RefAttributes[HTMLDivElement]]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libCheckboxMod.foo` */
  override def _to: CompoundedComponent = default
}

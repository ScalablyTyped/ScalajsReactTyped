package typingsJapgolly.rcCascader

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcSelect.libOptionListMod.RefOptionListProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListMod extends Shortcut {
  
  @JSImport("rc-cascader/es/OptionList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RefAttributes[RefOptionListProps]] = js.native
  
  type _To = ForwardRefExoticComponent[RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionListMod.foo` */
  override def _to: ForwardRefExoticComponent[RefAttributes[RefOptionListProps]] = default
}

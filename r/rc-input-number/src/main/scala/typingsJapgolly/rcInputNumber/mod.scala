package typingsJapgolly.rcInputNumber

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcInputNumber.anon.Children
import typingsJapgolly.rcInputNumber.anon.DisplayName
import typingsJapgolly.rcInputNumber.esInputNumberMod.InputNumberProps
import typingsJapgolly.rcInputNumber.esUtilsMiniDecimalMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-input-number", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children & InputNumberProps[ValueType], Element]) & DisplayName = js.native
  
  type _To = (js.Function1[/* props */ Children & InputNumberProps[ValueType], Element]) & DisplayName
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* props */ Children & InputNumberProps[ValueType], Element]) & DisplayName = default
}

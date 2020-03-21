package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSelect.nonceProviderMod.NonceProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NonceProvider {
  def apply(
    nonce: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NonceProviderProps, 
    typingsJapgolly.reactSelect.mod.NonceProvider, 
    Unit, 
    NonceProviderProps
  ] = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSelect.nonceProviderMod.NonceProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSelect.mod.NonceProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSelect.nonceProviderMod.NonceProviderProps])(children: _*)
  }
  @JSImport("react-select", "NonceProvider")
  @js.native
  object componentImport extends js.Object
  
}


package typingsJapgolly.reactNativePaper.anon

import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.TextInput
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceFocus extends StObject {
  
  def forceFocus(): Unit = js.native
  
  def innerRef(): Unit = js.native
  def innerRef(ref: TextInput): Unit = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.native
  
  var onChangeText: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.native
  
  def onLayoutAnimatedText(args: Any): Unit = js.native
  
  def onLeftAffixLayoutChange(event: LayoutChangeEvent): Unit = js.native
  
  def onRightAffixLayoutChange(event: LayoutChangeEvent): Unit = js.native
  
  var parentState: State = js.native
}

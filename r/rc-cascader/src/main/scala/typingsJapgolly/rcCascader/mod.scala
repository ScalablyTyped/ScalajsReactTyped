package typingsJapgolly.rcCascader

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcCascader.anon.DisplayName
import typingsJapgolly.rcCascader.anon.Ref
import typingsJapgolly.rcCascader.esCascaderMod.CascaderProps
import typingsJapgolly.rcCascader.esCascaderMod.DefaultOptionType
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-cascader", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] & Ref, Element]) & DisplayName = js.native
  
  type _To = (js.Function1[/* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] & Ref, Element]) & DisplayName
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] & Ref, Element]) & DisplayName = default
}

package typingsJapgolly.reactMdDivider

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdDivider.typesDividerMod.DividerElement
import typingsJapgolly.reactMdDivider.typesDividerMod.DividerProps
import typingsJapgolly.reactMdDivider.typesUseVerticalDividerHeightMod.VerticalDividerHeight
import typingsJapgolly.reactMdDivider.typesUseVerticalDividerHeightMod.VerticalDividerHookOptions
import typingsJapgolly.reactMdDivider.typesVerticalDividerMod.VerticalDividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/divider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/divider", "Divider")
  @js.native
  val Divider: ForwardRefExoticComponent[DividerProps & RefAttributes[DividerElement]] = js.native
  
  @JSImport("@react-md/divider", "VerticalDivider")
  @js.native
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useVerticalDividerHeight[E /* <: HTMLElement */](hasRefStyleMaxHeight: VerticalDividerHookOptions[E]): VerticalDividerHeight[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useVerticalDividerHeight")(hasRefStyleMaxHeight.asInstanceOf[js.Any]).asInstanceOf[VerticalDividerHeight[E]]
}
